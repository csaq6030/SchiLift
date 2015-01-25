package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Lift extends Model{
	@Id
	private int id;
	private String name;
	private String type;
	private double height;
	private int capacity;
	
	public Lift(int id,String name,String type, double height, int capacity){
		this.id = id;
		this.name = name;
		this.type = type;
		this.height = height;
		this.capacity = capacity;
	}
	
}
