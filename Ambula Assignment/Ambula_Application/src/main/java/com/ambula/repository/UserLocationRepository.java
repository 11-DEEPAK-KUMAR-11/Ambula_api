package com.ambula.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ambula.model.UserLocation;

/**
 * Provides access to the user repository.
 */

@Repository
public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
	
	/**
     * Retrieves all user locations from the database and sorts them in ascending order of latitude and longitude.
     *
     * @return A list of user locations sorted by latitude and longitude.
     */
    List<UserLocation> findAllByOrderByLatitudeAscLongitudeAsc();
}

