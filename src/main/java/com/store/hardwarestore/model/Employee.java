package com.store.hardwarestore.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class Employee extends Person{
}
