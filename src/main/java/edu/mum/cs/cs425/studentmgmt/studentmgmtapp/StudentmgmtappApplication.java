package edu.mum.cs.cs425.studentmgmt.studentmgmtapp;

import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.model.Student;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repository.ClassRoomRepository;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.studentmgmtapp.repository.TranscriptRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentmgmtappApplication implements CommandLineRunner {
    private StudentRepository studentRepository;
    private ClassRoomRepository classRoomRepository;
    private TranscriptRepository  transcriptRepository;

    public StudentmgmtappApplication(StudentRepository studentRepository, ClassRoomRepository classRoomRepository, TranscriptRepository transcriptRepository){
        this.studentRepository=studentRepository;
        this.classRoomRepository=classRoomRepository;
        this.transcriptRepository=transcriptRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello");
        Transcript t1= new Transcript("BS Computer Science");
        Classroom c1= new Classroom("McLaughlin building", "M105");
        Student s1= new Student("000-61-0001","Anna","Lynn","Smith",3.45, LocalDate.of(2019,5,24),c1,t1);
        saveStudent(s1);

    }
    private void saveStudent(Student student){
        System.out.println("Saving Student");
        this.studentRepository.save(student);

    }
}
