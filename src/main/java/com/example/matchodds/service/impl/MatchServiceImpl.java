package com.example.matchodds.service.impl;

import com.example.matchodds.entity.Match;
import com.example.matchodds.repository.MatchRepository;
import com.example.matchodds.service.def.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    @Autowired
    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public Match getMatch(Integer id) {
        return matchRepository.getById(id);
    }

    @Override
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    @Override
    public void saveOrUpdateMatch(Match match) {
        matchRepository.save(match);
    }

    @Override
    public void deleteMatch(Match match) {
        matchRepository.delete(match);
    }
}
