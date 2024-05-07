package com.xworkz.snapchat.repository;

import com.xworkz.snapchat.dto.SnapchatDto;

public interface SnapchatRepository {
    boolean save(SnapchatDto snapchatDto);
    SnapchatDto[] readAll();
}
