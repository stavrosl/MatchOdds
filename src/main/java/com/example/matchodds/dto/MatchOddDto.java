package com.example.matchodds.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString
@NoArgsConstructor
public class MatchOddDto {

    @Getter @Setter
    private String specifier;

    @Getter @Setter
    private Double odd;

}
