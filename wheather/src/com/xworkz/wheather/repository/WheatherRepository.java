package com.xworkz.wheather.repository;

import com.xworkz.wheather.dto.WheatherDto;

public interface WheatherRepository {
    boolean save(WheatherDto wheatherDto);
    WheatherDto[] readAll();
}
