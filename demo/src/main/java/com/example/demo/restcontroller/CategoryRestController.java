package com.example.demo.restcontroller;

import com.example.demo.bo.Category;
import com.example.demo.entity.Catagory;
import com.example.demo.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryRestController {

    @Autowired
    private CatagoryService catagoryService;


    @GetMapping("/all")
    public List<com.example.demo.bo.Category> getAllCategories(){
        return catagoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<Catagory> findById(@PathVariable(required = true) long id){
    return catagoryService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteByid(@PathVariable(required = true) long id){
        catagoryService.deleteCategoryById(id);
    }

    @PostMapping("/addCategory")
    public void addCategory(@RequestBody Category reqCategory){
        catagoryService.addCategory(reqCategory);
    }

    @PutMapping("/changeCategory/{id}")
    public void changeCategory(@RequestBody Category reqCategory, @PathVariable long id){
        catagoryService.changeCategory(reqCategory,id);
	
    }


//    @GetMapping("/{name}")
//    public Catagory findByName(@PathVariable(required = true) String name){
//        return catagoryService.findByName(name);
//    }
}
