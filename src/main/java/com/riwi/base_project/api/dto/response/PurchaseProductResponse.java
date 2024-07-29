package com.riwi.base_project.api.dto.response;

import java.util.List;

import com.riwi.base_project.domain.entities.ProductEntity;

public class PurchaseProductResponse {
  
    private Long id;
    private String userName;
    private String couponName;
    private Long couponId;
    private List<ProductEntity> products;
}
