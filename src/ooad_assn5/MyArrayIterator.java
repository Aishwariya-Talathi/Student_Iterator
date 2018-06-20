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
public class MyArrayIterator implements MyIterator {

    StudentData[] TechStudentData;
    int current, last = 0;

    public MyArrayIterator(TechStudents techstudent) {
        current = 0;
        TechStudentData = techstudent.getStudents();
        for (StudentData sd : TechStudentData) {
            if (sd != null) {
                last++;
            }
        }
        //Using Bubble Sort to sort the array
        for (int a = 1; a < last; a++) {
            for (int b = 0; b < last - a; b++) {
                if (((TechStudentData[b].GetName())
                        .compareTo((TechStudentData[b + 1].GetName()))) > 0) {
                    // swap TechStudentData[b] with TechStudentData[b+1]
                    StudentData temp = TechStudentData[b];
                    TechStudentData[b] = TechStudentData[b + 1];
                    TechStudentData[b + 1] = temp;
                }
            }
        }
    }

    @Override
    public void SetCurrent() {
        current = 0;
    }

    @Override
    public void Increment() {
        if (current < last) {
            current++;
        }
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
        return TechStudentData[current];
    }
}
