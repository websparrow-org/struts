package org.websparrow.bean;

public class PopulationBean {
	private String stateName;
	private int statePopulation;

	public int getStatePopulation() {
		return statePopulation;
	}

	public void setStatePopulation(int statePopulation) {
		this.statePopulation = statePopulation;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
}