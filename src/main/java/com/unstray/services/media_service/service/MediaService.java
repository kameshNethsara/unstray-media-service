package com.unstray.services.media_service.service;

import com.unstray.services.media_service.dto.MediaUploadResponse;
import org.springframework.web.multipart.MultipartFile;

public interface MediaService {

    MediaUploadResponse uploadFile(MultipartFile file);
    void deleteFile(String objectName);
}
