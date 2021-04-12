package com.pgr.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private List<String> namesList;
	private Set<String> namesSet;
	private Map<String, Integer> namesMap;

	public List<String> getNamesList() {
		return namesList;
	}

	public void setNamesList(List<String> namesList) {
		this.namesList = namesList;
	}

	public Set<String> getNamesSet() {
		return namesSet;
	}

	public void setNamesSet(Set<String> namesSet) {
		this.namesSet = namesSet;
	}

	public Map<String, Integer> getNamesMap() {
		return namesMap;
	}

	public void setNamesMap(Map<String, Integer> namesMap) {
		this.namesMap = namesMap;
	}

	@Override
	public String toString() {
		return "Employee [namesList=" + namesList + ", namesSet=" + namesSet + ", namesMap=" + namesMap + "]";
	}


	
}
