package com.xworkz.resort.repository;

import com.xworkz.resort.dto.ResortDto;

public interface ResortRepository {
    boolean save(ResortDto resortDto);
    ResortDto[] readAll();
}
