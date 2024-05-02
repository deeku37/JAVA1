package com.xworkz.vote.service;

import com.xworkz.vote.dto.VoteDto;

public interface VoteService {
    boolean validateAndSave(VoteDto voteDto);
    void readAll();
    boolean isPresent(VoteDto voteDto);
}