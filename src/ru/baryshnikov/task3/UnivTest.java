package ru.baryshnikov.task3;

public class UnivTest {
    public static void main(String[] args) {
        University univ = new University("KAI");
        System.out.println(univ.getName());

        Student stud = new Student("Mikhail", 23, univ.getName());

        univ.addStud(stud);

        Student stood = new Student("Vasya", 14, univ.getName());
        univ.addStud(stood);
        univ.showAllStoods();
        univ.showLength();

        stood.go();
        stud.studying();
    }
}
