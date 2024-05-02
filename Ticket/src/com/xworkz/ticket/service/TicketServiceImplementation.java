package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDto;
import com.xworkz.ticket.repository.TicketRepository;
import com.xworkz.ticket.repository.TicketRepositoryImplementation;

public class TicketServiceImplementation implements TicketService {
    private TicketRepository ticketRepository = new TicketRepositoryImplementation();

    @Override
    public boolean validateAndSave(TicketDto ticketDto) {
        if (ticketDto != null) {
            if (ticketDto.getTicketName() != null && ticketDto.getTicketPrice() > 0) {
                if (!isPresent(ticketDto)) {
                    boolean saved = ticketRepository.save(ticketDto);
                    if (saved) {
                        System.out.println("Ticket saved successfully");
                        return true;
                    }
                }
            } else {
                System.out.println("Invalid TicketDto fields");
            }
        }
        return false;
    }

    @Override
    public void readAll() {
        TicketDto[] ticketDtoArray = ticketRepository.readAll();
        if (ticketDtoArray != null) {
            for (TicketDto dto : ticketDtoArray) {
                System.out.println(dto);
            }
        }
    }

    public boolean isPresent(TicketDto ticketDto) {
        TicketDto[] ticketDtoArray = ticketRepository.readAll();
        if (ticketDtoArray != null) {
            for (TicketDto dto : ticketDtoArray) {
                if (dto == ticketDto) {
                    System.out.println("Already Present");
                    return true;
                }
            }
        }
        return false;
    }
}
