package com.example.demo.service.impl;

import com.example.demo.model.OrderSummary;
import com.example.demo.model.TrackingDetails;
import com.example.demo.repository.SummaryRepository;
import com.example.demo.repository.TrackingRepository;
import com.example.demo.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SummaryServiceImpl implements SummaryService {

    @Autowired
    SummaryRepository summaryRepository;

    @Autowired
    TrackingRepository trackingRepository;

    @Override
    public List<OrderSummary> getOrderDetails(int customerId, int productId) {
        return summaryRepository.findOrdersDetails(customerId,productId);
    }

    @Override
    public List<TrackingDetails> getTrackingDetails(int orderId) {
        return trackingRepository.findTrackingDetails(orderId);
    }
}
