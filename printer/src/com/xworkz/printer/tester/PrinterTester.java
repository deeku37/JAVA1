package com.xworkz.printer.tester;

import com.xworkz.printer.dto.PrinterDto;
import com.xworkz.printer.service.PrinterService;
import com.xworkz.printer.service.PrinterServiceImplementation;

public class PrinterTester {
    public static void main(String[] args) {
        PrinterDto printerDto = new PrinterDto("LASER", "LASER", 1999, "LASER");
        System.out.println(printerDto);
        PrinterService printerService = new PrinterServiceImplementation();
        boolean result = printerService.validateAndSave(printerDto);

        System.out.println("Printer validation and save result: " + result);
        printerService.validateAndSave(printerDto);
        printerService.readAll();
    }
}
