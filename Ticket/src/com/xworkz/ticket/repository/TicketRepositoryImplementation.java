package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.TicketDto;

public class TicketRepositoryImplementation implements TicketRepository {
    private TicketDto[] dtos = new TicketDto[10]; // max 10 tickets
    private int index = 0;

    @Override
    public boolean save(TicketDto ticketDto) {
        if (index < dtos.length) {
            dtos[index++] = ticketDto; // add the TicketDto to the array
            System.out.println("Ticket stored");
            return true;
        } else {
            System.out.println("Repository is full");
        }
        return false;
    }
    public TicketDto[] readAll() {
        System.out.println("entered");
        return dtos;
    }
}
