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
@Table(name="park_feature_link")
public class Park_Feature_Link {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  @Column
  private int pfl_id;
  
  @Column
  private int park_id;
  
  @Column
  private int feature_id;
}
