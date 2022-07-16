package com.scs.nemo.order.dto;

import com.scs.nemo.order.OrderDetails;
import com.scs.nemo.order.OrderStatus;
import com.scs.nemo.product.Product;
import com.scs.nemo.product.dto.ProductForOrderDetails;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDetailsDto {
    private Long id;
    private String orderShipping;
    private String orderNumber;
    private OrderStatus orderStatus;
    private Date orderDate;
    private Long orderTotal;
    private List<OrderDetails> orderDetails;

}
