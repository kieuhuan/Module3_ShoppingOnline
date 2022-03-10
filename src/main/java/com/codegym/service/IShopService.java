package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.model.User;

import java.util.List;

public interface IShopService {
    List<Product> displayAll();
    Product findByName(int id);
    List<Product> addProductIntoCart();
    List<Product>findbycategory(int category_id);
    boolean register(User user);
    void Payment();
}

