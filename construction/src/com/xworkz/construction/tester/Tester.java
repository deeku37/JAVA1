package com.xworkz.construction.tester;

import com.xworkz.construction.dto.Contract;
import com.xworkz.construction.dto.Project;

public class Tester {
    public static void main(String[] args) {
       Project project = new Project("Goverment");
        Contract contract = new Contract("roadConstruction","6Months",project);
        System.out.println(contract);
    }
}
