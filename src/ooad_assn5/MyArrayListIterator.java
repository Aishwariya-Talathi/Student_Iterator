/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_assn5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author aishwariyatalathi
 */
public class MyArrayListIterator implements MyIterator {

    ArrayList<StudentData> Students = new ArrayList<>();
    int current, last;
    StudentData temp;

    public MyArrayListIterator(LAStudents lastudent) {
        current = 0;
        Students.addAll(lastudent.getStudents());
        last = Students.size();
        Collections.sort(Students, Comparator.comparing(StudentData::GetName));
    }

    @Override
    public void SetCurrent() {
        current = 0;
    }

    @Override
    public void Increment() {
        current++;
    }

    @Override
    public boolean end() {
        if (current == last) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public StudentData GetCurrentObject() {
        return Students.get(current);
    }

}
