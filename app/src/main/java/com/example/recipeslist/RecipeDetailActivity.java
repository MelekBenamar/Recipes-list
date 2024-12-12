package com.example.recipeslist;

import static com.example.recipeslist.data.RecipeData.findRecipeById;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.recipeslist.data.RecipeData;
import com.example.recipeslist.model.Recipe;

public class RecipeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        Button backButton = findViewById(R.id.backButton);
        int recipeId = getIntent().getIntExtra("recipeId", +1); // Retrieve the ID
        Log.d("recipeId", String.valueOf(recipeId));

        // Fetch the Recipe using the ID
        Recipe recipe = findRecipeById(recipeId); // Implement this lookup method

        if (recipe != null) {
            // Display Recipe details
            ImageView recipePhoto = findViewById(R.id.recipePhoto);
            TextView recipeIngredients = findViewById(R.id.recipeIngredients);
            TextView recipeProcedure = findViewById(R.id.recipeProcedure);

            recipePhoto.setImageResource(recipe.getPhoto());
            recipeIngredients.setText(recipe.getIngredients());
            recipeProcedure.setText(recipe.getProcedure());
        }

        backButton.setOnClickListener(v -> finish());
    }

}