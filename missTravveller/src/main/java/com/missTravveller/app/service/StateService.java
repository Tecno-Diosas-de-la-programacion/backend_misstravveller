package com.missTravveller.app.service;

import com.missTravveller.app.model.States;

public interface StateService {
	
	//create
	States createStates (States states);
	//get
	States getStatesById (Long id);
	//update
	States updateStates (States states, Long id);
	//delete
	void deleteStates (Long id);

}
