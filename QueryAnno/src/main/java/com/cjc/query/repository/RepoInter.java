package com.cjc.query.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cjc.query.model.Student;

@Repository
public interface RepoInter extends JpaRepository<Student, Integer>{

	@Query("select st.lname from Student st where st.sid=:sid")//to find fname   lname
	String stuFind(@Param("sid")  int ss);

	@Query("from Student")
	List<Student> getAllStu();

	@Query(value="select * from Student stu where stu.fname=:fn",nativeQuery =  true)
	List<Student> getbyFname(@Param("fn") String fname);

	
	
}
