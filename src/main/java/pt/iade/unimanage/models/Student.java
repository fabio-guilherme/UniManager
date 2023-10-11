package pt.iade.unimanage.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
  private static int nextNumber = 0;

  private String name;
  private LocalDate birthDate;
  private String email;
  private char gender;
  private int number;

  private ArrayList<Unit> units;

  public Student(String name, LocalDate birthDate, char gender) {
    this.number = nextNumber;
    nextNumber++;
    this.name = name;
    this.birthDate = birthDate;
    this.gender = gender;
    email = "";
    units = new ArrayList<Unit>();
  }

  public ArrayList<Unit> getUnits() {
    return units;
  }

  public void enroll(Unit unit) {
    units.add(unit);
    unit.getStudents().add(this);
  }

  public static int getNextNumber() {
    return nextNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
