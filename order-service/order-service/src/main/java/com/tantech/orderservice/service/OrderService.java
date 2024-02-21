package com.tantech.orderservice.service;


import com.tantech.orderservice.dto.OrderLineItemsDto;
import com.tantech.orderservice.dto.OrderRequest;
import com.tantech.orderservice.model.Order;
import com.tantech.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        //Now mapping orderLineItems that comes from OrderRequest

        orderRequest.getOrderLineItemsDtoList().stream()
                .map(orderLineItemsDto -> mapToDto(orderLineItemsDto))
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto){
        OrderLineItems orderLineItems=new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
    }

}
