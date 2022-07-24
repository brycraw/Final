package com.bryancrawley.parks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bryancrawley.parks.model.Features;
import com.bryancrawley.parks.model.Park_Feature_Link;

@Repository
public interface ParkFeaturesLinkRepository extends JpaRepository<Park_Feature_Link, Integer>{

}
