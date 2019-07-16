package com.manpower.laboratory.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity(name = "middleware_instance")
public class MiddlewareInstance extends CustomPanacheEntity {

    @ManyToOne
    @JoinColumn(name="middleware_version_id", nullable=false)
    public MiddlewareVersion middlewareVersion;

    @ManyToOne
    @JoinColumn(name="server_id", nullable=false)
    @JsonbTransient
    public Server server;

    @ManyToMany(mappedBy = "middlewareInstances")
    @JsonbTransient
    public Set<ArtifactInstance> artifactInstances;
}
