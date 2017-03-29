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


public class Indian_Recipes extends ActionBarActivity {
    ListView myLV;
    ArrayList<ListBean> myList;
    MyArrayAdapter adapter;
    RecipeBean rb;

    void initList(){
        myList = new ArrayList<ListBean>();
        myList.add(new ListBean(R.drawable.indian_1,R.drawable.veg,"Paneer Kaliya"));
        myList.add(new ListBean(R.drawable.indian_2,R.drawable.non_veg,"Chicken Curry"));
        myList.add(new ListBean(R.drawable.indian_3,R.drawable.non_veg,"Chicken Biryani"));
        myList.add(new ListBean(R.drawable.indian_4,R.drawable.veg,"Vegetable Biryani"));
        myList.add(new ListBean(R.drawable.indian_5,R.drawable.veg,"Vegetable Fried Rice"));
        myList.add(new ListBean(R.drawable.indian_6,R.drawable.veg,"Paneer Makhani"));
        myList.add(new ListBean(R.drawable.indian_7,R.drawable.veg,"Dal Makhani"));
        myList.add(new ListBean(R.drawable.indian_8,R.drawable.veg,"Rajmah Masala"));
        myList.add(new ListBean(R.drawable.indian_9,R.drawable.veg,"Paneer Butter Masala"));
        myList.add(new ListBean(R.drawable.indian_10,R.drawable.veg,"Pav Bhaji"));
        myList.add(new ListBean(R.drawable.indian_11,R.drawable.veg,"Khaman Dhokla"));
        myList.add(new ListBean(R.drawable.indian_12,R.drawable.non_veg,"Butter Chicken"));
        myList.add(new ListBean(R.drawable.indian_13,R.drawable.veg,"Malai Kofta"));
        myList.add(new ListBean(R.drawable.indian_14,R.drawable.veg,"Kashmiri Dum Aloo"));
        myList.add(new ListBean(R.drawable.indian_15,R.drawable.veg,"Mushroom Curry"));
        myList.add(new ListBean(R.drawable.indian_16,R.drawable.non_veg,"Egg Curry"));
        myList.add(new ListBean(R.drawable.indian_17,R.drawable.non_veg,"Goan Fish Curry"));
        myList.add(new ListBean(R.drawable.indian_18,R.drawable.veg,"Paneer Tikka Masala"));

        adapter= new MyArrayAdapter(this,R.layout.list_item,myList);
        myLV.setAdapter(adapter);
        myLV.setOnItemClickListener(clickListener);
        rb = new RecipeBean();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian__recipes);
        myLV = (ListView)findViewById(R.id.listViewIndian);
        initList();
    }

AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
            {rb = new RecipeBean(R.drawable.indian_1,"Paneer Kaliya",R.drawable.indian_1," " +
                    "Ingredients\n" +
                    "•\t500 grams    Paneer (cottage cheese) 1 inch cubes   \n" +
                    "•\t1 1/2 cups   Almonds blanched and ground               \n" +
                    "•\t1/4 cup   Split Bengal gram (chana dal)                 \n" +
                    "•\t1/2 cup  Ghee                                                        \n" +
                    "•\t4   Green cardamoms                                       \n" +
                    "•\t4   Cloves                                                          \n" +
                    "•\t10  Black peppercorns                                        \n" +
                    "•\t1 inch stick  Cinnamon                                                  \n" +
                    "•\t2 medium   Onions sliced                                             \n" +
                    "•\t1 inch stick   Ginger roughly chopped                             \n" +
                    "•\t 2 tablespoons    Coriander seeds                                          \n" +
                    "•\t1/2 teaspoon   Turmeric powder                                        \n" +
                    "•\t1 cup  Milk                                                               \n" +
                    "•\t2 tablespoons   Fresh coriander leaves                                  \n" +
                    "•\tSalt -  to taste\n" +
                    "\n" +
                    "  Method\n" +
                    "Step 1\n" +
                    "Grind almonds to a fine paste. Grind roasted chana dal to a fine powder. Heat two tablespoons of ghee in a kadai.\n" +
                    "Step 2\n" +
                    "Crush cardamoms, cloves, peppercorns in a mortar with a pestle and add to the ghee. Add cinnamon, sliced onions and sauté for two to three minutes.\n" +
                    "Step 3\n" +
                    "Add ginger and coriander seeds to the onions and sauté for a minute more. Take off the heat, cool slightly and grind into a fine paste using little water.\n" +
                    "\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "sMY8e9VAsgY";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
           break;
            case 1:
            {rb = new RecipeBean(R.drawable.indian_2,"Chicken Curry",R.drawable.indian_2," " +
                    "Ingredients\n" +
                    "•\t800 grams   Chicken                                                 \n" +
                    "•\t4-5 medium   Onions                                                   \n" +
                    "•\t1 tablespoon   Ginger                                                    \n" +
                    "•\t1 tablespoon   Garlic                                                       \n" +
                    "•\t4-5 medium    Tomatoes                                                 \n" +
                    "•\t1 tablespoon    Fresh coriander leaves chopped                \n" +
                    "•\t4 tablespoons   Ghee                                                         \n" +
                    "•\t1 inch stick   Cinnamon                                                    \n" +
                    "•\t4-5    Cloves                                                            \n" +
                    "•\t4-5    Green cardamom                                          \n" +
                    "•\t1/2 teaspoon   Turmeric powder                                        \n" +
                    "•\t2 tablespoons   Coriander powder                                       \n" +
                    "•\t2 tablespoons   Cumin powder                                              \n" +
                    "•\t1 teaspoon  Red chilli powder                                          \n" +
                    "•\tSalt -  to taste\n" +
                    "•\t1 teaspoon   Garam masala powder                                \n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Heat ghee/oil in a thick-bottomed pan. Add cinnamon, cloves and green cardamoms and sauté for half a minute. Add onions and sauté till golden brown.\n" +
                    "Step 2\n" +
                    "Add ginger paste and garlic paste and continue to sauté for two to three minutes, stirring continuously.\n" +
                    "Step 3\n" +
                    "Add turmeric powder, coriander powder, cumin powder and red chilli powder. Mix well. Add pureed tomato and stir. Cook till oil separates from the masala. Add the chicken pieces and salt.\n" +
                    "Step 4\n" +
                    "Sauté on high heat for five minutes. Add two cups water, bring to a boil, cover and cook " +
                    "till the chicken is fully done. Sprinkle garam masala powder and garnish with coriander " +
                    "leaves and serve hot.\n",R.drawable.non_veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "DwBXXOrNIGc";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 2:
            {rb = new RecipeBean(R.drawable.indian_3,"Chicken Biryani",R.drawable.indian_3," " +
                    "Ingredients\n" +
                    "•\t600 grams  Boneless chicken                                      \n" +
                    "•\t1 1/2 cups  Basmati rice                                              \n" +
                    "•\t3 tablespoons   Oil to deep fry                                          \n" +
                    "•\t1 inch stick  Cinnamon                                                   \n" +
                    "•\t2  Bay leaves                                                         \n" +
                    "•\t5-6   Cloves                                                                \n" +
                    "•\t1 teaspoon  Cumin seeds                                                   \n" +
                    "•\t3-4  Green cardamoms                                               \n" +
                    "•\t2 medium   Onions sliced                                                   \n" +
                    "•\t3 Green chillies slit                                                 \n" +
                    "•\t1/4 teaspoon   Turmeric powder                                               \n" +
                    "•\t2 medium    Tomatoes chopped                                             \n" +
                    "•\tSalt-  to taste\n" +
                    "•\t3/4 teaspoon   Ginger paste                                                         \n" +
                    "•\t3/4 teaspoon    Garlic paste                                                         \n" +
                    "•\t1/2 teaspoon  Red chilli powder                                                \n" +
                    "•\t1 cup      Thick yogurt                                                            \n" +
                    "•\t3 medium    Onions sliced and fried brown                                  \n" +
                    "•\t1/2 teaspoon   Garam masala powder                                           \n" +
                    "•\t1 inch piece   Ginger cut into thin strips                                        \n" +
                    "•\tFresh mint leaves torn  - a few\n" +
                    "•\tFresh coriander leaves torn- a few\n" +
                    "•\t1/2 cup    Milk                                                                            \n" +
                    "•\tRose water - a few drops\n" +
                    "•\tEggs boiled and sliced                                                        4\n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Cut chicken in one inch pieces. Boil rice and set aside. Heat oil in a Wonderchef Granite Wok, add cinnamon, bay leaves, cloves, cumin seeds, green cardamoms and sauté for half a minute.\n" +
                    "Step 2\n" +
                    "Add sliced onions and sauté. Add slit green chillies and chicken cubes and continue to sauté. Add turmeric powder and mix. Add tomatoes and salt and mix. Add ginger-garlic paste, red chilli powder and yogurt. Mix well.\n" +
                    "Step 3\n" +
                    "Add half the fried brown onions. Add the boiled rice on top. Sprinkle garam masala powder, ginger strips, mint leaves and coriander leaves. Sprinkle milk, rose water and remaining browned onions.\n" +
                    "Step 4\n" +
                    "Cover and cook on low heat for about ten minutes. Garnish with the egg slices " +
                    "and serve hot.\n",R.drawable.non_veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "QDitVxdscNA";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 3:
            {rb = new RecipeBean(R.drawable.indian_4,"Vegetable Biryani",R.drawable.indian_4," " +
                    "Ingredients\n" +
                    "•\t1 1/2 cups   Basmati rice soaked                              \n" +
                    "•\t2 medium   Onions diced                                          \n" +
                    "•\t2 medium   Carrots 1/2 inch pieces                           \n" +
                    "•\t15   French beans 1/2 inch pieces                \n" +
                    "•\t10-12 florets  Cauliflower                                             \n" +
                    "•\t1 cup    Green peas shelled                                 \n" +
                    "•\tSalt  - to taste\n" +
                    "•\t8  Green cardamons                                      \n" +
                    "•\t1 Black cardamom                                       \n" +
                    "•\t15   Cloves                                                      \n" +
                    "•\t1/2 inch stick   Cinnamon                                            \n" +
                    "•\t1  Bay leaf                                                     \n" +
                    "•\t1/2 teaspoon   Caraway seeds (shahi jeera)                \n" +
                    "•\t1 1/2 tablespoons   Ginger-garlic paste                              \n" +
                    "•\t1 teaspoon  Turmeric powder                                   \n" +
                    "•\t1 tablespoon Red chilli powder                                   \n" +
                    "•\t1 tablespoon  Coriander powder                                 \n" +
                    "•\t1/2 cup   Yogurt                                                     \n" +
                    "•\t1/2 teaspoon  Rose water                                          \n" +
                    "•\tSaffron (kesar)  - a few strands\n" +
                    "•\t1 cup  Fresh tomato puree                                   \n" +
                    "•\t1 teaspoon   Garam masala powder                           \n" +
                    "•\t2 tablespoons   Fresh coriander leaves chopped           \n" +
                    "•\t2 tablespoons   Fresh mint leaves chopped                    \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Boil rice in four cups of salted boiling water with two green cardamoms, one black cardamom, five cloves, half inch stick of cinnamon, until three-fourth done. Drain excess water and set aside. Heat a Wonderchef Granite Wokm with Lid. Add the remaining green cardamoms, cloves, black cardamom and cinnamon along with bay leaf and caraway seeds and roast. Add onions, carrot, French beans, cauliflower florets and green peas.\n" +
                    "Step 2\n" +
                    "Sprinkle salt, cover and cook on medium heat for two minutes. Add ginger-garlic paste mixed with a little water and stir. Cover and cook for two minutes. Add turmeric powder, red chilli powder and coriander powder and cook.Whisk yogurt with rose water and saffron. Add a little water or milk and whisk well. Add tomato puree to the vegetables along with half teaspoon garam masala powder and mix well. Simmer for two minutes. Take a microwave safe deep bowl.\n" +
                    "Step 3\n" +
                    "Arrange a layer of rice at the bottom. Over that arrange half the cooked vegetables followed by another layer of rice. " +
                    "Sprinkle half of the remaining garam masala powder, half the coriander leaves, half the mint leaves and half the yogurt " +
                    "mixture. Arrange the remaining vegetables followed by the remaining rice.Sprinkle the remaining garam masala powder, " +
                    "remaining coriander leaves, remaining mint leaves and the remaining yogurt mixture. Cover with a silicon lid and cook in the" +
                    " microwave oven for four to five minutes on HIGH (100%). Let it stand for five minutes. Serve hot.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "IMhJ3XDPvDc";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 4:
            {rb = new RecipeBean(R.drawable.indian_5,"Vegetable Fried Rice",R.drawable.indian_5," " +
                    "Ingredients\n" +
                    "•\t2 cups    Rice boiled                                                    \n" +
                    "•\t1 medium   Onion chopped                                             \n" +
                    "•\t2 tablespoons   Olive oil                                                         \n" +
                    "•\t1/2 medium     Carrot cut into thin strips                                \n" +
                    "•\t1 medium   Green capsicum deseeded & chopped            \n" +
                    "•\t1/2 medium   Red capsicum deseeded & chopped              \n" +
                    "•\t1/2 medium    Yellow capsicum deseeded & chopped          \n" +
                    "•\t1 medium    Tomato chopped                                              \n" +
                    "•\t1 tablespoon   Soy sauce                                                       \n" +
                    "•\t1 teaspoon   Chilli sauce                                                        \n" +
                    "•\t2 stalks   Spring onion greens chopped                            \n" +
                    "•\tSalt -  to taste\n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Heat olive oil in a pan. Add onion, carrot, green, red and yellow capsicums, tomato, soy sauce, chilli sauce and mix. " +
                    "Add boiled rice and mix. Add spring onion leaves and salt and toss to mix well. Serve immediately.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "yz_it7Aq0P8";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 5:
            {rb = new RecipeBean(R.drawable.indian_6,"Paneer Makhni",R.drawable.indian_6," " +
                    "Ingredients\n" +
                    "•\t200 grams   Paneer (cottage cheese)                                                             \n" +
                    "•\t4 tablespoons   Oil                                                                                               \n" +
                    "•\t4  Green cardamoms                                                                            \n" +
                    "•\t6  Cloves                                                                                               \n" +
                    "•\t2 inch stick  Cinnamon                                                                                       \n" +
                    "•\t7-8 cloves   Garlic crushed                                                                                 \n" +
                    "•\t1 1/2 inch piece    Ginger chopped                                                                            \n" +
                    "•\t2  Green chillies chopped                                                                   \n" +
                    "•\t3 cups   Fresh tomato puree                                                                       \n" +
                    "•\tSalt - to taste\n" +
                    "•\t1 1/2 teaspoons   Kashmiri red chilli powder                                                              \n" +
                    "•\t3 tablespoons   Fresh coriander leaves chopped                                                     \n" +
                    "•\t1 teaspoon  Garam masala powder                                                                    \n" +
                    "•\t1 teaspoon  Dried fenugreek leaves (kasoori methi)                                           \n" +
                    "•\t2 tablespoons  Honey                                                                                              \n" +
                    "•\t1/4 cup    Skimmed milk                                                                                      \n" +
                    "\n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Cut the paneer into two thick slices. Heat two teaspoons oil in a non-stick pan. Add green cardamoms, cloves, cinnamon, garlic and ginger and sauté till fragrant.\n" +
                    "Step 2\n" +
                    "Add green chillies and continue to sauté. Cook tomato puree in another non-stick pan with salt till it reduces slightly. Add this to the ginger-garlic masala and cook.\n" +
                    "Step 3\n" +
                    "Heat the remaining oil in a grill pan and place the paneer slices on it. Sprinkle some salt and red chilli powder and grill, turning sides once, till both the sides are golden.\n" +
                    "Step 4\n" +
                    "Add coriander leaves to the tomato gravy and mix. Add salt, remaining red chilli powder, garam masala powder, kasoori methi and honey and mix well.\n" +
                    "Step 5\n" +
                    "Once the paneer pieces are well grilled, take them off the pan and cut into cubes. Add these cubes to the gravy and mix. " +
                    "Just before serving add milk and mix. Serve hot with chapatti.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "BVQECDKpoT0";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 6:
            {rb = new RecipeBean(R.drawable.indian_7,"Dal Makhani",R.drawable.indian_7," " +
                    "Ingredients\n" +
                    "•\t1/2 cup   Whole black gram (sabut urad)                     \n" +
                    "•\t2 tablespoons   Red kidney beans (rajma)                         \n" +
                    "•\tSalt   - to taste\n" +
                    "•\t1 teaspoon   Red chilli powder                                        \n" +
                    "•\t2 inch pieces   Ginger chopped                                          \n" +
                    "•\t3 tablespoons  Nutralite Butter                                            \n" +
                    "•\t1 tablespoon   Oil                                                               \n" +
                    "•\t1 teaspoon  Cumin seeds                                               \n" +
                    "•\t6 cloves   Garlic chopped                                            \n" +
                    "•\t1 large  Onion chopped                                           \n" +
                    "•\t2  Green chillies slit                                         \n" +
                    "•\t2 medium  Tomatoes                                                    \n" +
                    "•\t1 teaspoon  Garam masala powder                               \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Pick, wash and soak sabut urad and rajma overnight in three cups of water. Drain.\n" +
                    "Step 2\n" +
                    "Boil sabut urad and rajma in three cups of water with salt and half the red chilli powder (you can add half the ginger too if you wish) for three whistles in Wonderchef Secura5 Pressure Cooker. Open the lid and see if the rajma is totally soft. If not cook on low heat till the rajma becomes totally soft.\n" +
                    "Step 3\n" +
                    "Heat butter and oil in a pan. Add cumin seeds. When they begin to change colour, add ginger, garlic and onion and sauté till golden.\n" +
                    "Step 4\n" +
                    "Add slit green chillies, tomatoes and sauté on high heat. Add the remaining red chilli powder and sauté till the tomatoes are reduced to a pulp.\n" +
                    "Step 5\n" +
                    "Add the cooked dal and rajma along with the cooking liquour. Add some water if the mixture is too thick. Add garam masala powder and adjust salt.\n" +
                    "Step 6\n" +
                    "Simmer on low heat till the dals are totally soft and well blended.\n" +
                    "Step 7\n" +
                    "Serve hot.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "2TSFTzB0AyU";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 7:
            {rb = new RecipeBean(R.drawable.indian_8,"Rajmah Masala",R.drawable.indian_8," " +
                    "Ingredients\n" +
                    "•\t1 cup   Kidney beans soaked overnight                          \n" +
                    "•\tSalt -  to taste\n" +
                    "•\t4 tablespoons  Oil                                                                         \n" +
                    "•\t2 medium  Onions finely chopped                                         \n" +
                    "•\t2 tablespoons   Ginger-garlic paste                                              \n" +
                    "•\t2 teaspoons   Coriander powder                                               \n" +
                    "•\t1 teaspoon   Cumin powder                                                      \n" +
                    "•\t1 teaspoon   Red chilli powder                                                  \n" +
                    "•\t1/2 cup   Tomato puree                                                         \n" +
                    "•\t1 1/2 teaspoons   Garam masala powder                                        \n" +
                    "•\t1 tablespoon  Fresh coriander leaves chopped                           \n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Drain kidney beans and wash in fresh water and put into a pressure cooker. Add 5 cups of water and salt and cook under pressure till 4-5 whistles are given out.\n" +
                    "Step 2\n" +
                    "Drain and reserve the cooking liquor. Heat oil in a non-stick pan. Add onions and sauté till light brown.\n" +
                    "Step 3\n" +
                    "Add ginger-garlic paste and sauté for 2 minutes. Add coriander powder, cumin powder and red chilli powder and mix well.\n" +
                    "Step 4\n" +
                    "Add tomato puree and mix again. Sauté for 3-4 minutes.\n" +
                    "Step 5\n" +
                    "Add kidney beans and mix well. Add 1 cup cooking liquor and salt and stir to mix.\n" +
                    "Step 6\n" +
                    "Mash the beans a bit and stir again. Add garam masala powder and mix and cook for 5-7 minutes.\n" +
                    "Step 7\n" +
                    "Garnish with coriander leaves and serve hot.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "1e1PqQOfF7Q";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 8:
            {rb = new RecipeBean(R.drawable.indian_9,"Paneer Butter Masala",R.drawable.indian_9," " +
                    "Ingredients\n" +
                    "•\t500 grams   Paneer (cottage cheese) cut into triangles     \n" +
                    "•\t5 tablespoons  Butter                                                    \n" +
                    "•\t1 teaspoon  Oil                                                               \n" +
                    "•\t2   Bay leaves                                                       \n" +
                    "•\t2  Cloves                                                                                    \n" +
                    "•\t2 one-inch  Cinnamon                                                 \n" +
                    "•\t2   Dried red chillies broken                               \n" +
                    "•\t2 tablespoons  Coriander seeds crushed                        \n" +
                    "•\t1 medium  Onion sliced                                              \n" +
                    "•\t2 teaspoons   Ginger paste                                             \n" +
                    "•\t2 teaspoons  Garlic paste                                                \n" +
                    "•\t1 teaspoon  Coriander powder                                      \n" +
                    "•\t1 teaspoon  Red chilli powder                                       \n" +
                    "•\t5-6 medium  Tomatoes chopped                                   \n" +
                    "•\tSalt   - to taste\n" +
                    "•\t1/2 teaspoon   Kasoori methi crushed                                \n" +
                    "•\t2 tablespoons  Fresh cream                                                \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Heat three tablespoons butter with one teaspoon oil in a Wonderchef Click Amaze Wok. Add bay leaves, cloves, cinnamon, red chillies and half of the crushed coriander seeds. Sauté for half a minute.\n" +
                    "Step 2\n" +
                    "Add onion and stir-fry for thirty seconds and add ginger paste and garlic paste. Cook for another thirty seconds. Add coriander powder, red chilli powder and tomatoes. Cook on high heat till oil leaves the masala. Puree the mixture.\n" +
                    "Step 3\n" +
                    "Heat the remaining butter in a Wonderchef Click Amaze Frying Pan, cook the pureed mixture for two minutes. Add paneer pieces and salt. Add half a cup of water. Cook covered on low heat for five minutes.\n" +
                    "Step 4\n" +
                    "Sprinkle kasoori methi and mix in lightly. Remove from heat and mix in cream. Serve hot, garnished with " +
                    "remaining crushed coriander seeds.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "gcIFbH3EIAA";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 9:
            {rb = new RecipeBean(R.drawable.indian_10,"Pav Bhaji",R.drawable.indian_10," " +
                    "\n" +
                    "Ingredients\n" +
                    "•\t4 medium   Potatoes                               \n" +
                    "•\t4 medium    Tomatoes                              \n" +
                    "•\t1/4 small   Cauliflower                             \n" +
                    "•\t2 medium   Onions                                    \n" +
                    "•\t1 inch piece   Ginger                                        \n" +
                    "•\t8-10 cloves    Garlic                                         \n" +
                    "•\t1 medium   Green capsicum                               \n" +
                    "•\t3-4  Green chillies                                        \n" +
                    "•\t1/4 cup   Fresh coriander leaves                       \n" +
                    "•\t1/4 cup    Green peas shelled                            \n" +
                    "•\t2  Lemons                                                   \n" +
                    "•\t3 tablespoons  Oil                                                     \n" +
                    "•\tSalt   - to taste\n" +
                    "•\t1 1/2 tablespoons   Pav bhaji masala                              \n" +
                    "•\t1 1/2 tablespoons  Butter                                                  \n" +
                    "•\t8   Pav                                                            \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Boil, cool, peel and grate potatoes. Wash and finely chop tomatoes. Wash and grate cauliflower. Peel, wash and finely chop onion. Peel and wash ginger, garlic and grind to a fine paste.\n" +
                    "Step 2\n" +
                    "Wash, halve, remove seeds and finely chop capsicum. Wash, remove stems and finely chop green chillies.\n" +
                    "Step 3\n" +
                    "Clean, wash and finely chop fresh coriander leaves. Wash and boil the green peas in salted water till soft, drain and mash lightly and keep aside. Cut lemon into wedges.\n" +
                    "Step 4\n" +
                    "Heat oil in a pan and add three fourth quantity of chopped onions. Sauté till light brown. Add chopped green chillies and ginger garlic paste. Stir-fry for half a minute.\n" +
                    "Step 5\n" +
                    "Add half the quantity of chopped tomatoes and cook on medium heat for three to four minutes, stirring continuously or till oil separates from the masala. Add chopped capsicum, boiled and lightly mashed peas, grated cauliflower, grated boiled potatoes and\n" +
                    "Step 6\n" +
                    "Bring it to a boil and simmer for ten minutes, pressing with the back of the spoon a few times, till all the vegetables are completely mashed. Add pav bhajee masala, salt and the rest of the chopped tomatoes. Cook on medium heat for two minutes, stirring\n" +
                    "Step 7\n" +
                    "Heat half of the butter in a thick-bottomed pan or a tawa. Slice pav horizontally into two and pan fry in butter for half a minute, pressing two or three times or till pav is crisp and light brown.\n" +
                    "Step 8\n" +
                    "Garnish the bhajee with chopped coriander leaves, remaining butter and serve hot with pav accompanied " +
                    "with remaining chopped onion and lemon wedges.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "YI5pCJ0__N8";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 10:
            {rb = new RecipeBean(R.drawable.indian_11,"Khaman Dhokla",R.drawable.indian_11," " +
                    "Ingredients\n" +
                    "•\t2 cups   Gram flour (besan) sieved                                     \n" +
                    "•\t1 cup   Yogurt beaten                                                          \n" +
                    "•\tSalt  -  to taste\n" +
                    "•\t1/2 teaspoon  Turmeric powder                                                  \n" +
                    "•\t1 teaspoon   Green chilli-ginger paste                                       \n" +
                    "•\t2 tablespoons  Oil                                                                           \n" +
                    "•\t1 tablespoon   Lemon juice                                                           \n" +
                    "•\t1 teaspoon     Soda bicarbonate                                                   \n" +
                    "•\t1 teaspoon  Mustard seeds                                                        \n" +
                    "•\t2 tablespoons   Fresh coriander leaves chopped                            \n" +
                    "•\t1/2 cup   Coconut scraped                                                      \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Take gram flour in a bowl. Add yogurt and approximately one cup of warm water and mix. Avoid lumps. Add salt and mix again.\n" +
                    "Step 2\n" +
                    "Leave it aside to ferment for three to four hours. When gram flour mixture has fermented, add turmeric powder and green chilli-ginger paste. Mix Heat the steamer. Grease a thali.\n" +
                    "Step 3\n" +
                    "In a small bowl take lemon juice, soda bicarbonate, one teaspoon of oil and mix. Add it to the batter and whisk briskly. Pour batter into the greased thali and place it in the steamer.\n" +
                    "Step 4\n" +
                    "Cover with the lid and steam for ten minutes. When a little cool, cut into squares and keep in a serving bowl/plate.\n" +
                    "Step 5\n" +
                    "Heat remaining oil in a small pan. Add mustard seeds. When the seeds begin to crackle, remove and pour over the dhoklas.\n" +
                    "Step 6\n" +
                    "Serve, garnished with chopped coriander leaves and scraped coconut.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "nfTUXOYqvCI";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 11:
            {rb = new RecipeBean(R.drawable.indian_12,"Butter Chicken",R.drawable.indian_12," " +
                    "\n" +
                    "Ingredients\n" +
                    "•\t400 grams   Boneless chicken cut into 1½ inch pieces                      \n" +
                    "•\t1 tablespoon   Lemon juice                                                                     \n" +
                    "•\t1 teaspoon    Kashmiri red chilli powder                                                 \n" +
                    "•\tSalt  - to taste\n" +
                    "•\t2 tablespoons   Butter                                                                              \n" +
                    "For marinade \n" +
                    "•\t1/2 cup   Yogurt                                                                                  \n" +
                    "•\t2 teaspoons  Ginger paste                                                                         \n" +
                    "•\t2 teaspoons   Garlic paste                                                                          \n" +
                    "•\t1/2 teaspoon   Kashmiri red chilli powder                                                     \n" +
                    "•\t1/2 teaspoon   Garam masala powder                                                          \n" +
                    "•\tSalt -   to taste\n" +
                    "•\t2 teaspoons  Mustard oil                                                                            \n" +
                    "FOR MAKHNI GRAVY \n" +
                    "•\t2 tablespoons  Butter                                                                                   \n" +
                    "•\t2  Green cardamom                                                                      \n" +
                    "•\t2  Clove                                                                                         \n" +
                    "•\t2-3   Black peppercorns                                                                   \n" +
                    "•\t1 inch piece   Cinnamon                                                                             \n" +
                    "•\t1 teaspoon  Ginger paste                                                                         \n" +
                    "•\t1 teaspoon   Garlic paste                                                                          \n" +
                    "•\t1/2 cup  Tomato puree                                                                        \n" +
                    "•\t1/2 teaspoon   Red chilli powder                                                                 \n" +
                    "•\tSalt - to taste\n" +
                    "•\t2 tablespoons  Sugar                                                                                  \n" +
                    "•\t1/2 teaspoon   Kasoori methi                                                                      \n" +
                    "•\t1/2 cup  Fresh cream                                                                           \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Apply a mixture of red chilli powder, lemon juice and salt to the chicken pieces and set aside for half an hour in the refrigerator.\n" +
                    "Step 2\n" +
                    "Hang the yogurt in a muslin cloth for fifteen to twenty minutes to remove extra water. Add the ginger and garlic pastes, red chilli and garam masala powders, salt and mustard oil.\n" +
                    "Step 3\n" +
                    "Apply this marinade to the chicken pieces and place them in the refrigerator for three to four hours.\n" +
                    "Step 4\n" +
                    "Preheat the oven to 200°C/400°F/Gas Mark 6. String the chicken pieces onto skewers and cook in the preheated oven or a moderately hot tandoor for ten to twelve minutes or until almost done.\n" +
                    "Step 5\n" +
                    "Baste with the butter and cook for another two minutes. Remove and set aside.\n" +
                    "Step 6\n" +
                    "To make the makhni gravy, heat the butter in a non-stick pan. Add the green cardamoms, cloves, peppercorns and cinnamon.\n" +
                    "Step 7\n" +
                    "Sauté for two minutes, add the ginger and garlic pastes and sauté for two minutes. Add the tomato puree, red chilli powder, salt and half cup of water.\n" +
                    "Step 8\n" +
                    "Bring the mixture to a boil. Reduce the heat and simmer for ten minutes. Add the sugar or honey and powdered kasoori methi.\n" +
                    "Step 9\n" +
                    "Add the cooked tandoori chicken pieces. Simmer for five minutes and add the fresh cream. Serve hot with " +
                    "naan or parantha.\n",R.drawable.non_veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "-nzHXxasZ8E";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 12:
            {rb = new RecipeBean(R.drawable.indian_13,"Malai Kofta",R.drawable.indian_13," " +
                    "Ingredients\n" +
                    "For koftas \n" +
                    "•\t4-5 medium   Potatoes, boiled and mashed                        \n" +
                    "•\t100 grams  Paneer (cottage cheese),grated                     \n" +
                    "•\t2  Green chillies,seeded and chopped finely            \n" +
                    "•\t1/4 cup   Cornflour/ corn starch                        \n" +
                    "•\tSalt-  to taste\n" +
                    "•\t1/4 cup   Raisins                                               \n" +
                    "•\tOil  - to deep fry\n" +
                    "For gravy \n" +
                    "•\t3 medium   Onions,roughly chopped                       \n" +
                    "•\t3 tablespoons  Oil                                                        \n" +
                    "•\t1 tablespoon  Ginger paste                                         \n" +
                    "•\t1 tablespoon    Garlic paste                                          \n" +
                    "•\t2    Green chillies,chopped                                 \n" +
                    "•\t1 teaspoon   Coriander powder                                  \n" +
                    "•\t1 teaspoon   Turmeric powder                                     \n" +
                    "•\tSalt- to taste\n" +
                    "•\t1/2 cup   Tomato puree                                             \n" +
                    "•\t1 teaspoon   Red chilli powder                                        \n" +
                    "•\t1/2 cup    Mawa (khoya)                                                 \n" +
                    "•\t1/2 cup    Fresh cream                                                    \n" +
                    "•\t1 teaspoon   Garam masala powder                                   \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "For the koftas mix potatoes, paneer, green chillies, cornflour and salt. Divide into sixteen equal portions. Stuff raisins into each portion and shape them into balls.\n" +
                    "Step 2\n" +
                    "Heat sufficient oil in a kadai and deep fry the koftas till slightly coloured. Drain on absorbent paper and keep them warm.\n" +
                    "Step 3\n" +
                    "For the gravy, boil the onions with a cup of water for ten minutes. Drain excess water, cool and grind to a smooth paste. Heat oil in a kadai. Add boiled onion paste and sauté for five minutes.\n" +
                    "Step 4\n" +
                    "Add ginger paste, garlic paste, green chillies, coriander powder, turmeric powder and salt. Sauté for a minute. Add tomato puree and red chilli powder and sauté on medium heat for eight to ten minutes or till oil begins to leave the masala.\n" +
                    "Step 5\n" +
                    "Mix mawa in two cups of water and add to the gravy. Bring it to a boil and simmer for ten minutes on low heat, stirring occasionally.\n" +
                    "Step 6\n" +
                    "Add fresh cream and garam masala powder. Place warm koftas in a serving dish and pour hot " +
                    "gravy on top and serve. \n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "n6f18z8IFPc";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 13:
            {rb = new RecipeBean(R.drawable.indian_14,"Kashmiri Dum Aloo",R.drawable.indian_14," " +
                    "Ingredients\n" +
                    "•\t18-20 small    Potatoes peeled                                         \n" +
                    "•\tOil -  for deep-frying\n" +
                    "•\t5-6    Kashmiri red chillies ground                             \n" +
                    "•\t  2 cups  Yogurt                                                           \n" +
                    "•\t1/2 teaspoon   Green cardamom powder                            \n" +
                    "•\t1 teaspoon   Dry ginger powder (soonth)                          \n" +
                    "•\t2 tablespoons   Fennel seed (saunf) powder                         \n" +
                    "•\t1/4 cup   Mustard oil                                                          \n" +
                    "•\tClove powder - a pinch\n" +
                    "•\tAsafoetida  - a pinch\n" +
                    "•\tSalt-  to taste\n" +
                    "•\t1/2 teaspoon   Roasted cumin powder                                       \n" +
                    "•\t1/2 teaspoon   Garam masala powder                                        \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Prick the potatoes all over with the help of a fork. Keep in salted water for fifteen minutes.\n" +
                    "Step 2\n" +
                    "Drain and wipe dry.\n" +
                    "Step 3\n" +
                    "Heat sufficient oil in a kadai and deep-fry the potatoes on medium heat till golden brown.\n" +
                    "Step 4\n" +
                    "Drain on absorbent paper and set aside. Whisk the yogurt with Kashmiri red chilli paste, green cardamom powder, dry ginger powder and fennel powder. Heat the mustard oil in a pan.\n" +
                    "Step 5\n" +
                    "Add the clove powder and asafoetida. Add half a cup of water and salt to taste and bring the mixture to a boil.\n" +
                    "Step 6\n" +
                    "Stir in the yogurt mixture and bring the mixtuer to a boil.\n" +
                    "Step 7\n" +
                    "Add the fried potatoes and cook till the potatoes absorb the gravy and the oil surfaces. Serve hot, garnished with roasted cumin powder and garam masala powder.\n" +
                    "Step 8\n" +
                    "Serve hot, garnished with roasted cumin powder and garam masala powder.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "6Y-dJjiRDmI";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 14:
            {rb = new RecipeBean(R.drawable.indian_15,"Mushroom Curry",R.drawable.indian_15," " +
                    "Ingredients\n" +
                    "•\t20  Button mushrooms halved                                 \n" +
                    "•\t4 tablespoons   Oil                                                               \n" +
                    "•\t2 Stick    Cinnamon                                                     \n" +
                    "•\t  3    Cloves                                                             \n" +
                    "•\t  4     Green cardamoms                                          \n" +
                    "•\t3 medium    Onions, sliced                                          \n" +
                    "•\tSalt  - to taste\n" +
                    "•\t1 teaspoon  Ginger paste                                    \n" +
                    "•\t1 teaspoon   Garlic paste                                       \n" +
                    "•\t1 large   Tomato sliced                                      \n" +
                    "•\t1 tablespoon   Kashmiri red chilli powder           \n" +
                    "•\t1/2 teaspoon   Turmeric powder                         \n" +
                    "•\t2 teaspoons   Kasoori methi                                   \n" +
                    "•\tSalt  - to taste      \n" +
                    "•\t3 tablespoons   Cashewnut paste                           \n" +
                    "•\t1/2 teaspoon   Sugar                                                \n" +
                    "•\t1/4 cup   Fresh cream                                        \n" +
                    "•\t1 tablespoon   Butter                                               \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Heat three tablespoons oil in a non stick pan. Add cinnamon, cloves and cardamoms. Sauté for half minute.\n" +
                    "Step 2\n" +
                    "Add onions, salt and sauté till onions are soft. Add ginger paste, garlic paste and sauté for two minutes.\n" +
                    "Step 3\n" +
                    "Add tomato, turmeric powder, chilli powder, kasuri methi. Mix well and cook on medium heat for eight to ten minutes.\n" +
                    "Step 4\n" +
                    "Allow to cool and grind to a fine paste with sufficient water.\n" +
                    "Step 5\n" +
                    "Heat remaining oil in a non stick pan.\n" +
                    "Step 6\n" +
                    "Add the mushrooms, salt and cook on high heat till the moisture evaporates and mushrooms are cooked.\n" +
                    "Step 7\n" +
                    "Add the masala paste and half cup water. Mix well.\n" +
                    "Step 8\n" +
                    "Add cashew nut paste, sugar and mix. Cook on low heat for five minutes.\n" +
                    "Step 9\n" +
                    "Add fresh cream, butter and mix well. Serve hot.\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "-FIXJE9Jacw";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 15:
            {rb = new RecipeBean(R.drawable.indian_16,"Egg Curry",R.drawable.indian_16," " +
                    "Ingredients\n" +
                    "•\t8   Eggs boiled and peeled                           \n" +
                    "•\t4 tablespoons   Oil                                                    \n" +
                    "•\t1 inch piece   Ginger                                              \n" +
                    "•\t4 cloves    Garlic                                                 \n" +
                    "•\t2 medium   Onions                                              \n" +
                    "•\t7-8   Cloves                                                \n" +
                    "•\t10-12  Black peppercorns                            \n" +
                    "•\t1 medium   Tomato                                           \n" +
                    "•\t4  Dried red chillies                                      \n" +
                    "•\t1/2 teaspoon   Turmeric powder                            \n" +
                    "•\t1 teaspoon    Poppy seeds (khuskhus/posto)       \n" +
                    "•\t2 tablespoons   Coconut scraped                          \n" +
                    "•\tSalt -    to taste\n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Heat 2 tbsps oil in a non stick pan. Slice ginger, crush garlic and slice onions.\n" +
                    "Step 2\n" +
                    "Add cloves, peppercorns and onions to the oil. Add ginger and garlic and sauté.Roughly chop tomato.\n" +
                    "Step 3\n" +
                    "Add red chillies to the pan along with turmeric powder, poppy seeds, coconut and sauté. Add tomato and continue to sauté till fragrant.\n" +
                    "Step 4\n" +
                    "Cool and grind to a smooth paste with a little water. Heat 2 tbsps oil in another non stick pan, add eggs and stir till the eggs get lightly browned and glazed.\n" +
                    "Step 5\n" +
                    "Add the ground masala to the first pan along with ½ cup water and mix.\n" +
                    "Step 6\n" +
                    "Pour ½ cup water in the mixer jar, rinse and pour into the pan with the masala and mix well.\n" +
                    "Step 7\n" +
                    "Add eggs and salt and mix. Cover and simmer over low heat for a few minutes.\n" +
                    "Step 8\n" +
                    "Serve hot.\n",R.drawable.non_veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "jkHfCV8TdGk";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 16:
            {rb = new RecipeBean(R.drawable.indian_17,"Goan Fish Curry",R.drawable.indian_17," " +
                    "Ingredients\n" +
                    "•\t2 (400 gms)     Pomfret cut into 6 pieces each                 \n" +
                    "•\t1 small   Onion chopped                                          \n" +
                    "•\t2  Green chillies slit and halved                      \n" +
                    "•\tSalt -  to taste\n" +
                    "•\t1 tablespoon   Malt vinegar                                            \n" +
                    " For paste \n" +
                    "•\t2 teaspoon   Cumin seeds                                            \n" +
                    "•\t2 tablespoons  Coriander seeds                                       \n" +
                    "•\t6  Dried red chillies                                          \n" +
                    "•\t1/2 cup   Coconut scraped                                       \n" +
                    "•\t2 inch piece   Ginger roughly chopped                          \n" +
                    "•\t15 cloves   Garlic roughly chopped                               \n" +
                    "•\t1 lemon size ball   Tamarind (seedless)                            \n" +
                    "\n" +
                    "Method\n" +
                    "Step 1\n" +
                    "Dry roast cumin seeds, coriander seeds and whole red chillies. Make a fine paste of all the roasted spices along with scraped coconut, ginger, garlic and tamarind with a little water. Apply half of the ground paste to fish. Heat a non-stick pan. Add onions and roast till light brown.\n" +
                    "Step 2\n" +
                    "Add green chillies and cook on medium heat for three minutes. Stir constantly. Add the remaining paste and stir well. Roast for three minutes, on low heat, till a pleasant aroma is given out. Add one and a half cups of water.\n" +
                    "Step 3\n" +
                    "Bring to a boil and then add the marinated fish pieces and salt. Cook on low heat for about five minutes or till " +
                    "fish is just done. Stir in vinegar and serve hot with steamed rice.\n",R.drawable.non_veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "YTRXoPMeito";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;
            case 17:
            {rb = new RecipeBean(R.drawable.indian_18,"Paneer Tikka Masala",R.drawable.indian_18," " +
                    "Ingredients\n" +
                    "•\t500 grams       Paneer (cottage cheese),cut into 1-inch cubes           \n" +
                    "•\t 2 medium     Green capsicums,cut into 1 inch pieces                    \n" +
                    "•\t4 medium   Oil                                                                                \n" +
                    "•\t1 tablespoon   Butter                                                                          \n" +
                    "Marinade \n" +
                    "•\t1 cup    Yogurt,drained                                                              \n" +
                    "•\t1 tablespoon  Ginger paste                                                                \n" +
                    "•\t1 tablespoon  Garlic paste                                                                  \n" +
                    "•\t2 teaspoons  Kashmiri red chilli powder                                           \n" +
                    "•\t1 teaspoon   Garam masala powder                                                  \n" +
                    "•\t2 tablespoons  Lemon juice                                                                \n" +
                    "•\tSalt - to taste\n" +
                    "•\t2 tablespoons  Mustard oil                                                                \n" +
                    "•\t1 tablespoon  Onion tomato masala                                                 \n" +
                    "•\t2-3 tablespoons  Oil                                                                             \n" +
                    "•\t1 teaspoon  Cumin seeds                                                                \n" +
                    "•\t4 medium    Onions                                                                           \n" +
                    "•\t7-8 cloves   Garlic,chopped                                                              \n" +
                    "•\t1 teaspoon   Ginger paste                                                                         \n" +
                    "•\t1 teaspoon   Garlic paste                                                                           \n" +
                    "•\t3 large  Tomatoes,chopped                                                                \n" +
                    "•\tSalt - to taste\n" +
                    "•\t1/4 cup  Tomato puree                                                                         \n" +
                    "•\t1 1/2 tablespoons   Red chilli powder                                                             \n" +
                    "•\t1/4 teaspoon  Turmeric powder                                                                \n" +
                    "•\t1 teaspoon   Coriander powder                                                                 \n" +
                    "•\t1 teaspoon  Cumin powder                                                                       \n" +
                    "•\tFresh coriander leaves  - chopped                     \n" +
                    "•\tKasoori methi   - crushed \n" +
                    "•\t1 teaspoon    Garam masala powder                                                         \n" +
                    "•\t1/4 cup   Cream                                                                                     \n" +
                    "Method\n" +
                    "Step 1\n" +
                    "To make the tikkas combine all the ingredients for the marinade and whisk well.\n" +
                    "Step 2\n" +
                    "Dip paneer cubes in the marinade and set aside to marinate for half an hour, preferably in the refrigerator.\n" +
                    "Step 3\n" +
                    "Thread the marinated paneer cubes onto skewers. Heat oil on a tawa and place the skewers on it.\n" +
                    "Step 4\n" +
                    "Cook turning the skewers a few times, so that the paneer browns evenly on all sides. Take the paneer cubes off the skewers, place on a plate and set aside.\n" +
                    "Step 5\n" +
                    "For the onion-tomato masala, heat the oil in a pan. Add cumin seeds and when they begin to change colour, add onions and sauté till well browned.\n" +
                    "Step 6\n" +
                    "Add garlic and sauté till lightly browned. Add ginger paste and garlic paste and continue to sauté for another minute.\n" +
                    "Step 7\n" +
                    "Add tomatoes and salt and cook, covered over low heat till the tomatoes are soft and pulpy.\n" +
                    "Step 8\n" +
                    "Add tomato purée, red chilli powder, turmeric powder, coriander powder, cumin powder and half a cup of water and cook, covered, over medium heat for three to four minutes, or till the oil separates.\n" +
                    "Step 9\n" +
                    "Stir in the coriander leaves, kasoori methi, garam masala powder and cream. Cook for another two minutes.\n" +
                    "Step 10\n" +
                    "Add paneer tikka and capsicum, stir gently and serve with a dollop of butter on top.\n" +
                    "\n",R.drawable.veg);
                Intent i = new Intent(Indian_Recipes.this,AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe,rb);

                String videoId = "tgektRnOz9E";
                i.putExtra("VideoID", videoId);

                startActivity(i);}
            break;

        }
    }

};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_indian__recipes, menu);
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
