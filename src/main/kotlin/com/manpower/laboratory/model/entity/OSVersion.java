package com.manpower.laboratory.model.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.util.List;

@Entity(name = "os_version")
public class OSVersion extends CustomPanacheEntity {

    public String number;

    @ManyToOne
    @JoinColumn(name="os_id", nullable=false)
    public OS os;

    @JsonbTransient
    @OneToMany(mappedBy = "osVersion", cascade = CascadeType.ALL)
    public List<Server> servers;

}
