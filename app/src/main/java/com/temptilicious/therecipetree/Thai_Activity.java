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


public class Thai_Activity extends ActionBarActivity {


    ListView myLV;
    ArrayList<ListBean> myList;
    MyArrayAdapter adapter;
    RecipeBean rb;

    void initList(){
        myList = new ArrayList<ListBean>();
        myList.add(new ListBean(R.drawable.t1,R.drawable.veg,"Green Papaya Salad"));
        myList.add(new ListBean(R.drawable.t2,R.drawable.veg,"Corn Cakes"));
        myList.add(new ListBean(R.drawable.t3,R.drawable.non_veg,"Padh Thai"));
        myList.add(new ListBean(R.drawable.t4,R.drawable.veg,"Thai Red Curry"));
        myList.add(new ListBean(R.drawable.t5,R.drawable.veg,"Bean Sprouts and Capsicum Salad"));
        myList.add(new ListBean(R.drawable.t6,R.drawable.veg,"Coconut and Vegetable Rice"));
        myList.add(new ListBean(R.drawable.t7,R.drawable.veg,"Crispy Noodles"));
        myList.add(new ListBean(R.drawable.t8,R.drawable.veg,"Crispy Vegetables"));
        myList.add(new ListBean(R.drawable.t9,R.drawable.veg,"Glass Noodles"));
        myList.add(new ListBean(R.drawable.t10,R.drawable.veg,"Green Curry Paste"));
        myList.add(new ListBean(R.drawable.t11,R.drawable.veg,"Green Rice"));
        myList.add(new ListBean(R.drawable.t12,R.drawable.veg,"Mango Pancakes"));
        myList.add(new ListBean(R.drawable.t13,R.drawable.veg,"Massaman Curried Rice"));
        myList.add(new ListBean(R.drawable.t14,R.drawable.veg,"Primevera Noodles"));
        myList.add(new ListBean(R.drawable.t15,R.drawable.veg,"Thai Spring Rolls"));
        myList.add(new ListBean(R.drawable.t16,R.drawable.veg,"Thai Pineapple Rice"));
        myList.add(new ListBean(R.drawable.t17,R.drawable.non_veg,"Thai Chicken Satay"));
        myList.add(new ListBean(R.drawable.t18,R.drawable.non_veg,"Pad See Ew"));
        myList.add(new ListBean(R.drawable.t19,R.drawable.non_veg,"Crispy Fried Okra"));
        myList.add(new ListBean(R.drawable.t20,R.drawable.veg,"Stir Fried Pumpkin"));


        adapter= new MyArrayAdapter(this,R.layout.list_item,myList);
        myLV.setAdapter(adapter);
        myLV.setOnItemClickListener(clickListener);
        rb = new RecipeBean();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai_);
        myLV = (ListView)findViewById(R.id.listViewThai);
        initList();
    }
AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
            {rb = new RecipeBean(R.drawable.t1,"GREEN PAPAYA SALAD",R.drawable.t1," " +
                    "Ingredients\n" +
                    "•\t1/2 green papaya - finely shredded into long strands and soaked in ice cold water \n" +
                    "\n" +
                    "\n" +
                    "•\t4 garlic cloves \n" +
                    "\n" +
                    "\n" +
                    "•\t3 small red or green chillies \n" +
                    "\n" +
                    "\n" +
                    "•\t6 Tbsp jaggery\n" +
                    "\n" +
                    "\n" +
                    "•\t4-5 Tbsp lemon juice \n" +
                    "•\t3 Tbsp light soy sauce \n" +
                    "\n" +
                    "\n" +
                    "•\t1 medium tomato - quartered \n" +
                    "\n" +
                    "\n" +
                    "•\t3-4 long beans - chopped \n" +
                    "\n" +
                    "\n" +
                    "•\t2 Tbsp unsalted peanuts - roasted \n" +
                    "\n" +
                    "\n" +
                    "•\t*You may add more water and jaggery according to taste\n" +
                    "•\tMethod\n" +
                    "•\tIn a mortar, lightly pound the garlic, add the chillies and lightly pound again. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd the jaggery, lemon juice and soy sauce, pound to a paste. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd the roasted peanuts and lightly pound while occasionally stirring with a spoon to prevent the paste from thickening. \n" +
                    "\n" +
                    "\n" +
                    "•\tNow add the tomato, stir, then add the long beans and slightly bruise them. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd the shredded papaya, lightly pound and stir until all the ingredients have blended together. \n" +
                    "\n" +
                    "\n" +
                    "•\tArrange on a serving dish and garnish with crushed peanuts.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "7Wz4HVCNKr4";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 1:
            {rb = new RecipeBean(R.drawable.t2,"CORN CAKES",R.drawable.t2," " +
                    "Ingredients\n" +
                    "•\tFor the Corn Cakes: \n" +
                    "\n" +
                    "\n" +
                    "•\t1 cup sweet corn - boiled and crushed \n" +
                    "\n" +
                    "\n" +
                    "•\t1 tsp thai coriander root \n" +
                    "\n" +
                    "\n" +
                    "•\t1 tsp garlic \n" +
                    "\n" +
                    "\n" +
                    "•\t1 tsp white pepper corn \n" +
                    "\n" +
                    "\n" +
                    "•\t1 Tbsp sugar \n" +
                    "\n" +
                    "\n" +
                    "•\tSalt - to taste \n" +
                    "\n" +
                    "\n" +
                    "•\t1 tsp thai seasoning sauce \n" +
                    "\n" +
                    "\n" +
                    "•\t1 tsp soya sauce \n" +
                    "\n" +
                    "\n" +
                    "•\t3 Tbsp - rice flour \n" +
                    "\n" +
                    "\n" +
                    "•\tOil - for deep frying \n" +
                    "\n" +
                    "\n" +
                    "For the Sweet Chilli Sauce:\n" +
                    "\n" +
                    "\n" +
                    "•\t1/2 cup sugar \n" +
                    "\n" +
                    "\n" +
                    "•\t1/2 cup vinegar \n" +
                    "\n" +
                    "\n" +
                    "•\t1 Tbsp chopped red chillies \n" +
                    "\n" +
                    "\n" +
                    "•\tSalt to taste\n" +
                    "•\tMethod\n" +
                    "•\tTake a bowl and mix whole corn and crushed corn properly. \n" +
                    "\n" +
                    "\n" +
                    "•\tMake a paste of Thai coriander root, garlic and white pepper corn. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd 1 tbsp of the paste to the corn mixture followed by the sugar and add salt. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd the seasoning sauce and soya sauce. Add the rice flour for binding. \n" +
                    "\n" +
                    "\n" +
                    "•\tMix all the ingredients thoroughly. Heat the oil in a deep pan.\n" +
                    "\n" +
                    "\n" +
                    "•\tMake small balls of the corn mixture and deep fry till golden brown. \n" +
                    "\n" +
                    "\n" +
                    "•\tTo prepare the sweet chilli sauce, grind all the ingredients well. \n" +
                    "\n" +
                    "\n" +
                    "•\tServe the corn cakes with the sweet chilli sauce. \n" +
                    "\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "lBf6ORNfpBo";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 2:
            {rb = new RecipeBean(R.drawable.t3,"PADH THAI",R.drawable.t3," " +
                    "Ingredients\n" +
                    "•\t150 gm rice flat noodles\n" +
                    "\n" +
                    "\n" +
                    "•\t100 gm chicken / prawn or paneer\n" +
                    "\n" +
                    "\n" +
                    "•\t4 Tbsp vegetable oil\n" +
                    "\n" +
                    "\n" +
                    "•\t1 cup chopped green onion\n" +
                    "\n" +
                    "\n" +
                    "•\t4 Tbsp palm sugar (or 2 Tbsp regular sugar)\n" +
                    "\n" +
                    "\n" +
                    "•\t6 Tbsp fish sauce or soy sauce\n" +
                    "\n" +
                    "\n" +
                    "•\t2 eggs\n" +
                    "\n" +
                    "\n" +
                    "•\t1 cup bean sprouts or chopped cabbage\n" +
                    "\n" +
                    "\n" +
                    "•\t2 Tbsp chopped garlic\n" +
                    "\n" +
                    "\n" +
                    "•\t2 Tbsp chopped shallots\n" +
                    "\n" +
                    "\n" +
                    "•\t1 cup sliced fried paneer\n" +
                    "\n" +
                    "\n" +
                    "•\t4 Tbsp tamarind paste\n" +
                    "\n" +
                    "\n" +
                    "•\tCabbage, Bean sprouts, Green onion, Coriander leaf, lime wedges, groud roasted peanuts and ground dried red chilly for garnish.\n" +
                    "\n" +
                    "•\tMethod\n" +
                    "•\tSoak noodles in lukewarm water for 10-15 minutes till soft.\n" +
                    "\n" +
                    "\n" +
                    "•\tHeat veg oil over low heat and fry the garlic and shallots till fragrant.\n" +
                    "\n" +
                    "\n" +
                    "•\tAdd chicken/prawn or paneer and stir fry till cooked.\n" +
                    "\n" +
                    "\n" +
                    "•\tBreak the eggs into the wok and mix well.\n" +
                    "\n" +
                    "\n" +
                    "•\tAdd noodles, fish sauce, sugar, tamarind paste and stir until noodles are tender and well mixed. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd bean sprouts and green onion while stirring constantly.\n" +
                    "\n" +
                    "\n" +
                    "•\tServe topped with garnish. \n",R.drawable.non_veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "VmaEuPzlPII";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 3:
            {rb = new RecipeBean(R.drawable.t4,"THAI RED CURRY",R.drawable.t4," " +
                    "Ingredients\n" +
                    "•\tFresh vegetables (red bell pepper, broccoli, cauliflower, snow peas, zucchini and bamboo shoots) - simmered in an aromatic coconut milk broth. \n" +
                    "\n" +
                    "\n" +
                    "•\t1 Tbsp vegetable oil \n" +
                    "\n" +
                    "\n" +
                    "•\t1 Tbsp Thai red curry paste \n" +
                    "\n" +
                    "\n" +
                    "•\t1 sweet red bell pepper - cut into strips \n" +
                    "\n" +
                    "\n" +
                    "•\tBroccoli (about one small head) - cut into bite-size florets \n" +
                    "\n" +
                    "\n" +
                    "•\tCauliflower (approx. 1/4 head) - cut into bite-size florets \n" +
                    "\n" +
                    "\n" +
                    "•\t1 1/4 can unsweetened coconut milk \n" +
                    "\n" +
                    "\n" +
                    "•\t1 small zucchini - cut into julienne strips 2 inches long and 1/8 inch thick \n" +
                    "\n" +
                    "\n" +
                    "•\t2 Tbsp bamboo shoots - cut into strips\n" +
                    "•\tMethod\n" +
                    "•\tHeat oil in a large soup pot or sauce pan over medium high heat. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd curry paste, mashing with the back of a spoon, and saute until fragrant, about one minute. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd broccoli and cauliflower and mix well to coat with curry paste.\n" +
                    "\n" +
                    "\n" +
                    "•\tStir-fry for two minutes. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd bell pepper and stir-fry for two minutes. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd coconut milk and stir. \n" +
                    "\n" +
                    "\n" +
                    "•\tBring to a boil and then turn down heat to let simmer for 10 minutes, stirring occasionally. \n" +
                    "\n" +
                    "\n" +
                    "•\tAdd zucchini and bamboo shoots and simmer for five more minutes. Stir gently.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "Ck5abatNwNo";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 4:
            {rb = new RecipeBean(R.drawable.t5,"BEAN SPROUTS AND CAPSICUM SALAD",R.drawable.t5," " +
                    "Ingredients\n" +
                    "•\t1 1/2 cups bean sprouts\n" +
                    "\n" +
                    "•\t1/4 cup thinly sliced capsicum\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "\n" +
                    "•\tFor The Spicy Dressing\n" +
                    "\n" +
                    "•\t1 1/2 tsp oil\n" +
                    "\n" +
                    "•\t1 tsp finely chopped garlic (lehsun)\n" +
                    "\n" +
                    "•\t2 tsp vinegar\n" +
                    "\n" +
                    "•\t1 tsp soy sauce\n" +
                    "\n" +
                    "•\t1/2 tsp sugar\n" +
                    "\n" +
                    "•\t1/2 tsp chilli powder\n" +
                    "\n" +
                    "•\t1 1/2 tbsp coarsely crushed roasted peanuts\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "•\tFor The Garnish\n" +
                    "\n" +
                    "•\t1 tbsp finely chopped spring onion greens\n" +
                    "\n" +
                    "•\t1 tbsp finely chopped coriander (dhania)\n" +
                    "\n" +
                    "•\tMETHOD\n" +
                    "For the spicy dressing\n" +
                    "\n" +
                    "•\tHeat the oil in a small non-stick pan, add the garlic and sauté on a medium flame for 15 seconds.\n" +
                    "•\tRemove from the flame and keep aside to cool slightly.\n" +
                    "•\tAdd the vinegar, soya sauce, sugar, chilli powder, peanuts and mix well. Keep aside.\n" +
                    "•\t\n" +
                    "How to proceed\n" +
                    "\n" +
                    "•\tCombine the bean sprouts, capsicum, spicy dressing and salt in a bowl and toss well.\n" +
                    "•\tServe immediately or refrigerate for 30 minutes and serve chilled.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "qJcT5k4E6js";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 5:
            {rb = new RecipeBean(R.drawable.t6,"coconut and vegetable rice",R.drawable.t6," " +
                    "Ingredients\n" +
                    "•\t3/4 cup coconut milk (nariyal ka doodh)\n" +
                    "\n" +
                    "•\t1/4 cup sliced diagonally and boiled french beans\n" +
                    "\n" +
                    "•\t1/4 cup boiled green peas\n" +
                    "\n" +
                    "•\t1/4 cup sliced and boiled baby corn\n" +
                    "\n" +
                    "•\t3 cups cooked long grained rice (basmati)\n" +
                    "\n" +
                    "•\t1/2 tsp cornflour\n" +
                    "\n" +
                    "•\t1 tbsp oil\n" +
                    "\n" +
                    "•\t1 tsp garlic (lehsun) paste\n" +
                    "\n" +
                    "•\t1 tbsp red chilli paste\n" +
                    "\n" +
                    "•\t1 tbsp finely chopped fresh basil\n" +
                    "\n" +
                    "•\t1/2 tsp lemon rind\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "•\t\n" +
                    "•\tMETHOD \n" +
                    "•\tDissolve the cornflour in the coconut milk and keep aside.\n" +
                    "•\tHeat the oil in a broad non-stick pan, add the garlic paste and red chilli paste and sauté on a medium flame for 1 minute.\n" +
                    "•\tAdd the coconut milk-cornflour mixture, french beans, green peas, baby corn, basil,lemon rind and salt, mix well and cook on a medium flame for 2 to 3 minutes, while stirring occasionally.\n" +
                    "•\tAdd the rice, mix well and cook on a medium flame for another 2 minutes, while stirring occasionally.\n" +
                    "•\tServe hot.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "tpudmtj5WcA";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 6:
            {rb = new RecipeBean(R.drawable.t7,"CRISPY NOODLES",R.drawable.t7," " +
                    "Ingredients\n" +
                    "•\t60 gms raw rice noodles\n" +
                    "\n" +
                    "•\t1 cup tofu (bean curd/ soya paneer) or paneer (cottage cheese) \n" +
                    "\n" +
                    "•\toil for deep-frying\n" +
                    "\n" +
                    "\n" +
                    "•\tFor The Sauce\n" +
                    "\n" +
                    "•\t2 garlic (lehsun) cloves , chopped\n" +
                    "\n" +
                    "•\t1 onion , sliced\n" +
                    "\n" +
                    "•\t1 tbsp soy sauce\n" +
                    "4 tbsp sugar\n" +
                    "\n" +
                    "•\t1 1/2 tbsp lemon juice\n" +
                    "\n" +
                    "•\t1/2 cup vegetable stock\n" +
                    "\n" +
                    "•\t1/2 tsp chilli powder\n" +
                    "\n" +
                    "•\t2 tbsp oil\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "For The Garnish\n" +
                    "\n" +
                    "•\t1/2 cup red cabbage cubes\n" +
                    "\n" +
                    "•\t1/3 cup bean sprouts\n" +
                    "\n" +
                    "•\t1 spring onion , chopped\n" +
                    "\n" +
                    "•\t1/2 cup cauliflower florets\n" +
                    "\n" +
                    "•\t1 fresh slit green chilli\n" +
                    "•\t\n" +
                    "•\tMETHOD\n" +
                    "•\tHeat the oil and deep fry the raw noodles till golden. Drain and keep aside.\n" +
                    "•\tDeep fry the tofu till crisp. Drain and keep aside.\n" +
                    "•\t\n" +
                    "For the sauce\n" +
                    "\n" +
                    "•\tHeat the oil in a pan, add the garlic and onion and saute till brown.\n" +
                    "•\tAdd the soya sauce, sugar, lemon juice, stock and salt and stir till the mixture begins to caramelise.\n" +
                    "•\tAdd the fried tofu, chilli powder and mix well.\n" +
                    "•\t\n" +
                    "How to proceed\n" +
                    "\n" +
                    "•\tPour over the fried noodles, just before serving.\n" +
                    "•\tServe garnished with the red cabbage, bean sprouts and spring onion and " +
                    "cauliflower and top with the red chilli.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "mB8I_k0yjF0";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 7:
            {rb = new RecipeBean(R.drawable.t8,"CRISPY VEGETABLES",R.drawable.t8," " +
                    "Ingredients\n" +
                    "•\t400 gms mixed vegetables\n" +
                    "\n" +
                    "•\toil for deep-frying\n" +
                    "\n" +
                    "\n" +
                    "•\tFor The Batter\n" +
                    "\n" +
                    "•\t1 cup plain flour (maida)\n" +
                    "\n" +
                    "•\t1/2 cup cornflour\n" +
                    "\n" +
                    "•\t1/4 tsp freshly ground pepper powder\n" +
                    "\n" +
                    "•\t1 tsp sesame seeds (til)\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "\n" +
                    "•\tMETHOD\n" +
                    "For the batter\n" +
                    "\n" +
                    "•\tMix the flour, cornflour, pepper, sesmae seeds and salts with enough water to make a thick batter coating vegetables\n" +
                    "•\t\n" +
                    "How to proceed\n" +
                    "\n" +
                    "•\tDip the vegetables in the batter and deep fry till golden brown.\n" +
                    "•\tDrain and serve with an assortment of relishes and dips.\n" +
                    "•\tTips\n" +
                    "•\tUse the freshest vegetables for best results.\n" +
                    "•\tEnsure the oil is hot before frying the vegetables or otherwise you might end up " +
                    "with soggy fritters.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "25_JtMYvjIs";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 8:
            {rb = new RecipeBean(R.drawable.t9,"GLASS NOODLES ",R.drawable.t9," " +
                    "Ingredients\n" +
                    "•\t2 cups rice noodles\n" +
                    "\n" +
                    "•\t2 cups tofu (bean curd/ soya paneer) cubes or paneer (cottagte cheese) cubes\n" +
                    "\n" +
                    "•\t2 cups fresh mushrooms (khumbh) , sliced\n" +
                    "\n" +
                    "•\t1/2 cup sliced onions\n" +
                    "\n" +
                    "•\t3/4 cup sliced tomatoes\n" +
                    "\n" +
                    "•\t1 stalk celery (ajmoda) , thinly sliced\n" +
                    "\n" +
                    "•\t3 tbsp hot and sweet dip\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "•\tMETHOD\n" +
                    "•\tHeat the oil in a broad non-stick pan, add the paneer or tofu and saute on a medium flame for 3 to 4 minutes or till they turn light brown in colour.\n" +
                    "•\tJust before serving, toss all the ingredients together.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "i9ndxwUFfoI";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 9:
            {rb = new RecipeBean(R.drawable.t10,"GREEN CURRY PASTE",R.drawable.t10," " +
                    "\n" +
                    "Ingredients\n" +
                    "•t10 green chillies , chopped \n" +"\n" +
                    "\n" +"\n" +
                    "•t6 garlic (lehsun) cloves (lehsun) \n" +
                    "•t1 onion , chopped  \n" +
                     "\n" +
                    "•\t 20 of ginger (adrak) \n" +"\n" +
                    "•\t  1 cup chopped coriander (dhania) \n" +"\n" +
                    "•\t 1 lemon rind , grated \n" +"\n" +
                    "•\t 1/2 tbsp lemon juice \n" +"\n" +
                    "•\t 1 tbsp coriander (dhania) powder \n" +"\n" +
                    "•\t 2 tbsp cumin seeds (jeera) powder \n" +"\n" +
                    "•\t 2 lemongrass (hare chai ki patti) stalks \n" +"\n" +
                    "\n" +"\n" +
                    "•\t 1 tsp salt\\n\" +\n" +
                    "\n" +"\n" +
                    "•\t 1/2 tsp freshly ground black pepper powder\\n\" +\n" +
                    "•\t \n\" +\n" +
                    "•\t METHOD\\n\" +\n" +
                    "•\t Grind all the ingredients in a mortar or a food processor using a little water.\\n\" +\n" +
                    "•\t Store in an airtight container or in the refrigerator. Alternatively, freeze for upto 3 months.\\n\" +\n" +
                    "•\t Use as required.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "CRg-kYr7LPs";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;

            case 10:
            {rb = new RecipeBean(R.drawable.t11,"GREEN RICE",R.drawable.t11," " +
                    "\n" +
                    "Ingredients\n" +
                    "•\tTo Be Blended Into A Smooth Green Paste ( Without Using Any Water)\n" +
                    "\n" +
                    "•\t2 tbsp chopped coriander (dhania)\n" +
                    "\n" +
                    "•\t2 tbsp chopped coriander (dhania) stalks\n" +
                    "\n" +
                    "•\t2 tbsp chopped mint leaves (phudina)\n" +
                    "\n" +
                    "•\t1/2 tbsp roughly chopped green chillies\n" +
                    "\n" +
                    "•\t1 tsp chopped ginger (adrak)\n" +
                    "\n" +
                    "•\t2 garlic (lehsun) cloves\n" +
                    "\n" +
                    "•\t1/4 cup coconut milk\n" +
                    "\n" +
                    "Other Ingredients\n" +
                    "\n" +
                    "•\t1 1/2 cups basmati rice , soaked for 30 minutes and drained\n" +
                    "\n" +
                    "•\t1 tbsp oil\n" +
                    "\n" +
                    "•\t3 cloves (laung / lavang)\n" +
                    "\n" +
                    "•\t1 cinnamon (dalchini) stick \n" +
                    "\n" +
                    "•\t1 bay leaf (tejpatta)\n" +
                    "\n" +
                    "•\t4 black peppercorns (kalimirch)\n" +
                    "\n" +
                    "•\t2 tbsp cashewnuts (kaju) , broken into pieces\n" +
                    "\n" +
                    "•\t1/2 cup sliced onions\n" +
                    "\n" +
                    "•\t1 1/4 cups coconut milk\n" +
                    "\n" +
                    "•\t1/4 cup green peas\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "•\t\n" +
                    "•\tMETHOD\n" +
                    "•\tHeat the oil in a deep non-stick pan, add the cloves, cinnamon, bayleaf, peppercorns and cashewnuts and sauté on a medium flame for 1 minute.\n" +
                    "•\tAdd the onions and sauté on a medium flame for 1 to 2 minutes.\n" +
                    "•\tAdd the prepared green paste and sauté on a medium flame for 1 minute.\n" +
                    "•\tAdd the coconut milk, green peas and salt, mix well and cook on a medium flame for 3 minutes, while stirring occasionally.\n" +
                    "•\tAdd the rice and 1¼ cups of water, mix well and cover and cook on a medium flame for 15 minutes, while stirring occasionally.\n" +
                    "•\tServe hot.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "bii9wgcxTIk";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 11:
            {rb = new RecipeBean(R.drawable.t2,"MANGO PANCAKES",R.drawable.t12," " +
                    "Ingredients\n" +
                    "•\tFor The Pancakes\n" +
                    "\n" +
                    "•\t1/4 cup plain flour (maida)\n" +
                    "\n" +
                    "•\t1/4 cup cornflour\n" +
                    "\n" +
                    "1/4 cup milk\n" +
                    "\n" +
                    "salt to taste\n" +
                    "\n" +
                    "•\toil for greasing and cooking\n" +
                    "\n" +
                    "•\t\n" +
                    "\n" +
                    "•\tFor The Filling\n" +
                    "\n" +
                    "•\t1 cup chopped mangoes\n" +
                    "\n" +
                    "•\t1/4 cup grated coconut\n" +
                    "\n" +
                    "•\t1 cup fresh cream\n" +
                    "\n" +
                    "•\t2 tbsp powdered sugar\n" +
                    "\n" +
                    "•\t\n" +
                    "\n" +
                    "•\tOther Ingredients\n" +
                    "\n" +
                    "•\t3 tsp fresh cream\n" +
                    "\n" +
                    "•\t2 tsp sugar\n" +
                    "•\t\n" +
                    "•\tMethod \n" +
                    "\n" +
                    "•\tFor the pancakes\n" +
                    "\n" +
                    "•\tCombine all the ingredients in a bowl, except the oil, to make a smooth batter. Keep aside.\n" +
                    "•\tHeat a 125 mm. (5”) non-stick taper pan an degrease it lightly using a little oil.\n" +
                    "•\tPour 2 tbsp of the batter over it and tilt the pan in a circular motion to make an even circle.\n" +
                    "•\tCook, using a little oil, till it is golden brown in colour from both sides.\n" +
                    "•\tFold the pancake to make a semi-circle and spread ½ tsp of fresh cream and sprinkle a little sugar on top.\n" +
                    "•\tTurn the folded pancake upside down and cook on a medium flame for 30 seconds.\n" +
                    "•\tRepeat steps 3 to 6 to make 5 more pancakes.\n" +
                    "•\tServe hot.\n" +
                    "•\t\n" +
                    "How to proceed\n" +
                    "\n" +
                    "•\tSpoon a little filling on each pancake and fold neatly into a semicircle.\n" +
                    "•\tRepeat with all the pancakes.\n" +
                    "•\tServe immediately\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "83714t17vW0";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 12:
            {rb = new RecipeBean(R.drawable.t13,"MASSAMAN CURRIED RICE",R.drawable.t13," " +
                    "Ingredients\n" +
                    "•\tFor The Massaman Curry Paste\n" +
                    "\n" +
                    "•\t1 tsp coriander (dhania) seeds\n" +
                    "\n" +
                    "•\t1 tsp cumin seeds (jeera)\n" +
                    "\n" +
                    "•\t1 tsp cloves (laung / lavang)\n" +
                    "\n" +
                    "•\t1 whole star anise (chakri phool)\n" +
                    "\n" +
                    "•\t6 shallots (madras onions) , chopped\n" +
                    "\n" +
                    "•\t4 whole dry kashmiri red chillies , broken into pieces\n" +
                    "\n" +
                    "•\t1 tbsp lemongrass (hare chai ki patti)\n" +
                    "\n" +
                    "•\t1/2 tsp lemon rind\n" +
                    "\n" +
                    "•\t1 tsp cinnamon (dalchini) powder\n" +
                    "\n" +
                    "•\t1 tsp oil\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "•\t\n" +
                    "\n" +
                    "•\tFor The Rice\n" +
                    "\n" +
                    "•\t3 cups steamed rice\n" +
                    "\n" +
                    "•\t1 cup paneer (cottage cheese) cubes\n" +
                    "\n" +
                    "•\t1/4 cup thinly sliced french beans , parboiled\n" +
                    "\n" +
                    "•\t1/4 cup cut into thin strips carrot , parboiled\n" +
                    "\n" +
                    "•\t2 tsp oil\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "\n" +
                    "•\tFor The Garnish\n" +
                    "\n" +
                    "•\t2 tbsp roasted and coarsely crushed peanuts\n" +
                    "\n" +
                    "•\t2 tbsp finely chopped spring onion greens\n" +
                    "•\t\n" +
                    "•\tMETHOD\n" +
                    "•\tFor the massaman curry paste\n" +
                    "•\t1. Heat the oil in a pan, add the shallots, chillies and lemon grass and fry till the shallots soften. Cool and keep aside.\n" +
                    "•\t2. Dry roast the coriander seeds, cumin seeds, clove and star anise. Cool.\n" +
                    "•\t3. In a blender, grind all the ingredients including the lemon rind, cinnamon powder and salt. Keep aside.\n" +
                    "•\tFor the rice\n" +
                    "•\tMarinate the paneer in 1 tbsp of the curry paste for 5 minutes.\n" +
                    "•\tHeat the oil in a broad non-stick pan, add the remaining massaman curry paste and cook on a medium flame for 1 minute.\n" +
                    "•\tAdd the french beans and carrots and cook on a medium flame for 1 to 2 minutes.\n" +
                    "•\tAdd the rice and salt, mix well and cook on a medium flame for 2 minutes, while stirring occasionally.\n" +
                    "•\tAdd the marinated paneer, mix gently and cook on a medium flame for 1 minute.\n" +
                    "•\tServe hot garnished with the spring onions and crushed peanuts.\n" +
                    "\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "2PQXxcjiwPM";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 13:
            {rb = new RecipeBean(R.drawable.t14,"primevera noodles",R.drawable.t14," " +
                    "Ingredients\n" +
                    "•\t2 cups boiled noodles\n" +
                    "\n" +
                    "•\t2 tbsp oil\n" +
                    "\n" +
                    "•\t2 tbsp finely chopped garlic (lehsun)\n" +
                    "\n" +
                    "•\t1/2 cup finely chopped onions\n" +
                    "\n" +
                    "•\t1/2 cup thinly sliced yellow capsicum\n" +
                    "\n" +
                    "•\t1/4 cup thinly sliced carrot\n" +
                    "\n" +
                    "•\t1/2 cup thinly sliced zucchini (unpeeled)\n" +
                    "\n" +
                    "•\t2 tbsp chopped black olives\n" +
                    "\n" +
                    "•\t1/4 cup cherry tomatoes halves\n" +
                    "\n" +
                    "•\t2 tbsp fresh cream\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "For The Garnish\n" +
                    "\n" +
                    "•\t1 tsp chopped parsley (optional)\n" +
                    "\n" +
                    "\n" +
                    "•\tMETHOD\n" +
                    "•\tHeat the oil in a broad non-stick pan, add the garlic and onions and sauté on a medium flame for 1 minute.\n" +
                    "•\tAdd the yellow capsicum, carrots, zucchini and olives, mix well and cook on a medium flame for 2 to 3 minutes, while stirring occasionally.\n" +
                    "•\tAdd the cherry tomatoes, fresh cream and salt, mix well and cook on a medium flame for 1 to 2 minutes, while stirring occasionally.\n" +
                    "•\tAdd the noodles, mix well and cook on a medium flame for 1 more minute.\n" +
                    "•\tServe immediately garnished with parsley.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "W9WFXMv7F3w";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 14:
            {rb = new RecipeBean(R.drawable.t15,"THAI SPRING ROLLS",R.drawable.t15," " +
                    "Ingredients\n" +
                    "•\t4 spring roll wrappers\n" +
                    "\n" +
                    "•\toil for deep-frying\n" +
                    "\n" +
                    "•\t\n" +
                    "\n" +
                    "•\tFor The Filling\n" +
                    "\n" +
                    "•\t1 tsp oil\n" +
                    "\n" +
                    "•\t1/2 cup carrot juliennes\n" +
                    "\n" +
                    "•\t1 cup shredded spinach (palak) leaves\n" +
                    "\n" +
                    "•\t1/2 cup boiled and drained rice noodles\n" +
                    "\n" +
                    "•\t1 tsp finely chopped green chillies\n" +
                    "\n" +
                    "•\t1 tsp finely chopped garlic (lehsun)\n" +
                    "\n" +
                    "•\t1 tsp soy sauce\n" +
                    "\n" +
                    "•\t1 tbsp chopped coriander (dhania)\n" +
                    "\n" +
                    "•\t1 tsp lemon juice\n" +
                    "\n" +
                    "•\tsalt and to taste\n" +
                    "•\t\n" +
                    "•\tMETHOD\n" +
                    "\n" +
                    "•\tFor the filling\n" +
                    "\n" +
                    "•\tHeat the oil in a broad non-stick pan, add the carrots and sauté on a medium flame for 2 minutes.\n" +
                    "•\tAdd the spinach, noodles, green chillies, garlic, soya sauce, coriander, salt and pepper, mix well and cook on a medium flame for 2 minutes ,while stirring occasionally.\n" +
                    "•\tAdd the lemon juice, mix well and cook on a medium flame for 1 minute, while stirring occasionally.\n" +
                    "•\tDivide into 4 equal portions and keep aside.\n" +
                    "•\t\n" +
                    "How to proceed\n" +
                    "\n" +
                    "•\tPlace a wrapper on a clean, dry surface and place a portion of the filing mixture in one corner of the wrapper. \n" +
                    "\n" +
                    "•\tRoll over the wrapper till ¾th. Refer step 2 and 3.\n" +
                    "\n" +
                    "•\tFold over from both the sides one by one towards the centre. \n" +
                    "\n" +
                    "•\tFinally roll it completely and seal the edge using little water.\n" +
                    "\n" +
                    "•\tRepeat steps 1 to 4 to make 3 more rolls.\n" +
                    "•\tHeat the oil in a deep non- stick kadhai and deep-fry, 2 rolls at a time, till they turn golden brown in colour from all the sides.\n" +
                    "•\tDrain on an absorbent paper and cut each roll into 3 equal pieces using a sharp knife.\n" +
                    "•\tServe immediately.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "wqRRuyTs240";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 15:
            {rb = new RecipeBean(R.drawable.t16,"THAI PINEAPPLE RICE",R.drawable.t16," " +
                    "Ingredients\n" +
                    "\n" +
                    "•\tTo Be Blended Into A Smooth Yellow Curry Paste (using 5 Tbsp Of Water)\n" +
                    "\n" +
                    "•\t1 tbsp roasted cumin seeds (jeera)\n" +
                    "\n" +
                    "•\t1 tbsp roasted coriander (dhania) seeds\n" +
                    "\n" +
                    "•\t1/4 cup chopped lemon grass (hare chai ki patti)\n" +
                    "\n" +
                    "•\t1/2 tbsp grated ginger (adrak)\n" +
                    "\n" +
                    "•\t3 whole dry kashmiri red chillies , broken into pieces\n" +
                    "\n" +
                    "•\t1 tsp chopped garlic (lehsun)\n" +
                    "\n" +
                    "•\t1/4 cup onion cubes\n" +
                    "\n" +
                    "•\t1/2 tsp turmeric powder (haldi)\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "\n" +
                    "•\tOther Ingredients\n" +
                    "\n" +
                    "•\t1 large pineapple\n" +
                    "\n" +
                    "•\t3 cups cooked basmati rice\n" +
                    "\n" +
                    "•\t2 tbsp butter\n" +
                    "\n" +
                    "•\t3/4 cup chopped onions\n" +
                    "\n" +
                    "•\t1 tsp finely chopped green chillies\n" +
                    "\n" +
                    "•\t1/2 cup coconut milk\n" +
                    "\n" +
                    "•\t2 tbsp raisins (kismis)\n" +
                    "\n" +
                    "•\t2 tbsp roasted cashewnuts (kaju)\n" +
                    "\n" +
                    "•\t1/2 tbsp sugar\n" +
                    "\n" +
                    "•\tsalt to taste\n" +
                    "\n" +
                    "\n" +
                    "•\tFor The Garnish\n" +
                    "\n" +
                    "•\t2 tbsp finely chopped coriander (dhania)\n" +
                    "\n" +
                    "\n" +
                    "•\tMETHOD\n" +
                    "\n" +
                    "•\tCut the pineapple into half lengthwise, keeping the leaves on. Scoop out the pineapple from the center portion using a sharp knife.\n" +
                    "•\tChop the scooped pineapple into cubes you will get approx. 1½ cups of chopped pineapple. Keep aside.\n" +
                    "•\tHeat the butter in a deep non-stick kadhai, add the onions and green chillies and sauté on a medium flame for 2 minutes.\n" +
                    "•\tAdd the prepared yellow curry paste, mix well and cook on a medium flame for 1 to 2 minutes, while stirring occasionally.\n" +
                    "•\tAdd the chopped pineapple, coconut milk, raisins, cashewnuts, cooked rice, sugar and salt, mix well and cook on a medium flame for 2 to 3 minutes, while stirring occasionally.\n" +
                    "•\tDivide the rice into 2 equal portions and fill each portion of the rice into the scooped out pineapple halve.\n" +
                    "•\tServe immediately garnished with coriander.\n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "hL0kuCIfFJI";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 16:
            {rb = new RecipeBean(R.drawable.t17,"THAI CHICKEN SATAY",R.drawable.t17," " +
                    "•\tIngredients \n" +
                    "•\tOriginal recipe makes 4 servings \n" +
                    "•\t \n" +
                    "•\t1/2 cup canned coconut milk \n" +
                    "•\t \n" +
                    "•\t1 1/2 teaspoons ground coriander \n" +
                    "•\t \n" +
                    "•\t1 teaspoon yellow curry powder \n" +
                    "•\t \n" +
                    "•\t1 teaspoon fish sauce \n" +
                    "•\t \n" +
                    "•\t1/2 teaspoon chili oil \n" +
                    "•\t \n" +
                    "•\t1 pound skinless, boneless chicken breast halves - cut into strips \n" +
                    "•\t \n" +
                    "•\t1 tablespoon chopped fresh cilantro \n" +
                    "•\t \n" +
                    "•\t1 tablespoon chopped unsalted peanuts \n" +
                    "•\t \n" +
                    "•\t12 wooden skewers, soaked in water for 15 minutes \n" +
                    "•\t \n" +
                    "•\t1 cup prepared Thai peanut sauce \n" +
                    "•\tCheck All Add to Shopping List \n" +
                    "•\tMETHOD\n" +
                    "•\tIn a medium bowl, stir together the coconut milk, ground coriander, " +
                    "curry powder, fish sauce, and chili oil. Add the chicken breast strips, and stir to coat. Cover, " +
                    "and refrigerate for at least 30 minutes, and up to 2 hours.\n" +
                    "•\tPreheat an indoor or outdoor grill for high heat. Thread the chicken strips onto skewers. Discard marinade.\n" +
                    "•\tGrill chicken for 2 to 3 minutes per side, until no longer pink. Time will depend on how thick your strips are. " +
                    "Transfer to a serving plate, and garnish with cilantro and peanuts. Serve with peanut sauce " +
                    "for dipping.\n",R.drawable.non_veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "lkpfQUxINQg";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 17:
            {rb = new RecipeBean(R.drawable.t18,"PAD SEE EW",R.drawable.t18," " + "\n Ingredients \n"+
                    "•\t1 lb Chinese broccoli \n" +
                    "•\t1 tablespoon Dark Soy Sauce \n" +
                    "•\t1 egg \n" +
                    "•\t1 lb Fresh Flat Rice Noodles \n" +
                    "•\t2 cloves chopped garlic \n" +
                    "•\t2 tablespoons Light Soy Sauce \n" +
                    "•\t1/2 cup thinly sliced pork \n" +
                    "•\t1 tablespoon sugar \n" +
                    "•\tTips and Techniques\n" +
                    "•\tFor a vegetarian version, skip the pork. Add firm tofu if you like. I often enjoy pad see ew with just the egg.\n" +
                    "•\tDark soy sauce gives the noodles the color while light soy sauce seasons the dish.\n" +
                    "•\tIf Chinese broccoli is tough to find where you live, try kale or regular broccoli.\n" +
                    "•\tIf your fresh flat rice noodles are not pre-cut, cut them into strips of 3/4 inch wide. If your fresh noodles came out from the refrigerator, heat them up in the microwave first. Cut Chinese broccoli into 2 inch long pieces. Halve the stems lengthwise because thick stems take longer to cook. You are going to want to cook them at the same time.\n" +
                    "•\tHeat a wok to high heat and then add 2 tablespoons of oil. Drop in the chopped garlic and stir. Add the sliced pork. Stir to cook the pork. When the pork is somewhat cooked or turned from pink to light brown, add rice noodles. Stir to break up the noodles. Add light and dark soy sauce and sugar.\n" +
                    "•\tStir to mix the seasonings into the noodles and pork. Open a spot in the middle of the pan, and drop the egg in. Scramble the egg until it is almost all cooked (not watery any more). Fold in the noodles and mix them all. Add the Chinese broccoli, stems first. I usually add half of the Chinese broccoli and stir until it wilts and then add the rest. But if you have room in your wok, you can cook all the Chinese broccoli at once. As soon as the Chinese broccoli is cooked, turn off the heat.\n" +
                    "•\tPut on a serving plate and sprinkle white pepper on top. Serve with the usual noodles condiments; sugar, fish sauce, vinegar and dried ground chili pepper. I usually like mine with ground chili peppers and vinegar.\n" +
                    "•\tPad see ew that you find in Thailand is little sweeter than mine because many " +
                    "street vendors add more sugar than I prefer.\n",R.drawable.non_veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "MVrmkpJkt74";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 18:
            {rb = new RecipeBean(R.drawable.t19,"CRISPY FRIED OKRA",R.drawable.t19," " +"\n Ingredients \n"+
                    "•\t1 teaspoon baking powder \n" +
                    "•\t1/3 cup all purpose flour \n" +
                    "•\t1 lb okra \n" +
                    "•\t1/2 cup tapioca flour \n" +
                    "•\t1/2 cup water \n" +
                    "•\tTips and Techniques\n" +
                    "•\tFor a vegetarian version, dip the okra in soy sauce instead of chili fish sauce. \n" +
                    "•\tIt is best to cook this dish last if you are preparing other dishes to retain the crispiness.\n" +
                    "•\tWhen it's time to reheat crispy fried okra (and other fried foods) a toaster oven or oven at low heat will return its crispiness, but a microwave will make it soggy.\n" +
                    "•\tMix all the flours, baking powder and water together. Stir and mix well. Drop the okra in.\n" +
                    "•\tHeat up a cup of oil in a wok or frying pan over medium heat. Test the oil with a drop of batter; the batter should puff up right away. Coat each piece of okra with the batter and drop it in the pan. Fry until lightly brown. Remove and drain oil. Serve immediately.\n" +
                    "•\tServe hot with chili fish sauce (below) and rice.\n" +
                    "•\t2 tablespoons fish sauce \n" +
                    "•\t1/4 lime \n" +
                    "•\t1 shallots \n" +
                    "•\t1-4 Thai chili pepper \n" +
                    "\n" +
                    "•\tMETHOD\n" +
                    "•\tFor a vegetarian chili fish sauce, substitute light soy sauce for fish sauce.\n" +
                    "•\tSlice chili pepper and shallot and place them in a sauce dish. Add fish sauce and lime juice. Some people omit the lime juice. But in our house, lime juice is a must. Some like garlic instead of shallot. \n" +
                    "•\tThis sauce is like salt and pepper, appearing on most people's table. Chili fish sauce is also served with crispy fried dishes like fried fish, deep fried okra or green beans.\n" +
                    "\n",R.drawable.non_veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "y5X3lcNmhoU";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;

            case 19:
            {rb = new RecipeBean(R.drawable.t20,"STIR FRIED PUMPKIN",R.drawable.t20," " +"\n Ingredients \n"+
                    "•\t2 tablespoons fish sauce \n" +
                    "•\t2 cloves garlic \n" +
                    "•\t30 peppercorns \n" +
                    "•\t2 cups pumpkin \n" +
                    "•\t1 teaspoon sugar \n" +
                    "•\t1 tablespoon cooking oil \n" +
                    "•\t1 cup water \n" +
                    "•\tMETHOD\n" +
                    "•\tKabocha squash is a substitute for a yellow/orange flesh squash in Thailand that we call ‘fug tong’. The flavor is the same but the texture is very different. Fug tong is more gummy and creamier than Kabocha squash. A good fug tong can be steamed and eaten without any seasoning. If you get a chance to cook in Thailand, try the real thing! For a vegetarian dish, substitute a teaspoon of salt for fish sauce.\n" +
                    "•\tYou can substitute delicata, acorn, butternut or acorn squash for the Oriental one. \n" +
                    "•\tPeel the skin off from the squash. If you are using delicata squash or other thin skin squash, you don't need to peel off the skin. Remove seeds and spongy part of the squash. Cut into pieces that are an inch long and half an inch thick.\n" +
                    "•\tCrush peppercorn and garlic in a mortar. In an absence of mortar and pestle, chop garlic and use ground pepper.\n" +
                    "•\tHeat up the wok on high heat. Add oil and garlic and pepper. Stir fry until garlic starts to brown. Add the squash. Stir to coat the squash with the garlic and pepper mixture. Add water and stir. It should take about 5 minutes or so for the water to reduce and squash to cook. If you are using delicata, it will cook in no time so add less water. But if you find the squash still hard, add more water. Add fish sauce and sugar while there is still water in the wok. The seasoning will penetrate the squash to give a consistent flavor throughout the pieces. It should be a little bit mushy when done.\n" +
                    "•\tServe with hot rice. \n",R.drawable.veg);
                Intent i = new Intent(Thai_Activity.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "fuV2lpyF-08";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;

        }
    }
};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_thai_, menu);
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
