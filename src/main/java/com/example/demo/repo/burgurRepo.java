package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Burgur;

public interface burgurRepo extends CrudRepository<Burgur, Integer>{

}
