package com.github.mahui53541.guitar.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.mahui53541.guitar.dao.GuitarDao;
import com.github.mahui53541.guitar.domain.Guitar;
import com.github.mahui53541.guitar.service.GuitarService;

@Service("guitarService")
public class GuitarServiceImpl implements GuitarService{

	@Autowired
	private GuitarDao guitarDao;
	@Override
	public List<Guitar> search(Guitar guitar) {
		return guitarDao.search(guitar);
	}

}
