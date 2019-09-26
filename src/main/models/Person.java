package main.models;

import java.util.List;
import java.util.Optional;

public class Person {

    private String name;
    private int age;
    private double weight;
    private String gender;
    private List<String> activities;
    private int siblings;
    private Optional<Car> car = Optional.empty(); //not every person has car so it's optional

    public Person(String name, int age, double weight, String gender, List<String> activities, int siblings) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.activities = activities;
        this.siblings = siblings;
    }

    public Person(String name, int age, double weight, String gender, List<String> activities) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.activities = activities;
    }

    // this is required to be able to use constructor reference (see ConstructorReferenceExample)
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    // all setters and getters below:

    // added this method to allow usig method reference
    public void printListOfActivities() {
        System.out.println(activities);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                ", siblings=" + siblings +
                ", car=" + car +
                '}';
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public int getSiblings() {
        return siblings;
    }

    public void setSiblings(int siblings) {
        this.siblings = siblings;
    }

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Optional<Car> car) {
        this.car = car;
    }
}
