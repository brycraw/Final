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
@Table(name="parks")
public class Parks {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  @Column
  private int park_id;
  
  @Column
  private String park_name;
  @Column
  private double acreage;
}
