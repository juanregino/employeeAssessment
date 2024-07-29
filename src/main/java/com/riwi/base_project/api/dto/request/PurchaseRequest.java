package com.riwi.base_project.api.dto.request;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PurchaseRequest {
   private double subtotal;
   private double total;
   private LocalDate dueDate;
   private Long userId;
   private Long couponId;
}
