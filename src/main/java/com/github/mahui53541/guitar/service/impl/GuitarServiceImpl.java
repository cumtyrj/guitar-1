package com.github.mahui53541.guitar.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.mahui53541.guitar.dao.GuitarDao;
import com.github.mahui53541.guitar.domain.Inventory;
import com.github.mahui53541.guitar.pojo.Guitar;
import com.github.mahui53541.guitar.pojo.spec.GuitarSpec;
import com.github.mahui53541.guitar.service.GuitarService;

@Service("guitarService")
public class GuitarServiceImpl implements GuitarService{

	@Autowired
	private GuitarDao guitarDao;
	@Autowired
	private Inventory inventory;
	@Override
	public List<Guitar> search(GuitarSpec searchSpec){
		List<Guitar> guitars=guitarDao.findAll();
		return inventory.search(searchSpec, guitars);
	}

}
