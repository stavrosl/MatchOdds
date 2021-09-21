package com.example.matchodds.controller;

import com.example.matchodds.dto.MatchDto;
import com.example.matchodds.form.MatchForm;
import com.example.matchodds.mapper.MatchMapper;
import com.example.matchodds.service.def.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class MatchController {

    final private MatchService matchService;
    final private MatchMapper matchMapper;

    @Autowired
    public MatchController(MatchService matchService, MatchMapper matchMapper) {
        this.matchService = matchService;
        this.matchMapper = matchMapper;
    }

    @GetMapping("/match/allMatches")
    public List<MatchDto> getAllMatches() {
        return matchService.getAllMatches()
                .stream()
                .map(matchMapper::matchToMatchDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/match/{id}")
    public MatchDto getMatchById(@PathVariable(name = "id") Integer id) {
        return matchMapper.matchToMatchDto(matchService.getMatch(id));
    }

    @PostMapping("/match")
    public void saveMatch(@Valid @RequestBody MatchForm matchForm,
                          BindingResult bindingResult) {
        if(!bindingResult.hasErrors()) {
            matchService.saveOrUpdateMatch(matchMapper.matchFormToMatch(matchForm));
        }
    }

    @PutMapping("/match")
    public void updateMatch(@Valid @RequestBody MatchForm matchForm,
                                      BindingResult bindingResult) {
        if(!bindingResult.hasErrors()) {
            matchService.saveOrUpdateMatch(matchMapper.matchFormToMatch(matchForm));
        }
    }

    @DeleteMapping("/match/{id}")
    public void deleteMatch(@PathVariable(name = "id") Integer id) {
        matchService.deleteMatch(matchService.getMatch(id));
    }
}
