package com.github.mahui53541.guitar.dao.mapper;

public class GuitarDynaSqlProvider {
	// 动态搜索
	/*public String search(Guitar guitar){
		return new SQL(){
			{
				SELECT("*");		
				FROM("guitar");
				if(guitar!=null){
					if(guitar.getPrice()!=null){
						OR();
						WHERE(" price = #{price} ");
					}
					if(guitar.getBackWood()!=null&&guitar.getBackWood().trim().length()>0){
						OR();
						WHERE(" back_wood LIKE '%'||#{backWood}||'%' ");
					}
					if(guitar.getTopWood()!=null&&guitar.getTopWood().trim().length()>0){
						OR();
						WHERE(" top_wood LIKE '%'||#{topWood}||'%' ");
					}
					if(guitar.getBuilder()!=null&&guitar.getBuilder().trim().length()>0){
						OR();
						WHERE(" builder LIKE '%'||#{builder}||'%' ");
					}
					if(guitar.getModel()!=null&&guitar.getModel().trim().length()>0){
						OR();
						WHERE(" model LIKE '%'||#{model}||'%' ");
					}
					if(guitar.getType()!=null&&guitar.getType().trim().length()>0){
						OR();
						WHERE(" type LIKE '%'||#{type}||'%' ");
					}
				}
			}
		}.toString();
	}*/
}
