package com.bryancrawley.parks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bryancrawley.parks.model.Events;

public interface EventsRepository extends JpaRepository<Events, Integer>{

}
