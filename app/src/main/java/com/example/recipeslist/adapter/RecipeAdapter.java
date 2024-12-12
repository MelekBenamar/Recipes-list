package com.example.recipeslist.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeslist.R;
import com.example.recipeslist.RecipeDetailActivity;
import com.example.recipeslist.model.Recipe;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private List<Recipe> recipeList;
    private Context context;

    public RecipeAdapter(List<Recipe> recipeList, Context context) {
        this.recipeList = recipeList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Use the correct layout file
        View view = LayoutInflater.from(context).inflate(R.layout.activity_recipe_item, parent, false);
        return new RecipeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        Recipe recipe = recipeList.get(position);


        // Log the recipe details
        Log.d("RecipeAdapter", "Recipe ID: " + recipe.getId());
        Log.d("RecipeAdapter", "Recipe Name: " + recipe.getName());
        Log.d("RecipeAdapter", "Recipe Description: " + recipe.getDescription());
        Log.d("RecipeAdapter", "Recipe Ingredients: " + recipe.getIngredients());
        Log.d("RecipeAdapter", "Recipe Procedure: " + recipe.getProcedure());

        holder.recipeName.setText(recipe.getName());
        holder.recipeDescription.setText(recipe.getDescription());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, RecipeDetailActivity.class);
            Log.d("ID before it send", String.valueOf(recipe.getId()));
            intent.putExtra("recipeId", recipe.getId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    static class RecipeViewHolder extends RecyclerView.ViewHolder {
        TextView recipeName, recipeDescription;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            // Match IDs with activity_recipe_item.xml
            recipeName = itemView.findViewById(R.id.recipeName);
            recipeDescription = itemView.findViewById(R.id.recipeDescription);
        }
    }
}

