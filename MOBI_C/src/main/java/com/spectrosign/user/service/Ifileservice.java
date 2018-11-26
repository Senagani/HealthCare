package com.spectrosign.user.service;

import java.util.List;

import com.spectrosign.user.model.IdUpload;

public interface Ifileservice {

	public void save(IdUpload user);
	public List<IdUpload> getFiles(IdUpload user);

}
