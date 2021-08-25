package com.store.hardwarestore.model;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categories")
public class Category extends  BaseEntity{
    @Column(name="category_name")
    private String name;
    @ManyToMany(mappedBy = "categories")
    private Set<Product> products;
}
