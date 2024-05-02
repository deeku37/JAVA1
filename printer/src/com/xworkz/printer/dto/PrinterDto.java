package com.xworkz.printer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PrinterDto {
    private String printerName;
    private String printerType;
    private double price;
    private String brand;

    @Override
    public String toString() {
        return "PrinterName: " + printerName + ", PrinterType: " + printerType + ", Price: " + price + ", Brand: " + brand;
    }
}
