package com.thanhsang.tieccuoi.services;

import com.thanhsang.tieccuoi.entity.MenuItem;
import com.thanhsang.tieccuoi.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MenuItemService {
    @Autowired
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItem() {
        List<MenuItem> parentMenus = menuItemRepository.findAll();
//        List<MenuItem> allMenus = new ArrayList<>();
//        for (MenuItem parentMenu : parentMenus) {
//            allMenus.add(parentMenu);
//            addChildrenToMenuItem(parentMenu, allMenus);
//        }
        return parentMenus;
    }

//    private void addChildrenToMenuItem(MenuItem parentMenuItem, List<MenuItem> allMenuItems) {
//        List<MenuItem> children = parentMenuItem.getChildren();
//        if (children != null && !children.isEmpty()) {
//            for (MenuItem child : children) {
//
//
//                allMenuItems.add(child);
//                addChildrenToMenuItem(child, allMenuItems);
//            }
//        }
//    }

}
