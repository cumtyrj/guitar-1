package com.github.mahui53541.guitar.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.github.mahui53541.guitar.domain.Inventory;
import com.github.mahui53541.guitar.pojo.Builder;
import com.github.mahui53541.guitar.pojo.Guitar;
import com.github.mahui53541.guitar.pojo.Type;
import com.github.mahui53541.guitar.pojo.Wood;
import com.github.mahui53541.guitar.pojo.spec.GuitarSpec;

public class GuitarTest {
	@Test
	public void search(){
		Inventory inventory = new Inventory();
		
		List<Guitar> all=new ArrayList<Guitar>();
		
		all.add(new Guitar("1",10.0d,Builder.JIANGSU, "X", Type.ACOUSTIC,Wood.CAMPHOR, Wood.CAMPHOR,3));
		all.add(new Guitar("2",15.0d,Builder.SHANDONG, "XL", Type.ACOUSTIC,Wood.BRICH, Wood.CAMPHOR,2));
		all.add(new Guitar("3",20.0d,Builder.JIANGSU, "M", Type.ACOUSTIC,Wood.CAMPHOR, Wood.KOREANPINE,5));
		
		
		GuitarSpec whatErinLikes = 
			      new GuitarSpec(Builder.JIANGSU, "X", 
			                     Type.ACOUSTIC,Wood.CAMPHOR, Wood.CAMPHOR,3);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes,all);
		
		for(Guitar guitar:matchingGuitars){
			System.out.println("匹配吉他的序列号："+guitar.getId());
		}
	}
	
}
