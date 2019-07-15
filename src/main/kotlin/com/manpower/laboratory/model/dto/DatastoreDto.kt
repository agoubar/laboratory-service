package com.manpower.laboratory.model.dto

import com.manpower.laboratory.model.entity.Datastore
import com.manpower.laboratory.model.entity.DatastoreInstance
import com.manpower.laboratory.model.entity.DatastoreVersion
import java.time.LocalDate

class DatastoreDto {

    var type: String = ""
    var name: String = ""
    val versions: List<DatastoreVersionDto>

    constructor(datastore: Datastore)  {
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
    constructor(datastoreInstance: DatastoreInstance) {
    }
}

