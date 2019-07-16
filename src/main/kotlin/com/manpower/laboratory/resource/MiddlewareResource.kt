package com.manpower.laboratory.resource

import com.manpower.laboratory.model.dto.MiddlewareDto
import com.manpower.laboratory.model.entity.Middleware
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/middlewares")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class MiddlewareResource {

    @GET
    fun list() = Middleware.listAll<Middleware>().map { MiddlewareDto(it) }


}
