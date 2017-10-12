package com.csc680.orbit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Student 
{
    @Id
    private String id;
    private String name;
    private String imageURL;
 
    public Student() {}
 
    public Student(String name) 
    {
        this.name = name;
        this.imageURL = "http://via.placeholder.com/400x400";
    }
    
    public String getId() {  return id;   }
 
    public void setId(String id) {  this.id = id;   }
    
    public String getName() {  return name;  }
 
    public void setName(String name) {this.name = name;}

    public String getImageURL() {return imageURL;}

    public void setImageURL(String imageURL) {this.imageURL = imageURL;}

    @Override
    public String toString() 
    {
    	return "Pose [id=" + id + ", name=" + name + 
               ", imageURL=" + imageURL + "]";
    }
}