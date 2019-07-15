package com.manpower.laboratory.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Server extends CustomPanacheEntity {

    public String name;
    public String ip;

    @ManyToOne
    @JoinColumn(name="os_version_id", nullable=false)
    public OSVersion osVersion;

    @OneToMany(mappedBy = "server", cascade = CascadeType.ALL)
    @JsonbTransient
    public List<ArtifactInstance> artifactInstances;

    @OneToMany(mappedBy = "server", cascade = CascadeType.ALL)
    @JsonbTransient
    public List<MiddlewareInstance> middlewareInstances;

    @OneToMany(mappedBy = "server", cascade = CascadeType.ALL)
    @JsonbTransient
    public List<DatastoreInstance> datastoreInstances;

}
