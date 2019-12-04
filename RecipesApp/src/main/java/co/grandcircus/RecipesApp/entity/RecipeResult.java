package co.grandcircus.RecipesApp.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeResult {

	private String q;
	private int count;
	ArrayList<Recipe> hits;

	public RecipeResult() {
		super();
	}

	public RecipeResult(String q, int count, ArrayList<Recipe> hits) {
		super();
		this.q = q;
		this.count = count;
		this.hits = hits;
	}


	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ArrayList<Recipe> getHits() {
		return hits;
	}

	public void setHits(ArrayList<Recipe> hits) {
		this.hits = hits;
	}

	@Override
	public String toString() {
		return "RecipeResult [q=" + q + ", count=" + count + ", hits=" + hits + "]";
	}

}
