package com.xworkz.abcd.dto;

import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EnterpriseApplication {
    private String enterpriseApplicationName;
    private TechnicalSkill technicalSkill;
    private Company company;
}
