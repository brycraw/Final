package com.bryancrawley.parks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="events")
public class Events {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  @Column
  private int event_id;
  
  @Column
  private int park_id;
  
  @Column
  private String event_name;
  @Column
  private String description;
}
