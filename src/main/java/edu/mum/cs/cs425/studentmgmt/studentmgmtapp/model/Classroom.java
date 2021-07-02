package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.model;

import javax.persistence.*;
import java.util.StringJoiner;

@Entity
@Table(name = "classroom")
public class Classroom {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classRoomId;
    private String buildingName;
    private String roomNumber;

    public Classroom() {

    }
    public Classroom(Integer classRoomId, String buildingName, String roomNumber) {
        this.classRoomId = classRoomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public Classroom(String buildingName, String roomNumber) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public Integer getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(Integer classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", Classroom.class.getSimpleName() + "[", "]")
                .add("classRoomId=" + classRoomId)
                .add("buildingName='" + buildingName + "'")
                .add("roomNumber='" + roomNumber + "'")
                .toString();
    }
}
