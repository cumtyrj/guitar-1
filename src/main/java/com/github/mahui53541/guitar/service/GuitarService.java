package com.github.mahui53541.guitar.service;

import java.util.List;

import com.github.mahui53541.guitar.pojo.Guitar;
import com.github.mahui53541.guitar.pojo.spec.GuitarSpec;

public interface GuitarService {
	public List<Guitar> search(GuitarSpec searchSpec);
}
