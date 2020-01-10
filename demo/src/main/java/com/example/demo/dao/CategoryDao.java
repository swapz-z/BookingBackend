package com.example.demo.dao;

import com.example.demo.entity.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryDao extends JpaRepository<Catagory , Long> {

}
