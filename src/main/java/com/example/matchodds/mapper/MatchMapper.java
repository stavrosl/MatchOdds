package com.example.matchodds.mapper;

import com.example.matchodds.dto.MatchDto;
import com.example.matchodds.entity.Match;
import com.example.matchodds.form.MatchForm;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface MatchMapper {
    @Mapping(source = "category", target = "sport")
    Match matchFormToMatch(MatchForm matchForm);
    @Mapping(source = "sport", target = "category")
    MatchDto matchToMatchDto(Match match);
}
