package io.spings.Ravi.controller;

import io.spings.Ravi.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    private static final String UPLOAD_DIR = "src/main/resources/static/image";


    @PostMapping("/file")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "Please select a file to upload!";
        }

        try {
            // Create directory if not exists
            Files.createDirectories(Paths.get(UPLOAD_DIR));

            // Save the file
            Path filePath = Paths.get(UPLOAD_DIR + file.getOriginalFilename());
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            return "File uploaded successfully: " + file.getOriginalFilename();
        } catch (IOException e) {
            return "Failed to upload file: " + e.getMessage();
        }
    }
}
