package com.idea_festival.data.remote.datasource

import com.idea_festival.data.remote.dto.image.ImageUploadRequest
import com.idea_festival.data.remote.dto.image.ImageUploadWithCodeRequest
import kotlinx.coroutines.flow.Flow

interface ImageDataSource {
    suspend fun uploadImage(body: ImageUploadRequest): Flow<Unit>
    suspend fun uploadImageWithCode(body: ImageUploadWithCodeRequest): Flow<Unit>
}