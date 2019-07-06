package com.manpower.laboratory.model.entity;

import com.manpower.laboratory.model.enumeration.EnvironmentType;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;

@Entity(name = "artifact_instance")
public class ArtifactInstance extends CustomPanacheEntity {

    @Enumerated(EnumType.STRING)
    public EnvironmentType environmentType;

    @ManyToOne
    @JoinColumn(name="artifact_version_id", nullable=false)
    @JsonbTransient
    public ArtifactVersion artifactVersion;

    @ManyToOne
    @JoinColumn(name="server_id", nullable=false)
    @JsonbTransient
    public Server server;

}
