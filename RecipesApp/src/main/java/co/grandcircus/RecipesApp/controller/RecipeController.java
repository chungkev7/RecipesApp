package co.grandcircus.RecipesApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.RecipesApp.entity.RecipeResult;

@Controller
public class RecipeController {

	@Value("${recipe.key}")
	String recipeKey;

	@Value("${application.id}")
	String appId;

	RestTemplate rt = new RestTemplate();

	@RequestMapping("/")
	public ModelAndView homePage() {

		return new ModelAndView("index");
	}

	@RequestMapping("/search")
	public ModelAndView searchRecipe() {

		String url = "https://api.edamam.com/search?q=chicken&app_id=" + appId + "&app_key=" + recipeKey;

//		String test = rt.getForObject(url, String.class);
		RecipeResult test = rt.getForObject(url, RecipeResult.class);

		System.out.println(test);

		return new ModelAndView("redirect:/");
	}
}
