package com.demoPractice.servlet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_alien")
public class Alien {
	
	@Id
	@Column(name="id")
		private int aId;
	
	@Column(name="name")
		private String aName;
	
	@Column(name="color")
		private String Color;
	
		public int getaId() {
			return aId;
		}
		public void setaId(int aId) {
			this.aId = aId;
		}
		public String getaName() {
			return aName;
		}
		public void setaName(String aName) {
			this.aName = aName;
		}
		public String getColor() {
			return Color;
		}
		public void setColor(String color) {
			this.Color = color;
		}
		
		
}
