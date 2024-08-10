package com.missTravveller.app.service.impl;
import com.missTravveller.app.model.State;
import com.missTravveller.app.repository.StateRepository;
import com.missTravveller.app.service.StateService;
import com.missTravveller.app.util.StateUpdate;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StateServiceImpl implements StateService {
	
	StateRepository stateRepository;
	
	
	public StateServiceImpl(StateRepository stateRepository) {
		this.stateRepository = stateRepository;
		
	}

	@Override
	public State createStates(State state) {
		String stateName = state.getStateName();
		if( stateRepository.existsByStateName(stateName) ) {
			throw new IllegalStateException("The state " + stateName + " is already registered.");
		}
		state.setId(null);
		State newState = saveState(state);
		return newState;
	}

	private State saveState(State state) {
		return stateRepository.save(state);
	}

	@Override
	public State getStatesById(Long id) {
		Optional<State> optionalState = stateRepository.findById(id);
		if( optionalState.isEmpty() ) {
			throw new IllegalStateException("State does not exist with id " + id);
		}
		return optionalState.get();
	}

	@Override
	public State updateStates(State state, Long id) {
		State existingState = getStatesById(id);
		return StateUpdate.updateState(existingState, state);
	}

	@Override
	public void deleteStates(Long id) {
		State existingState = getStatesById(id);
		saveState(existingState);
		
	}
	

}
