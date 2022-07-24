package com.bryancrawley.parks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bryancrawley.parks.exception.ResourceNotFoundException;
import com.bryancrawley.parks.model.Events;
import com.bryancrawley.parks.model.Parks;
import com.bryancrawley.parks.repository.EventsRepository;
import com.bryancrawley.parks.service.EventsService;

@Service
public class EventsServiceImpl implements EventsService{
  private EventsRepository eventsRepository;
  @Autowired
  public EventsServiceImpl(EventsRepository eventsRepository) {
    super();
    this.eventsRepository = eventsRepository;
  }
  
  @Override
  public Events saveEvents(Events events) {
    return eventsRepository.save(events);
  }

  @Override
  public Events getEventsById(int id) {
    return eventsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Events", "Id", id));
  }

  @Override
  public void deleteEvents(int Id) { 
    Events existingEvents = eventsRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Events", "Id", Id));
    eventsRepository.deleteById(Id);
  }
}
