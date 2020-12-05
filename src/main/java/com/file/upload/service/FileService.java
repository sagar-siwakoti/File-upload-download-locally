package com.file.upload.service;

import java.io.IOException;
import java.util.stream.Stream;

import com.file.upload.model.File;
import com.file.upload.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


/*
 * @created 05/12/2020-4:37 PM
 * @project file
 * @author Sagar Siwakoti
 */
public class FileService {
    @Autowired
    private FileRepository fileRepository;

    public File store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        File File = new File(fileName, file.getContentType(), file.getBytes());

        return fileRepository.save(File);
    }

    public File getFile(String id) {
        return fileRepository.findById(id).get();
    }

    public Stream<File> getAllFiles() {
        return fileRepository.findAll().stream();
    }
}

