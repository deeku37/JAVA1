package com.xworkz.google.repository;

import com.xworkz.google.dto.GoogleDto;

public interface GoogleRepository {
    boolean save(GoogleDto googleDto);
    GoogleDto[] readAll();
}
