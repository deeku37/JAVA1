package com.xworkz.vote.repository;

import com.xworkz.vote.dto.VoteDto;

public class VoteRepositoryImplementation implements VoteRepository {
    private VoteDto[] dtos = new VoteDto[5];
    private int index = 0;

    @Override
    public boolean save(VoteDto voteDto) {
        if (index < dtos.length) {
            dtos[index++] = voteDto; // add the VoteDto to the array
            System.out.println("Vote stored");
            return true;
        } else {
            System.out.println("Repository is full");
        }
        return false;
    }
    public VoteDto[] readAll() {
        System.out.println("entered");
        return dtos;
    }
}
