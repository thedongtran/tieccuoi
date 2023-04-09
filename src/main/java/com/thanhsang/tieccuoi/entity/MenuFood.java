package com.thanhsang.tieccuoi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "menu_food")
@Getter
@Setter
public class MenuFood {
    @EmbeddedId
    private MenuFoodId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("menuId")
    private Menu menu;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("foodId")
    private Food food;

    @Column(name = "description")
    private String description;


}
