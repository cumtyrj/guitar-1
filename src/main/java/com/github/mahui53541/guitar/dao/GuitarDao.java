package com.github.mahui53541.guitar.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import com.github.mahui53541.guitar.dao.mapper.GuitarDynaSqlProvider;
import com.github.mahui53541.guitar.domain.Guitar;

public interface GuitarDao {
	
	//@Select("select * from guitar where price like #{str+%} or builder like #{str%} or model like #{str%} or type like #{str%} or back_wood like #{str%} or top_wood like #{str%}")
	@SelectProvider(type=GuitarDynaSqlProvider.class,method="search")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="price",property="price"),
		@Result(column="builder",property="builder"),
		@Result(column="model",property="model"),
		@Result(column="type",property="type"),
		@Result(column="back_wood",property="backWood"),
		@Result(column="top_wood",property="topWood")
	})
	public List<Guitar> search(Guitar guitar);
	
}
