package com.manpower.laboratory.resource

import com.manpower.laboratory.exception.ResourceNotFoundException
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

    @GET
    @Path("/{id}")
    fun get(@PathParam("id") id: Long): MiddlewareDto {
        val middleware = Middleware.findById<Middleware>(id) ?: throw ResourceNotFoundException()
        return MiddlewareDto(middleware)
    }



}
