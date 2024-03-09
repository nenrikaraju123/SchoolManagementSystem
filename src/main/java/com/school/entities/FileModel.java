package com.school.entities;

public class FileModel {
	String videoFileName;

	public FileModel(String videoFileName) {
		super();
		this.videoFileName = videoFileName;
	}

	public FileModel() {
		super();
	}

	@Override
	public String toString() {
		return "FileModel [videoFileName=" + videoFileName + "]";
	}

	public String getVideoFileName() {
		return videoFileName;
	}

	public void setVideoFileName(String videoFileName) {
		this.videoFileName = videoFileName;
	}
	

}
