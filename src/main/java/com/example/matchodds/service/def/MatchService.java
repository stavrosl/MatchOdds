package com.example.matchodds.service.def;

import com.example.matchodds.entity.Match;

import java.util.List;

public interface MatchService {

    Match getMatch(Integer id);
    List<Match> getAllMatches();
    void saveOrUpdateMatch(Match match);
    void deleteMatch(Match match);
}
