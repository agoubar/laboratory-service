package com.manpower.laboratory.model.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class OS extends CustomPanacheEntity {

    public String name;

    @JsonbTransient
    @OneToMany(mappedBy = "os", cascade = CascadeType.ALL)
    public List<OSVersion> versions;

}
