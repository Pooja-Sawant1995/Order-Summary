package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "tracking_details")
@Data
public class TrackingDetails {

    @Id
    private Integer tracking_id;
    private Integer orderid;
    private String status;
    private String location;
    private Date timestamp;

    public TrackingDetails() {
    }

    public TrackingDetails(Integer tracking_id, Integer orderid, String status, String location, Date timestamp) {
        this.tracking_id = tracking_id;
        this.orderid = orderid;
        this.status = status;
        this.location = location;
        this.timestamp = timestamp;
    }
}
