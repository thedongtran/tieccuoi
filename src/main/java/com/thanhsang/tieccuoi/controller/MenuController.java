package com.thanhsang.tieccuoi.controller;

import com.thanhsang.tieccuoi.entity.Menu;
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
@RequestMapping("home")
@CrossOrigin(origins = "http://localhost:3000")
public class MenuController {
    @Autowired
    private MenuService service;
    @GetMapping("/getListMenu")
    public ResponseEntity<List<Menu>> getBook() {
        List<Menu> list= service.getAllMenu();

        return new ResponseEntity<>(list,new HttpHeaders(),HttpStatus.OK);
    }
}
