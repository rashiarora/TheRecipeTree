package com.temptilicious.therecipetree;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Mocktails_Activity extends ActionBarActivity {

    ListView myLV;
    ArrayList<ListBean> myList;
    MyArrayAdapter adapter;
    RecipeBean rb;

    void initList(){
        myList = new ArrayList<ListBean>();
        myList.add(new ListBean(R.drawable.mocktails_1,R.drawable.veg,"Twisted Lime Drink"));
        myList.add(new ListBean(R.drawable.mocktails_2,R.drawable.veg,"Chilled Grren Tea and Honey Drink"));
        myList.add(new ListBean(R.drawable.mocktails_3,R.drawable.veg,"Coconut Green Tea"));
        myList.add(new ListBean(R.drawable.mocktail_5,R.drawable.veg,"GINGER PEACH SODA"));
        myList.add(new ListBean(R.drawable.mocktail_6,R.drawable.veg,"POMEGRANATE FIZZ"));
        myList.add(new ListBean(R.drawable.mocktail_7,R.drawable.veg,"Bluberry Mojito"));
        myList.add(new ListBean(R.drawable.mocktail_8,R.drawable.veg,"GREEN APPE MOJITO"));
        myList.add(new ListBean(R.drawable.mocktail_9,R.drawable.veg,"STRAWBERRY COCONUT MOJItO"));

        adapter= new MyArrayAdapter(this,R.layout.list_item,myList);
        myLV.setAdapter(adapter);
        myLV.setOnItemClickListener(clickListener);
        rb = new RecipeBean();


    }    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_mocktails_);
       // setContentView(R.layout.listview_activity);
        myLV = (ListView)findViewById(R.id.listViewMocktails);
        initList();
    }
AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0: {
                rb = new RecipeBean(R.drawable.mocktails_1, "Twisted Lime Drink", R.drawable.mocktails_1, " " +
                        "Ingredients\n" +
                        "•\t4    Lemons                                       \n" +
                        "•\t1 Green chilli                                      \n" +
                        "•\tSea salt  -  to taste\n" +
                        "•\tBlack salt (kala namak)   -  to taste\n" +
                        "•\t10-12   Fresh mint leaves                        \n" +
                        "•\t2 tablespoons  Powdered sugar                         \n" +
                        "•\tIce cubes  - as required\n" +
                        "•\t4  Fresh mint sprigs                         \n" +
                        "•\tSoda - as required\n" +
                        "\n" +
                        "Method\n" +
                        "Step 1\n" +
                        "Quarter three lemons and halve the remaining one. Squeeze the juice from the lemon halves into a stainless steel glass. Put the lemon pieces in it.\n" +
                        "Step 2\n" +
                        "Add green chilli, sea salt, black salt, mint leaves and crush with a wooden stick. Add powdered sugar, half a cup of water and mix. Add ice cubes and shake to mix well.\n" +
                        "Step 3\n" +
                        "Put a mint sprig in a serving glass, add ice cubes and strain the mixture through a strainer into the glass. Top it up with soda and mix.\n" +
                        "Step 4\n" +
                        "Serve immediately.\n", R.drawable.veg);

                Intent i = new Intent(Mocktails_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "QGZTHAGKcyk";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 1: {
                rb = new RecipeBean(R.drawable.mocktails_2, "Chilled Green Tea and Honey Drink", R.drawable.mocktails_2, " " +
                        " Ingredients\n" +
                        "•\t1 gram   Green tea powder                      \n" +
                        "•\t2 teaspoon   Honey                                       \n" +
                        "\n" +
                        "Method\n" +
                        "Step 1\n" +
                        "Place the green tea powder in a glass.\n" +
                        "Step 2\n" +
                        "Add a little lukewarm water and stir till it dissolves.\n" +
                        "Step 3\n" +
                        "Top it with chilled water.\n" +
                        "Step 4\n" +
                        "Add two teaspoons honey and stir.\n", R.drawable.veg);

                Intent i = new Intent(Mocktails_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "GX2uGEaJrU4";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;

            case 2: {
                rb = new RecipeBean(R.drawable.mocktails_3, "Coconut Green Tea", R.drawable.mocktails_3, " " +
                        "Ingredients\n" +
                        "•\t3-4 cups Tender coconut water                                          \n" +
                        "•\t½ cup   tender coconut flesh                                             \n" +
                        "•\t4 tablespoon  Green tea                                                           \n" +
                        "•\t24-32    Ice cubes                                                            \n" +
                        "•\t4 tablespoon  Lemon juice                                                       \n" +
                        "•\t8 tablespoon   Honey                                                                  \n" +
                        "\n" +
                        "Method\n" +
                        "Step 1    Boil 2 cups water in a non-stick pan, add green tea and mix till it infuses. Switch off heat.\n" +
                        "Step 2    Take 4 tall glasses and put 6-8 ice cubes in each glass. Add 1 tsp lemon juice, 2 tbsps honey and some coconut flesh.\n" +
                        "Step 3    Strain the green tea into a bowl, add coconut water and mix well.\n" +
                        "Step 4    Pour the green tea-coconut water mixture into the glasses and serve chilled.\n", R.drawable.veg);

                Intent i = new Intent(Mocktails_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "vce-S_lkRWA";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 3: {
                rb = new RecipeBean(R.drawable.mocktail_5, "GINGER PEACH SODA", R.drawable.mocktail_5, " " +
                        "Ingredients:\n" +
                        "1 cup(s) sugar\n" +
                        "2 tablespoon(s) minced fresh ginger\n" +
                        "2 (about 2/3 pound) very ripe peaches, halved, pitted, and thinly sliced\n" +
                        "2 liter(s) seltzer, chilled\n" +
                        "16 fresh mint leaves, for garnish\n" +
                        "METHOD\n" +
                        "Directions:\n" +
                        "1. In a medium saucepan over medium-low heat, bring 1 cup water, sugar, and ginger to a gentle simmer, stirring to dissolve sugar. Remove simple syrup from heat, cover, and steep for about 30 minutes.\n" +
                        "2. Over a medium bowl, pour syrup through a fine-mesh sieve, pressing minced ginger against sieve with the back of a spoon to extract flavor. Discard ginger. Cover bowl with plastic wrap, and refrigerate until well chilled.\n" +
                        "Directions:\n" +
                        "1. In a medium saucepan over medium-low heat, bring 1 cup water, sugar, and ginger to a gentle simmer, stirring to dissolve sugar. Remove simple syrup from heat, cover, and steep for about 30 minutes.\n" +
                        "2. Over a medium bowl, pour syrup through a fine-mesh sieve, pressing minced ginger against sieve with the back of a spoon to extract flavor. Discard ginger. Cover bowl with plastic wrap, and refrigerate until well chilled.\n" +
                        "3. Evenly distribute peach slices among 8 tall glasses. For each glass, lightly press peaches with the back of " +
                        "a wooden spoon to release their juice. Pour about 2 tablespoons chilled syrup over peaches. (Store remaining syrup in refrigerator for up to 2 weeks.) " +
                        "Add ice cubes; then top with seltzer. Stir to distribute syrup, peach juice, and seltzer evenly. " +
                        "Garnish with 2 mint leaves\n", R.drawable.veg);

                Intent i = new Intent(Mocktails_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "W2OpT5qedt0";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 4: {
                rb = new RecipeBean(R.drawable.mocktail_6, "POMEGRANATE FIZZ", R.drawable.mocktail_6, " " +
                        "Ingredients:\n" +
                        "•\t¼ ounce fresh lemon juice \n" +
                        "•\t¼ ounce fresh orange juice \n" +
                        "•\t1 ounce pomegranate juice \n" +
                        "•\tapproximately 10 pomegranate arils \n" +
                        "•\tsplash of sparkling cider \n" +
                        "\n" +
                        "Preparation:\n" +
                        "Step 1: Combine the lemon juices, orange juice, and pomegranate juice in a cocktail shaker with ice and shake until cold. \n" +
                        "Step 2: Strain mixture into a glass and add arils to the glass. \n" +
                        "Step 3: Top off with sparkling cider \n", R.drawable.veg);

                Intent i = new Intent(Mocktails_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "ua7buBQWk9c";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 5: {
                rb = new RecipeBean(R.drawable.mocktail_7, "Bluberry Mojito", R.drawable.mocktail_7, " " +
                        "Ingredients: \n" +
                        "6-8 mint leaves \n" +
                        "Handful of fresh blueberries - slightly muddle together. \n" +
                        "2 ounces of lime juice \n" +
                        "2 ounces of simple syrup \n" +
                        "Splash of club \n" +
                        "Directions: \n" +
                        "Add ice. \n" +
                        "Shake. \n" +
                        "Enjoy"
                        , R.drawable.veg);

                Intent i = new Intent(Mocktails_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "hNzsxb8nmTQ";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 6: {
                rb = new RecipeBean(R.drawable.mocktail_8, "GREEN APPE MOJITO", R.drawable.mocktail_8, " " +
                        "Ingredients \n"+
                        "club soda \n"+
                        "3 wedge(s) lime \n"+
                       " 5 leaf(ves) mint, torn \n"+
                        "2 oz. light rum \n"+
                        "ice \n"+
                        "1/2 oz. Granny Smith Apple Syrup \n" +
                        "1/2 oz. Mojito Mix \n"+
                        "Preparation \n" +
               " 1. Combine ingredients in shaker in the order listed, except sparkling beverage. \n" +
                "2. Cap and shake vigorously. \n" +
               " 3. Pour into serving glass and add any needed ice. \n" +
                "4. Top with sparkling beverage and garnish \n"

                , R.drawable.veg);

                Intent i = new Intent(Mocktails_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "Rp2mITEai2k";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 7: {
                rb = new RecipeBean(R.drawable.mocktail_9, "STRAWBERRY COCONUT MOJItO", R.drawable.mocktail_9, " " +
                        "10 fresh mint leaves \n" +
                        "1/2 lime, cut into 4 wedges \n "+
                        " 4-5 sliced local strawberries \n "+
                        "2 tablespoons white sugar, or to taste \n"+
                        "1 cup ice cubes \n"+
                        "1 1/2 fluid ounces white  coconut rum \n"+
                        "1/2 cup club soda (or diet 7up, leave out sugar if you use 7up)\n"+

                "PROCEDURE \n"+
                "Place mint leaves and 1 lime wedge into a sturdy glass. Use a muddler to crush the mint and lime to release the " +
                        "mint oils and lime juice. Add 2 more lime wedges and the sugar, and muddle again to release the lime juice. " +
                        "Do not strain the mixture. Fill the glass almost to the top with ice. Add sliced strawberries.  " +
                        "Pour the rum over the ice, and fill the glass with carbonated water." +
                        " Stir, taste, and add more sugar if desired. Garnish with the remaining lime wedge "   , R.drawable.veg);

                Intent i = new Intent(Mocktails_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "VWoLEVGLNNw";
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
        getMenuInflater().inflate(R.menu.menu_mocktails_, menu);
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
