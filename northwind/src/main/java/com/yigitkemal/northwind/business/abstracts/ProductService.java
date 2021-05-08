package com.yigitkemal.northwind.business.abstracts;

import com.yigitkemal.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
