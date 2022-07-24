package com.bryancrawley.parks.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bryancrawley.parks.model.Park_Feature_Link;
import com.bryancrawley.parks.service.ParkFeaturesLinkService;

@RestController
@RequestMapping("/parks_db/park_features_link")
public class ParkFeaturesLinkController {
  
  private ParkFeaturesLinkService pFLService;
  
  public ParkFeaturesLinkController(ParkFeaturesLinkService pFLService) {
    super();
    this.pFLService = pFLService;
  }
  
  @PostMapping()
  public ResponseEntity<Park_Feature_Link> savePFL(@RequestBody Park_Feature_Link pFL) {
    return new ResponseEntity<Park_Feature_Link>(pFLService.savePFL(pFL), HttpStatus.CREATED);
  }
  
  @GetMapping("{pfl_id}")
  public ResponseEntity<Park_Feature_Link> getPFLById(@PathVariable("pfl_id") int id) {
    return new ResponseEntity<Park_Feature_Link>(pFLService.getPFLById(id), HttpStatus.OK);
  }
}
