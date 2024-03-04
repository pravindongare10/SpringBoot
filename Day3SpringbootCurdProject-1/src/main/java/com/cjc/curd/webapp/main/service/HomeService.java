package com.cjc.curd.webapp.main.service;

import com.cjc.curd.webapp.main.model.Student;

public interface HomeService
{

	public void saveData(Student s);
	
	public void logincheck(String un,String pass);
	
	public Iterable<Student>displayAllData();
	
	public void deleteData(Student s);
	
	public Student editData(int uid);
}
