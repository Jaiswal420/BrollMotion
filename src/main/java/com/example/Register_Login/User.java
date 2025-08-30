package com.example.Register_Login;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "users1")
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
   
   @Column(nullable=false,unique=true,length=64)
   private String email;
   
   @Column(nullable=false, length=200)
  private String subject;
   
   @Column(nullable=false, length=200)
  private String message;
  

  public Long getId()
  {
	return id;
  }

  public void setId(Long id)
  {
	this.id = id;
  }

  public String getName() 
   {
	return name;
   }
 
  public void setName(String name) 
   {
 	this.name = name;
   }
   
  
  public String getEmail() 
   {
	return email;
   }
 
  public void setEmail(String email) 
  {
	this.email = email;
  } 

  public String getSubject() 
   {
	return subject;
   }
   public void setSubject(String subject) 
   {
	this.subject = subject;
   }

   public String getMessage() 
   {
	return message;
   }
   
   public void setMessage(String message) 
   {
	this.message = message;
   }
  
}
