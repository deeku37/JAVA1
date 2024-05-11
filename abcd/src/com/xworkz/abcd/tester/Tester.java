package com.xworkz.abcd.tester;

import com.xworkz.abcd.dto.*;

public class Tester {
    public static void main(String[] args) {
        TechnicalSkill technicalSkill = new TechnicalSkill("spring");
        EmployeeDetails employeeDetails = new EmployeeDetails("avi","avi@12");
       Department department = new Department("devoloping","java",employeeDetails);
      Company company = new Company("lard" ,"hassan",department);
       WebApplication webApplication= new WebApplication("youtube",technicalSkill,company);
        System.out.println(webApplication);
        System.out.println(webApplication.getCompany().getDepartment().getEmployeeDetails().getEmployeeName());
        Android android= new Android("Snapdargon",technicalSkill,company);
        System.out.println(android);
        System.out.println(android.getCompany().getDepartment().getEmployeeDetails().getEmployeeName());
        IotApplication iotApplication = new IotApplication("GoogleMaps",technicalSkill,company);
        System.out.println(iotApplication);
        System.out.println(iotApplication.getCompany().getDepartment().getEmployeeDetails().getEmployeeName());
        EnterpriseApplication enterpriseApplication = new EnterpriseApplication("supply chain managment",technicalSkill,company);
        System.out.println(enterpriseApplication);
        System.out.println(enterpriseApplication.getCompany().getDepartment().getEmployeeDetails().getEmployeeName());


    }
}
