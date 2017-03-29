package com.temptilicious.therecipetree;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class Continental_Activity extends ActionBarActivity {

    ListView myLV;
    ArrayList<ListBean> myList;
    MyArrayAdapter adapter;
   // MyArrayAdapter2 adapter2;
    //ArrayList<RecipeBean> list;
    RecipeBean rb;

    void initList(){
        myList = new ArrayList<ListBean>();
        myList.add(new ListBean(R.drawable.c1,R.drawable.veg,"Stuffed Jacket Potatos"));
        myList.add(new ListBean(R.drawable.c2,R.drawable.veg,"Paneer Steak"));
        myList.add(new ListBean(R.drawable.c3,R.drawable.veg,"Poached Pear Salad"));
        myList.add(new ListBean(R.drawable.c4,R.drawable.non_veg,"Chicken and Cheese Salad"));
        myList.add(new ListBean(R.drawable.c5,R.drawable.non_veg,"ZUCCHINI BREAD"));
        myList.add(new ListBean(R.drawable.c6,R.drawable.veg,"MINTY POTATO TARTS"));
        myList.add(new ListBean(R.drawable.c7,R.drawable.veg,"CARAMALISED ONION DIP"));
        myList.add(new ListBean(R.drawable.c8,R.drawable.veg,"CHEESE  FONDUE"));
        myList.add(new ListBean(R.drawable.c9,R.drawable.veg,"MACARONI CHEESE"));



//


        adapter= new MyArrayAdapter(this, R.layout.list_item, myList);
        myLV.setAdapter(adapter);
        myLV.setOnItemClickListener(clickListener);

        //adapter2 = new MyArrayAdapter2(Continental_Activity.this, R.layout.list_item, list);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continental_);
        myLV = (ListView)findViewById(R.id.listViewContinental);
        initList();
    }
AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             switch (position){
                 case 0:{
                     rb = new RecipeBean(R.drawable.c1,"Stuffed Jacket Potatos",R.drawable.c1," " +
                             "Ingredients\n" +
                             "•\t8 medium potatoes \n" +
                             "•\tOil for frying \n" +
                             "\n" +
                             "For the stuffing:\n" +
                             "\n" +
                             "•\t1 large onion \n" +
                             "•\t1 Tbsp garlic paste \n" +
                             "•\t2 tomatoes \n" +
                             "•\t350 gm mushrooms \n" +
                             "•\t125 ml thick yoghurt \n" +
                             "•\t2 Tbsp ginger paste \n" +
                             "•\t1 Tbsp garlic paste \n" +
                             "•\t2 green chillies \n" +
                             "•\t1 Tbsp fresh coriander \n" +
                             "•\t1 Tbsp kasoori methi\n" +
                             "Method\n" +
                             "•\tDeep fry whole potatoes in oil for 8-10 minutes or coat each potato with little oil.\n" +
                             "•\tRub with salt and bake until tender. Set aside to cool.\n" +
                             "•\tMix the onions, garlic, tomatoes and mushrooms. Add yoghurt, ginger, garlic, chillies, coriander, garam masala and methi leaves. Set aside for 1 hour. \n" +
                             "•\tCook mushroom mixture with marinade over a slow fire. \n" +
                             "•\tCut off a small circle from the narrow top of the potato. \n" +
                             "•\tScoop out the flesh to within an inch of the skin. \n" +
                             "•\tFill the cavity with the mushroom filling. \n" +
                             "•\tReplace the potato caps and hold in place with a string. \n" +
                             "•\tPlace in an oven and bake for 20 minutes.\n",R.drawable.veg);
                     Intent i = new Intent(Continental_Activity.this,AllRecipesActivity.class);
                     i.putExtra(Util.keyRecipe,rb);

                     String videoId = "iWOj9ewXh2U";
                     i.putExtra("VideoID", videoId);

                     startActivity(i);
                 }
                 break;
                 case 1:{rb = new RecipeBean(R.drawable.c2,"Paneer Steak",R.drawable.c2," " +
                        " Ingredients\n" +
                         "•\t125 gm cottage cheese\n" +
                         "•\t1/4 tsp salt or to taste\n" +
                         "•\tHalf a slice bread soft portion\n" +
                         "•\t1 Tbsp coriander leaves, chopped\n" +
                         "•\t1 tsp green chillies, chopped (optional)\n" +
                         "•\t2 slices cheese \n" +
                         "•\t1 Tbsp oil \n" +
                         "•\t2 slices tomato \n" +
                         "Method\n" +
                         "\n" +
                         "•\tMash the paneer. Break the bread into small pieces or grate it.\n" +
                         "\n" +
                         "•\tMix well together the paneer, salt, hara dhania, green chillies and bread.\n" +
                         "\n" +
                         "•\tForm into two round 'patties' and pan fry over high heat with the oil till brown on both sides.\n" +
                         "\n" +
                         "•\tPlace on a baking sheet, cover decoratively with the cheese slices and place the tomato " +
                         "on top and grill till cheese is soft and maybe brown if you so desire. (About 5 minutes)\n",R.drawable.veg);

                     Intent i = new Intent(Continental_Activity.this,AllRecipesActivity.class);
                     i.putExtra(Util.keyRecipe,rb);

                     String videoId = "hVCPjakPQTA";
                     i.putExtra("VideoID", videoId);

                     startActivity(i); }
                      break;

                 case 2:{rb = new RecipeBean(R.drawable.c3,"Poached Pear Salad",R.drawable.c3," " +
                        "Ingredients\n" +
                         "•\t2 pears \n" +
                         "•\t1 cup white wine\n" +
                         "•\t1 cup water\n" +
                         "•\t1/3 cup Sugar\n" +
                         "•\t2 cloves\n" +
                         "•\t1 cinnamon \n" +
                         "\n" +
                         "For dressing: \n" +
                         "•\t1/4 cup organic honey\n" +
                         "•\t¼ cup extra virgin olive oil\n" +
                         "•\t2 Tbsp lime juice\n" +
                         "•\t4 medium sized leaves, radicchio\n" +
                         "•\t4 medium sized leaves, romaine\n" +
                         "•\t1 cup blue cheese\n" +
                         "•\t5 grapes, cut in half\n" +
                         "•\t10 hazelnuts\n" +
                         "\n" +
                         "For garnish:\n" +
                         "•\tDil leaves    \n" +
                         "•\tMicrogreens (optional)\n" +
                         "Method\n" +
                         "For the poached pear:\n" +
                         "•\tPeel the pear, cut into quarters and deseed.  Mix all the ingredients for the poached pear, bring to a boil and simmer on low till the pear is soft. Keep aside.\n" +
                         "•\tMix all the ingredients for the dressing, season and keep aside.\n" +
                         "•\tWhip the blue cheese with a hand blender to lighten the cheese.\n" +
                         "\n" +
                         "To make the salad:\n" +
                         "•\tCut the unpoached pear into a big dice, do the same with the poached pear. \n" +
                         "•\tCut the leaves into smaller pieces, add the grapes, toasted hazelnuts, both the pears and the dressing.\n" +
                         "•\tLightly toss, top with the whipped blue cheese.\n",R.drawable.veg);

                     Intent i = new Intent(Continental_Activity.this,AllRecipesActivity.class);
                     i.putExtra(Util.keyRecipe,rb);

                     String videoId = "a5cAqVCUvwI";
                     i.putExtra("VideoID", videoId);

                     startActivity(i); }
                 break;
                 case 3:{rb = new RecipeBean(R.drawable.c4,"Chicken and Cheese Salad",R.drawable.c4," " +
                         "Ingredients\n" +
                         "•\t350 gm boneless chicken breast - cooked \n" +
                         "•\t1 cup cheese – cubed\n" +
                         "•\t1/4 tsp powdered black pepper \n" +
                         "•\t1 tsp salt \n" +
                         "•\t1/2 cup mayonnaise sauce\n" +
                         "\n" +
                         "For garnishing:\n" +
                         "•\tCelery or parsley- chopped \n" +
                         "•\tLettuce or cabbage leaves for decoration and plating\n" +
                         "Method\n" +
                         "•\tCut chicken into cubes. \n" +
                         "•\tMix together chicken, cheese, salt and pepper. \n" +
                         "•\tAdd enough mayonnaise and mix well. \n" +
                         "•\tGarnish, chill and serve. \n",R.drawable.non_veg);

                     Intent i = new Intent(Continental_Activity.this,AllRecipesActivity.class);
                     i.putExtra(Util.keyRecipe,rb);

                     String videoId = "cAkfO1C415Y";
                     i.putExtra("VideoID", videoId);

                     startActivity(i); }
                 break;
                 case 4:{rb = new RecipeBean(R.drawable.c5,"ZUCCHINI BREAD",R.drawable.c5," " +
                         "INGREDIENTS\n" +
                         "•\t3 eggs\n" +
                         "•\t3 cups flour\n" +
                         "•\t3 teaspoons vanilla\n" +
                         "•\t1 cup oil\n" +
                         "•\t2 cups zucchini, grated\n" +
                         "•\t1⁄4 teaspoon salt\n" +
                         "•\t1 teaspoon baking soda\n" +
                         "•\t1⁄4 teaspoon baking powder\n" +
                         "•\t1 cup nuts (optional)\n" +
                         "•\t3 teaspoons cinnamon\n" +
                         "METHOD\n" +
                         "GETTING READY\n" +
                         "1. Heat the oven to 350°F.\n" +
                         "2. Use a shredder and shred the zucchini. Squeeze out the water and rest on a paper towel.\n" +
                         "3. Take the loaf pan; smear it with the baking spray.\n" +
                         "4. Place the parchment paper in the plan.\n" +
                         "5. In a mixing bowl, add the dry ingredients, the flour, baking powder, sugar, salt and cinnamon and mix it through.\n" +
                         "6. Make a well in the bowl, add the eggs. Crack the eggs in a separate bowl and pour in the mixing bowl.\n" +
                         "7. Add the vegetable oil and sour cream and with a rubber spatula fold everything together.\n" +
                         "8. Mix in the cup of shredded zucchini and the cup of walnuts and make sure the ingredients are incorporated well.\n" +
                         "9. Transfer to the greased loaf pan and smoothen the surface.\n" +
                         "MAKING\n" +
                         "10. Pop into the oven for 60 mins.\n" +
                         "11. Take it out of the oven and insert a skewer around the middle to check for doneness.\n" +
                         "12. Release it from the pan and let it rest and cool.\n" +
                         "SERVING\n" +
                         "13. Slice it off and serve for breakfast.\n",R.drawable.non_veg);

                     Intent i = new Intent(Continental_Activity.this,AllRecipesActivity.class);
                     i.putExtra(Util.keyRecipe,rb);

                     String videoId = "IqpWYmMImnM";
                     i.putExtra("VideoID", videoId);

                     startActivity(i); }
                 break;
                 case 5:{rb = new RecipeBean(R.drawable.c6,"MINTY POTATO TARTS",R.drawable.c6," " +
                         "Ingredients\n" +
                         "•\t1 potato boiled and chopped\n" +
                         "•\t½ cup coloured bell peppers chopped\n" +
                         "•\t1/4 cup olives finely chopped\n" +
                         "•\tsalt to taste\n" +
                         "•\t2 tsp pizza seasoning\n" +
                         "•\t1 spring onions finely chopped\n" +
                         "•\t1 tbsp olive oil\n" +
                         "Method\n" +
                         "Heat olive oil in the pan and stir fry coloured bell peppers ,potatoes, olives and spring onions.add all the other seasoning ingredients and keep aside.\n" +
                         "Minty sauce:\n" +
                         "•\t1 tbsp vinegar\n" +
                         "•\t¾ to 1 tsp garlic paste\n" +
                         "•\t1 tsp mixed dry herbs\n" +
                         "•\t½ tsp sugar\n" +
                         "•\t1 green chilly\n" +
                         "•\t3 tbsp mint leaves\n" +
                         "•\t3 tbsp coriander leaves\n" +
                         "•\t3 tbsp mayonnaise\n" +
                         "Method\n" +
                         "Grind all the ingredients into a smooth paste. Fill in a cake pipping bag and chill in the refrigerator.\n" +
                         "Other ingredients:\n" +
                         "•\t15 to 18 pieces Bite sized canapés \n" +
                         "To assemble the tarts\n" +
                         "Fill the canapés with 1 ½ tsp of the potato filling. Garnish with minty sauce and serve immediately.\n",R.drawable.veg);

                     Intent i = new Intent(Continental_Activity.this,AllRecipesActivity.class);
                     i.putExtra(Util.keyRecipe,rb);

                     String videoId = "bbn01zv8BlM";
                     i.putExtra("VideoID", videoId);

                     startActivity(i); }
                 break;
                 case 6:{rb = new RecipeBean(R.drawable.c7,"CARAMALISED ONION DIP",R.drawable.c7," " +
                         "Ingredients\n" +
                         "•\tOnions thinly sliced2 medium\n" +
                         "•\tCream cheese 1/2 cup\n" +
                         "•\tLemon juice 2 teaspoons\n" +
                         "•\tSalt to taste\n" +
                         "•\tUnsalted butter 2 tablespoons\n" +
                         "•\tYogurt 1 cup\n" +
                         "•\tfresh chiv \n" +
                         "•\tChives fresh and chopped2 tablespoons\n" +
                         "•\tBlack pepper powder to taste\n" +
                         "Method\n" +
                         "Step 1\n" +
                         "In a bowl whisk cream cheese and lemon juice together. Add salt, mix and set aside.\n" +
                         "Step 2\n" +
                         "Heat butter in a non-stick pan, add onions and salt and saute, stirring occasionally, until the onions turn a deep golden brown. Remove from heat and allow to cool. \n" +
                         "Step 3\n" +
                         "Mix together onions, yogurt, cream cheese-lemon juice mixture, chives, salt and pepper powder. Serve with the chips.\n",R.drawable.veg);

                     Intent i = new Intent(Continental_Activity.this,AllRecipesActivity.class);
                     i.putExtra(Util.keyRecipe,rb);

                     String videoId = "bbn01zv8BlM";
                     i.putExtra("VideoID", videoId);

                     startActivity(i); }
                 break;
                 case 7:{rb = new RecipeBean(R.drawable.c8,"CHEESE  FONDUE",R.drawable.c8," " +
                         "Ingredients\n" +
                         "•\t100 gm Swiss-style cheese such as Emmenthaler, shredded\n" +
                         "\n" +
                         "100 gm Gruyere cheese, shredded\n" +
                         "\n" +
                         "2 Tbsp corn flour\n" +
                         "\n" +
                         "1 cup dry white wine (such as Sauvignon Blanc)\n" +
                         "\n" +
                         "1 Tbsp lemon juice\n" +
                         "\n" +
                         "1/2 tsp dry mustard\n" +
                         "\n" +
                         "Pinch of freshly grated nutmeg\n" +
                         "\n" +
                         "1 broccoli, chopped\n" +
                         "\n" +
                         "6 baby Corn, chopped \n" +
                         "Method\n" +
                         "Mix the cornstarch and the shredded cheese in a bowl. Set aside in the fridge.\n" +
                         "\n" +
                         "Chop broccoli and baby corn, blanch them in hot water and transfer them into ice water. \n" +
                         "\n" +
                         "Add the wine and lemon juice to the pot, and bring to a low simmer on medium heat. Bit by bit, slowly stir the cheese into the wine. Stir constantly in a figure of eight pattern. \n" +
                         "\n" +
                         "Please make sure that the mixture does not boil by regulating the temperature. Cook just until the cheese is melted and creamy. \n" +
                         "\n" +
                         "Once the mixture is smooth add the grain mustard and grated nutmeg. Keep stirring.\n" +
                         "\n" +
                         "Transfer the cheese to a fondue serving pot, set over a low flame to keep warm. If your pot is thin-bottomed, a lit candle will probably do. \n" +
                         "\n" +
                         "If thick-bottomed, you can use a small Sterno.\n" +
                         "\n" +
                         "Serve with bread and vegetable. \n" +
                         " \n",R.drawable.veg);

                     Intent i = new Intent(Continental_Activity.this,AllRecipesActivity.class);
                     i.putExtra(Util.keyRecipe,rb);

                     String videoId = "VR15_ItYh0w";
                     i.putExtra("VideoID", videoId);

                     startActivity(i); }
                 break;
                 case 8:{rb = new RecipeBean(R.drawable.c9,"MACARONI CHEESE",R.drawable.c9," " +
                         "Ingredients\n" +
                         "•\t250 gm macaroni pasta\n" +
                         "\n" +
                         "40 gm butter\n" +
                         "\n" +
                         "40 gm plain flour or maida\n" +
                         "\n" +
                         "600 ml milk\n" +
                         "\n" +
                         "250 gm grated cheddar\n" +
                         "\n" +
                         "50 gm grated parmesan cheese\n" +
                         "Method\n" +
                         "Cook the macaroni in a large saucepan of boiling salted water for 8-10 minutes; drain well and set aside.\n" +
                         "\n" +
                         "Melt the butter over a medium heat in a saucepan slightly larger than that used for the macaroni. Add the flour and stir to form a roux, cooking for a few minutes.\n" +
                         "\n" +
                         "Gradually whisk in the milk, a little at a time. Cook for 10-15 minutes to a thickened and smooth sauce.\n" +
                         "\n" +
                         "Meanwhile, preheat the grill to hot.\n" +
                         "\n" +
                         "Remove the sauce from the hob, add 175 gm of the cheese and stir until the cheese is well combined and melted.\n" +
                         "\n" +
                         "Add the macaroni to the sauce and mix well. Transfer to a deep suitably-sized ovenproof dish.\n" +
                         "\n" +
                         "Sprinkle over the remaining cheddar and the Parmesan and place the dish under the hot grill. \n" +
                         "\n" +
                         "Cook until the cheese is browned and bubbling. Serve straightaway.\n" +
                         "\n",R.drawable.veg);

                     Intent i = new Intent(Continental_Activity.this,AllRecipesActivity.class);
                     i.putExtra(Util.keyRecipe,rb);

                     String videoId = "coYqrXsDPdU";
                     i.putExtra("VideoID", videoId);

                     startActivity(i); }
                 break;
             }

    }
};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_continental_, menu);
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
