package com.bryancrawley.parks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bryancrawley.parks.exception.ResourceNotFoundException;
import com.bryancrawley.parks.model.Park_Feature_Link;
import com.bryancrawley.parks.repository.ParkFeaturesLinkRepository;
import com.bryancrawley.parks.service.ParkFeaturesLinkService;

@Service
public class ParkFeaturesLinkServiceImpl implements ParkFeaturesLinkService{
  private ParkFeaturesLinkRepository pFLRepository;
  @Autowired
  public ParkFeaturesLinkServiceImpl(ParkFeaturesLinkRepository pFLRepository) {
    super();
    this.pFLRepository = pFLRepository;
  }
  
  @Override
  public Park_Feature_Link savePFL(Park_Feature_Link pFL) {
    return pFLRepository.save(pFL);
  }

  @Override
  public Park_Feature_Link getPFLById(int id) {
    return pFLRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Parks_Features_Link", "Id", id));
  }
 
}
