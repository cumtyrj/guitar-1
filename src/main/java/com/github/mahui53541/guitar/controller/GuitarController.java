package com.github.mahui53541.guitar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.mahui53541.guitar.domain.Guitar;
import com.github.mahui53541.guitar.service.GuitarService;

@Controller
@RequestMapping("/")
public class GuitarController {
	@Autowired
	private GuitarService guitarService;
	
	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	@ResponseBody
	public List<Guitar> getPosts(Guitar guitar) throws Exception{
		return guitarService.search(guitar);
    }
}
