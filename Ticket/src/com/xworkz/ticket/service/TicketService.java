package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDto;

public interface TicketService {
    boolean validateAndSave(TicketDto ticketDto);
    void readAll();
    boolean isPresent(TicketDto ticketDto);
}
