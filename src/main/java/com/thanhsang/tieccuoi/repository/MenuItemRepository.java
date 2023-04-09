package com.thanhsang.tieccuoi.repository;

import com.thanhsang.tieccuoi.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
