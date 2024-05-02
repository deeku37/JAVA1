package com.xworkz.vote.tester;

import com.xworkz.vote.dto.VoteDto;
import com.xworkz.vote.service.VoteService;
import com.xworkz.vote.service.VoteServiceImplementation;

public class VoteTester {
    public static void main(String[] args) {
        VoteDto voteDto = new VoteDto("DEVAN", "DEVAN", 1);
        System.out.println(voteDto);
        VoteService voteService = new VoteServiceImplementation();
        boolean result = voteService.validateAndSave(voteDto);
        System.out.println("Vote validation and save result: " + result);
        voteService.validateAndSave(voteDto);
        voteService.readAll();
    }
}