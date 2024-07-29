package com.riwi.base_project.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductRequest {
  @NotBlank(message = "El nombre del producto no puede estar vacío")
  private String name;
  @NotNull(message = "El precio del producto no puede estar vacía")
  private double price;
  @NotBlank(message = "La descripción del producto no puede estar vacía")
  private String description;
}
