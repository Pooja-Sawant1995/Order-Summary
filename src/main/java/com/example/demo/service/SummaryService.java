package com.example.demo.service;


import com.example.demo.model.OrderSummary;
import com.example.demo.model.TrackingDetails;

import java.util.List;

public interface SummaryService {
    List<OrderSummary> getOrderDetails(int customerId, int productId);

    List<TrackingDetails> getTrackingDetails(int orderId);
}
