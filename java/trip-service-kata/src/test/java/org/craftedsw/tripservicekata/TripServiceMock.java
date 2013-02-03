package org.craftedsw.tripservicekata;

import org.craftedsw.tripservicekata.trip.TripService;
import org.craftedsw.tripservicekata.user.User;

public class TripServiceMock extends TripService {
	
	private User user;
	
	
	
	public TripServiceMock(User user) {
		super();
		this.user = user;
	}

	@Override
	protected User getLoggedUser() {
		return user;
	}

}
