package com.xworkz.abcd.dto;

import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class WebApplication extends Application{
    private String webApplicationName;
    private TechnicalSkill technicalSkill;
    private Company company;


}
