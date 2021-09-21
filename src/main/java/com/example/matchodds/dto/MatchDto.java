package com.example.matchodds.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@ToString
@NoArgsConstructor
public class MatchDto {

    @Getter @Setter
    private String description;

    @Getter @Setter
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date match_date;

    @Getter @Setter
    private String match_time;

    @Getter @Setter
    private String team_a;

    @Getter @Setter
    private String team_b;

    @Getter @Setter
    private String category;

    @Getter @Setter
    List<MatchOddDto> matchOdds;

}
