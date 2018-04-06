package org.saicoconuts.records.controller;

import org.saicoconuts.records.dao.CoconutsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoconutController {
	
	@Autowired
	private CoconutsRepository coconutsRepository;

	@RequestMapping(value = "/getAll")
	public void getCoconuts() {
	}
	
}
