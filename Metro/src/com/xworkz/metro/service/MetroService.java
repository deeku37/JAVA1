
package com.xworkz.metro.service;

import com.xworkz.metro.dto.MetroDto;

public interface MetroService {
    boolean validateAndSave(MetroDto metroDto);
    void readAll();
    boolean isPresent(MetroDto metroDto);
    MetroDto searchByName(String metroName);
}
