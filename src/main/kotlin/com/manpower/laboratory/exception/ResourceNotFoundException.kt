package com.manpower.laboratory.exception

import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

class ResourceNotFoundException : Exception()

@Provider
class ResourceNotFoundExceptionMapper : ExceptionMapper<ResourceNotFoundException> {

    override fun toResponse(exception: ResourceNotFoundException): Response {
        return Response.status(404).build()
    }
}