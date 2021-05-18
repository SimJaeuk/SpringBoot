package com.study.springboot.dto;

import lombok.Data;

@Data
public class SimpleBbsDto {
    public int id;
    private String writer;
    private String title;
    private String content;
}
