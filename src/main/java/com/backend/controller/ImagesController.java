package com.backend.controller;

import com.backend.service.IImagesService;
import com.backend.service.IThumbnailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/images")
public class ImagesController {

    @Autowired
    private IImagesService iImagesService;

    @GetMapping("/getAllImages")
    public ResponseEntity<?> getAllImages() {
        return ResponseEntity.ok(iImagesService.getAll());
    }
}
