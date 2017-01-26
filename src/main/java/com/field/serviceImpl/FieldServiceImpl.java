package com.field.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.field.dao.FieldsDao;
import com.field.domain.Fields;
import com.field.service.FieldService;

public class FieldServiceImpl implements FieldService {

	@Autowired
	private FieldsDao fieldsDao;

	@Override
	public List<Fields> findAll() {
		return (List<Fields>) fieldsDao.findAll();
	}

	@Override
	public Fields insert(Fields arg0) {
		// TODO Auto-generated method stub
		return fieldsDao.save(arg0);
	}

	@Override
	public void delete(Fields arg0) {
		fieldsDao.delete(arg0);

	}

	@Override
	public Fields findOne(Fields arg0) {
		// TODO Auto-generated method stub
		return fieldsDao.findOne(arg0.getField_id());
	}

}