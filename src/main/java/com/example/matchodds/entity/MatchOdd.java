package com.example.matchodds.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@Entity
@Table(name = "match_odds")
public class MatchOdd {

    @Getter
    @Setter
    @Column(name = "id", nullable = false)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter
    @Column(name = "specifier", nullable = false)
    private String specifier;

    @Getter @Setter
    @Column(name = "odd", nullable = false)
    private Double odd;

    @Getter @Setter @ToString.Exclude
    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="match_id")
    private Match match;

}
