package com.file.upload.repository;

import com.file.upload.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @created 05/12/2020-4:37 PM
 * @project file
 * @author Sagar Siwakoti
 */
@Repository
public interface FileRepository extends JpaRepository<File, String> {

}
