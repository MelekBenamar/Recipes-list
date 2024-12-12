package com.example.recipeslist.data;

import com.example.recipeslist.R;
import com.example.recipeslist.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeData {

    private static final List<Recipe> recipes = new ArrayList<>();

    static {
        // Add sample data
        recipes.add(new Recipe(1,
                "Spaghetti Carbonara",
                "Spaghetti Carbonara is a classic Italian pasta dish originating from Rome. It is made with eggs, cheese, pancetta, and pepper. The creamy texture comes from the combination of eggs and cheese, which is tossed with hot pasta to create a velvety sauce.",                R.drawable.spaghetti,
                "Spaghetti \nEggs \nPancetta \nParmesan \nBlack Pepper",
                "1. Boil spaghetti. \n2. Cook pancetta. \n3. Mix eggs and cheese. \n4. Combine and serve."));

        recipes.add(new Recipe(2,
                "Chicken Curry",
                "Chicken Curry is a flavorful and aromatic dish that combines tender pieces of chicken with a rich, spicy curry sauce. The dish is a staple in many cultures, particularly in Indian cuisine. It is known for its vibrant flavors, which come from a blend of spices like cumin, coriander, turmeric, and garam masala. The coconut milk adds a creamy texture, balancing the heat from the spices.",                R.drawable.chicken_curry,
                "Chicken \nCurry Powder \nCoconut Milk \nOnion \nGarlic \nGinger",
                "1. Cook onion, garlic, and ginger. \n2. Add chicken and curry powder. \n3. Add coconut milk and simmer."));

        recipes.add(new Recipe(
                3,
                "Beef Tacos",
                "Beef Tacos are a quick and easy dish that delivers bold flavors with every bite. The ground beef is seasoned with a blend of chili powder, cumin, and other spices to create a savory filling that’s perfect for taco shells or soft tortillas. Tacos are highly customizable and can be topped with a variety of ingredients, such as fresh lettuce, tomatoes, cheese, sour cream, and salsa.",                R.drawable.beef_tacos,
                "Ground Beef \nTaco Shells \nLettuce \nTomato \nCheese \nSour Cream",
                "1. Cook ground beef with taco seasoning. \n2. Prepare taco shells. \n3. Add beef and toppings to the shells."));

        recipes.add(new Recipe(
                4,
                "Vegetable Stir Fry",
                "Vegetable Stir Fry is a colorful and nutritious dish that features a mix of fresh vegetables, sautéed with garlic, ginger, and soy sauce. The beauty of this dish lies in its versatility – you can use any combination of vegetables you have on hand, such as bell peppers, carrots, broccoli, and snap peas.",                R.drawable.vegetable_stir_fry,
                "Bell Peppers \nCarrots \nBroccoli \nSoy Sauce \nGarlic \nGinger",
                "1. Heat oil in a pan. \n2. Stir-fry vegetables with garlic and ginger. \n3. Add soy sauce and cook until tender.")
        );
    }

    // Method to retrieve the full list of recipes
    public static List<Recipe> getRecipes() {
        return recipes;
    }

    // Method to find a recipe by ID
    public static Recipe findRecipeById(int id) {
        for (Recipe recipe : recipes) {
            if (recipe.getId() == id) {
                return recipe;
            }
        }
        return null; // Return null if not found
    }
}
