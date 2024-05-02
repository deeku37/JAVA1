package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.TicketDto;

public interface TicketRepository {
    boolean save(TicketDto ticketDto);
    TicketDto[] readAll();
}
