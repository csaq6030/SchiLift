package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class User extends Model{
	@Id
	private String name;
	private String pwd;
	
	public User(String n, String p){
		this.name = n;
		this.pwd = p;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPwd(){
		return pwd;
	}
}
