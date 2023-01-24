package com.domainmodel.product;

import java.util.List;

public interface ProductItem {
    Product getProduct();

    List<ProductItemOption> getOptions();
}
