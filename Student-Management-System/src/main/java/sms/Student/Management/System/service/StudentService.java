package sms.Student.Management.System.service;

import java.util.List;

import sms.Student.Management.System.entity.Student;

public interface StudentService {
   List<Student> getAllStudents();
   
   Student saveStudent(Student student);
   
   Student getStudentById(Long id);
   
   Student updateStudent(Student student);
   
   void deleteStudentById(Long id);
}
