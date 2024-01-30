package com.inex.document.ui;

import com.inex.document.ui.dto.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sample")
public class SampleController {

  @GetMapping
  public ResponseDto sample(SampleRequest request) {
    return new ResponseDto(request.getName());
  }

  @Getter @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class SampleRequest {
    private String name;
  }
}
