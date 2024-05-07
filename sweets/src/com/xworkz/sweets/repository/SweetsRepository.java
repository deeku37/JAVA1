package com.xworkz.sweets.repository;

import com.xworkz.sweets.dto.SweetsDto;

public interface SweetsRepository {
    boolean save(SweetsDto sweetsDto);
    SweetsDto[] readAll();
}
