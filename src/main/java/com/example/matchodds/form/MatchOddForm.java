package com.example.matchodds.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString
@NoArgsConstructor
public class MatchOddForm {

    @Getter @Setter
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String specifier;

    @Getter @Setter
    @NotNull(message = "is required")
    private Double odd;

}
