package me.wuwenbin.noteblogv4.dao.repository;

import me.wuwenbin.noteblogv4.model.entity.NBUpload;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UploadRepository extends JpaRepository<NBUpload, Long> {
}
