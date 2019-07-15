package com.manpower.laboratory.resource

import com.manpower.laboratory.model.dto.DatastoreDto
import com.manpower.laboratory.model.entity.Datastore
import com.manpower.laboratory.model.entity.DatastoreInstance
import com.manpower.laboratory.model.entity.DatastoreVersion
import com.manpower.laboratory.model.entity.Server
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/datastores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class DatastoreResource {

    @GET
    fun list(): List<DatastoreDto> = Datastore.listAll<Datastore>().map { DatastoreDto(it) }

}
