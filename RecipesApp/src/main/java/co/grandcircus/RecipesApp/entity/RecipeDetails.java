package co.grandcircus.RecipesApp.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeDetails {

	private String label;
	private String url;
	private double calories;
	private Integer yield;
//	ArrayList<DietLabel> dietLabels;

	public RecipeDetails() {
		super();
	}

	public RecipeDetails(String label, String url, double calories, Integer yield) {
		super();
		this.label = label;
		this.url = url;
		this.calories = calories;
		this.yield = yield;
	}

//	public RecipeDetails(String label, String url, double calories, ArrayList<DietLabel> dietLabels) {
//		super();
//		this.label = label;
//		this.url = url;
//		this.calories = calories;
//		this.dietLabels = dietLabels;
//	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

//	public ArrayList<DietLabel> getDietLabels() {
//		return dietLabels;
//	}
//
//	public void setDietLabels(ArrayList<DietLabel> dietLabels) {
//		this.dietLabels = dietLabels;
//	}

	@Override
	public String toString() {
		return "RecipeDetails [label=" + label + ", url=" + url + ", calories=" + calories + "]";
	}

	public Integer getYield() {
		return yield;
	}

	public void setYield(Integer yield) {
		this.yield = yield;
	}

}
