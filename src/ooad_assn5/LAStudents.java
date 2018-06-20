/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_assn5;

import java.util.ArrayList;

/**
 *
 * @author aishwariyatalathi
 */
public class LAStudents {

    ArrayList<StudentData> Students;

    public LAStudents() {
        Students = new ArrayList<>(); //Loading Student Data
    }

    public void addStudent(String l, String f, String m, String c, int cha, int che, int qp) {
        StudentData studentdata = new StudentData(l, f, m, c, cha, che, qp);
        Students.add(studentdata);  //put student in ArrayList Students
    }

    public ArrayList getStudents() {
        return Students;
    }
}
