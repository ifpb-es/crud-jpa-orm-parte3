package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Address {

	private String street1;

	private String street2;

	private String city;

	private String state;

	private String zipcode;

	private String country;

	public Address() {

	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Address)) return false;
		Address address = (Address) o;
		return Objects.equals(street1, address.street1) && Objects.equals(street2, address.street2) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(zipcode, address.zipcode) && Objects.equals(country, address.country);
	}

	@Override
	public int hashCode() {
		return Objects.hash(street1, street2, city, state, zipcode, country);
	}

	@Override
	public String toString() {
		return "Address{" +
				"street1='" + street1 + '\'' +
				", street2='" + street2 + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zipcode='" + zipcode + '\'' +
				", country='" + country + '\'' +
				'}';
	}

}
