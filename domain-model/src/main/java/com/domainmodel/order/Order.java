package com.domainmodel.order;

import java.util.List;

public interface Order {
    List<OrderDetail> getDetails();
}
