package com.github.mahui53541.guitar.dao;

import java.util.List;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.github.mahui53541.guitar.pojo.Guitar;

public interface GuitarDao {
	
	@Select("select * from guitar")
	//@SelectProvider(type=GuitarDynaSqlProvider.class,method="search")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="price",property="price"),
		@Result(column="builder",property="builder"),
		@Result(column="model",property="model"),
		@Result(column="type",property="type"),
		@Result(column="back_wood",property="backWood"),
		@Result(column="top_wood",property="topWood"),
		@Result(column="num_strings",property="numStrings"),
		@Result(column="builder",property="spec.builder"),
		@Result(column="model",property="spec.model"),
		@Result(column="type",property="spec.type"),
		@Result(column="back_wood",property="spec.backWood"),
		@Result(column="top_wood",property="spec.topWood"),
		@Result(column="num_strings",property="spec.numStrings")
	})
	public List<Guitar> findAll();
	
}
