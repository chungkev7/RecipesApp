package co.grandcircus.RecipesApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.RecipesApp.entity.RecipeDetails;

public interface RecipeRepo extends JpaRepository<RecipeDetails, Integer> {

	RecipeDetails findByLabel(String label);
	
}
