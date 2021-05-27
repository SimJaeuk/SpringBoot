package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data //getter satter equals 등등을 자동으로 생성한다.
@Builder(toBuilder = true)
public class SampleDTO {
    private Long sno;
    private String first;
    private String last;
    private LocalDateTime regTime;
}
