package com.manpower.laboratory.model.dto

import com.manpower.laboratory.model.entity.Artifact
import com.manpower.laboratory.model.entity.ArtifactInstance
import com.manpower.laboratory.model.entity.ArtifactVersion

class ArtifactDto(artifact: Artifact) {
    val artifactId = artifact.artifactId
    val groupId = artifact.groupId
    val versions = artifact.versions.map { ArtifactVersionDto(it) }
}

class ArtifactVersionDto(artifactVersion: ArtifactVersion) {
    val number = artifactVersion.number
    val instances = artifactVersion.artifactInstances.map { ArtifactInstanceDto(it) }
}

class ArtifactInstanceDto(artifactInstance: ArtifactInstance) {
    val environmentType: String = artifactInstance.environmentType.name
}
