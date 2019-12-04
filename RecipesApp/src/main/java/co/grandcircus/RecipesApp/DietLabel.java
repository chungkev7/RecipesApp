package co.grandcircus.RecipesApp;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum DietLabel {

	balanced, high_protein, high_fiber, low_fat, low_carb, low_sodium;

	private String dietLabel;

	private DietLabel() {
	}

	private DietLabel(String dietLabel) {
		this.dietLabel = dietLabel;
	}

	public String getDietLabel() {
		return dietLabel;
	}

	public void setDietLabel(String dietLabel) {
		this.dietLabel = dietLabel;
	}

	@JsonCreator
	public static DietLabel getEnumFromValue(String value) {
		for (DietLabel testEnum : values()) {
			if (testEnum.dietLabel.equals(value)) {
				return testEnum;
			}
		}
		throw new IllegalArgumentException();
	}

}
