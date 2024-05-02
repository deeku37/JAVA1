package com.xworkz.vote.service;

import com.xworkz.vote.dto.VoteDto;
import com.xworkz.vote.repository.VoteRepository;
import com.xworkz.vote.repository.VoteRepositoryImplementation;

public class VoteServiceImplementation implements VoteService {
    private VoteRepository voteRepository = new VoteRepositoryImplementation();

    @Override
    public boolean validateAndSave(VoteDto voteDto) {
        if (voteDto != null) {
            if (voteDto.getVoterName() != null && voteDto.getCandidateName() != null && voteDto.getVoteNumber() > 0) {
                if (isPresent(voteDto) == false) {
                    boolean saved = voteRepository.save(voteDto);
                    if (saved){
                        System.out.println("Vote saved successfully");
                        return true;
                    }
                }
            }else {
                System.out.println("Invalid VoteDto fields");
            }
        }
        return false;
    }
    @Override
    public void readAll() {
        VoteDto[] voteDtoArray = voteRepository.readAll();
        if (voteDtoArray != null) {
            for (VoteDto dto : voteDtoArray) {
                System.out.println(dto);
            }
        }
    }

    public boolean isPresent(VoteDto voteDto) {
        VoteDto[] voteDtoArray = voteRepository.readAll();
        if (voteDtoArray != null) {
            for (VoteDto dto : voteDtoArray) {
                if (dto == voteDto) {
                    System.out.println("Already Present");
                    return true;
                }
            }
        }
        return false;
    }
}
