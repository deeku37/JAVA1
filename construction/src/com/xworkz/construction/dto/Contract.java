package com.xworkz.construction.dto;

import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contract extends Construction {

    private String contractType;
    private String contractDuration;
    private Project project;

}
