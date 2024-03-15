package com.example.demo.service.impl;

import com.example.demo.model.OrderSummary;
import com.example.demo.repository.SummaryRepository;
import com.example.demo.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SummaryServiceImpl implements SummaryService {

    @Autowired
    SummaryRepository summaryRepository;

    @Override
    public List<OrderSummary> getOrderDetails(int customerId, int productId) {
        List<OrderSummary> list =  summaryRepository.findAllCustomerId(customerId,productId);
        return list;
    }
}
