package com.thanhsang.tieccuoi.services;

import com.thanhsang.tieccuoi.entity.Menu;
import com.thanhsang.tieccuoi.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAllMenu() {
        List<Menu> list = menuRepository.findAll();
        return list;
    }

}
