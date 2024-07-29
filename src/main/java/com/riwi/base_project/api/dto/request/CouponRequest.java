package com.riwi.base_project.api.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponRequest {
  @NotBlank(message = "El código de cupón no puede estar vacío")

  private String code;

  @NotNull(message = "El tipo de cupón no puede estar vacío")
  private int discountRate;

  private Boolean isActive;
  @FutureOrPresent(message = "La fecha de vencimiento no puede estar en el pasado")
  @NotNull(message = "La fecha de vencimiento no puede estar vacía")
  private LocalDate dueDate;
}
