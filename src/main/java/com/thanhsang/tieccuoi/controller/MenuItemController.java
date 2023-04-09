package com.thanhsang.tieccuoi.controller;

import com.thanhsang.tieccuoi.entity.Menu;
import com.thanhsang.tieccuoi.entity.MenuItem;
import com.thanhsang.tieccuoi.services.MenuItemService;
import com.thanhsang.tieccuoi.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
@CrossOrigin(origins = "http://localhost:3000")
public class MenuItemController {
    @Autowired
    private MenuItemService service;

    @GetMapping("/getListMenuItem")
    public ResponseEntity<List<MenuItem>> getBook() {
        List<MenuItem> list = service.getAllMenuItem();

        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
