package com.cjc.curd.webapp.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.curd.webapp.main.model.Student;
import com.cjc.curd.webapp.main.repository.HomeRepository;
import com.cjc.curd.webapp.main.service.HomeService;


@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Student s) 
	{
		
		hr.save(s);
		
	}

	@Override
	public void logincheck(String un, String pass) {
		
		hr.findAllByUnameAndPassword(un, pass);
	}

	@Override
	public Iterable<Student> displayAllData() {
		
		return hr.findAll();
	}

	@Override
	public void deleteData(Student s) {
		hr.delete(s);	
	}

	@Override
	public Student editData(int uid) {
		hr.findAllByUid(uid);
		return null;
	}

	
}