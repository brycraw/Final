package com.bryancrawley.parks.service;

import com.bryancrawley.parks.model.Events;

public interface EventsService {

  Events saveEvents(Events events);
  
  Events getEventsById(int id);
  
  void deleteEvents(int Id);
}
