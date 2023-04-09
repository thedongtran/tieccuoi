package com.thanhsang.tieccuoi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "menu_tbl")
@Getter
@Setter
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "menu_description")
    private String menuName;

    @Column(name = "menu_link", nullable = false)
    private String link;

    @Column(name = "active")
    private Boolean active;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "main_id",
            nullable = true)
    private MenuItem mainMenu;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mainMenu", cascade = CascadeType.REMOVE)
    private Set<MenuItem> children = new HashSet<>();
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "menu_relation",
//            joinColumns = @JoinColumn(name = "child_id"),
//            inverseJoinColumns = @JoinColumn(name = "parent_id")
//    )
//    private List<MenuItem> parentList;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "slug")
//    private String slug;
//    @JsonIgnore
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "parent_id")
//    private MenuItem parent;
//
//    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
//    private List<MenuItem> children = new ArrayList<>();
}