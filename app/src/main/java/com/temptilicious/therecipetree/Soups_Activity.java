package com.temptilicious.therecipetree;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class Soups_Activity extends ActionBarActivity {

    ListView myLV;
    ArrayList<ListBean> myList;
    MyArrayAdapter adapter;
    RecipeBean rb;

    void initList(){
        myList = new ArrayList<ListBean>();
        myList.add(new ListBean(R.drawable.s1,R.drawable.veg,"Loaded Potato Soup"));
        myList.add(new ListBean(R.drawable.s2,R.drawable.non_veg,"French Onion Soup"));
        myList.add(new ListBean(R.drawable.s3,R.drawable.veg,"Broccoli and Cheese Soup"));
        myList.add(new ListBean(R.drawable.s4,R.drawable.veg,"Tomato Basil Soup"));
        myList.add(new ListBean(R.drawable.s5,R.drawable.non_veg,"Chicken and Wild Rice Soup"));
        myList.add(new ListBean(R.drawable.s6,R.drawable.non_veg,"Chicken and Noodle Soup"));
        myList.add(new ListBean(R.drawable.s7,R.drawable.non_veg,"Squash Soup"));
        myList.add(new ListBean(R.drawable.s8,R.drawable.non_veg,"Wonton Soup"));
        myList.add(new ListBean(R.drawable.s9,R.drawable.veg,"Fresh Pea Soup"));
        myList.add(new ListBean(R.drawable.s10,R.drawable.non_veg,"Chilled Avocado"));
        myList.add(new ListBean(R.drawable.s11,R.drawable.veg,"Roasted Tomato Soup"));
        myList.add(new ListBean(R.drawable.s12,R.drawable.non_veg,"Mexican Corn Soup"));
        myList.add(new ListBean(R.drawable.s13,R.drawable.veg,"Oats Soup"));
        myList.add(new ListBean(R.drawable.s14,R.drawable.veg,"Banana Stem Soup"));
        myList.add(new ListBean(R.drawable.s15,R.drawable.veg,"Minestrone Soup"));
        myList.add(new ListBean(R.drawable.s16,R.drawable.veg,"Pumpkin Soup"));
        myList.add(new ListBean(R.drawable.s17,R.drawable.veg,"Almond Soup"));
        myList.add(new ListBean(R.drawable.s18,R.drawable.veg,"Bean and Pasta Soup"));
        myList.add(new ListBean(R.drawable.s19,R.drawable.veg,"Beetroot Soup"));
        myList.add(new ListBean(R.drawable.s20,R.drawable.veg,"Black Bean Soup"));



        adapter= new MyArrayAdapter(this,R.layout.list_item,myList);
        myLV.setAdapter(adapter);
        myLV.setOnItemClickListener(clickListener);
        rb = new RecipeBean();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soups_);
        myLV = (ListView)findViewById(R.id.listViewSoups);
        initList();
    }
AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0: {
                rb = new RecipeBean(R.drawable.s1, "Loaded potato soup", R.drawable.s1, " " +
                        "Ingredients\n" +
                        "•\t4 (6-ounce) red potatoes \n" +
                        "•\t2 teaspoons olive oil \n" +
                        "•\t1/2 cup prechopped onion $\n" +
                        "•\t1 1/4 cups fat-free, lower-sodium chicken broth \n" +
                        "•\t3 tablespoons all-purpose flour \n" +
                        "•\t2 cups 1% low-fat milk, divided $\n" +
                        "•\t1/4 cup reduced-fat sour cream \n" +
                        "•\t1/2 teaspoon salt \n" +
                        "•\t1/4 teaspoon freshly ground black pepper \n" +
                        "•\t3 bacon slices, halved $\n" +
                        "•\t1.5 ounces cheddar cheese, shredded (about 1/3 cup) \n" +
                        "•\t4 teaspoons thinly sliced green onions $\n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tPierce potatoes with a fork. Microwave on HIGH 13 minutes or until tender. Cut in half; cool slightly.\n" +
                        "•\tWhile potatoes cook, heat oil in a saucepan over medium-high heat. Add onion; sauté 3 minutes. Add broth. Combine flour and 1/2 cup milk; add to pan with 1 1/2 cups milk. Bring to a boil; stir often. Cook 1 minute. Remove from heat; stir in sour cream, salt, and pepper.\n" +
                        "•\tArrange bacon on a paper towel on a microwave-safe plate. Cover with a paper towel; microwave on HIGH for 4 minutes. Crumble bacon.\n" +
                        "•\tDiscard potato skins. Coarsely mash potatoes into soup. Top with cheese, green onions, and bacon.\n" +
                        "\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "vURJb5aMLOE";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 1: {
                rb = new RecipeBean(R.drawable.s2, "FRENCH ONION SOUP", R.drawable.s2, " " +
                        "•\tIngredients\n" +
                        "•\t2 teaspoons olive oil $\n" +
                        "•\t4 cups thinly vertically sliced Walla Walla or other sweet onion $\n" +
                        "•\t4 cups thinly vertically sliced red onion \n" +
                        "•\t1/2 teaspoon sugar $\n" +
                        "•\t1/2 teaspoon freshly ground black pepper \n" +
                        "•\t1/4 teaspoon salt $\n" +
                        "•\t1/4 cup dry white wine $\n" +
                        "•\t8 cups less-sodium beef broth \n" +
                        "•\t1/4 teaspoon chopped fresh thyme \n" +
                        "•\t8 (1-ounce) slices French bread, cut into 1-inch cubes $\n" +
                        "•\t8 (1-ounce) slices reduced-fat, reduced-sodium Swiss cheese (such as Alpine Lace) \n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tHeat olive oil in a Dutch oven over medium-high heat. Add onions to pan; sauté for 5 minutes or " +
                        "until tender. Stir in sugar, pepper, and 1/4 teaspoon salt. Reduce heat to medium; cook 20 minutes, " +
                        "stirring frequently. Increase heat to medium-high, and sauté for 5 minutes or until onion is golden brown. " +
                        "Stir in wine, and cook for 1 minute. Add broth and thyme; bring to a boil. Cover, reduce heat, and simmer 2 hours.\n" +
                        "•\tPreheat broiler.\n" +
                        "•\tPlace bread in a single layer on a baking sheet; broil 2 minutes or until toasted, turning after 1 minute.\n" +
                        "•\tPlace 8 ovenproof bowls on a jelly-roll pan. Ladle 1 cup soup into each bowl. Divide bread evenly among bowls; " +
                        "top each serving with 1 cheese slice. Broil 3 minutes or until cheese begins to brown.\n",R.drawable.non_veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "Ptauy20rLjg";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 2: {
                rb = new RecipeBean(R.drawable.s3, "BROCCOLI AND CHEESE SOUP", R.drawable.s3, " " +
                        "Ingredients\n" +
                        "•\tCooking spray $\n" +
                        "•\t1 cup chopped onion $\n" +
                        "•\t2 garlic cloves, minced \n" +
                        "•\t3 cups fat-free, less-sodium chicken broth \n" +
                        "•\t1 (16-ounce) package broccoli florets $\n" +
                        "•\t2 1/2 cups 2% reduced-fat milk $\n" +
                        "•\t1/3 cup all-purpose flour \n" +
                        "•\t1/4 teaspoon black pepper \n" +
                        "•\t8 ounces light processed cheese, cubed (such as Velveeta Light) \n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tHeat a large nonstick saucepan coated with cooking spray over medium-high heat. Add onion and garlic; saute 3 minutes or until tender. Add broth and broccoli. Bring broccoli mixture to a boil over medium-high heat. Reduce heat to medium; cook 10 minutes.\n" +
                        "•\tCombine milk and flour, stirring with a whisk until well blended. Add milk mixture to broccoli mixture. Cook 5 minutes or until slightly thick, stirring constantly. Stir in pepper. Remove from heat; add cheese, stirring until cheese melts.\n" +
                        "•\tPlace one-third of the soup in a blender or food processor, and process until smooth. " +
                        "Return pureed soup mixture to pan.\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "_mrkQmEHquk";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 3: {
                rb = new RecipeBean(R.drawable.s4, "TOMATO BASIL SOUP", R.drawable.s4, " " +
                         "Ingredients\n" +
                        "•\t4 cups chopped seeded peeled tomato (about 4 large) $\n" +
                        "•\t4 cups low-sodium tomato juice $\n" +
                        "•\t1/3 cup fresh basil leaves \n" +
                        "•\t1 cup 1% low-fat milk $\n" +
                        "•\t1/4 teaspoon salt $\n" +
                        "•\t1/4 teaspoon cracked black pepper \n" +
                        "•\t1/2 cup (4 ounces) 1/3-less-fat cream cheese, softened $\n" +
                        "•\tBasil leaves, thinly sliced (optional) $\n" +
                        "•\t8 (1/2-inch-thick) slices diagonally cut French bread baguette $\n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tBring tomato and juice to a boil in a large saucepan. Reduce heat; simmer, uncovered, 30 minutes.\n" +
                        "•\tPlace tomato mixture and basil in a blender or food processor; process until smooth. " +
                        "Return pureed mixture to pan; stir in milk, salt, and pepper. Add cream cheese, stirring well with a whisk, " +
                        "and cook over medium heat until thick (about 5 minutes). " +
                        "Ladle soup into individual bowls; garnish with sliced basil, if desired. Serve with bread.\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "qUFDhCo1_J8";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 4: {
                rb = new RecipeBean(R.drawable.s5, "CHICKEN AND WILD RICE SOUP", R.drawable.s5, " " +
                        "Ingredients\n" +
                        "•\t1 cup uncooked quick-cooking wild rice $\n" +
                        "•\tCooking spray $\n" +
                        "•\t1 cup chopped onion $\n" +
                        "•\t2 garlic cloves, minced \n" +
                        "•\t3 cups fat-free, less-sodium chicken broth \n" +
                        "•\t1 1/2 cups cubed peeled baking potato $\n" +
                        "•\t3 cups 2% reduced-fat milk $\n" +
                        "•\t1/3 cup all-purpose flour \n" +
                        "•\t10 ounce light processed cheese, cubed (such as Velveeta Light) \n" +
                        "•\t2 cups chopped roasted skinless, boneless chicken breasts (about 2 breasts) $\n" +
                        "•\t1/2 teaspoon freshly ground black pepper \n" +
                        "•\t1/4 teaspoon salt $\n" +
                        "•\t1/4 cup chopped fresh parsley (optional) \n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tCook rice according to package directions, omitting salt and fat.\n" +
                        "•\tHeat a large Dutch oven over medium-high heat. Coat pan with cooking spray. Add onion and garlic; sauté 3 minutes. Add broth and potato; bring to a boil " +
                        "over medium-high heat. Cover, reduce heat, and simmer 5 minutes or until potato is tender.\n" +
                        "•\tCombine milk and flour, stirring well with a whisk. Add the milk mixture to potato mixture; " +
                        "cook 5 minutes or until slightly thick, stirring constantly. Remove from heat; add cheese, " +
                        "stirring until cheese melts. Stir in rice, chicken, pepper, and salt." +
                        " Garnish with parsley, if desired.\n",R.drawable.non_veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "q5fT0Ffh8m8";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 5: {
                rb = new RecipeBean(R.drawable.s6, "CHICKEN AND NOODLE SOUP", R.drawable.s6, " " +
                        "Ingredients\n" +
                        "•\t2 teaspoons olive oil $\n" +
                        "•\t1 cup chopped onion $\n" +
                        "•\t1 cup diced carrots $\n" +
                        "•\t1 cup sliced celery \n" +
                        "•\t1 garlic clove, minced \n" +
                        "•\t1/4 cup all-purpose flour \n" +
                        "•\t1/2 teaspoon dried oregano \n" +
                        "•\t1/4 teaspoon dried thyme \n" +
                        "•\t1/4 teaspoon poultry seasoning \n" +
                        "•\t6 cups low-salt chicken broth \n" +
                        "•\t4 cups diced peeled baking potato $\n" +
                        "•\t1 teaspoon salt $\n" +
                        "•\t2 cups diced leftover roasted chicken $\n" +
                        "•\t1 cup evaporated skim milk $\n" +
                        "•\t4 ounces (2 cups) uncooked wide egg noodles \n" +
                        "•\tFresh thyme (optional) \n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tHeat olive oil in a Dutch oven over medium heat. Add chopped onion, carrots, celery, and garlic clove; sauté 5 minutes." +
                        " Sprinkle flour, oregano, thyme, and poultry seasoning over vegetables, and cook 1 minute. Stir in broth, potato, and salt. " +
                        "Bring to a boil; reduce heat, and simmer, partially covered, 25 minutes or until potato is tender." +
                        " Add roasted chicken, milk, and noodles, and cook 10 minutes or until noodles are tender. Garnish with fresh thyme, " +
                        "if desired.\n",R.drawable.non_veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "45WXFbSyGm4";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 6: {
                rb = new RecipeBean(R.drawable.s7, "SQUASH SOUP", R.drawable.s7, " " +
                        "Ingredients \n" +
                        "\n" +
                        "•\t3 to 3 1/2 pounds butternut squash, approximately 2, seeded and quartered \n" +
                        "\n" +
                        "•\tUnsalted butter, melted, for brushing \n" +
                        "\n" +
                        "•\t1 tablespoon kosher salt, plus 1 teaspoon \n" +
                        "\n" +
                        "•\t1 teaspoon freshly ground white pepper, plus 1/2 teaspoon \n" +
                        "\n" +
                        "•\t3 cups chicken or vegetable broth \n" +
                        "\n" +
                        "•\t1/4 cup honey \n" +
                        "\n" +
                        "•\t1 teaspoon minced fresh ginger \n" +
                        "\n" +
                        "•\t1/2 cup heavy cream \n" +
                        "\n" +
                        "•\t1/4 teaspoon freshly grated nutmeg \n" +
                        "\n" +
                        "METHOD\n" +
                        "•\t\n" +
                        "\n" +
                        "•\tWatch how to make this recipe \n" +
                        "\n" +
                        "\n" +
                        "•\tHeat the oven to 400 degrees F. \n" +
                        "\n" +
                        "\n" +
                        "•\tPlace the quartered squash onto a half sheet pan, brush the flesh of the squash with a little butter and season with 1 tablespoon of the salt and 1 teaspoon of the white pepper. Place in the oven and roast for 30 to 35 minutes or until the flesh is soft and tender. \n" +
                        "\n" +
                        "\n" +
                        "•\tScoop the flesh from the skin into a 6-quart pot. Add the broth, honey and ginger. " +
                        "Place over medium heat and bring to a simmer, approximately 7 to 8 minutes. Using a stick blender, puree the mixture until smooth*. Stir in the heavy cream and return to a low simmer. Season with the remaining salt, pepper, and nutmeg. \n" +
                        "\n" +
                        "*When blending hot liquids: Remove liquid from the heat and allow to cool for at least 5 minutes. " +
                        "Transfer liquid to a blender or food processor and fill it no more than halfway. If using a blender, " +
                        "release one corner of the lid. This prevents the vacuum effect that creates heat explosions. Place a towel over " +
                        "the top of the machine, pulse a few times then process on high speed until smooth.\n",R.drawable.non_veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "rmpWkys1UEk";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 7: {
                rb = new RecipeBean(R.drawable.s8, "WONTON SOUP", R.drawable.s8, " " +
                        "INGREDIENTS\n" +
                        "•\t6 cups reduced-sodium chicken broth \n" +
                        "\n" +
                        "•\t1 cup shredded cabbage \n" +
                        "\n" +
                        "•\t1/2 cup shredded or diced cooked pork \n" +
                        "\n" +
                        "•\t1 tablespoon soy sauce \n" +
                        "\n" +
                        "•\t1 tablespoon sesame oil \n" +
                        "\n" +
                        "•\t16 wonton wrappers \n" +
                        "\n" +
                        "•\t1/4 cup chopped scallions \n" +
                        "\n" +
                        "METHODS\n" +
                        "\n" +
                        "•\tWatch how to make this recipe \n" +
                        "\n" +
                        "•\tPlace broth and cabbage in a large saucepan and set pan over medium-high heat. Bring to a simmer. \n" +
                        "\n" +
                        "•\tMeanwhile, in a food processor, combine pork, soy sauce and sesame oil. Pulse 3 or 4 times until the pork is finely minced but not a paste. \n" +
                        "\n" +
                        "\n" +
                        "•\tArrange 16 wonton wrappers on a flat surface. Spoon filling onto the center of each wrapper, to within 1/4-inch of the edges (about 1 teaspoon per wrapper). Wet your fingers with water and pull up corners of the wontons to create individual \"purses\". Pinch the edges together (with wet fingers) to seal. \n" +
                        "\n" +
                        "\n" +
                        "•\tPlace stuffed wontons in simmering broth. Cook 5 minutes, until wontons are tender and translucent. " +
                        "Remove from heat and stir in scallions\n",R.drawable.non_veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "PrhiodyLUyg";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 8: {
                rb = new RecipeBean(R.drawable.s9, "FRESH PEA SOUP", R.drawable.s9, " " +
                        "Ingredients \n" +
                        "\n" +
                        "\n" +
                        "•\t2 tablespoons unsalted butter \n" +
                        "\n" +
                        "•\t2 cups chopped leeks, white and light green parts (2 leeks) \n" +
                        "\n" +
                        "•\t1 cup chopped yellow onion \n" +
                        "\n" +
                        "•\t4 cups chicken stock, preferably homemade \n" +
                        "\n" +
                        "•\t5 cups freshly shelled peas or 2 (10-ounce) packages frozen peas \n" +
                        "\n" +
                        "•\t2/3 cup chopped fresh mint leaves, loosely packed \n" +
                        "\n" +
                        "•\t2 teaspoons kosher salt \n" +
                        "\n" +
                        "•\t1/2 teaspoon freshly ground black pepper \n" +
                        "\n" +
                        "•\t1/2 cup creme fraiche \n" +
                        "\n" +
                        "•\t1/2 cup freshly chopped chives \n" +
                        "\n" +
                        "•\tGarlic croutons, for serving \n" +
                        "\n" +
                        "METHOD\n" +
                        "\n" +
                        "•\tWatch how to make this recipe \n" +
                        "\n" +
                        "\n" +
                        "•\tHeat the butter in a large saucepan, add the leeks and onion, and cook over medium-low heat for 5 to 10 minutes, until the onion is tender. Add the chicken stock, increase the heat to high, and bring to a boil. Add the peas and cook for 3 to 5 minutes, until the peas are tender. (Frozen peas will take only 3 minutes.) Off the heat, add the mint, salt, and pepper. \n" +
                        "\n" +
                        "\n" +
                        "•\t*Puree the soup in batches: place 1 cup of soup in a blender, place the lid on top, " +
                        "and puree on low speed. With the blender still running, open the venthole in the lid and slowly add " +
                        "more soup until the blender is three-quarters full. Pour the soup into a large bowl and repeat until all " +
                        "the soup is pureed. Whisk in the creme fraiche and chives and taste for seasoning. " +
                        "Serve hot with garlic croutons.\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "PrhiodyLUyg";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 9: {
                rb = new RecipeBean(R.drawable.s10, "CHILLED AVOCADO", R.drawable.s10, " " +
                        "\n" +
                        "Ingredients \n" +
                        "\n" +
                        "•\t3 tablespoons olive oil \n" +
                        "\n" +
                        "•\t1 cup diced white onion \n" +
                        "\n" +
                        "•\t1 serrano chile, stemmed, seeded, and diced \n" +
                        "\n" +
                        "•\t3 garlic cloves, minced \n" +
                        "\n" +
                        "•\tSalt, for seasoning, plus 1 teaspoon \n" +
                        "\n" +
                        "•\t4 firm ripe avocados, halved, pitted, peeled and mashed \n" +
                        "\n" +
                        "•\t4 cups chicken broth \n" +
                        "\n" +
                        "•\t1/4 cup fresh lemon juice \n" +
                        "\n" +
                        "•\t1/4 cup chopped fresh cilantro leaves \n" +
                        "\n" +
                        "•\t2 cups water \n" +
                        "\n" +
                        "•\t1 teaspoon freshly ground black pepper \n" +
                        "\n" +
                        "•\t1/2 cup Mexican sour cream or creme fraiche, whisked to soften* \n" +
                        "\n" +
                        "•\tCrostini or croutons, for serving, optional \n" +
                        "\n" +
                        "•\t*Mexican sour crema is called cream or crema acida and can be found in Latin markets \n" +
                        "\n" +
                        "\n" +
                        "METHOD\n" +
                        "•\t\n" +
                        "\n" +
                        "•\tWatch how to make this recipe \n" +
                        "\n" +
                        "\n" +
                        "•\tHeat 2 tablespoons of the olive oil in a medium skillet over medium heat. Add the onion, chile and the garlic and cook until slightly soft, about 2 minutes. \n" +
                        "\n" +
                        "\n" +
                        "•\tSeason with salt, to taste. Remove from the heat and set aside to cool. \n" +
                        "\n" +
                        "\n" +
                        "•\tPut the avocados in a large bowl. Add the chicken broth, lemon juice, cilantro, onion mixture, and water. Add, in batches, to a blender and puree until smooth, straining each batch of puree into a large bowl. Stir in the 1 teaspoon of salt and the 1 teaspoon of pepper, then cover and refrigerate until well chilled, about 3 hours. \n" +
                        "\n" +
                        "\n" +
                        "•\tPour the chilled soup into individual bowls. Top each serving with a drizzle of the sour cream. Serve with crostini or croutons, if desired. \n" +
                        "\n" +
                        "\n",R.drawable.non_veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "L18qEvwYtiM";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 10: {
                rb = new RecipeBean(R.drawable.s11, "ROASTED TOMATO SOUP", R.drawable.s11, " " +
                        "Ingredients \n" +
                        "\n" +
                        "\n" +
                        "•\t8 Roma tomatoes, cut in half lengthwise \n" +
                        "\n" +
                        "•\t2 tablespoons olive oil, divided \n" +
                        "\n" +
                        "•\tKosher salt and freshly ground black pepper \n" +
                        "\n" +
                        "•\t1/2 cup plus 1 tablespoon water, divided \n" +
                        "\n" +
                        "•\t1/2 onion, chopped \n" +
                        "\n" +
                        "•\t2 cloves garlic, minced \n" +
                        "\n" +
                        "•\t2 teaspoons dried herbes de provence \n" +
                        "\n" +
                        "•\t2 cups chicken or vegetable stock \n" +
                        "\n" +
                        "•\tSour cream or olive oil, for garnish, (optional) \n" +
                        "\n" +
                        "METHOD\n" +
                        "\n" +
                        "•\tWatch how to make this recipe \n" +
                        "\n" +
                        "\n" +
                        "•\tPreheat the oven to 275 degrees F. Line a baking sheet with parchment paper. \n" +
                        "\n" +
                        "•\t\n" +
                        "\n" +
                        "•\tIn a bowl, toss the tomatoes with 1 tablespoon olive oil, salt, and pepper. Place the tomatoes, cut side down, on the prepared baking sheet and drizzle 1 tablespoon water over the tomatoes. Bake in the oven for 1 hour. \n" +
                        "\n" +
                        "\n" +
                        "•\tRemove from the oven. Carefully peel off the skins and discard. Flip the tomatoes over so they're cut side up, and place back in the " +
                        "oven until the tomatoes are shriveled but not dry, another 30 to 60 minutes. Remove the tomatoes from the oven and allow to cool slightly. \n" +
                        "\n" +
                        "\n" +
                        "•\tMeanwhile, in a large saucepan, saute the onion in the remaining 1 tablespoon olive oil over low heat until very soft, 10 to 12 minutes. " +
                        "Add the garlic and herbes de provence and cook until fragrant, another 1 to 2 minutes. Add the stock and remaining 1/2 cup water and bring to a simmer. Simmer 15 minutes. Cool slightly. \n" +
                        "\n" +
                        "\n" +
                        "•\tIn a blender, puree the tomatoes (including any cooking liquid on the baking sheet) and the stock mixture until very smooth. You may need to work in batches. Strain through a fine sieve if a very smooth texture is desired. Pour the soup back into the saucepan, season with salt and pepper, and heat gently. " +
                        "To serve, ladle into cups or bowls and top with either a swirl of olive oil or a" +
                        " little sour cream, if desired.\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "mezakYgTGpc";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 11: {
                rb = new RecipeBean(R.drawable.s12, "MEXICAN CORN SOUP", R.drawable.s12, " " +
                        "\n" +
                        "Ingredients \n" +
                        "\n" +
                        "•\t4 ears fresh or 3 cups frozen, thawed corn kernels \n" +
                        "\n" +
                        "•\t2 medium tomatoes, roughly chopped \n" +
                        "\n" +
                        "•\t2 cups chicken broth \n" +
                        "\n" +
                        "•\t1/2 teaspoon dried oregano \n" +
                        "\n" +
                        "•\t4 slices thick cut bacon \n" +
                        "\n" +
                        "•\t1/2 onion, chopped (about 1 cup) \n" +
                        "\n" +
                        "•\t2 cloves garlic, finely chopped \n" +
                        "\n" +
                        "•\tCoarse salt and freshly ground black pepper \n" +
                        "\n" +
                        "•\t1/2 cup heavy cream, optional \n" +
                        "\n" +
                        "•\t3 tablespoons chopped fresh flat-leaf parsley \n" +
                        "\n" +
                        "•\t1/2 cup queso fresco, fresh farmer's cheese, feta cheese, or sour cream, optional \n" +
                        "\n" +
                        "•\tTortilla chips or fried tortilla strips, optional \n" +
                        "\n" +
                        "METHOD\n" +
                        "\n" +
                        "Watch how to make this recipe \n" +
                        "\n" +
                        "•\tIf using fresh corn, scrape kernels from cobs using small sharp knife or spoon. Place half of the corn kernels in blender with tomatoes, 2 cups of broth, and oregano. Puree until smooth. Set aside. \n" +
                        "\n" +
                        "\n" +
                        "•\tIn a large saucepan over medium heat, cook bacon, turning once until brown and crisp, about 10 minutes. Remove bacon to a paper towel lined plate to drain. Set aside. Add onion to bacon fat in saucepan and cook, stirring frequently until onion is soft and translucent. Add garlic and stir for another minute. \n" +
                        "\n" +
                        "\n" +
                        "•\tAdd tomato-corn puree to saucepan with remaining 2 cups of broth. Bring to a low boil and add remaining whole corn kernels. Simmer over medium-low heat until thickened, about 20 minutes. Stir occasionally and remove any foam as it develops with a large flat metal spoon. Season with salt and pepper. \n" +
                        "\n" +
                        "\n" +
                        "•\tMix in half of the parsley and cream, if desired, and heat through.To serve, garnished with crumbled bacon, remaining parsley, crumbled cheese and tortilla chips or strips.\n" +
                        "\n" +
                        "\n",R.drawable.non_veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "9VJuKh9BzuU";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 12: {
                rb = new RecipeBean(R.drawable.s13, "OATS SOUP", R.drawable.s13, " " +
                        "Ingredients\n" +
                        "\n" +
                        "•\tOats - 1 cup\n" +
                        "\n" +
                        "•\tOnion - 1/2 (finely chopped)\n" +
                        "\n" +
                        "•\tGreen Chilly - 1 (finely chopped)\n" +
                        "\n" +
                        "•\tGarlic - 1 clove (minced)\n" +
                        "\n" +
                        "•\tSalt - to taste\n" +
                        "\n" +
                        "•\tPepper powder - a pinch\n" +
                        "\n" +
                        "•\tWater- 1 cup\n" +
                        "\n" +
                        "•\tMilk - 1 cup\n" +
                        "\n" +
                        "•\tOil - 2 tsp\n" +
                        "\n" +
                        "•\tCilantro - for garnish\n" +
                        "\n" +
                        "Method\n" +
                        "1. Heat oil in a pan and saute the onions, green chilly and garlic till they begin to sweat. \n" +
                        "2. Now add the oats and fry along with it for 2 minutes.\n" +
                        "3. Add salt and water and let it come to a boil. \n" +
                        "4. Now add the milk and pepper powder to it and bring to a boil. \n" +
                        "5. Garnish the rich and creamy oats soup with cilantro or green onions. Serve piping hot with a slice of bread\n" +
                        "\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "Z9FqG4IPOF0";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 13: {
                rb = new RecipeBean(R.drawable.s14, "BANANA STEM SOUP", R.drawable.s14, " " +
                        "Ingredients\n" +
                        "1. Banana Stem - 5\" long\n" +
                        "2. Sweet Corn - 125 gms\n" +
                        "3. Water - 1 cup\n" +
                        "4. Water - 250 ml\n" +
                        "5. Black Pepper Powder - to taste\n" +
                        "6. Black Salt - to taste\n" +
                        "7. Salt - to taste\n" +
                        "8. Lime Juice - to taste\n" +
                        " \n" +
                        "For garnishing \n" +
                        "Few mint leaves\n" +
                        "Few coriander leaves\n" +
                        "Grated carrots - 2 tsp\n" +
                        "Grated cheese - 2 tsp\n" +
                        "Boiled beans – 2 tsp \n" +
                        "\n" +
                        "Method \n" +
                        "1. Cut the banana stem into round pieces.  While cutting, u can remove the thread which comes out of it.  \n" +
                        "2. After cutting, add corn, one cup water and pressure cook the same till  4-5 whistles comes out.\n" +
                        "3. Cool it and grind it to a smooth paste in the mixer.  Add 250 ml water and strain through a strainer.  \n" +
                        "4. Transfer the same into a kadai and boil it after adding item no.5-7.  Just before removing from the stove, add lime juice and stir.\n" +
                        "5. Transfer into bowls, garnish with the items mentioned for garnishing. \n" +
                        " \n" +
                        "Banana stem soup is ready to serve. It is a lovely soup. You can add butter if you wish.\n" +
                        "\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "KhjoxAehftU";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 14: {
                rb = new RecipeBean(R.drawable.s15, "MINESTRONE SOUP", R.drawable.s15, " " +
                        "Ingredients\n" +
                        "\n" +
                        "•\tVegetable broth (home made or store bought) - 4-5 cups\n" +
                        "\n" +
                        "•\tDiced Tomatoes - 1 can (or you can use blanch and chop fresh tomatoes and use \n" +
                        "•\tthem)\n" +
                        "\n" +
                        "•\tOnion - 1 (chopped)\n" +
                        "\n" +
                        "•\tGarlic - 4 cloves (minced)\n" +
                        "\n" +
                        "•\tVegetables of your choice - 2 cups (I usually like to add carrots, potato, zucchini, celery and cabbage.)\n" +
                        "\n" +
                        "•\tBeans - 1/2 cup \n" +
                        "(You can use any beans like white beans, pinto beans, chickpeas etc. If using canned one, use directly. If using dried beans, soak it overnight, cook it and use.)\n" +
                        "\n" +
                        "•\tGreens - 2 cups packed (You can use spinach, swiss chard or any other greens.)\n" +
                        "\n" +
                        "•\tPasta - 3/4 cup\n" +
                        "\n" +
                        "•\tDried Italian Herbs - 2 tsp\n" +
                        "\n" +
                        "•\tRed Pepper Flakes - 1/2 tsp\n" +
                        "\n" +
                        "•\tSalt - to taste\n" +
                        "\n" +
                        "•\tExtra Virgin Olive Oil - 2 tsp \n" +
                        "\n" +
                        "For Garnishing\n" +
                        "•\tExtra Virgin Olive Oil\n" +
                        "\n" +
                        "•\tParmesan Cheese (grated)\n" +
                        "\n" +
                        "•\tFresh Basil leaves or Parsley (chopped) or spring onions\n" +
                        "\n" +
                        "Slow Cooker Method\n" +
                        "Combine all the above ingredients and cook on low for 6-8 hours or 4 hours on high. \n" +
                        "\n" +
                        "Pressure Cooker Method\n" +
                        "Combine all the above ingredients (except the greens) and cook for 2-3 whistles. After the pressure is released, add the greens and simmer the soup for 10 minutes. \n" +
                        "\n" +
                        "Open Pot Method\n" +
                        "1. Heat the oil in a heavy bottomed pot. Saute the garlic and onions till it sweats.\n" +
                        "2. Add the vegetable stock and bring it to a boil.\n" +
                        "3. Add the vegetables, cooked beans and cook till the veggies are tender.\n" +
                        "4. Add the italian seasoning (dried herbs), salt, red pepper flakes and the can of diced tomatoes. Boil again.\n" +
                        "5. Now add the pasta and the greens. Cook for 15-20 minutes till the pasta is tender. Add more water if you " +
                        "feel the soup is thick.\n" +
                        " \n" +
                        "Serving Suggestion\n" +
                        "Take the hot soup in a bowl. Drizzle some extra virgin olive oil on top. Garnish with some fresh grated " +
                        "parmesan cheese and chopped parsley. Serve this hearty meal with a slice of " +
                        "garlic bread.\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "MtWNUAUmGpU";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 15: {
                rb = new RecipeBean(R.drawable.s16, "PUMPKIN SOUP", R.drawable.s16, " " +
                        "Ingredients: \n" +
                        "\n" +
                        "•\t1/4 kg Red pumpkin sliced\n" +
                        "\n" +
                        "•\t1 Onion sliced\n" +
                        "\n" +
                        "•\t2-3 Cloves\n" +
                        "\n" +
                        "•\t1 Small piece of ginger\n" +
                        "\n" +
                        "•\t1 cup Coconut milk (i used fresh coconut milk)\n" +
                        "\n" +
                        "•\t1 cup Water\n" +
                        "\n" +
                        "•\t2 tsp Butter\n" +
                        "\n" +
                        "•\tSalt, Black salt, Roasted cumin powder as per taste.\n" +
                        "\n" +
                        "Method:\n" +
                        "1. Wash and remove the skin of pumpkin and slice it.\n" +
                        "2. Peel the oninon and slice it\n" +
                        "3. Add butter in a kadai, add the cloves, saute for a minute.\n" +
                        "4. Add onionS and saute till it changes the colour little bit\n" +
                        "5. Add pumpkin slices and saute the same with little salt till soft.\n" +
                        "6. Allow to cool. Grind it in mixer with 1 cup of water. \n" +
                        "7. Transfer it into a kadai and boil the same. Check the salt,if required add more.\n" +
                        "8. Add black salt, roasted cumin powder and the coconut milk.\n" +
                        "9. Mix well and remove from the gas. Do not boil after adding coconut milk. Consistency should not be watery.\n" +
                        " \n" +
                        "Serve with chopped pudina (mint) leaves.\n" +
                        "\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "ReNqmujbtx0";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 16: {
                rb = new RecipeBean(R.drawable.s17, "ALMOND SOUP", R.drawable.s17, " " +
                        "Ingredients\n" +
                        "•\t15 to 20 almonds (badam)\n" +
                        "\n" +
                        "•\t4 cups white stock , refer handy tip\n" +
                        "\n" +
                        "•\t2 tsp butter\n" +
                        "\n" +
                        "•\t1 tbsp plain flour (maida)\n" +
                        "\n" +
                        "•\t3/4 cup hot milk\n" +
                        "\n" +
                        "•\t3 to 4 drops almond essence\n" +
                        "\n" +
                        "•\tsalt and to taste\n" +
                        "\n" +
                        "•\t2 tbsp fresh cream\n" +
                        "\n" +
                        "Method \n" +
                        "•\tSoak the almonds in hot water for 10 minutes, drain and remove the skin.\n" +
                        "•\tKeep 2 to 3 almonds aside and blend the remaining in a mixer till smooth using a little stock.\n" +
                        "•\tCut the remaining almonds into slivers and bake them in an oven until crisp. Keep aside.\n" +
                        "•\tAdd the prepared almond paste to the white stock and mix well. Keep aside.\n" +
                        "•\tHeat the butter in a deep non-stick pan, add the flour and sauté over a slow flame for 5 minutes, while stirring continuously, taking care the flour does not discolour.\n" +
                        "•\tAdd the almond paste and remaining white stock, mix well and bring to boil, while stirring continuously.\n" +
                        "•\tAdd the milk, almond essence, salt and pepper, mix well and simmer for 5 minutes.\n" +
                        "•\tAdd the cream and mix well. Serve immediately garnished with almond slivers.\n" +
                        "\n" +
                        "\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "M2f-lEEnzxw";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 17: {
                rb = new RecipeBean(R.drawable.s18, "BEAN AND PASTA ", R.drawable.s18, " " +
                        "Ingredients\n" +
                        "•\t1/2 cup baked beans (canned)\n" +
                        "\n" +
                        "•\t1 medium onion , sliced\n" +
                        "\n" +
                        "•\t2 garlic (lehsun) cloves , sliced\n" +
                        "\n" +
                        "•\t1 cup chopped tomatoes\n" +
                        "\n" +
                        "•\t1/4 cup macaroni or any small\n" +
                        "\n" +
                        "•\t1 tbsp cornflour\n" +
                        "\n" +
                        "•\t1 tsp dried oregano\n" +
                        "\n" +
                        "•\t2 tbsp fresh cream\n" +
                        "\n" +
                        "•\t2 tbsp tomato ketchup\n" +
                        "\n" +
                        "•\t2 tbsp butter\n" +
                        "\n" +
                        "•\tsalt and to taste\n" +
                        "\n" +
                        "\n" +
                        "•\tFor The Garnish\n" +
                        "4 tbsp grated parmesan cheese\n" +
                        "•\tMethod \n" +
                        "•\tHeat the butter in a pan, add the onion and garlic and sauté till the onion turns translucent.\n" +
                        "•\tAdd the baked beans, tomatoes, macaroni, salt and 3 cups of hot water and bring to a boil. Simmer till the macaroni is cooked (aprrox. 8 to 10 minutes).\n" +
                        "•\tDissolve the cornflour in 1 1/2 tablespoons of water and add to the soup.\n" +
                        "•\tAdd the oregano, cream, tomato ketchup, salt and freshly ground pepper and mix well.\n" +
                        "•\tServe hot, garnished with the cheese.\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "b6FtVUPhiFw";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 18:
            {
                rb = new RecipeBean(R.drawable.s19, "BEETROOT SOUP ", R.drawable.s19, " " +
                        "Ingredients\n" +
                        "•\t1 big beetroot\n" +
                        "\n" +
                        "•\t1 tbsp butter\n" +
                        "\n" +
                        "•\t1 tbsp plain flour (maida)\n" +
                        "\n" +
                        "•\t3/4 cup milk\n" +
                        "\n" +
                        "•\tsalt and freshly ground black pepper (kalimirch) powder to taste\n" +
                        "\n" +
                        "•\t1 tbsp fresh cream\n" +
                        "\n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tCombine the beetroot with enough water and pressure cook for 4 whistles.\n" +
                        "•\tAllow the steam to escape before opening the lid.\n" +
                        "•\tPeel the beetroot and chop them roughly into big cubes.\n" +
                        "•\tCombine the beetroot cubes with ¾ cup of water and blend in a mixer to a smooth mixture. Strain and keep aside.\n" +
                        "•\tHeat the butter in a broad non-stick pan and add the plain flour and cook on a medium flame for 1 to 2 minutes, while stirring continuously.\n" +
                        "•\tAdd the milk and the beetroot mixture, mix well and cook on a medium flame for 2 to 3 minutes, while stirring continuously.\n" +
                        "•\tAdd the salt, pepper and fresh cream and cook on a medium flame for 2 minutes, while stirring occasionally.\n" +
                        "•\tServe hot.\n" +
                        "\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "PquAQ8opLyE";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 19:
            {
                rb = new RecipeBean(R.drawable.s20, "BLACK BEAN SOUP\n", R.drawable.s20, " " +
                        "Ingredients\n" +
                        "•\t1/2 cup black beans , soaked for 5 hours and drained\n" +
                        "\n" +
                        "•\t2 tsp oil\n" +
                        "\n" +
                        "•\t1/4 cup finely chopped onions\n" +
                        "\n" +
                        "•\t2 tsp chopped garlic (lehsun)\n" +
                        "\n" +
                        "•\t1 cup roughly chopped tomatoes\n" +
                        "\n" +
                        "•\tsalt to taste\n" +
                        "\n" +
                        "\n" +
                        "•\tFor The Garnish\n" +
                        "2 tbsp hung curds (chakka dahi)\n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "\n" +
                        "•\tHeat the oil in a pressure cooker, add the onions and garlic and sauté on a medium flame for 2 minutes.\n" +
                        "•\tAdd the tomatoes, black beans, 1½ cups of water and salt, mix well and pressure cook for 3 whistles.\n" +
                        "•\tAllow the steam to escape before opening the lid.\n" +
                        "•\tAllow it to cool a little and blend in a mixer till smooth.\n" +
                        "•\tTransfer the mixture into a deep pan, add ¼ cup of water, mix well and cook on a medium flame for 3 to 4 minutes, while stirring occasionally.\n" +
                        "•\tServe hot garnished with hung curds.\n" +
                        "\n",R.drawable.veg);
                Intent i = new Intent(Soups_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "GTXGdpgEk7Q";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
        }
    }
};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_soups_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
