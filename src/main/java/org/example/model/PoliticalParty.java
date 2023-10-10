package org.example.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class PoliticalParty {

    private String name;

    private String logo;

    private String owner;

    private String leader;

    private String secretary;

    private String actualRating;

    private BigDecimal votes;

}
