package com.thanhsang.tieccuoi.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "food")
@Getter
@Setter
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "food", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference

    private Set<Menu> menu = new HashSet<>();
}

