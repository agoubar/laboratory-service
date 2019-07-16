package com.manpower.laboratory.model.entity;

import com.manpower.laboratory.model.enumeration.EnvironmentType;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.util.List;

@Entity(name = "artifact_instance")
public class ArtifactInstance extends CustomPanacheEntity {

    @Enumerated(EnumType.STRING)
    public EnvironmentType environmentType;

    @ManyToOne
    @JoinColumn(name="artifact_version_id", nullable=false)
    public ArtifactVersion artifactVersion;

    @ManyToOne
    @JoinColumn(name="server_id", nullable=false)
    @JsonbTransient
    public Server server;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "artifact_datastore",
            joinColumns = { @JoinColumn(name = "artifact_instance_id") },
            inverseJoinColumns = { @JoinColumn(name = "datastore_instance_id") }
    )
    @JsonbTransient
    public List<DatastoreInstance> datastoreInstances;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "artifact_middleware",
            joinColumns = { @JoinColumn(name = "artifact_instance_id") },
            inverseJoinColumns = { @JoinColumn(name = "middleware_instance_id") }
    )
    @JsonbTransient
    public List<MiddlewareInstance> middlewareInstances;

}
