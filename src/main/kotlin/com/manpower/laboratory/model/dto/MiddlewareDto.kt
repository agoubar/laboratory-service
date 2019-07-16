package com.manpower.laboratory.model.dto

import com.manpower.laboratory.model.entity.ArtifactInstance
import com.manpower.laboratory.model.entity.Middleware
import com.manpower.laboratory.model.entity.MiddlewareInstance
import com.manpower.laboratory.model.entity.MiddlewareVersion
import java.time.LocalDate

class MiddlewareDto {
    var id: Long = 0L
    var type: String = ""
    var name: String = ""
    val versions: List<MiddlewareVersionDto>

    constructor(middleware: Middleware)  {
        this.id = middleware.id
        this.type = middleware.type
        this.name = middleware.name
        this.versions = middleware.versions.map { MiddlewareVersionDto(it) }
    }
}

class MiddlewareVersionDto {

    var number: String
    val editor: String
    var endOfSupport: LocalDate
    var instances: List<MiddlewareInstanceDto>

    constructor(middlewareVersion: MiddlewareVersion) {
        this.number = middlewareVersion.number
        this.endOfSupport = middlewareVersion.endOfSupport
        this.instances = middlewareVersion.middlewareInstances.map { MiddlewareInstanceDto(it) }
        this.editor = middlewareVersion.editor
    }
}


class MiddlewareInstanceDto {

    var id: Long = 0L
    var server = ServerDto(0L, "uknown", "uknown")
    val artifactInstances: Set<ArtifactInstance>

    constructor(middlewareInstance: MiddlewareInstance) {
        this.id = middlewareInstance.id
        this.server = ServerDto(middlewareInstance.server.id, middlewareInstance.server.name, middlewareInstance.server.ip)
        this.artifactInstances = middlewareInstance.artifactInstances;
    }
}