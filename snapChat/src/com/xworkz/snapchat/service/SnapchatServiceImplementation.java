package com.xworkz.snapchat.service;

import com.xworkz.snapchat.dto.SnapchatDto;
import com.xworkz.snapchat.repository.SnapchatRepository;
import com.xworkz.snapchat.repository.SnapchatRepositoryImplementation;

public class SnapchatServiceImplementation implements SnapchatService {
    private SnapchatRepository snapchatRepository = new SnapchatRepositoryImplementation();

    @Override
    public boolean validateAndSave(SnapchatDto snapchatDto) {
        if (snapchatDto == null) {
            System.out.println("SnapchatDto is null");
            return false;
        }

        if (snapchatDto.getSnapchatName() == null || snapchatDto.getSnapchatName().isEmpty()) {
            System.out.println("Snapchat name is invalid");
            return false;
        }

        if (snapchatDto.getLocation() == null || snapchatDto.getLocation().isEmpty()) {
            System.out.println("Location is invalid");
            return false;
        }

        if (snapchatDto.getUsers() < 0) {
            System.out.println("Users must be positive");
            return false;
        }

        if (isPresent(snapchatDto)) {
            System.out.println("SnapchatDto already exists");
            return false;
        }

        boolean saved = snapchatRepository.save(snapchatDto);
        if (saved) {
            System.out.println("SnapchatDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save SnapchatDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        SnapchatDto[] snapchatArray = snapchatRepository.readAll();
        if (snapchatArray != null) {
            for (SnapchatDto dto : snapchatArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(SnapchatDto snapchatDto) {
        SnapchatDto[] snapchatArray = snapchatRepository.readAll();
        if (snapchatArray != null) {
            for (SnapchatDto dto : snapchatArray) {
                if (dto != null && dto.equals(snapchatDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public SnapchatDto searchByName(String snapchatName) {
        SnapchatDto[] snapchatArray = snapchatRepository.readAll();
        if (snapchatArray != null) {
            for (SnapchatDto dto : snapchatArray) {
                if (dto != null && dto.getSnapchatName().equalsIgnoreCase(snapchatName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
