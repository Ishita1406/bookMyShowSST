package org.example.bookmyshowsst.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id // primarykey column
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremented
    private long id;
    private Date createdAt;
    private Date lastModifiedAt;
}
