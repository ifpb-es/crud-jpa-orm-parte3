package br.edu.ifpb.es.daw.entities;

import br.edu.ifpb.es.daw.util.Util;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "DELIVERIES")
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date prazo;

	@Embedded
	private Address address;

	public Delivery() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Delivery)) return false;
		Delivery delivery = (Delivery) o;
		return Objects.equals(Util.removeTime(prazo), Util.removeTime(delivery.prazo)) && Objects.equals(address, delivery.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(Util.removeTime(prazo), address);
	}

	@Override
	public String toString() {
		return "Delivery{" +
				"id=" + id +
				", prazo=" + prazo +
				", address=" + address +
				'}';
	}

}
