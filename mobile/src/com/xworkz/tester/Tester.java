package com.xworkz.tester;

import com.xworkz.application.AppName;
import com.xworkz.iphone.IphoneSeries;



public class Tester {
    public static void main(String[] args) {
        AppName appName = new AppName("deegowda","podcast");
        IphoneSeries iphoneSeries= new IphoneSeries("15promax","128gb",appName);
        System.out.println(appName);

    }
}
