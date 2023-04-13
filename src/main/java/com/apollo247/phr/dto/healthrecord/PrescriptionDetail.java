package src.main.java.com.apollo247.phr.dto.healthrecord;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrescriptionDetail implements UIPojo {
	private String name;
	private String strength;
	private int route;
	private List<Integer> howOften = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public int getRoute() {
		return route;
	}
	public void setRoute(int route) {
		this.route = route;
	}
	public List<Integer> getHowOften() {
		return howOften;
	}
	public void setHowOften(List<Integer> howOften) {
		this.howOften = howOften;
	}
}
