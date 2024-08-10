package com.missTravveller.app.service;

import com.missTravveller.app.model.State;

public interface StateService {
	
	//create
	State createStates (State states);
	//get
	State getStatesById (Long id);
	//update
	State updateStates (State states, Long id);
	//delete
	void deleteStates (Long id);

}
