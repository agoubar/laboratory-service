package com.manpower.laboratory.model.dto

import com.manpower.laboratory.model.entity.*
import java.time.LocalDate

class DatastoreDto {

    var id: Long = 0L
    var type: String = ""
    var name: String = ""
    val versions: List<DatastoreVersionDto>

    constructor(datastore: Datastore)  {
        this.id = datastore.id
        this.type = datastore.type
        this.name = datastore.name
        this.versions = datastore.versions.map { DatastoreVersionDto(it) }
    }
}

class DatastoreVersionDto {

    var number: String
    var endOfSupport: LocalDate
    var instances: List<DatastoreInstanceDto>

    constructor(datastoreVersion: DatastoreVersion) {
        this.number = datastoreVersion.number
        this.endOfSupport = datastoreVersion.endOfSupport
        this.instances = datastoreVersion.datastoreInstances.map { DatastoreInstanceDto(it) }
    }
}


class DatastoreInstanceDto {

    var id: Long = 0L
    var server = ServerDto(0L, "uknown", "uknown")
    val artifactInstances: Set<ArtifactInstance>

    constructor(datastoreInstance: DatastoreInstance) {
        this.id = datastoreInstance.id
        this.server = ServerDto(datastoreInstance.server.id, datastoreInstance.server.name, datastoreInstance.server.ip)
        this.artifactInstances = datastoreInstance.artifactInstances;
    }
}

