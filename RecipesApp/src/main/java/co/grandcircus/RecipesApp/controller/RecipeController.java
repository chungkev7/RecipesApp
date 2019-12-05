package co.grandcircus.RecipesApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.RecipesApp.entity.RecipeDetails;
import co.grandcircus.RecipesApp.entity.RecipeResult;
import co.grandcircus.RecipesApp.repo.RecipeRepo;

@Controller
public class RecipeController {

	@Value("${recipe.key}")
	String recipeKey;

	@Value("${application.id}")
	String appId;

	RestTemplate rt = new RestTemplate();

	@Autowired
	RecipeRepo rp;

	static RecipeResult test;

	@RequestMapping("/")
	public ModelAndView homePage() {

		return new ModelAndView("index");
	}

	@RequestMapping("/search")
	public ModelAndView searchRecipe(@RequestParam("q") String q, @RequestParam("cal1") Integer cal1,
			@RequestParam("cal2") Integer cal2, @RequestParam("diet") String diet) {
		ModelAndView mv = new ModelAndView("display");
		String url = "https://api.edamam.com/search?q=" + q + "&app_id=" + appId + "&app_key=" + recipeKey;
		if (cal1 != null && cal2 != null) {
			url.concat("&calories=" + cal1 + "-" + cal2);
		}
		if (diet != null) {
			url.concat("&diet=" + diet);
		}

		test = rt.getForObject(url, RecipeResult.class);

		mv.addObject("test", test.getHits());
		return mv;
	}

	@RequestMapping("/details")
	public ModelAndView showDetails(RecipeDetails r) {
		ModelAndView mv = new ModelAndView("details");
		mv.addObject("image", r.getImage());
		mv.addObject("label", r.getLabel());
		mv.addObject("calories", r.getCalories());
		mv.addObject("yield", r.getYield());
		mv.addObject("time", r.getTotalTime());
		return mv;
	}

	@RequestMapping("/add-recipe")
	public ModelAndView addToFavorites(RecipeDetails r) {
		ModelAndView mv = new ModelAndView("display");
		List<RecipeDetails> faves = rp.findAll();
		if (!faves.contains(rp.findByLabel(r.getLabel()))) {
			rp.save(r);
		} 
		mv.addObject("test", test.getHits());
		return mv;
	}

	@RequestMapping("/favorites")
	public ModelAndView displayFavourites() {
		return new ModelAndView("favorites", "faves", rp.findAll());

	}

	@RequestMapping("/remove")
	public ModelAndView removeFromFavorites(Integer id) {
		ModelAndView mv = new ModelAndView("redirect:/favorites");
		rp.delete(rp.findById(id).orElse(null));
		mv.addObject("faves", rp.findAll());

		return mv;
	}

}