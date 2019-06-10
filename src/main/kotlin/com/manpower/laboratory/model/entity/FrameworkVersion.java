package com.manpower.laboratory.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity(name = "framework_version")
public class FrameworkVersion extends CustomPanacheEntity {

    public String number;

    @ManyToOne
    @JoinColumn(name="framework_id", nullable=false)
    public Framework framework;

    @ManyToMany(mappedBy = "frameworkVersions")
    @JsonbTransient
    public Set<ArtifactVersion> artifactVersions;

}
