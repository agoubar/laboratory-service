package com.manpower.laboratory.model.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@RegisterForReflection
public class Artifact extends CustomPanacheEntity {

    public String artifactId;
    public String groupId;

    @OneToMany(mappedBy = "artifact", cascade = CascadeType.ALL)
    public List<ArtifactVersion> versions;

    public Artifact() {
    }

    public Artifact(String artifactId, String groupId) {
        this.artifactId = artifactId;
        this.groupId = groupId;
    }
}
