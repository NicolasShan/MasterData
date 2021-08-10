package com.woolworths.cspmasterdata.controller;

import com.woolworths.cspmasterdata.model.Transportorder;
import com.woolworths.cspmasterdata.service.TransportorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransportorderController {

    @Autowired
    private TransportorderService transportorderService;

    @GetMapping(value = "/order")
    public ResponseEntity<Object> getAllTransportorders() {
        List<Transportorder> orders = this.transportorderService.getAll();
        return ResponseEntity.ok(orders);
    }

    @GetMapping(value = "/order/{id}")
    public ResponseEntity<Object> getTransportorderById(@PathVariable("id") String id) {
        Transportorder order = this.transportorderService.getTransportorderById(id.trim());
        return ResponseEntity.ok(order);
    }

    @GetMapping(value = "/order")
    public ResponseEntity<Object> getTransportorder(@RequestBody Transportorder order) {
        Transportorder transportorder = this.transportorderService.get(order);
        return ResponseEntity.ok(transportorder);
    }

    @PostMapping(value = "/order")
    public ResponseEntity<Object> addTransportorder(@RequestBody Transportorder order) {
        Transportorder transportorder = this.transportorderService.add(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(transportorder);
    }

    @PutMapping(value = "/order")
    public ResponseEntity<Object> updateTransportorder(@RequestBody Transportorder order) {
        Transportorder transportorder = this.transportorderService.update(order);
        return ResponseEntity.ok(transportorder);
    }

    @DeleteMapping(value = "/order")
    public ResponseEntity<Object> deleteTransportorder(@RequestBody Transportorder order) {
        this.transportorderService.delete(order);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/order/{id}")
    public ResponseEntity<Object> deleteTransportorderById(@PathVariable("id") String id) {
        this.transportorderService.deleteById(id.trim());
        return ResponseEntity.ok().build();
    }





}
