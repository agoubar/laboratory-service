package com.manpower.laboratory.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Datastore extends CustomPanacheEntity {

    public String type;
    public String name;

    @OneToMany(mappedBy = "datastore", cascade = CascadeType.ALL)
    @JsonbTransient
    public List<DatastoreVersion> versions;
}
