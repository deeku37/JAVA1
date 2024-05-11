package com.xworkz.abcd.dto;

import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Android extends Application{
    private String androidName;
    private TechnicalSkill technicalSkill;
    private Company company;
}
