package com.xworkz.snapchat.dto;

import com.xworkz.snapchat.constant.SnapchatType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SnapchatDto {
    private String snapchatName;
    private SnapchatType snapchatType;
    private String location;
    private double users; // in millions

    @Override
    public String toString() {
        return "SnapchatName: " + snapchatName + ", SnapchatType: " + snapchatType
                + ", Location: " + location + ", Users: " + users + "M";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        SnapchatDto dto = (SnapchatDto) obj;
        return snapchatName.equals(dto.snapchatName)
                && snapchatType == dto.snapchatType
                && location.equals(dto.location);
    }
}
