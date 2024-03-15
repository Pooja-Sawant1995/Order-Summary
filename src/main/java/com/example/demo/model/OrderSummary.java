package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "order_summary")
@Data
public class OrderSummary {

    @Id
    private Integer orderID;
    private Integer customerId;
    private Date orderDate;
    private Integer productId;
    private String productName;
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    private String shippingAddress;
    private String billingAddress;
    private String paymentMethod;
    private String orderStatus;
    private String shippingMetho;
    private Double discounts;
    private Double tax;
    private Double totalAmount;
    private String notes;
    private String exceptionType;
    private String exceptionDescription;
    private Date exceptionDate;
    private String resolutionStatus;
    private String resolutionNotes;
    private String responsibleParty;
    private String priority;
    private String actionTaken;

    public OrderSummary(Integer orderID, Integer customerId, Date orderDate, Integer productId, String productName, Integer quantity, Double unitPrice, Double totalPrice, String shippingAddress, String billingAddress, String paymentMethod, String orderStatus, String shippingMetho, Double discounts, Double tax, Double totalAmount, String notes, String exceptionType, String exceptionDescription, Date exceptionDate, String resolutionStatus, String resolutionNotes, String responsibleParty, String priority, String actionTaken) {
        this.orderID = orderID;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.paymentMethod = paymentMethod;
        this.orderStatus = orderStatus;
        this.shippingMetho = shippingMetho;
        this.discounts = discounts;
        this.tax = tax;
        this.totalAmount = totalAmount;
        this.notes = notes;
        this.exceptionType = exceptionType;
        this.exceptionDescription = exceptionDescription;
        this.exceptionDate = exceptionDate;
        this.resolutionStatus = resolutionStatus;
        this.resolutionNotes = resolutionNotes;
        this.responsibleParty = responsibleParty;
        this.priority = priority;
        this.actionTaken = actionTaken;
    }

    public OrderSummary() {
    }
}
