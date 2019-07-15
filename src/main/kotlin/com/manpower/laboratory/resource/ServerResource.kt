package com.manpower.laboratory.resource

import com.manpower.laboratory.exception.ResourceNotFoundException
import com.manpower.laboratory.model.entity.ArtifactInstance
import com.manpower.laboratory.model.entity.DatastoreInstance
import com.manpower.laboratory.model.entity.MiddlewareInstance
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


    @GET
    @Path("/{id}/middlewares")
    fun getMiddlewares(@PathParam("id") id: Long): List<MiddlewareInstance> {
        val server = Server.findById<Server>(id) ?: throw ResourceNotFoundException()
        return MiddlewareInstance.list("server", server)
    }

    @GET
    @Path("/{id}/artifacts")
    fun getArtifacts(@PathParam("id") id: Long): List<ArtifactInstance> {
        val server = Server.findById<Server>(id) ?: throw ResourceNotFoundException()
        return ArtifactInstance.list("server", server)
    }
    
    @GET
    @Path("/{id}/datastores")
    fun getDatastores(@PathParam("id") id: Long): List<DatastoreInstance> {
        val server = Server.findById<Server>(id) ?: throw ResourceNotFoundException()
        return DatastoreInstance.list("server", server)
    }

    @POST
    @Transactional
    fun add(Server: Server): Response {
        Server.persist()
        return Response.created(URI("/Servers/${Server.id}")).build()
    }

}
