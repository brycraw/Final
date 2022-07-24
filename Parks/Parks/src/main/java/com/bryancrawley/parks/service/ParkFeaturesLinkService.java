package com.bryancrawley.parks.service;

import com.bryancrawley.parks.model.Park_Feature_Link;

public interface ParkFeaturesLinkService {
  
  Park_Feature_Link savePFL(Park_Feature_Link pFL);
  
  Park_Feature_Link getPFLById(int id);
}
