package org.example.bookmyshowsst.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity(name = "shows")
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;

    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Screen screen;

    @Enumerated(EnumType.ORDINAL)
//    this say it's not a simple attribute but an enum
//    ordinal means store the values of the features instead of the string format
    @ElementCollection
//    this is only required when you have a list of enum
    private List<Feature> features;

    private String languages;
}

/*

Show -- Movie -> many-one

Show -- Screen -> many-one

when it's a list of enum don't define the cardinality

 */