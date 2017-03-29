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


public class Desserts_Activity extends ActionBarActivity {
    ListView myLV;
    ArrayList<ListBean> myList;
    MyArrayAdapter adapter;
    RecipeBean rb;

    void initList(){
        myList = new ArrayList<ListBean>();
        myList.add(new ListBean(R.drawable.dessert_1,R.drawable.non_veg,"Chocolate Waffles"));
        myList.add(new ListBean(R.drawable.dessert_2,R.drawable.veg,"Nariyal Ka Halwa"));
        myList.add(new ListBean(R.drawable.dessert_3,R.drawable.veg,"Mango Ice Cream"));
        myList.add(new ListBean(R.drawable.dessert_4,R.drawable.veg,"Mango CheeseCake"));
        myList.add(new ListBean(R.drawable.dessert_5,R.drawable.veg,"Chocolate Yogurt"));
        myList.add(new ListBean(R.drawable.dessert_6,R.drawable.veg,"Kesar Badam IceCream"));
        myList.add(new ListBean(R.drawable.dessert_7,R.drawable.veg,"Fruit Kheer with custard"));
        myList.add(new ListBean(R.drawable.dessert_8,R.drawable.veg,"Rose Kheer Dessert"));
        myList.add(new ListBean(R.drawable.dessert_9,R.drawable.non_veg,"Caramel Custard"));
        myList.add(new ListBean(R.drawable.dessert_10,R.drawable.veg,"Rose Sandesh"));
        myList.add(new ListBean(R.drawable.dessert_11,R.drawable.non_veg,"Soft Centered Chocolate Cake"));
        myList.add(new ListBean(R.drawable.dessert_12,R.drawable.non_veg,"Chocolate CupCake"));
        myList.add(new ListBean(R.drawable.dessert_13,R.drawable.non_veg,"Mango Eve’s pudding"));
        myList.add(new ListBean(R.drawable.dessert_14,R.drawable.veg,"Chocolate Gulab Jamun"));
        myList.add(new ListBean(R.drawable.dessert_15,R.drawable.non_veg,"Chocolate and Orange Cake"));
        myList.add(new ListBean(R.drawable.dessert_16,R.drawable.veg,"Kesari Phirni"));
        myList.add(new ListBean(R.drawable.dessert_17,R.drawable.veg,"Sweet Potato Kheer"));
        myList.add(new ListBean(R.drawable.dessert_18,R.drawable.veg,"Jalebi"));
        myList.add(new ListBean(R.drawable.dessert_19,R.drawable.veg,"Chocolate Cookie CheeseCake"));
        myList.add(new ListBean(R.drawable.dessert_20,R.drawable.veg,"Chocolate Walnut Fudge"));


        adapter= new MyArrayAdapter(this,R.layout.list_item,myList);
        myLV.setAdapter(adapter);
        myLV.setOnItemClickListener(clickListener);
        rb = new RecipeBean();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts_);
        myLV = (ListView)findViewById(R.id.listViewDesserts);
        initList();
    }
    AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
            case 0:
            {rb = new RecipeBean(R.drawable.dessert_1,"Chocolate Waffles",R.drawable.dessert_1," " +
                    "Ingredients\n" +
                    "•\t1 cup   Refined flour (maida)          \n" +
                    "•\t3 tablespoons    Chocolate grated               \n" +
                    "•\t1 1/2 teaspoons   Baking powder                   \n" +
                    "•\t1 tablespoon     Cocoa powder                     \n" +
                    "•\t2 tablespoons    Sugar                                  \n" +
                    "•\t2    Eggs                                  \n" +
                    "•\tVanilla essence  -a few drops\n" +
                    "•\t3/4 cup    Milk                                    \n" +
                    "•\t2 tablespoons  Chocolate sauce               \n" +
                    "•\t8 tablespoons   Butter melted                    \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Sift together refined flour and baking powder. Add cocoa powder and sugar and mix. Break eggs into it.\n" +
                    "Step 2Add vanilla essence and mix. Add some milk and mix. Add more milk to get the proper consistency.\n" +
                    "Step 3\n" +
                    "Add chocolate sauce, butter and grated chocolate and mix.\n" +
                    "Step 4\n" +
                    "Heat the waffle maker. Grease with butter and pour a ladleful of batter into it. Close the lid and cook for three to four minutes. Open half way through and glaze with butter.\n" +
                    "Step 5\n" +
                    "Serve hot immediately.\n",R.drawable.non_veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "2CjVQeuPa2E";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 1:
            {rb = new RecipeBean(R.drawable.dessert_2,"Nariyal Ka Halwa",R.drawable.dessert_2," " +
                    "Ingredients\n" +
                    "•\t1 cup    Coconut freshly scraped                                                           \n" +
                    "•\t2 tablespoons    Ghee                                                                                         \n" +
                    "•\t8 tablespoons    Sugar Free Natura Diet Sugar                                                  \n" +
                    "•\t2 tablespoons   Milk                                                                                           \n" +
                    "•\tSaffron strands dissolved in 1 tablespoon warm milk  -   a few\n" +
                    "•\t¼ teaspoon   Green cardamom powder                                                        \n" +
                    "•\t10-12 for garnishing   Pistachios chopped                                                                   \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Heat the ghee in a non-stick kadai. Add the coconut and sauté for two to three minutes.\n" +
                    "Step 2\n" +
                    "Add the Sugar Free Natura Diet Sugar and milk and mix well. Cover the kadai and cook on low heat for four to five minutes. Uncover, stir once and continue to cook till the sugar dissolves.\n" +
                    "Step 3\n" +
                    "Mix in the saffron milk and cardamom powder.\n" +
                    "Step 4\n" +
                    "Serve hot garnished with the pistachios.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "ZHm3P7bXrxY";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 2:
            {rb = new RecipeBean(R.drawable.dessert_3,"Mango Ice Cream",R.drawable.dessert_3," " +
                    "Ingredients\n" +
                    "•\t1 cup  Mango puree                                              \n" +
                    "•\t1 cup  Milk                                                             \n" +
                    "•\t1 cup  Fresh cream                                              \n" +
                    "•\t1 cup  Milk powder                                                \n" +
                    "•\t8   Sugar Free Natura Sweet Drops               \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Place the milk, fresh cream, milk powder, Sugar Free Natura Sweet Drops and mango purée in a in a blender and blend till smooth.\n" +
                    "Step 2\n" +
                    "Pour into an ice cream container with a tight- fitting lid and freeze till set.\n" +
                    "Step 3\n" +
                    "Slice and serve.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "rrISpFoNsGE";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 3:
            {rb = new RecipeBean(R.drawable.dessert_4,"Mango CheeseCake",R.drawable.dessert_4," " +
                    "Ingredients\n" +
                    "•\t2 cups    Mango pulp                                                           \n" +
                    "•\t2 cups     Paneer (cottage cheese)                                          \n" +
                    "•\t½ centimeter cubes    Crust                                                                     \n" +
                    "•\t8-10 tablespoons   Digestive biscuits                                                  \n" +
                    "•\t2 tablespoons   Butter                                                                     \n" +
                    "For Filling \n" +
                    "•\t1 cup   Skimmed milk                                                        \n" +
                    "•\t1/2 cup   Condensed milk                                                    \n" +
                    "•\t1 tablespoon   Cornflour/ corn starch                                           \n" +
                    "•\t1 tablespoon   Carrageenan (vegetarian gelatin)                         \n" +
                    "•\t1 1/2 cups   Skimmed milk yogurt                                            \n" +
                    "•\t1 teaspoon   Mango essence                                                    \n" +
                    "•\t1/2 cup    Sugar powdered                                                     \n" +
                    "For Topping \n" +
                    "•\t1 tablespoon    Mango jelly                                                           \n" +
                    "•\t1  Mango sliced                                                        \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Crush biscuits to a coarse powder and put it into a bowl. Add butter and mix. Put this mixture at the base of a spring form pan (loose bottom pan) lined with greaseproof paper.\n" +
                    "Step 2\n" +
                    "Press the mixture lightly and place it in the refrigerator to set. Heat milk in a pan. Add condensed milk and mix. Dissolve cornflour in a little milk and add it to the hot milk. Cook stirring continuously till the mixture thickens. Set aside.\n" +
                    "Step 3\n" +
                    "Mix carrageenan or gelatin in a little water and heat in the microwave for one minute. Remove from the microwave and set aside. Take hung yogurt in a bowl. Add paneer and mix with a whisk.\n" +
                    "Step 4\n" +
                    "Add mango pulp and mix again. Add mango essence and the milk mixture. Mix again. Add powdered sugar and blend with a hand blender. Add the dissolved carrageenan or gelatin and blend again.\n" +
                    "Step 5\n" +
                    "Pour this mixture into the prepared tin over the biscuit layer. Refrigerate for two to three hours. Dissolve mango jelly in a quarter cup of water, bring it to a boil and cool. Put a layer of mango jelly on the set cheesecake.\n" +
                    "Step 6\n" +
                    "Chill until the jelly is set. Remove from the spring form pan and cut into eight wedges with a sharp knife " +
                    "dipped in hot water. Serve chilled with sliced mango fan.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "7p9WBkAWV8Y";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 4:
            {rb = new RecipeBean(R.drawable.dessert_5,"Chocolate Yogurt",R.drawable.dessert_5," " +
                    "Ingredients\n" +
                    "•\t4 1/2 cups   Yogurt                                                  \n" +
                    "•\t3/4 cup   Dark chocolate grated                          \n" +
                    "•\t80 measures   Sugar Free Natura                              \n" +
                    "•\t5 tablespoons   Fresh cream                                        \n" +
                    "•\t15   Walnuts toasted and crushed              \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Tie up yogurt in a muslin cloth and hang it in the refrigerator with a bowl beneath it to collect the whey. Once all the excess water has drained away, squeeze the residue through the cloth into a bowl to get smooth hung yogurt.\n" +
                    "Step 2\n" +
                    "Melt chocolate in the microwave for one minute. You can also use a double boiler to melt the chocolate. Whisk it well, add cream and mix well.\n" +
                    "Step 3\n" +
                    "Keep aside a little of this mixture for garnish. Add Sugar Free Natura to the yogurt and mix well. Add melted chocolate and mix it with a fork to get a marbled effect. Keep aside a tablespoon of walnuts and add the rest to the yogurt mixture and mix lightly.\n" +
                    "Step 4\n" +
                    "Transfer into a serving bowl, sprinkle the remaining walnuts on top.\n" +
                    "Step 5\n" +
                    "Drizzle the remaining melted chocolate on top and serve.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "UyVwWSEJUMA";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 5:
            {rb = new RecipeBean(R.drawable.dessert_6,"Kesar Badam IceCream",R.drawable.dessert_6," " +
                    "Ingredients\n" +
                    "•\t500 millilitres     Milk                                                \n" +
                    "•\t2 tablespoons   Cornflour/ corn starch                    \n" +
                    "•\t125 grams   Cream                                            \n" +
                    "•\t125 grams   Sugar                                             \n" +
                    "•\tSaffron (kesar)   - a few strands\n" +
                    "•\t25-30  Almonds                                         \n" +
                    "•\t10-15    Pistachios                                      \n" +
                    "•\t3 drop    Ice cream essence                        \n" +
                    "•\t2-3 drop   Edible yellow colour                       \n" +
                    "•\t5 grams   CMC                                              \n" +
                    "•\t5 grams  GMS (stabilizer)                           \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Blanch almonds and pistachios in one cup of hot water. Drain, peel and cut into slivers. Heat milk in a pan. Dissolve cornstarch in a little cold milk. Add cream to the milk and mix. Add sugar and stir till the sugar dissolves.\n" +
                    "Step 2\n" +
                    "Add saffron strands and mix. Keep an ice cream maker ready. Add the dissolved cornstarch to the boiling milk and stir till thick. Add half the blanched and slivered almonds and pistachios. Put ice in the ice cream maker and add rock salt to it.\n" +
                    "Step 3\n" +
                    "Take the milk mixture in a bowl that had been kept in the refrigerator to be cooled. Add ice cream essence and yellow colour. Dissolve GMS and CNC in a little milk and strain through a sieve. Add it to the milk mixture and mix thoroughly.\n" +
                    "Step 4\n" +
                    "Add the remaining almonds and pistachios and put the mixture in the ice cream maker. Switch on the ice cream maker. Replace the ice and rock salt at regular intervals.\n" +
                    "Step 5\n" +
                    "When about to set, place it in deep freezer for final setting. When set hard, remove, cut into slices and serve.\n"
                     ,R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "1pQiMQMEVEU";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 6:
            {rb = new RecipeBean(R.drawable.dessert_7," Fruit Kheer with custard",R.drawable.dessert_7," " +
                    "Ingredients\n" +
                    "•\t3 tablespoons    Basmati rice soaked                               \n" +
                    "•\t10-15    Red grapes halved                                 \n" +
                    "•\t6 cups   Milk (full cream)                                     \n" +
                    "•\t3 tablespoons    Vanilla Custard powder                         \n" +
                    "•\t2  Bananas (elaichi)                                 \n" +
                    "•\t1 medium    Apple diced                                           \n" +
                    "•\t8-10   Orange segments peeled                      \n" +
                    "•\t8-10    Sweet lime segments peeled                 \n" +
                    "•\t1 tablespoon   Butter                                                   \n" +
                    "•\t8 tablespoons   Sugar                                                   \n" +
                    "•\tSaffron (kesar) -6-8 strands\n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Heat a pan. Add drained rice and five cups of milk and let it come to a boil. Reduce heat and cook, stirring continuously, so that the milk does not burn.\n" +
                    "Step 2\n" +
                    "Take custard powder in a bowl, add the remaining milk and whisk. Halve the grapes and remove seeds. Dice apple. Peel and dice bananas.\n" +
                    "Step 3\n" +
                    "Heat butter in a pan. Add apple, bananas, grapes, orange segments, sweet lime segments and one tablespoon sugar and stir.\n" +
                    "Step 4\n" +
                    "Cover and cook on low heat till the fruits soften. Add the custard powder mixture to the kheer once the rice is cooked and stir.\n" +
                    "Step 5\n" +
                    "Cook till thick. Add the remaining sugar and stir till all the sugar dissolves. Add saffron and mix.\n" +
                    "Step 6\n" +
                    "Transfer the stewed fruits into the serving bowl. Pour the custard kheer over them.\n" +
                    "Step 7\n" +
                    "Sprinkle pomegranate pearls and serve.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "ceDDmjSsb2w";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 7:
            {rb = new RecipeBean(R.drawable.dessert_8,"Rose Kheer Dessert",R.drawable.dessert_8," " +
                    "Ingredients\n" +
                    "•\t4 tablespoons    Short grain rice                                         \n" +
                    "•\t2 cups   Milk                                                            \n" +
                    "•\t1/4 cup   Sugar                                                       \n" +
                    "•\t1/2 teaspoon   Green cardamom powder                        \n" +
                    "•\t3/4 cup   Cream                                                     \n" +
                    "•\t1/2 cup    Rose petals                                              \n" +
                    "•\t4 tablespoons     Rose syrup                                               \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Take rice in a pan, add milk and cook till rice is soft. Add sugar and green cardamom powder and cook till thick. Set aside to cool.\n" +
                    "Step 2\n" +
                    "Transfer the kheer into a deep bowl. Fold in half cup whipped cream and most of the rose petals. Add two tablespoons rose syrup and mix.\n" +
                    "Step 3\n" +
                    "Put the kheer in stemmed glasses and chill. Put the remaining whipped cream in a piping bag and pipe rosettes on top of the kheer in each glass.\n" +
                    "Step 4\n" +
                    "Drizzle a little rose syrup over it, place a rose petal on top and serve chilled.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "Mp6EH1ihhr0";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 8:
            {rb = new RecipeBean(R.drawable.dessert_9,"Caramel Custard",R.drawable.dessert_9," " +
                    "Ingredients\n" +
                    "•\t3/4 cup   Sugar                              \n" +
                    "•\t2 1/2 cups  Milk                                  \n" +
                    "•\t4  Eggs                                \n" +
                    "•\t1 teaspoon   Vanilla essence              \n" +
                    "\n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Take quarter cup of sugar in a thick-bottomed pan. Add a few drops of water and heat till the sugar caramelizes. Pour the caramel into a mould and let it settle by cooling.\n" +
                    "Step 2\n" +
                    "Heat milk either in a microwave oven or on gas flame. Place a metallic ring in the pressure cooker. Add four cups of water and heat. Break eggs into a bowl.\n" +
                    "Step 3\n" +
                    "Add half cup of sugar, vanilla essence and mix gently with a whisk. Add warm milk and mix. Strain the mixture. Pour the egg-milk mixture into the mould with the caramel.\n" +
                    "Step 4\n" +
                    "Cover with aluminium foil and place it in the cooker. Cover with lid and steam for twenty-five to thirty minutes. Do not use the whistle. Remove when done.\n" +
                    "Step 5\n" +
                    "Serve, turned out with caramel side up, either hot or cold.\n" +
                    "\n",R.drawable.non_veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "P-IOvbwLs1M";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 9:
            {rb = new RecipeBean(R.drawable.dessert_10,"Rose Sandesh",R.drawable.dessert_10," " +
                    "\n" +
                    "Ingredients\n" +
                    "•\t2 litres   Cow’s milk                                       \n" +
                    "•\tRose water  - a few drops\n" +
                    "•\t1 cup   Whey (to curdle milk)                       \n" +
                    "•\t1 cup  Sugar substitute sucralose              \n" +
                    "•\t15-20  Pistachios blanched                        \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Take cow’s milk in a deep pan and bring it to a boil.\n" +
                    "Step 2\n" +
                    "Reduce heat, add whey and keep stirring till the milk curdles completely.\n" +
                    "Step 3\n" +
                    "Strain through a muslin cloth and immediately place the muslin potli on ice to stop the cooking process.\n" +
                    "Step 4\n" +
                    "Squeeze to remove the excess moisture.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "0PUPOPy0DWI";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 10:
            {rb = new RecipeBean(R.drawable.dessert_11,"Soft Centered Chocolate Cake",R.drawable.dessert_11," " +
                    "Ingredients\n" +
                    "•\t125 grams   Plain chocolate broken                    \n" +
                    "•\t1/2 cup + for dusting    Refined flour (maida)                       \n" +
                    "•\t9 tablespoons  for greasing    Unsalted butter                                \n" +
                    "•\t4   Eggs                                                 \n" +
                    "•\t6 tablespoons     Powdered sugar                              \n" +
                    "•\t1 tablespoon     Cocoa powder                                 \n" +
                    "•\t1/2 teaspoon   Baking powder                                 \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Preheat oven to 180°C. Grease the muffin moulds, dust with flour and remove the excess flour.\n" +
                    "Step 2\n" +
                    "Take chocolate in a bowl, add butter and melt in the microwave oven (HIGH) for one minute. Take the bowl out and mix well.\n" +
                    "Step 3\n" +
                    "Break eggs in another bowl. Add powdered sugar and blend with a hand blender till light and frothy. Sieve cocoa powder into it and mix. Add the melted chocolate and butter and mix. Sieve flour and baking powder into the bowl and blend with the hand blender till well mixed.\n" +
                    "Step 4\n" +
                    "Pour the batter into the muffin moulds taking care not to fill up to the top.\n" +
                    "Step 5\n" +
                    "Place the moulds in the preheated oven and bake at 180°C for seven to eight minutes. Take the moulds out of the oven, loosen the edges carefully with a knife.\n" +
                    "Step 6\n" +
                    "Carefully unmould  the cakes onto a serving plate and serve hot.\n",R.drawable.non_veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "dWDs1lcaLdM";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 11:
            {rb = new RecipeBean(R.drawable.dessert_12,"Chocolate CupCake",R.drawable.dessert_12," " +
                    "\n" +
                    "Ingredients\n" +
                    "•\t60 grams    Dark chocolate chopped                        \n" +
                    "•\t4   Eggs separated                                      \n" +
                    "•\t1 1/2 cups   Powdered sugar sifted                            \n" +
                    "•\t100 grams   Butter                                                      \n" +
                    "•\t1 3/4 cups   Refined flour (maida)                               \n" +
                    "•\t3 teaspoons    Baking powder                                        \n" +
                    "•\t1/4 teaspoon    Salt                                                         \n" +
                    "•\t2 teaspoons   Vanilla essence                                       \n" +
                    "•\t1/2 cup  Milk                                                          \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Preheat oven to 180° C/350°F.\n" +
                    "Step 2\n" +
                    "Grease moulds or paper cups. Melt chocolate in the microwave on HIGH for one minute. Break the eggs into a bowl and whisk with an egg beater for two to three minutes.\n" +
                    "Step 3\n" +
                    "Add sugar and continue beating till the mixture is frothy. Whisk the chocolate well.\n" +
                    "Step 4\n" +
                    "Melt the butter and add to the chocolate and mix well. Sift the flour with baking powder and salt into a bowl.\n" +
                    "Step 5\n" +
                    "Add the chocolate-butter mixture to the flour along with vanilla essence and mix well. Add the egg-sugar mixture, a little at a time, and mix in the fold-and-cut manner. Add milk to adjust the consistency.\n" +
                    "Step 6\n" +
                    "Pour the batter into the greased moulds. Fill up only till half mark. Arrange the moulds in a tray and bake in the preheated oven for thirty minutes.\n" +
                    "Step 7\n" +
                    "You can also cook them in a microwave for about six to seven minutes.\n",R.drawable.non_veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "Q8PVV3wYK4k";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 12:
            {rb = new RecipeBean(R.drawable.dessert_13," Mango Eve’s pudding",R.drawable.dessert_13," " +
                    "Ingredients\n" +
                    "•\t500 grams   Ripe mangoes peeled and sliced                   \n" +
                    "•\t3/4 cup   Refined flour (maida)                                       \n" +
                    "•\t1/4 cup   Unsalted butter                                                \n" +
                    "•\t1/4 cup  Castor sugar (caster sugar)                             \n" +
                    "•\t1  Egg                                                                   \n" +
                    "•\t1/4 teaspoon  Vanilla essence                                             \n" +
                    "•\t3/4 teaspoon   Baking powder                                               \n" +
                    "•\t1/4 cup   Sugar                                                             \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Preheat oven to 160°C.\n" +
                    "Step 2\n" +
                    "Cream butter with castor sugar until pale and soft. Beat in the egg and mix. Add vanilla essence. Sieve refined flour and baking powder onto this mixture.\n" +
                    "Step 3\n" +
                    "Mix with a palette knife in a cut and fold style. Take a pudding mould. Arrange the mango slices at the base. Sprinkle sugar over them. Put the pudding batter over and level the top.\n" +
                    "Step 4\n" +
                    "Bake in the preheated oven at 160°C for about one hour.\n",R.drawable.non_veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "XTrtQ3k2uGY";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 13:
            {rb = new RecipeBean(R.drawable.dessert_14,"Chocolate Gulab Jamun",R.drawable.dessert_14," " +
                    "Ingredients\n" +
                    "•\t2 1/2 cups  Milk solids (khoya)                           \n" +
                    "•\t2 1/2 cups  Refined flour (maida)\n" +
                    "•\t2 tablespoons  Cocoa powder                                 \n" +
                    "•\t1 tablespoon  Drinking chocolate                          \n" +
                    "•\t2/3 teaspoon  Baking powder                                \n" +
                    "•\t3 cups  Water                                             \n" +
                    "•\t5 cups  Sugar                                              \n" +
                    "•\t3 tablespoons  Chocolate chips optional                \n" +
                    "•\tOil  -for frying\n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Grate fresh khoya in a bowl. Add sieved maida, cocoa powder, drinking chocolate, baking powder and mix well.\n" +
                    "Step 2\n" +
                    "Prepare the sugar syrup and keep it warm.\n" +
                    "Step 3\n" +
                    "Add water or milk to knead the khoya mixture. Make small softballs of even size. If you wish you can stuff these balls with the chocolate chips.\n" +
                    "Step 4\n" +
                    "Heat oil in a kadhai and deep-fry the ball till golden. Drain and soak them in the sugar syrup.\n" +
                    "Step 5\n" +
                    "Serve hot.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "Qrhr2WnUqHk";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 14:
            {rb = new RecipeBean(R.drawable.dessert_15,"Chocolate and Orange Cake",R.drawable.dessert_15," " +
                    "Ingredients\n" +
                    "•\t175 grams   Dark chocolate,grated                           \n" +
                    "•\t5 tablespoons   Orange juice                                          \n" +
                    "•\t1   Orange                                                  \n" +
                    "•\t100 grams   Margarine                                              \n" +
                    "•\t225 grams  Castor sugar (caster sugar)                 \n" +
                    "•\t2  Eggs                                                        \n" +
                    "•\t150 grams   Yogurt                                                  \n" +
                    "•\t275 grams   Refined flour (maida)                            \n" +
                    "•\t1 teaspoon  Soda bicarbonate                                 \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Preheat the oven to 190°C. Place margarine in a bowl, add sugar and beat together till light. Break eggs and add to the bowl and mix. Add yogurt and mix. Grate the rind of an orange and add to the mixture. Add orange juice and mix well.\n" +
                    "Step 2\n" +
                    "Sift refined flour and baking soda into the bowl and mix. Add chocolate and mix well.Pour the batter into a rectangular silicon mould and level the surface.\n" +
                    "Step 3\n" +
                    "Keep it in the preheated oven and bake. Check after 20 minutes if it is done. If it is not cooked completely, " +
                    "then bake for 5 minutes more. Removed from oven and cool. " +
                    "Remove from the mould, slice and serve.\n",R.drawable.non_veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "bTtt17nakuo";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 15:
            {rb = new RecipeBean(R.drawable.dessert_16,"Kesari Phirni",R.drawable.dessert_16," " +
                    "Ingredients\n" +
                    "•\tSaffron (kesar)  - a few strands\n" +
                    "•\t1 litre   Milk                                                \n" +
                    "•\t50 gram   Basmati rice soaked                     \n" +
                    "•\t1 cup  Sugar                                             \n" +
                    "•\t1/2 teaspoon    Green cardamom powder            \n" +
                    "•\tRose water- a few drops\n" +
                    "•\t8-10   Pistachios chopped                        \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Bring the milk to a boil in a deep pan.\n" +
                    "Step 2\n" +
                    "Lower the heat and let it simmer till it reduces a little. Grind the soaked rice to a coarse paste.\n" +
                    "Step 3\n" +
                    "Add a little milk to it and mix to make it a little thinner.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "XCVQz4iGBk4";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 16:
            {rb = new RecipeBean(R.drawable.dessert_17,"Sweet Potato Kheer",R.drawable.dessert_17," " +
                    "Ingredients\n" +
                    "•\t3 medium   Sweet potatoes grated and soaked in water                 \n" +
                    "•\t5 cups  Milk                                                                                \n" +
                    "•\t1 tablespoon   Ghee                                                                             \n" +
                    "•\t1 tablespoon   Rose petals                                                                   \n" +
                    "•\t1/2 teaspoon  Green cardamom powder                                             \n" +
                    "•\tSugar  -  to taste\n" +
                    "•\t2 tablespoons   Rose syrup\n" +
                    "                                                                   \t\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Heat ghee in a pan.\n" +
                    "Step 2\n" +
                    "Add sweet potatoes and sauté for two to three minutes. Add milk and cook. As the sweet potato gets cooked the milk will thicken. Add half the rose petals and green cardamom powder and stir and cook till the mixture thickens slightly. Add sugar and stir and cook till you get the desired consistency.\n" +
                    "Step 3\n" +
                    "Set aside to cool and place in the refrigerator to chill.\n" +
                    "Step 4\n" +
                    "Pour into serving bowls, brush the top with rose syrup, sprinkle the remaining rose " +
                    "petals and serve.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "N_3iDFAjB1Q";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 17:
            {rb = new RecipeBean(R.drawable.dessert_18,"Jalebi",R.drawable.dessert_18," " +
                    "Ingredients\n" +
                    "•\t1 1/2 cups   Refined flour (maida)                                                           \n" +
                    "•\t1 teaspoon  Soda bicarbonate                                                               \n" +
                    "•\t2 1/2 cups  Sugar                                                                                  \n" +
                    "•\t1/2 teaspoon   Green cardamom powder                                                    \n" +
                    "•\tGhee- to deep fry\n" +
                    "•\tYellow food colour or saffron colour (optional) -a pinch\n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Mix refined flour and soda bi-carbonate. Add two cups of water and make a smooth batter. Make sure that there are no lumps. Leave it overnight to ferment. Mix it again, add a little water if required and make it into a pouring consistency.\n" +
                    "Step 2\n" +
                    "To prepare sugar syrup mix equal quantities of sugar and water. Add cardamom powder and cook for twenty minutes. Heat ghee in a jalebi tawi or a flat kadai or a frying pan. Pour batter into a jalebi cloth and then pour it into medium hot ghee giving it a jalebi shape.\n" +
                    "Step 3\n" +
                    "Start from outside to inside for better results. Deep fry till golden and crisp. Drain and soak in the " +
                    "sugar syrup for five minutes. Drain and serve hot.\n",R.drawable.veg);
                Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "7b7YBpceols";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
                case 18:
                {rb = new RecipeBean(R.drawable.dessert_19,"Chocolate Cookie CheeseCake",R.drawable.dessert_19," " +
                        "Ingredients\n" +
                        "•\t250 grams   Plain chocoalte biscuits                                           \n" +
                        "•\t150 grams   Dark chocolate biscuits                                     \n" +
                        "•\t1 1/2 cups   Cream cheese                                                          \n" +
                        "•\t150 grams  Butter                                                                      \n" +
                        "•\t2 teaspoons  Gelatin                                                                     \n" +
                        "•\t 2 cups  Fresh cream                                                           \n" +
                        "•\t1/2 cup  Castor sugar (caster sugar)                                    \n" +
                        "•\t1 teaspoon  Vanilla essence                                                     \n" +
                        "•\t180 grams  White chocolate                                                         \n" +
                        "\n" +
                        "Method\n" +
                        "Step 1\n" +
                        "Butter a nine-inch spring form tin. Crush the chocolate biscuits and put them in a bowl. Add the remaining butter and mix. Line the spring form tin with this mixture and press well.\n" +
                        "Step 2\n" +
                        "Keep it in the refrigerator for fifteen minutes. Mix gelatin with two tablespoons of water and melt it in the microwave oven for forty five seconds.\n" +
                        "Step 3\n" +
                        "Take fresh cream in a bowl. Add castor sugar and mix. Add vanilla essence and cream cheese and continue to mix.\n" +
                        "Step 4\n" +
                        "Melt white chocolate in the microwave oven at 60% for one minute. Whisk well and add it to the cream and cheese mixture. Mix well.\n" +
                        "Step 5\n" +
                        "Pour the melted gelatin through a strainer into the above mixture and mix well. Pour this mixture over the biscuit base in the spring form tin.\n" +
                        "Step 6\n" +
                        "Let it set in the refrigerator for one and a half to two hours. Just before serving gently slide in the dark chocolate biscuits all round the outer edge of the cheese cake. Sprinkle some grated white chocolate over the top.\n" +
                        "Step 7\n" +
                        "Cut into wedges and serve.\n",R.drawable.veg);
                    Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                    i.putExtra(Util.keyRecipe,rb);

                    String videoId = "M9JRVy9FbX4&spfreload=10";
                    i.putExtra("VideoID", videoId);

                    startActivity(i);}
                break;
                case 19:
                {rb = new RecipeBean(R.drawable.dessert_20,"Chocolate Walnut Fudge",R.drawable.dessert_20," " +
                        "Ingredients\n" +
                        "•\t100 grams   Dark chocolate                               \n" +
                        "•\t1/2 cup  Walnuts finely chopped                  \n" +
                        "•\t4 tablespoons   Unsalted butter                             \n" +
                        "•\t400 grams   Condensed milk                            \n" +
                        "•\t180 grams   Khoya/mawa                                 \n" +
                        "•\t1/2 teaspoon   Vanilla essence                             \n" +
                        "\n" +
                        "Method\n" +
                        "Step 1\n" +
                        "Grease a seven-inch square aluminium tray.\n" +
                        "Step 2\n" +
                        "Heat a non-stick pan; add the butter and allow it to melt. Add the chocolate and stir till it melts. Stir in the condensed milk and cook for five to six minutes.\n" +
                        "Step 3\n" +
                        "Add the walnuts to the pan and mix. Add the grated khoya, and vanilla essence, and mix well.\n" +
                        "Step 4\n" +
                        "Transfer the mixture onto the greased tray and spread evenly with a greased spatula. Cool in the refrigerator before cutting into pieces. Serve chilled.\n" +
                        "Step 5\n" +
                        "Makes 750 grams\n",R.drawable.veg);
                    Intent i = new Intent(Desserts_Activity.this,AllRecipesActivity.class);
                    i.putExtra(Util.keyRecipe,rb);

                    String videoId = "v=pZewegenLVE";
                    i.putExtra("VideoID", videoId);

                    startActivity(i);}
                break;

        }
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_desserts_, menu);
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
