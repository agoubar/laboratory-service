package com.manpower.laboratory.model.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.util.List;

@Entity(name = "artifact_version")
public class ArtifactVersion extends CustomPanacheEntity {

    public String number;

    @ManyToOne
    @JoinColumn(name="artifact_id", nullable=false)
    public Artifact artifact;

    @OneToMany(mappedBy = "artifactVersion", cascade = CascadeType.ALL)
    @JsonbTransient
    public List<ArtifactInstance> artifactInstances;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JsonbTransient
    @JoinTable(
            name = "artifact_framework",
            joinColumns = { @JoinColumn(name = "artifact_version_id") },
            inverseJoinColumns = { @JoinColumn(name = "framework_version_id") }
    )
    public List<FrameworkVersion> frameworkVersions;

    public ArtifactVersion() {
    }

    public ArtifactVersion(String number) {
        this.number = number;
    }

}
