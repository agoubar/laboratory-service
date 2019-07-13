package com.manpower.laboratory.model.entity;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.util.List;

@Entity(name = "middleware_version")
public class MiddlewareVersion extends CustomPanacheEntity {

    public String number;
    public String editor;

    @ManyToOne
    @JoinColumn(name="middleware_id", nullable=false)
    public Middleware middleware;

    @OneToMany(mappedBy = "middlewareVersion", cascade = CascadeType.ALL)
    @JsonbTransient
    public List<MiddlewareInstance> middlewareInstances;

}
