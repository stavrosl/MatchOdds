package com.example.matchodds.service.impl;

import com.example.matchodds.entity.Match;
import com.example.matchodds.repository.MatchRepository;
import com.example.matchodds.service.def.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    @Autowired
    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override @Transactional
    public Match getMatch(Integer id) {
        return matchRepository.getById(id);
    }

    @Override @Transactional
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    @Override @Transactional
    public void saveOrUpdateMatch(Match match) {
        matchRepository.save(match);
    }

    @Override @Transactional
    public void deleteMatch(Match match) {
        matchRepository.delete(match);
    }
}
