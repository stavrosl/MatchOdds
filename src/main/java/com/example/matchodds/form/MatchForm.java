package com.example.matchodds.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@ToString
@NoArgsConstructor
public class MatchForm {

    @Getter @Setter
    @NotNull(message = "is required")
    @Size(min = 4, message = "is required")
    private String description;

    @Getter @Setter
    @NotNull(message = "is required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date match_date;

    @Getter @Setter
    @NotNull(message = "is required")
    @Size(min = 4, message = "is required")
    private String match_time;

    @Getter @Setter
    @NotNull(message = "is required")
    @Size(min = 4, message = "is required")
    private String team_a;

    @Getter @Setter
    @NotNull(message = "is required")
    @Size(min = 4, message = "is required")
    private String team_b;

    @Getter @Setter
    @NotNull(message = "is required")
    private String category;

    @Getter @Setter
    @NotNull(message = "is required")
    List<MatchOddForm> matchOdds;


}
