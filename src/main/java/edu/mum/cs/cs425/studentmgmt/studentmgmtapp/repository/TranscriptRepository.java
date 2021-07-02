package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repository;

import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.model.Transcript;
import org.springframework.data.repository.CrudRepository;

public interface TranscriptRepository extends CrudRepository<Transcript,Integer> {
}
