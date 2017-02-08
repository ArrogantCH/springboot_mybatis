package com.boom.spring_mybatis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boom.spring_mybatis.entity.Animal;
import com.boom.spring_mybatis.mapper.AnimalMapper;

@Repository
public class AnimalRepository {

	@Autowired
	private AnimalMapper animalMapper;

	public int save(Animal animal){
		animalMapper.save(animal);
		return animal.getId();
	}
}
