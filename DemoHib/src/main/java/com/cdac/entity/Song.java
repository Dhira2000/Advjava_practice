package com.cdac.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_song")
public class Song {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
		private int id;
		private String title;
		private LocalDate releseDate;
		private String copyRight;
		
		@ManyToOne 
		@JoinColumn(name ="album-id")
		private Album album;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setName(String title) {
			this.title = title;
		}

		public LocalDate getReleseDate() {
			return releseDate;
		}

		public void setReleseDate(LocalDate releseDate) {
			this.releseDate = releseDate;
		}

		public String getCopyRight() {
			return copyRight;
		}

		public void setCopyRight(String copyRight) {
			this.copyRight = copyRight;
		}

		public Album getAlbum() {
			return album;
		}

		public void setAlbum(Album album) {
			this.album = album;
		}
		
		
}
