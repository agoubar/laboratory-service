package com.manpower.laboratory.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.util.List;

@Entity(name = "datastore_version")
public class DatastoreVersion extends CustomPanacheEntity {

    public String number;

    @ManyToOne
    @JoinColumn(name="datastore_id", nullable=false)
    public Datastore datastore;

    @OneToMany(mappedBy = "datastoreVersion", cascade = CascadeType.ALL)
    @JsonbTransient
    public List<DatastoreInstance> datastoreInstances;

}
