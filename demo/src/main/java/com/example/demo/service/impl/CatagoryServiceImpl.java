package com.example.demo.service.impl;

import com.example.demo.bo.Category;
import com.example.demo.dao.CategoryDao;
import com.example.demo.entity.Catagory;
import com.example.demo.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CatagoryServiceImpl implements CatagoryService {

    @Autowired
    private CategoryDao categoryDao;

    public List<com.example.demo.bo.Category> getAllCategories() {
        List<com.example.demo.bo.Category> bocatList = new ArrayList<>();

        Iterable<Catagory> listCat = categoryDao.findAll();
        for (Catagory e : listCat) {

            com.example.demo.bo.Category bocat = new com.example.demo.bo.Category();
            bocat.setcId(e.getcId());
            bocat.setCname(e.getCname());
            bocat.setCdescription(e.getCdescription());
            bocatList.add(bocat);
        }

        return bocatList;
    }

    @Override
    public Optional<Catagory> findById(long id) {
        return categoryDao.findById(id);
    }

    @Override
    public void deleteCategoryById(long id) {
        boolean count = categoryDao.existsById(id);
        if (count) {
            categoryDao.deleteById(id);
        }
    }

    @Override
    public void addCategory(Category category) {
        categoryDao.save(toEntity(category));
    }

    //TODO
    @Override
    public void changeCategory(Category category, long id) {
        Optional<Catagory> foundCategory = categoryDao.findById(id);
        Catagory daoCategory = new Catagory();
        if (foundCategory.isPresent()) {
            daoCategory.setcId(id);
            daoCategory.setCname(category.getCname());
            daoCategory.setCdescription(category.getCdescription());
            categoryDao.save(daoCategory);
        }
    }

    private Catagory toEntity(Category category) {
        Catagory categoryDao = new Catagory();
        categoryDao.setcId(category.getcId());
        categoryDao.setCname(category.getCname());
        categoryDao.setCdescription(category.getCdescription());
        return categoryDao;
    }

//    @Override public Catagory findByName(String name) {
//        return categoryDao.;
//    }

}
