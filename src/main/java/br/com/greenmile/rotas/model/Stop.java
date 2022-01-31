package br.com.greenmile.rotas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import br.com.greenmile.rotas.enums.StatusStop;

@Entity
public class Stop implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "ADDRESS")
	private String address;
	@NotBlank
	@Column(name = "LATITUDE")
	private double latitude;
	@NotBlank
	@Column(name = "LONGITUDE")
	private double longitude;
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private StatusStop status = StatusStop.NOT_ANSWER;
	@Column(name="DELIVERYRADIUS")
	private int deliveryRadius;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public StatusStop getStatus() {
		return status;
	}
	public void setStatus(StatusStop status) {
		this.status = status;
	}
//	public Rota getRota() {
//		return rota;
//	}
//	public void setRota(Rota rota) {
//		this.rota = rota;
//	}
	public int getDeliveryRadius() {
		return deliveryRadius;
	}
	public void setDeliveryRadius(int deliveryRadius) {
		this.deliveryRadius = deliveryRadius;
	}

}
