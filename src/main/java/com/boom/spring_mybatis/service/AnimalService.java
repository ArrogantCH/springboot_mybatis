package com.boom.spring_mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boom.spring_mybatis.entity.Animal;
import com.boom.spring_mybatis.repository.AnimalRepository;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;
	
	public int save(Animal animal){
		return animalRepository.save(animal);
	}
}
