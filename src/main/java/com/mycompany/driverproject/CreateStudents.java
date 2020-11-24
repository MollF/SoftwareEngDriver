/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.driverproject;
import College.Student;
import College.Module;
import College.CourseProgram;
import org.joda.time.*;


/**
 *
 * @author 35387
 */
public class CreateStudents {

    
    public static void main(String[] args) {
        // creating the students
        Student s1 = new Student("Frankie Smith", new DateTime(1998,12,16,14,30), 000001);
        Student s2 = new Student("John Doe", new DateTime(1998,07,02,00,30), 000002);
        Student s3 = new Student("Timothee Chalamet", new DateTime(1998,07,02,00,30), 000003);
        Student s4 = new Student("Lee Alders", new DateTime(1997,12,25,10,00), 000004);
        Student s5 = new Student("Arabella Woods", new DateTime(1998,12,13,20,30), 000005);
        
        s1.createUsername();
        s2.createUsername();
        s3.createUsername();
        s4.createUsername();
        s5.createUsername();
        
        
        //creating the modules
        
        Module dsp = new Module("Digital Signal Processing","EE445");
        Module ml = new Module("Machine Learning","CT4101");
        Module tsa = new Module("Telecommunications Software Applications","EE453");
        
        //creating the courses
        
        CourseProgram ece = new CourseProgram("Electronic and Computer Engineering");
        CourseProgram cs = new CourseProgram("Computer Science");
        DateTime startCourse = new DateTime(2017,9,1,9,00);
        DateTime endCourse = new DateTime(2021,5,28,17,30);
        
        // adding students to the modules
        
        
        
        s1.addModule(dsp);
        s1.addModule(ml);
        
        s2.addModule(ml);
        s2.addModule(tsa);
        
        s3.addModule(dsp);
        s3.addModule(ml);
        
        s4.addModule(ml);
        s4.addModule(tsa);
        
        s5.addModule(tsa);
        s5.addModule(dsp);
        
        // adding modules to the courses
        
        ece.addModule(dsp);
        ece.addModule(tsa);
        ece.addModule(ml);
        cs.addModule(ml);
        
        
        // adding students to the courses
        
        ece.addStudent(s1);
        ece.addStudent(s2);
        ece.addStudent(s3);
        
        cs.addStudent(s4);
        cs.addStudent(s5);

        // print courses and their modules
        
        System.out.println("Courses and their respective Modules");
        System.out.println(ece.toString());
        System.out.println(cs.toString());

        //print students with their username, modules and course
        
        System.out.println("Students, their usernames, assigned modules, and courses");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
        
    }


    
}
