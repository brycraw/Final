package com.bryancrawley.parks.service;

import java.util.List;
import com.bryancrawley.parks.model.Parks;

public interface ParksService {

   Parks saveParks(Parks parks);
   
   List<Parks> getAllParks();
   
   Parks getParksById(int id);
   
   Parks updateParks(Parks parks, int Id);
   
   void deleteParks(int Id);
}
