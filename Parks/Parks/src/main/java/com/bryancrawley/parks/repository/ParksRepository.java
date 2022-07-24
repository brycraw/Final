package com.bryancrawley.parks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bryancrawley.parks.model.Parks;

@Repository
public interface ParksRepository extends JpaRepository<Parks, Integer> {
//This space intentionally left blank
}
