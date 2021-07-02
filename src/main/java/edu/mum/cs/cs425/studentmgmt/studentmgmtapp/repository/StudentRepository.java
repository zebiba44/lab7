package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repository;

import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
