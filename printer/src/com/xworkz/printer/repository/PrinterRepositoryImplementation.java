package com.xworkz.printer.repository;

import com.xworkz.printer.dto.PrinterDto;

public class PrinterRepositoryImplementation implements PrinterRepository {
    private PrinterDto[] dtos = new PrinterDto[10]; // Maximum 10 printers
    private int index = 0;

    @Override
    public boolean save(PrinterDto printerDto) {
        if (index < dtos.length) {
            dtos[index++] = printerDto;
            return true;
        } else {
            System.out.println("Repository is full");
        }
        return false;
    }
    public PrinterDto[] readAll() {
        System.out.println("entered");
        return dtos;
    }
}
