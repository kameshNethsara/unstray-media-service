package com.unstray.services.media_service.service;

import com.unstray.services.media_service.dto.MediaUploadResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface MediaService {

    MediaUploadResponse uploadFile(MultipartFile file);
    List<MediaUploadResponse> uploadMultipleFiles(List<MultipartFile> files);
    void deleteFile(String objectName);
}
