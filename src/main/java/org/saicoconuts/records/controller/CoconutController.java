package org.saicoconuts.records.controller;

import org.saicoconuts.records.bo.CoconutBO;
import org.saicoconuts.records.entity.Coconut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping(value = "/coconut")
public class CoconutController {

	private CoconutBO coconutBO;

	@Autowired
	public CoconutController(CoconutBO coconutBO) {
		this.coconutBO = coconutBO;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getCoconuts() {
		return new ResponseEntity<>(coconutBO.getAllCoconutRates(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{type}", method = RequestMethod.GET)
	public ResponseEntity<?> getCoconutRateByType(@PathVariable("type") String type) {
		return new ResponseEntity<>(coconutBO.getCoconutRateByType(type), HttpStatus.OK);
	}

	@RequestMapping(method = PUT)
	public ResponseEntity<?> setCoconutRates(@RequestBody Set<Coconut> coconutRates) {
		if(coconutBO.setCoconutRates(coconutRates)) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.badRequest().build();
	}
}
