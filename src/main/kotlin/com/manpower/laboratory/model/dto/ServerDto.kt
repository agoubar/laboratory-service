package com.manpower.laboratory.model.dto

import java.time.LocalDate

class ServerDto(
        val id: Long,
        val name: String,
        val ip: String,
        val osVersion: OSVersionDto
)

class OSDto (
        val name: String
)

class OSVersionDto (
        val number: String,
        val endOfSupport: LocalDate,
        val os: OSDto
)
