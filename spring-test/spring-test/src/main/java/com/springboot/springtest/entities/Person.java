package com.springboot.springtest.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table
public class Person {
  @Id
  @Column
  private Integer personId;
  @Column
  private String personName;
   @Column
  private String personCity;

}
