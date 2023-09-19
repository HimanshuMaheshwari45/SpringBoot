package com.book.api.bootrestbook.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int authorID;
  private String firstName;
  private String lastName;
  private String languages;


  public Author() {
  }

  public Author(int authorID, String firstName, String lastName, String languages) {
    this.authorID = authorID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.languages = languages;
  }

  public int getAuthorID() {
    return authorID;
  }
  public void setAuthorID(int authorID) {
    this.authorID = authorID;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getLanguages() {
    return languages;
  }
  public void setLanguages(String languages) {
    this.languages = languages;
  }

  @Override
  public String toString() {
    return "Author [authorID=" + authorID + ", firstName=" + firstName + ", lastName=" + lastName + ", languages="
        + languages + "]";
  }

  
  
}
