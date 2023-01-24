package com.domainmodel.order;

import java.util.List;

public interface OrderDetail {
    Order getOrder();

    List<OrderItem> getItems();
}
