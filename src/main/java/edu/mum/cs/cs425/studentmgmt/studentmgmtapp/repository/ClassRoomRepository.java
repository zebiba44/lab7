package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repository;

import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.model.Classroom;
import org.springframework.data.repository.CrudRepository;

public interface ClassRoomRepository extends CrudRepository<Classroom,Integer> {
}
