package org.example.bookmyshowsst.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class City extends BaseModel {
    private String name;
    private String pincode;
}
