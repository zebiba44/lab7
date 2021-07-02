package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.model;

import javax.persistence.*;
import java.util.StringJoiner;
@Entity
@Table(name = "transcript")
public class Transcript {
    public Transcript() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transcriptId;
    private String degreeTitle;

    public Integer getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(Integer transcriptId) {
        this.transcriptId = transcriptId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Transcript.class.getSimpleName() + "[", "]")
                .add("transcriptId=" + transcriptId)
                .add("degreeTitle='" + degreeTitle + "'")
                .toString();
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public Transcript(Integer transcriptId, String degreeTitle) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;
    }
}