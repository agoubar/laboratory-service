package com.manpower.laboratory.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Middleware extends CustomPanacheEntity {

    public String code;
    public String name;

    @OneToMany(mappedBy = "middleware", cascade = CascadeType.ALL)
    @JsonbTransient
    public List<MiddlewareVersion> versions;

}
