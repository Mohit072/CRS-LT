/**
 * 
 */
package com.srs.lt.business;
import com.srs.lt.bean.Student;

import java.util.List;

/**
 * @author user208
 *
 */
public interface ProfessorInterface {
    Boolean  addGrade (int studentId, java.lang.String courseCode, java.lang.String grade);
    String getCourses(String profId);
    String getProfessorById(String profId);
    List<Student> viewEnrolledStudents(String profId);

}
