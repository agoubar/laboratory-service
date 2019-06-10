package com.manpower.laboratory.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Framework extends CustomPanacheEntity {

    public String name;

    @JsonbTransient
    @OneToMany(mappedBy = "framework", cascade = CascadeType.ALL)
    public List<FrameworkVersion> versions;

}
