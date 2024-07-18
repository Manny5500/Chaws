package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.recipeapp.adapter.IngredientsAdapter
import com.example.recipeapp.adapter.ProceduresAdapter
import com.example.recipeapp.databinding.ActivityRecipeBinding

class RecipeActivity : AppCompatActivity() {

    private lateinit var binding:ActivityRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerIngredients = binding.recyclerIngredients
        recyclerIngredients.layoutManager = LinearLayoutManager(this)
        recyclerIngredients.adapter = IngredientsAdapter(listOf(
            "1 egg",
            "3/4 cup milk",
            "2 tablespoons butter, melted",
            "1 cup all-purpose flour",
            "1 tablespoon granulate sugar",
            "1 teaspoon baking powder",
            "1/2 teaspoon baking powder",
            "1/2 teaspoon salt",
            "cherry sauce",
            "1/4 granulated sugar (option)",
            "2 teaspoons cornstarch",
            "1/8 teaspoon cinnamon",
            "1/2 cup orange juice",
            "2 cups sweet cherries, pitted and halved",
            "1 teaspoon grated orange peel"
        ))

        val recyclerProcedures = binding.recyclerProcedures
        recyclerProcedures.layoutManager = LinearLayoutManager(this)
        recyclerProcedures.adapter = ProceduresAdapter(listOf(
            "Step 1.\tIn a small saucepan, melt the butter. Beat egg in a mixing bowl until fluffy.",
            "Step 2.\tAdd milk and melted butter. Put all the dry ingredients a bowl to combine then add to the wet ingredients and mix well.",
            "Step 3.\tHeat a heavy griddle or fry fan which is greased with a little butter. The pan is hot enough when your pour a drop of water into the pan" +
                    "and its slides around.",
            "Step 4.\tPour a small amount of batter (approx. 1/4 cup) and spread it out a little to form the pancake. The number you can cook at a time will" +
                    "depend on the size of your frying pan.",
            "Step 5.\t When bubbles appear on surface and begin to break, turn over and cook the other side. Repeat until all the pancake batter is used.",
            "Step 6.\tStack the cooked pancakes on a plate and cover them with an upside-down bowl.",
            "Step 7.\tCherry Sauce. In a medium saucepan, combine the sugar, cornstarch and cinnamon. Add orange juice, cherries and orange peel. Bring to a boil over" +
                    "medium-high heat and boil until thickened. Serve with the pancakes. Add a scoop of ice cream if this is a dessert."
        ))

    }
}