package org.saicoconuts.records.controller;

import org.saicoconuts.records.bo.ItemBO;
import org.saicoconuts.records.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping(value = "/Item")
public class ItemController {

	private ItemBO ItemBO;

	@Autowired
	public ItemController(ItemBO ItemBO) {
		this.ItemBO = ItemBO;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getItems() {
		return new ResponseEntity<>(ItemBO.getAllItems(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public ResponseEntity<?> getItem(@PathVariable("name") String name) {
		return new ResponseEntity<>(ItemBO.getItem(name), HttpStatus.OK);
	}

	@RequestMapping(method = PUT)
	public ResponseEntity<?> createItems(@RequestBody Set<Item> items) {
		if(ItemBO.createItems(items)) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.badRequest().build();
	}
}
