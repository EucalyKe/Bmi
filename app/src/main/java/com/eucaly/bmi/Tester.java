package com.eucaly.bmi;

import com.eucaly.bmi.hello.Person;
import com.eucaly.bmi.hello.Student;

public class Tester {
    public static void main(String[] args) {
        Student stu0 = new Student("001", "Eucaly", 80, 60);
        Student stu1 = new Student("002", "Jenny", 60, 50);
        stu0.print();
        stu1.print();

        /*stu.setId("001");
        stu.setName("Eucaly");
        stu.setMath(80);
        stu.setEnglish(60);*/
//        System.out.println("Hello world");
        /*Person person = new Person();
        person.hello();
        person.hello("Eucaly");
        person.setWeight(45);
        person.setHeight(1.56f);
        System.out.println(person.bmi());*/

    }
}
