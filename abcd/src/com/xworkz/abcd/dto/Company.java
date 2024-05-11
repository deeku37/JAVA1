package com.xworkz.abcd.dto;

import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    private String companyName;
    private String companyLocation;
    private Department department;

}
