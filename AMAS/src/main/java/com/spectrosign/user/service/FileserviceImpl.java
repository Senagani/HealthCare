package com.spectrosign.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spectrosign.user.dao.IFileUploadDao;
import com.spectrosign.user.model.IdUpload;
@Service
public class FileserviceImpl implements Ifileservice {
private IFileUploadDao dao;
	public void save(IdUpload user) {
		dao.save(user);
		
	}

	public List<IdUpload> getFiles(IdUpload user) {
		
		return dao.getFiles(user);
	}

}
