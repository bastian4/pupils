package pl.sebastian;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pupil {

    private int id;
    private String name;
    private int classNumber;
    private char classLetter;
    private int absenceCount;

}