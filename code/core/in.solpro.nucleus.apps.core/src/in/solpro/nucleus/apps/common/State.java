package in.solpro.nucleus.apps.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class State {
	
		@Id 
		@GeneratedValue ( strategy=GenerationType.IDENTITY)
		private int id ;
		@Column ( nullable=false)
		private String name ;
		private Country objCountry=null;
		
				
		public int getId (){
		return id ; 
		 } 
		public void setId (int id){
		this.id = id;
		 } 
		public String getName (){
		return name ; 
		 } 
		public void setName (String name){
		this.name = name;
		 } 
		public Country getObjCountry (){
			return objCountry ; 
			 } 
			public void setObjCountry(Country country){
			this.objCountry = country;
			 } 
		public String toString(){
		 return this.name;
		 } 
		 
} 


