package com.riwi.base_project.api.dto.response.basic;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponBasicResponse {
    private Long id;
    private String code;
    private int discountRate;
    private Boolean isActive = false;
    private LocalDate dueDate;
}
