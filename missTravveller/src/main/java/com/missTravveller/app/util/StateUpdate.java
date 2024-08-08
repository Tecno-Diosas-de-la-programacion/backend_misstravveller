package com.missTravveller.app.util;

import com.missTravveller.app.model.State;

public class StateUpdate {
	private StateUpdate() {}
	
	public static State updateState(State existingState, State newStateData) {
		if (existingState == null || newStateData == null) {
			throw new IllegalArgumentException("State data cannot be null");
		}
		
		existingState.setName(newStateData.getName());
		return existingState;


	}
}
