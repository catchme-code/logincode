package com.controller;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;



	
	
	@Mapper
	public interface map{

		@Insert("insert into pro values(#{id},#{pw},#{name})")
		public void Map_insert(String id, String pw, String name);
		
		@Select("SELECT * FROM pro")
		public List<dto> Map_select();
	}
	

