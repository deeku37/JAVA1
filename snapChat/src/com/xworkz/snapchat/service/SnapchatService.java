package com.xworkz.snapchat.service;

import com.xworkz.snapchat.dto.SnapchatDto;

public interface SnapchatService {
    boolean validateAndSave(SnapchatDto snapchatDto);
    void readAll();
    boolean isPresent(SnapchatDto snapchatDto);
    SnapchatDto searchByName(String snapchatName);
}
