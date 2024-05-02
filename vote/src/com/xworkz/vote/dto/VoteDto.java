package com.xworkz.vote.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class VoteDto {
    private String voterName;
    private String candidateName;
    private int voteNumber;

    @Override
    public String toString() {
        return "VoterName: " + voterName + ", CandidateName: " + candidateName + ", VoteNumber: " + voteNumber;
    }
}
