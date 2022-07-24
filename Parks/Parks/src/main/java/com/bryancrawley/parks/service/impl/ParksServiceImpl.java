package com.bryancrawley.parks.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bryancrawley.parks.exception.ResourceNotFoundException;
import com.bryancrawley.parks.model.Parks;
import com.bryancrawley.parks.repository.ParksRepository;
import com.bryancrawley.parks.service.ParksService;

@Service
public class ParksServiceImpl implements ParksService{
  private ParksRepository parksRepository;
  @Autowired
  public ParksServiceImpl(ParksRepository parksRepository) {
    super();
    this.parksRepository = parksRepository;
  }
  
  @Override
  public Parks saveParks(Parks parks) {
    return parksRepository.save(parks);
  }
  
  @Override
  public List<Parks> getAllParks(){
    return parksRepository.findAll();
  }
  
  @Override
  public Parks getParksById(int id) {
    return parksRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Parks", "Id", id));
  }
  
  @Override
  public Parks updateParks(Parks parks, int id) {
    Parks existingParks = parksRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Parks", "Id", id));
    
    existingParks.setPark_name(parks.getPark_name());
    existingParks.setAcreage(parks.getAcreage());
    existingParks.setPark_id(parks.getPark_id());
    
    parksRepository.save(existingParks);
    
    return existingParks;
  }
  
  @Override
  public void deleteParks(int Id) {   
    Parks existingParks = parksRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Parks", "Id", Id));
    parksRepository.deleteById(Id);
  }
}
