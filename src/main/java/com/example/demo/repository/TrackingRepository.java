package com.example.demo.repository;

import com.example.demo.model.OrderSummary;
import com.example.demo.model.TrackingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackingRepository extends JpaRepository<TrackingDetails,Long> {


    @Query(value = "select * from tracking_details where orderid = ?1 order by timestamp",nativeQuery = true)
    List<TrackingDetails> findTrackingDetails(int orderId);
}
