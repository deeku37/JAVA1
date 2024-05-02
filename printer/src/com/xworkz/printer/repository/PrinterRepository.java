package com.xworkz.printer.repository;

import com.xworkz.printer.dto.PrinterDto;

public interface PrinterRepository {
    boolean save(PrinterDto printerDto);
    PrinterDto[] readAll();
}
