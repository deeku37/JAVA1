package com.xworkz.vote.repository;

import com.xworkz.vote.dto.VoteDto;

public interface VoteRepository {
    boolean save(VoteDto voteDto);
    VoteDto[] readAll();
}
