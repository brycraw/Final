package com.bryancrawley.parks.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bryancrawley.parks.model.Events;
import com.bryancrawley.parks.service.EventsService;

@RestController
@RequestMapping("/parks_db/events")
public class EventsController {

  private EventsService eventsService;
  
  public EventsController(EventsService eventsService) {
    super();
    this.eventsService = eventsService;
  }
  
  @PostMapping()
  public ResponseEntity<Events> saveEvents(@RequestBody Events events) {
    return new ResponseEntity<Events>(eventsService.saveEvents(events), HttpStatus.CREATED);
  }
  
  @GetMapping("{event_id}")
  public ResponseEntity<Events> getParksById(@PathVariable("event_id") int Id) {
    return new ResponseEntity<Events>(eventsService.getEventsById(Id), HttpStatus.OK);
  }
  
  @DeleteMapping("{event_id}")
  public ResponseEntity<String> deleteEvents(@PathVariable("event_id") int Id){
    eventsService.deleteEvents(Id);
   
    return new ResponseEntity<String>("Event Removed", HttpStatus.OK);
  }

}
