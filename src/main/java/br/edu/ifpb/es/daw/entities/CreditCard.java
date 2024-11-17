package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CREDIT_CARDS", uniqueConstraints = {
		@UniqueConstraint(name = "UC_CREDIT_CARD__NUMBER_CC", columnNames = { "NUMBER_CC" })
})
public class CreditCard {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "NUMBER_CC", nullable = false, unique = true)
	private String numberCC;

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPIRY_DATE")
	private Date expiryDate;

	@Column(name = "CONTROL_NUMBER")
	private Integer controlNumber;

	@Enumerated(EnumType.STRING)
	@Column(name = "TYPE")
	private CreditCardType creditCardType;

	public CreditCard() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNumberCC() {
		return numberCC;
	}

	
	public void setNumberCC(String numberCC) {
		this.numberCC = numberCC;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(Integer controlNumber) {
		this.controlNumber = controlNumber;
	}

	public CreditCardType getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(CreditCardType creditCardType) {
		this.creditCardType = creditCardType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CreditCard)) return false;
		CreditCard that = (CreditCard) o;
		return Objects.equals(numberCC, that.numberCC) && creditCardType == that.creditCardType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numberCC, creditCardType);
	}

	@Override
	public String toString() {
		return "CreditCard{" +
				"id=" + id +
				", numberCC='" + numberCC + '\'' +
				", expiryDate=" + expiryDate +
				", controlNumber=" + controlNumber +
				", creditCardType=" + creditCardType +
				'}';
	}

}
