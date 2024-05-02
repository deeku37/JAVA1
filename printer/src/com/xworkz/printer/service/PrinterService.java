package com.xworkz.printer.service;

import com.xworkz.printer.dto.PrinterDto;

public interface PrinterService {
    boolean validateAndSave(PrinterDto printerDto);
    void readAll();
    boolean isPresent(PrinterDto printerDto);
}
