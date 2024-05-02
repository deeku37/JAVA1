package com.xworkz.ticket.tester;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.service.TicketService;
import com.xworkz.ticket.service.TicketServiceImplementation;

public class TicketTester {
    public static void main(String[] args) {
        TicketDto ticketDto = new TicketDto("Concert", "Music concert ticket", 50.0);
        System.out.println(ticketDto);
        TicketService ticketService = new TicketServiceImplementation();
        boolean result = ticketService.validateAndSave(ticketDto);

        System.out.println("Ticket validation and save result: " + result);
        ticketService.validateAndSave(ticketDto);
        ticketService.readAll();
    }
}
