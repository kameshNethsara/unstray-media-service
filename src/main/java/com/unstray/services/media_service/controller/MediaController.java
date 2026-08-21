package com.unstray.services.media_service.controller;

import com.unstray.services.media_service.dto.MediaUploadResponse;
import com.unstray.services.media_service.service.MediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/media")
@RequiredArgsConstructor
public class MediaController {

    private final MediaService mediaService;

    // POST /api/v1/media/upload
    @PostMapping(
            value = "/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public ResponseEntity<MediaUploadResponse> uploadFile(
            @RequestParam("file") MultipartFile file
    ) {

        MediaUploadResponse response =
                mediaService.uploadFile(file);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    // DELETE /api/v1/media/{objectName}
    @DeleteMapping
    public ResponseEntity<Void> deleteFile(
            @RequestParam String objectName
    ) {

        mediaService.deleteFile(objectName);

        return ResponseEntity.noContent().build();
    }
}
