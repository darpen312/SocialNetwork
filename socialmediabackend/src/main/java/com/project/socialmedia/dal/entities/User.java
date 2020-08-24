package com.project.socialmedia.dal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Model class(JPA Entity) for user.
@Entity
/*user needs to be whatever the table name is in SQL. 
*Not sure if this is needed if model name is the same as table name
*/
@Table(name="user") 
public class User {
	
	//Variables corresponding the fields in database for user entity
	
	/* Note: An easy way of generating getters and setters is highlighting the variables,
	 * Going to source, And selecting generate getters and setters.
	 * The generate code will not be format the generate code to be more readable. Highlight it
	 * and press cntrl,shift + f.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="age")
	private int age;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//Note: IDE generated code. Source -> generate toString method.

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", location=" + location + ", age=" + age + "]";
	}
}
