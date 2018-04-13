package org.saicoconuts.records.controller;

import org.saicoconuts.records.bo.CoconutBO;
import org.saicoconuts.records.entity.Coconut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class CoconutController {

	private CoconutBO coconutBO;

	@Autowired
	public CoconutController(CoconutBO coconutBO) {
		this.coconutBO = coconutBO;
	}

	@RequestMapping(value = "/CoconutRates", method = RequestMethod.GET)
	public ResponseEntity<?> getCoconuts() {
		return new ResponseEntity<>(coconutBO.getAllCoconutRates(), HttpStatus.OK);
	}

	@RequestMapping(value = "/CoconutRates/{type}", method = RequestMethod.GET)
	public ResponseEntity<?> getCoconutRateByType(@PathVariable("type") String type) {
		return new ResponseEntity<>(coconutBO.getCoconutRateByType(type), HttpStatus.OK);
	}

	@RequestMapping(value = "/SetCoconutRates", method = PUT)
	public ResponseEntity<?> setCoconutRates(@RequestBody Set<Coconut> coconutRates) {
		if(coconutBO.setCoconutRates(coconutRates)) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.badRequest().build();
	}
}
