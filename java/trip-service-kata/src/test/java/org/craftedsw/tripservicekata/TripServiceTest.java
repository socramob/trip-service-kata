package org.craftedsw.tripservicekata;

import junit.framework.Assert;

import org.craftedsw.tripservicekata.exception.UserNotLoggedInException;
import org.craftedsw.tripservicekata.trip.Trip;
import org.craftedsw.tripservicekata.trip.TripService;
import org.craftedsw.tripservicekata.user.User;
import org.junit.Test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class TripServiceTest {

	@Test(expected = NullPointerException.class)
	public void
	userArgumentIsNull() throws Exception {
		TripService tripService = new TripServiceMock(new User());

		tripService.getTripsByUser(null);
	}
	
	@Test(expected = UserNotLoggedInException.class)
	public void
	userIsNotLoggedInThrowsUserNotLoggedInException() throws Exception {
		TripService tripService = new TripServiceMock(null);
		tripService.getTripsByUser(new User());
	}
	
	@Test
	public void newUserHasNoFriends() throws Exception {
		TripService tripService = new TripServiceMock(new User());
		
		 java.util.List<Trip> trips = tripService.getTripsByUser(new User());
		
		 Assert.assertTrue(trips.isEmpty());
	}
	
	
}
