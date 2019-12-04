package co.grandcircus.RecipesApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {

	RecipeDetails recipe;
	private boolean bookmarked;

	public Recipe() {
		super();
	}

	public Recipe(RecipeDetails recipe, boolean bookmarked) {
		super();
		this.recipe = recipe;
		this.bookmarked = bookmarked;
	}

	public RecipeDetails getRecipe() {
		return recipe;
	}

	public void setRecipe(RecipeDetails recipe) {
		this.recipe = recipe;
	}

	public boolean isBookmarked() {
		return bookmarked;
	}

	public void setBookmarked(boolean bookmarked) {
		this.bookmarked = bookmarked;
	}

	@Override
	public String toString() {
		return "recipe=" + recipe + "&bookmarked=" + bookmarked;
	}

}
