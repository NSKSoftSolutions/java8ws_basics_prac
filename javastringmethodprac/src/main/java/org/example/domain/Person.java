package org.example.domain;

public class Person {

    private int id;
    private String name;
    private int age;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) { //reference comparision
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        if (person.getName() == this.name) {
            System.out.println("Two are Objects Having same Name");
            return true;
        } else {
            System.out.println("Objects are not equal");
            return false;
        }
    }
}
