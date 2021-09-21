package com.example.matchodds.mapper;

import com.example.matchodds.entity.MatchOdd;
import com.example.matchodds.form.MatchOddForm;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface MatchOddMapper {
    MatchOdd matchOddFormToMatchOdd(MatchOddForm matchOddForm);
}
