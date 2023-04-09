package com.thanhsang.tieccuoi.repository;

import com.thanhsang.tieccuoi.entity.MenuFood;
import com.thanhsang.tieccuoi.entity.MenuFoodId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuFoodRepository extends JpaRepository<MenuFood, MenuFoodId> {
}
