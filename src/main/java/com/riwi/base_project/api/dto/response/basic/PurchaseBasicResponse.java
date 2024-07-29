package com.riwi.base_project.api.dto.response.basic;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PurchaseBasicResponse {
    private Long id;
    private double subtotal;
    private double total;
    private LocalDate dueDate;
}
