package com.inex.document.ui.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseDto {
  private String name;
  public ResponseDto(String name) {
    this.name = name;
  }
}
