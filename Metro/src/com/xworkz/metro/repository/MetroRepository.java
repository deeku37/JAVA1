package com.xworkz.metro.repository;

import com.xworkz.metro.dto.MetroDto;

public interface MetroRepository {
    boolean save(MetroDto metroDto);
    MetroDto[] readAll();
}
