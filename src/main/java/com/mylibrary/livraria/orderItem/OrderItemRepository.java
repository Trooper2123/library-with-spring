package com.mylibrary.livraria.orderItem;

import com.mylibrary.livraria.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}