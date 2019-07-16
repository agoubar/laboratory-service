package com.manpower.laboratory.resource

import com.manpower.laboratory.exception.ResourceNotFoundException
import com.manpower.laboratory.model.dto.DatastoreDto
import com.manpower.laboratory.model.entity.Datastore
import com.manpower.laboratory.model.entity.DatastoreVersion
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/datastores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class DatastoreResource {

    @GET
    fun list(): List<DatastoreDto> = Datastore.listAll<Datastore>().map { DatastoreDto(it) }

    @GET
    @Path("/{id}")
    fun get(@PathParam("id") id: Long): DatastoreDto {
        val datastore = Datastore.findById<Datastore>(id) ?: throw ResourceNotFoundException()
        return DatastoreDto(datastore)
    }

    @GET
    @Path("/{id}/versions")
    fun getVersions(@PathParam("id") id: Long): List<Datastore> {
        val datastore = Datastore.findById<Datastore>(id)
        return DatastoreVersion.list("datastore", datastore)
    }


}
