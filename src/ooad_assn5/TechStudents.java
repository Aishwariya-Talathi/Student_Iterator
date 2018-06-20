/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_assn5;

/**
 *
 * @author aishwariyatalathi
 */
public class TechStudents {

    static final int NumUTS = 1000;
    int current_position;
    StudentData[] TechStudentData; //sized to NumUTS

    public TechStudents() {
        TechStudentData = new StudentData[NumUTS]; //Loading Student Data
        current_position = 0;
    }

    public void addStudent(String l, String f, String m, String c, int cha, int che, int qp) {
        if (current_position < NumUTS) {
            StudentData studentdata = new StudentData(l, f, m, c, cha, che, qp);
            TechStudentData[current_position] = studentdata; //put student in array TechStudentData
            current_position++;
        }
    }

    public StudentData[] getStudents() {
        return TechStudentData;
    }
}
