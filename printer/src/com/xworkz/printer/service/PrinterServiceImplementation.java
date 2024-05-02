package com.xworkz.printer.service;

import com.xworkz.printer.dto.PrinterDto;
import com.xworkz.printer.repository.PrinterRepository;
import com.xworkz.printer.repository.PrinterRepositoryImplementation;

public class PrinterServiceImplementation implements PrinterService {
    private PrinterRepository printerRepository = new PrinterRepositoryImplementation();

    @Override
    public boolean validateAndSave(PrinterDto printerDto) {
        if (printerDto != null) {
            if (printerDto.getPrinterName() != null && printerDto.getPrice() > 0 && printerDto.getBrand() != null) {
                if (isPresent(printerDto) == false) {
                    boolean saved = printerRepository.save(printerDto);
                    if (saved) {
                        System.out.println("Printer saved successfully");
                        return true;
                    }
                }
            } else {
                System.out.println("Invalid PrinterDto fields");
            }
        }
        return false;
    }

    @Override
    public void readAll() {
        PrinterDto[] printerDtoArray = printerRepository.readAll();
        if (printerDtoArray != null) {
            for (PrinterDto dto : printerDtoArray) {
                System.out.println(dto);
            }
        }
    }

    public boolean isPresent(PrinterDto printerDto) {
        PrinterDto[] printerDtoArray = printerRepository.readAll();
        if (printerDtoArray != null) {
            for (PrinterDto dto : printerDtoArray) {
                if (dto == printerDto) {
                    System.out.println("Already Present");
                    return true;
                }
            }
        }
        return false;
    }
}
