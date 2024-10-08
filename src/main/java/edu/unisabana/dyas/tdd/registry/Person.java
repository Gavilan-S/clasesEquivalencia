package edu.unisabana.dyas.tdd.registry;

public class Person {

  private String name;
  private int id;
  private int age;
  private Gender gender;
  private boolean alive;

  public Person() {
    super();
  }

  /**
     * A person constructor with all the information
     *
     * @param name the name
     * @param id the identification number
     * @param age the age
     * @param gender the gender
     * @param alive if the person is alive
     */

  public Person(String name, int id, int age, Gender gender, boolean alive) {
    this.name = name;
    this.id = id;
    this.age = age;
    this.gender = gender;
    this.alive = alive;
  }

  // Getters
  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

  public boolean isAlive() {
    return alive;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  // toString
  @Override
  public String toString() {
    return "Person [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", alive=" + alive + "]"; }
}
