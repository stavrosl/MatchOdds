package com.example.matchodds.entity;

import com.example.matchodds.enums.Sport;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ToString @NoArgsConstructor
@Entity @Table(name = "match")
public class Match {

    @Getter @Setter
    @Column(name = "id", nullable = false)
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter
    @Column(name = "description", nullable = false)
    private String description;

    @Getter @Setter
    @Temporal(value = TemporalType.DATE)
    @Column(name = "match_date", nullable = false)
    private Date match_date;

    @Getter @Setter
    @Column(name = "match_time", nullable = false)
    private String match_time;

    @Getter @Setter
    @Column(name = "team_a", nullable = false)
    private String team_a;

    @Getter @Setter
    @Column(name = "team_b", nullable = false)
    private String team_b;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "sport", nullable = false)
    private Sport sport;

    @Getter @Setter
    @OneToMany(mappedBy="match",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    private List<MatchOdd> matchOdds;

    // add convenience methods for bi-directional relationship
    public void add(MatchOdd matchOdd) {
        if (matchOdds == null) {
            matchOdds = new ArrayList<>();
        }
        matchOdds.add(matchOdd);
        matchOdd.setMatch(this);
    }

}
