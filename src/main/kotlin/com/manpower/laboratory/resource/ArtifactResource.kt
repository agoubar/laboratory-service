package com.manpower.laboratory.resource

import com.manpower.laboratory.exception.ResourceNotFoundException
import com.manpower.laboratory.model.entity.Artifact
import com.manpower.laboratory.model.entity.ArtifactVersion
import java.net.URI
import javax.inject.Inject
import javax.transaction.Transactional
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.persistence.EntityManager



@Path("/artifacts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class ArtifactResource {

    @GET
    fun list() = Artifact.listAll<Artifact>()

    @GET
    @Path("/{id}")
    fun get(@PathParam("id") id: Long) = Artifact.findById<Artifact>(id) ?: throw ResourceNotFoundException()

    @POST
    @Transactional
    fun add(artifact: Artifact): Response {
        artifact.persist()
        return Response.created(URI("/artifacts/${artifact.id}")).build()
    }

}