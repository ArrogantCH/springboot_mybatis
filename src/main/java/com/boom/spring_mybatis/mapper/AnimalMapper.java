package com.boom.spring_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.boom.spring_mybatis.entity.Animal;

@Mapper
public interface AnimalMapper {

	int save(Animal animal);
}
