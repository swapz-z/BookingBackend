package com.example.demo.restcontroller.service;

import com.example.demo.bo.Category;
import com.example.demo.entity.Catagory;

import java.util.List;
import java.util.Optional;

public interface CatagoryService {
    List<Category> getAllCategories();

    Optional<Catagory> findById(long id);

    void deleteCategoryById(long id);

    void addCategory(Category category);

    void changeCategory(Category category,long id);

    //  Catagory findByName(String name);
}
