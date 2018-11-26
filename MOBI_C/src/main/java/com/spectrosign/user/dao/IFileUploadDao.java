package com.spectrosign.user.dao;

import java.util.List;
import com.spectrosign.user.model.IdUpload;


public interface IFileUploadDao {
public void save(IdUpload id);

public List<IdUpload> getFiles(IdUpload user);
;

}
