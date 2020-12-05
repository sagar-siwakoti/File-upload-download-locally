package com.file.upload.service;

import java.io.IOException;
import java.util.Objects;
import java.util.stream.Stream;

import com.file.upload.model.File;
import com.file.upload.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


/*
 * @created 05/12/2020-4:37 PM
 * @project file
 * @author Sagar Siwakoti
 */
@Service
public class FileUploadService {

    private FileRepository fileRepository;

    @Autowired
    public FileUploadService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }


    public void store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        File file1 = new File(fileName, file.getContentType(), file.getBytes());

        fileRepository.save(file1);
    }

    public File getFile(String id) {
        return fileRepository.findById(id).get();
    }

    public Stream<File> getAllFiles() {
        return fileRepository.findAll().stream();
    }
}

