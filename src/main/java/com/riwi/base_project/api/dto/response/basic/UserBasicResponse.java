package com.riwi.base_project.api.dto.response.basic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserBasicResponse {
  private Long id;
  private String name;
  private int phone;
  private String email;
}
