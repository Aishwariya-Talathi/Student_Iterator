/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_assn5;

import java.text.DecimalFormat;

/**
 *
 * @author aishwariyatalathi
 */
public class OOAD_Assn5 {

    public static void main(String[] args) {
        LAStudents lastudent = new LAStudents();
        lastudent.addStudent("Wagner", "Richardo", "English", "LA", 80, 80, 240);
        lastudent.addStudent("DerfleigendeHollaender", "Albert", "History", "LA", 45, 45, 100);
        lastudent.addStudent("Walkure", "B", "PoliSci", "LA", 128, 124, 270);
        lastudent.addStudent("Lohengrin", "Harry", "English", "LA", 30, 30, 80);
        lastudent.addStudent("Gotterdammerung", "Brian", "English", "LA", 80, 80, 270);
        lastudent.addStudent("Siegfried", "Susan", "History", "LA", 12, 12, 45);
        lastudent.addStudent("Renizi", "George", "PoliSci", "LA", 86, 86, 330);
        lastudent.addStudent("Rheingold", "Andrew", "PoliSci", "LA", 62, 60, 145);
        lastudent.addStudent("Tannhauser", "James", "English", "LA", 78, 76, 120);
        lastudent.addStudent("Johanneskepplerstrasse", "A", "English", "LA", 87, 87, 256);
        MyIterator mi_la = new MyArrayListIterator(lastudent);
        TechStudents techstudents = new TechStudents();
        techstudents.addStudent("Smith", "William", "CompSci", "Tech", 90, 90, 340);
        techstudents.addStudent("Jones", "Michael", "CompEnr", "Tech", 45, 45, 100);
        techstudents.addStudent("Carter", "Mary", "SoftEng", "Tech", 128, 124, 270);
        techstudents.addStudent("Harris", "Harry", "CompSci", "Tech", 30, 30, 90);
        techstudents.addStudent("Wilson", "Brian", "CompSci", "Tech", 90, 90, 270);
        techstudents.addStudent("Adams", "Susan", "CompEng", "Tech", 12, 12, 45);
        techstudents.addStudent("Washington", "George", "SoftEng", "Tech", 96, 96, 360);
        techstudents.addStudent("Jackson", "Andrew", "SoftEng", "Tech", 62, 60, 145);
        techstudents.addStudent("Madison", "James", "CompSci", "Tech", 78, 76, 120);
        techstudents.addStudent("Madison", "Dolly", "CompSci", "Tech", 87, 87, 256);
        MyIterator mi_tech = new MyArrayIterator(techstudents);
        System.out.print("\n*****Student Details*****\n");
        Display(mi_la, mi_tech);
    }

    private static void Display(MyIterator LaIterator, MyIterator myIterator) {
        myIterator.SetCurrent();
        LaIterator.SetCurrent();
        while (!myIterator.end() && !LaIterator.end()) {
            String name1 = myIterator.GetCurrentObject().GetName();
            String name2 = LaIterator.GetCurrentObject().GetName();
            int compare = name1.compareTo(name2);
            if (compare < 0) { //name1 is smaller
                process_tech_iterator(myIterator);
            } else { //name2 is smaller
                process_la_iterator(LaIterator);
            }
        }
        while (!myIterator.end()) {
            process_tech_iterator(myIterator);
        }

        while (!LaIterator.end()) {
            process_la_iterator(LaIterator);
        }

    }

    public static void process_la_iterator(MyIterator LaIterator) {
        int Quality_points = LaIterator.GetCurrentObject().GetQualityPoints();
        int Hours_Attempted = LaIterator.GetCurrentObject().GetCreditHoursAttempted();
        double gpa = (double) Quality_points / Hours_Attempted;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("\nName->" + LaIterator.GetCurrentObject().GetName());
        System.out.print("\tCollege->" + LaIterator.GetCurrentObject().GetCollege());
        System.out.print("\tmajor->" + LaIterator.GetCurrentObject().GetMajor());
        System.out.print("\tCredit Hours Attempted->" + Hours_Attempted);
        System.out.print("\tCredit Hours Earned->" + LaIterator.GetCurrentObject().GetCreditHoursEarned());
        System.out.print("\tQuality Points->" + Quality_points + "\t");
        System.out.print("GPA->" + f.format(gpa) + "\n");
        LaIterator.Increment();
    }

    public static void process_tech_iterator(MyIterator myIterator) {
        int Quality_points = myIterator.GetCurrentObject().GetQualityPoints();
        int Hours_Attempted = myIterator.GetCurrentObject().GetCreditHoursAttempted();
        double gpa = (double) Quality_points / Hours_Attempted;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("\nName->" + myIterator.GetCurrentObject().GetName());
        System.out.print("\tCollege->" + myIterator.GetCurrentObject().GetCollege());
        System.out.print("\tMajor->" + myIterator.GetCurrentObject().GetMajor());
        System.out.print("\tCredit Hours Attempted->" + Hours_Attempted);
        System.out.print("\tCredit Hours Earned->" + myIterator.GetCurrentObject().GetCreditHoursEarned());
        System.out.print("\tQuality Points->" + Quality_points + "\t");
        System.out.print("GPA->" + f.format(gpa) + "\n");
        myIterator.Increment();
    }

}
