package com.thanhsang.tieccuoi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class MenuFoodId implements Serializable {
    private Long menuId;
    private Long foodId;
}
