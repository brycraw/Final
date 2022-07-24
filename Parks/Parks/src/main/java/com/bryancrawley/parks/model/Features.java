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
@Table(name="Features")
public class Features {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  @Column
  private int feature_id;
  
  @Column
  private String features;
}
