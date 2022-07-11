package com.cdac.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_album")
public class Album {
	
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private String artist;
		private double duration;
		
		@OneToMany(mappedBy = "album")
		private List<Song>songs;

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

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public double getDuration() {
			return duration;
		}

		public void setDuration(double duration) {
			this.duration = duration;
		}

		public List<Song> getSongs() {
			return songs;
		}

		public void setSongs(List<Song> songs) {
			this.songs = songs;
		}
		
		
}
