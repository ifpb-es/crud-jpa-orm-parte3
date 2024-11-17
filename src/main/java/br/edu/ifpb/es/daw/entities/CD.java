package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.Table;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

@Entity
@Table(name = "CDS")
public class CD {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String title;

	private Float price;

	private String description;

	@Lob
	private byte[] cover;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "TRACKS")
	@MapKeyColumn(name = "POSITION")
	@Column(name = "TITLE")
	private Map<Integer, String> tracks;

	public CD() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getCover() {
		return cover;
	}

	public void setCover(byte[] cover) {
		this.cover = cover;
	}

	public Map<Integer, String> getTracks() {
		return tracks;
	}

	public void setTracks(Map<Integer, String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CD)) return false;
		CD cd = (CD) o;
		return Objects.equals(title, cd.title) && Objects.equals(tracks, cd.tracks);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, tracks);
	}

	@Override
	public String toString() {
		return "CD{" +
				"id=" + id +
				", title='" + title + '\'' +
				", price=" + price +
				", description='" + description + '\'' +
				", cover=" + Arrays.toString(cover) +
				", tracks=" + tracks +
				'}';
	}
}
