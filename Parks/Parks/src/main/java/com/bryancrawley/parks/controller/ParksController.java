package com.bryancrawley.parks.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bryancrawley.parks.model.Parks;
import com.bryancrawley.parks.service.ParksService;

@RestController
@RequestMapping("/parks_db/parks")
public class ParksController {

  private ParksService parksService;
 
  public ParksController(ParksService parksService) {
    super();
    this.parksService = parksService;
  }
  
  @PostMapping()
  public ResponseEntity<Parks> saveParks(@RequestBody Parks parks) {
    return new ResponseEntity<Parks>(parksService.saveParks(parks), HttpStatus.CREATED);
  }
  
  @GetMapping
  public List<Parks> getAllParks(){
    return parksService.getAllParks();
  }
  
  @GetMapping("{park_id}")
  public ResponseEntity<Parks> getParksById(@PathVariable("park_id") int parkId) {
    return new ResponseEntity<Parks>(parksService.getParksById(parkId), HttpStatus.OK);
  }
  
  @PutMapping("{park_id}")
  public ResponseEntity<Parks> updateParks(@PathVariable("park_id") int parkId, @RequestBody Parks parks){
    return new ResponseEntity<Parks>(parksService.updateParks(parks, parkId), HttpStatus.OK);
  }
  
  @DeleteMapping("{park_id}")
  public ResponseEntity<String> deleteParks(@PathVariable("park_id") int parkId){
    parksService.deleteParks(parkId);
   
    return new ResponseEntity<String>("Park Removed", HttpStatus.OK);
  }
  
}
