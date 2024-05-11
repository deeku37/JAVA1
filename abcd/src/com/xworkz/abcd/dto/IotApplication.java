package com.xworkz.abcd.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IotApplication {
    private String iotName;
    private TechnicalSkill technicalSkill;
    private Company company;
}
