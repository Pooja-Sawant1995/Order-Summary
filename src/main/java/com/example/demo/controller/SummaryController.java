package com.example.demo.controller;

import com.example.demo.model.OrderSummary;
import com.example.demo.repository.SummaryRepository;
import com.example.demo.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SummaryController {

    @Autowired
    SummaryService summaryService;
    
    @Autowired
    SummaryRepository summaryRepository;

    @CrossOrigin
    @GetMapping(value = "/products/{customerId}/{productId}")
    public List<OrderSummary> getOrderDetails(@PathVariable int customerId,@PathVariable int productId ) {
        return summaryService.getOrderDetails(customerId,productId);
    }

}
