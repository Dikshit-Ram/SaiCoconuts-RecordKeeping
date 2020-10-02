package org.saicoconuts.records.controller;

import org.saicoconuts.records.bo.ConsumerBO;
import org.saicoconuts.records.entity.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping(value = "/consumer")
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

    @RequestMapping(value = "/name/{names}", method = RequestMethod.GET)
    public ResponseEntity<?> getConsumersByName(@PathVariable List<String> names) {
        if(CollectionUtils.isEmpty(names))
            return new ResponseEntity<>(Collections.EMPTY_LIST, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(consumerBO.getConsumersByName(names), HttpStatus.OK);
    }

    @RequestMapping(value = "/id/{ids}", method = RequestMethod.GET)
    public ResponseEntity<?> getConsumersByIds(@PathVariable List<String> ids) {
        if(CollectionUtils.isEmpty(ids))
            return new ResponseEntity<>(Collections.EMPTY_LIST, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(consumerBO.getConsumersById(ids), HttpStatus.OK);
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