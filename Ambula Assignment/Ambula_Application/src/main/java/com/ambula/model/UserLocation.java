package com.ambula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a user in the system.
 */

@Entity
public class UserLocation {
	
	/**
     * The ID of the user.
     */
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    /**
     * The name of the user.
     */
    private String name;
    
    /**
     * The latitude of the user.
     */
    private Double latitude;
    
    
    /**
     * The longitude of the user.
     */
    private Double longitude;
    
    
    /**
     * The parameterized constructor of the UserLocation class.
     */
    public UserLocation(Long id, String name, Double latitude, Double longitude) {
		super();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
    
    /**
     * The empty constructor of the UserLocation class.
     */
	public UserLocation() {
		super();
		
	}
    
	//getters and setters
    
	/**
     * Gets the ID of the user.
     *
     * @return the ID of the user
     */
	public Long getId() {
		return id;
	}
	
	
	/**
     * Sets the ID of the user.
     *
     * @param id the ID of the user
     */
	public void setId(Long id) {
		this.id = id;
	}
	
	
	/**
     * Gets the name of the user.
     *
     * @return the name of the user
     */
	public String getName() {
		return name;
	}
	
	
	/**
     * Sets the name of the user.
     *
     * @param id the name of the user
     */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
     * Gets the latitude of the user.
     *
     * @return the latitude of the user
     */
	public Double getLatitude() {
		return latitude;
	}
	
	
	/**
     * Sets the latitude of the user.
     *
     * @param id the latitude of the user
     */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	
	/**
     * Gets the longitude of the user.
     *
     * @return the longitude of the user
     */
	public Double getLongitude() {
		return longitude;
	}
	
	
	/**
     * Sets the longitude of the user.
     *
     * @param id the longitude of the user
     */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
    
    
}
