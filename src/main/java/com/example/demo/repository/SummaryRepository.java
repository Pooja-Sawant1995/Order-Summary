package com.example.demo.repository;

import com.example.demo.model.OrderSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SummaryRepository extends JpaRepository<OrderSummary,Long> {

    @Query(value = "select * from order_summary where customer_id = ?1 and product_id = ?2 order by order_date",nativeQuery = true)
    List<OrderSummary> findAllCustomerId(int customerId, int productId);
}
