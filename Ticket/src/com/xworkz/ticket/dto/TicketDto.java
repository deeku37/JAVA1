package com.xworkz.ticket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TicketDto {
    private String ticketName;
    private String ticketDescription;
    private double ticketPrice;

    @Override
    public String toString() {
        return "TicketName: " + ticketName + ", TicketDescription: " + ticketDescription + ", TicketPrice: " + ticketPrice;
    }
}
