package ru.baryshnikov.task22;

public class Person {
    private int age;
    private String sex;
    private String lastName;

    public Person(int age, String lastName, String sex) {
        this.age = age;
        this.lastName = lastName;
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public String toString() {
        return " Age: " + getAge() + "; Last Name: " + getLastName() + "; Sex: " + getSex() + " |";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Person guest = (Person) obj;
        return age == guest.age
                && (sex == guest.sex
                || (sex != null && sex.equals(guest.getSex())))
                && (lastName == guest.lastName
                || (lastName != null && lastName.equals(guest.getLastName())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((sex == null) ? 0 : sex.hashCode());
        result = prime * result + age;
        result = prime * result +
                ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }
}
