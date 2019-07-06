package com.manpower.laboratory.resource

import com.manpower.laboratory.exception.ResourceNotFoundException
import com.manpower.laboratory.model.entity.Server
import java.net.URI
import javax.inject.Inject
import javax.persistence.EntityManager
import javax.transaction.Transactional
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("/servers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class ServerResource {

    @GET
    fun list() = Server.listAll<Server>()

    @GET
    @Path("/{id}")
    fun get(@PathParam("id") id: Long) = Server.findById<Server>(id) ?: throw ResourceNotFoundException()

    @POST
    @Transactional
    fun add(Server: Server): Response {
        Server.persist()
        return Response.created(URI("/Servers/${Server.id}")).build()
    }

}