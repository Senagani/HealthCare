package com.spectrosign.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spectrosign.user.model.IdUpload;
import com.spectrosign.user.model.User;
@Repository
@Transactional
public class FileUploadDaoimpl implements IFileUploadDao{
	@Autowired
private HibernateTemplate ht;
	public void save(IdUpload user) {
		ht.save(user);
		
	}

	public List<IdUpload> getFiles(IdUpload user) {
		
		return ht.loadAll(IdUpload.class);
	}
	

}
