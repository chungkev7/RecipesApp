package co.grandcircus.RecipesApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeDetails {

	private String label;
	private String url;
	private String image;
	private double calories;
	private Integer yield;
	private Integer totalTime;
	
//	ArrayList<DietLabel> dietLabels;

	public RecipeDetails() {
		super();
	}

	public RecipeDetails(String label, String url, String image, double calories, Integer yield, Integer totalTime) {
		super();
		this.label = label;
		this.url = url;
		this.image = image;
		this.calories = calories;
		this.yield = yield;
		this.totalTime = totalTime;
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
		this.calories = Math.floor(calories);
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
		return "label=" + label + "&url=" + url + "&image=" + image + "&calories=" + calories
				+ "&yield=" + yield + "&totalTime=" + totalTime;
	}

	public Integer getYield() {
		return yield;
	}

	public void setYield(Integer yield) {
		this.yield = yield;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(Integer totalTime) {
		this.totalTime = totalTime;
	}

}
