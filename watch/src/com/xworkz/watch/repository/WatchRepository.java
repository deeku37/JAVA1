package com.xworkz.watch.repository;

import com.xworkz.watch.dto.WatchDto;

public interface WatchRepository {
    boolean save(WatchDto watchDto);
    WatchDto[] readAll();
}
