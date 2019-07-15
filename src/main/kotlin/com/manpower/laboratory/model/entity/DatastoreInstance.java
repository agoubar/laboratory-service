package com.manpower.laboratory.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "datastore_instance")
public class DatastoreInstance extends CustomPanacheEntity {

    @ManyToOne
    @JoinColumn(name="datastore_version_id", nullable=false)
    public DatastoreVersion datastoreVersion;

    @ManyToOne
    @JoinColumn(name="server_id", nullable=false)
    @JsonbTransient
    public Server server;


}
