package co.grandcircus.RecipesApp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.RecipesApp.entity.Recipe;
import co.grandcircus.RecipesApp.entity.RecipeDetails;
import co.grandcircus.RecipesApp.entity.RecipeResult;

@Controller
public class RecipeController {

	@Value("${recipe.key}")
	String recipeKey;

	@Value("${application.id}")
	String appId;

	RestTemplate rt = new RestTemplate();

	static RecipeResult test;
	static ArrayList<Recipe> favorites;
	
	@RequestMapping("/")
	public ModelAndView homePage() {

		return new ModelAndView("index");
	}

	@RequestMapping("/search")
	public ModelAndView searchRecipe(@RequestParam("q") String q, @RequestParam("cal1") Integer cal1, 
			@RequestParam("cal2") Integer cal2, @RequestParam("diet") String diet) {
		ModelAndView mv = new ModelAndView("display");
		String url = "https://api.edamam.com/search?q="+ q +"&app_id=" + appId + "&app_key=" + recipeKey;
		if (cal1 != null && cal2 != null) {
			url.concat("&calories=" + cal1 + "-" + cal2);
		} 
		if (diet != null) {
			url.concat("&diet=" + diet);
		}

//		RecipeResult test = rt.getForObject(url, RecipeResult.class);
		test = rt.getForObject(url, RecipeResult.class);

		mv.addObject("test", test.getHits());
		return mv;
	}
	
	@RequestMapping("/details")
	public ModelAndView showDetails(RecipeDetails r) {
		ModelAndView mv = new ModelAndView("details");
		mv.addObject("details", r);
		return mv;
	}
	
	@RequestMapping("/add-recipe")
	public ModelAndView addToFavorites(Recipe r) {
		
		ModelAndView mv = new ModelAndView("display");
//		favorites.add(r);
		
		mv.addObject("test", test.getHits());
//		System.out.println(favorites);
//		System.out.println(r);
		return mv;
	}
//	@RequestMapping("/show-cal")
//	public ModelAndView showCal(@RequestParam("filter") String option) {
//		ModelAndView mv = new ModelAndView("index");
//		if (option.equalsIgnoreCase("calories")) {
//			mv.addObject("calories", "<span>Between<input type='number'> and <input type='number'>calories</span>");
//		}
//		System.out.println(option);
//		return mv;
//	}
	
}
