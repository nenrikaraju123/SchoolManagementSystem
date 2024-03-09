package com.school.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

import com.school.entities.FileModel;

public interface FileService {
	FileModel uploadVideo(String path,MultipartFile file) throws IOException;
	InputStream getVideoFile(String path,String fileName,Integer id) throws FileNotFoundException;

}
