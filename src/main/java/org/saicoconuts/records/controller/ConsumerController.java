package org.saicoconuts.records.controller;

import org.saicoconuts.records.bo.ConsumerBO;
import org.saicoconuts.records.entity.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping(value = "/consumers")
public class ConsumerController {

    private ConsumerBO consumerBO;

    @Autowired
    public ConsumerController(ConsumerBO consumerBO) {
        this.consumerBO = consumerBO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getConsumers() {
        return new ResponseEntity<>(consumerBO.getAllConsumers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getConsumerByName(@PathVariable("name") String name, @RequestBody List<String> names) {
        if(name != null && !name.isEmpty())
            return new ResponseEntity<>(consumerBO.getConsumersByName(Collections.singletonList(name)), HttpStatus.OK);
        else if(names != null && names.isEmpty())
            return new ResponseEntity<>(consumerBO.getConsumersByName(names), HttpStatus.OK);
        return new ResponseEntity<>(consumerBO.getAllConsumers(), HttpStatus.OK);
    }

    @RequestMapping(method = PUT)
    public ResponseEntity<?> saveConsumer(@RequestBody Set<Consumer> consumers) {
        if(consumerBO.saveOrUpdateConsumer(consumers)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @RequestMapping(method = DELETE)
    public ResponseEntity<?> deleteConsumer(@RequestBody Set<Consumer> consumers) {
        if(consumerBO.deleteConsumers(consumers)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}