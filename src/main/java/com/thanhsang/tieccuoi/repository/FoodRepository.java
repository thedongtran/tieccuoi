package com.thanhsang.tieccuoi.repository;

import com.thanhsang.tieccuoi.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
