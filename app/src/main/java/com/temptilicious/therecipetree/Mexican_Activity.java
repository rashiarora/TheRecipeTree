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


public class Mexican_Activity extends ActionBarActivity {

    ListView myLV;
    ArrayList<ListBean> myList;
    MyArrayAdapter adapter;
    RecipeBean rb;

    void initList(){
        myList = new ArrayList<ListBean>();
        myList.add(new ListBean(R.drawable.m1,R.drawable.veg,"Bean Nachos" ));
        myList.add(new ListBean(R.drawable.m2,R.drawable.non_veg,"Meat Balls"));
        myList.add(new ListBean(R.drawable.m3,R.drawable.non_veg,"Tortilla Pie"));
        //myList.add(new ListBean("Margarita",R.drawable.dessert_recipe4));
        myList.add(new ListBean(R.drawable.m5,R.drawable.veg,"Bean Chilly"));
        myList.add(new ListBean(R.drawable.m6,R.drawable.non_veg,"Beaf and Chicken Fajitas"));
        myList.add(new ListBean(R.drawable.m7,R.drawable.non_veg,"Beaf Quesadilla"));
        myList.add(new ListBean(R.drawable.m8,R.drawable.non_veg,"Chicken Nachos Salad"));
        myList.add(new ListBean(R.drawable.m9,R.drawable.veg,"Mexican Pasta"));
        myList.add(new ListBean(R.drawable.m10,R.drawable.veg,"Spinach Enchiladas"));
        myList.add(new ListBean(R.drawable.m11,R.drawable.veg,"Burritos"));
        myList.add(new ListBean(R.drawable.m12,R.drawable.non_veg,"Chorizo Hash"));
        myList.add(new ListBean(R.drawable.m13,R.drawable.non_veg,"Pork Chop"));
        myList.add(new ListBean(R.drawable.m14,R.drawable.non_veg,"Acapulco Enchildas"));
        myList.add(new ListBean(R.drawable.m15,R.drawable.non_veg,"Salbutes"));
        myList.add(new ListBean(R.drawable.m16,R.drawable.non_veg,"Chicken and Rice"));
        myList.add(new ListBean(R.drawable.m17,R.drawable.veg,"Cheese Quesadilas"));
        myList.add(new ListBean(R.drawable.m18,R.drawable.non_veg,"Rancheros"));
        myList.add(new ListBean(R.drawable.m19,R.drawable.non_veg,"Tamale Potpie"));


        adapter= new MyArrayAdapter(this,R.layout.list_item,myList);
        myLV.setAdapter(adapter);
        myLV.setOnItemClickListener(clickListener);
        rb = new RecipeBean();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexican_);
        myLV = (ListView)findViewById(R.id.listViewMexican);
        initList();
    }

AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0: {
                rb = new RecipeBean(R.drawable.m1, "BEAN NACHOS", R.drawable.m1, " " +"\n Ingredients  \n"+
                        "1 tablespoon oil \n" +
                        "•\t 1 large brown onion, finely chopped \n" +
                        "•\t 1 small red capsicum, diced \n" +
                        "•\t 1 small green capsicum, diced \n" +
                        "•\t 2 cobs of corn, kernels removed \n" +
                        "•\t 400g can diced tomatoes in juice \n" +
                        "•\t 420g can four-bean mix, rinsed and drained \n" +
                        "•\t 1/2 teaspoon Tabasco sauce \n" +
                        "•\t 1 x 220g packet light corn chips \n" +
                        "•\t 1 cup reduced-fat grated tasty cheese \n" +
                        "•\t 1/2 avocado, peeled, cored (see Notes) \n" +
                        "•\t 2 tablespoons lemon juice \n" +
                        "          METHOD\n" +
                        "•\t•  Heat oil in a large heavy-based frying pan over medium-high heat. Add onion and cook, stirring, for 2 to 3 minutes or until onion is tender.\n" +
                        "•\t•  Step 2 \n" +
                        "•\tAdd red and green capsicum, corn kernels, tomatoes, beans and Tabasco. Season with salt and pepper. Bring to the boil. Reduce heat to medium and simmer for 20 to 25 minutes, or until vegetables are tender and beans are heated through.\n" +
                        "•\t•  Step 3 \n" +
                        "•\tPreheat oven to 200°C. Arrange corn chips on heatproof serving plates. Sprinkle with half of the cheese. Spoon over bean mixture. Sprinkle with remaining cheese. Bake for 10 minutes or until corn chips are crisp and cheese is melted.\n" +
                        "•\t•  Step 4 \n" +
                        "•\tPlace avocado into a bowl. Add lemon juice and mash. Dollop over dish and serve.\n" +
                        "\n",R.drawable.veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "0TxZi7vYcDU";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 1: {
                rb = new RecipeBean(R.drawable.m2, "MEATBALLS", R.drawable.m2, " " +"\n Ingredients  \n"+
                        "750g turkey or chicken mince \n" +
                        "•\t 1 small brown onion, grated \n" +
                        "•\t 35g packet salt-reduced taco seasoning mix \n" +
                        "•\t 1 cup fresh white breadcrumbs \n" +
                        "•\t 1/2 cup coriander leaves, finely chopped \n" +
                        "•\t olive oil cooking spray \n" +
                        "•\t corn chips, to serve \n" +
                        "•\tTomato salsa\n" +
                        "•\t 2 tomatoes, seeds removed, diced \n" +
                        "•\t 1 avocado, diced \n" +
                        "•\t 310g can corn kernels, drained \n" +
                        "•\t 1/2 cup coriander leaves, chopped \n" +
                        "•\t 1 lime, juiced \n" +
                        "               METHOD\n" +
                        "•\t•  Preheat oven to 200°C. Line a large baking tray with baking paper.\n" +
                        "•\t•  Step 2 \n" +
                        "•\tMake tomato salsa: Combine tomato, avocado, corn kernels, coriander and 2 tablespoons lime juice in a bowl. Season with salt and pepper. Cover and refrigerate until ready to serve.\n" +
                        "•\t•  Step 3 \n" +
                        "•\tCombine mince, onion, taco seasoning mix, breadcrumbs and coriander in a large bowl. Mix well. Roll tablespoonfuls of mixture into balls. Place on baking tray. Spray with oil. Bake for 20 minutes or until cooked through. Serve with tomato salsa and corn chips.\n" +
                        "\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "xEIHMVQv4ww";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 2: {
                rb = new RecipeBean(R.drawable.m3, "TORTILLA PIE", R.drawable.m3, " " +"\n Ingredients  \n"+
                        "2 teaspoons olive oil \n" +
                        "•\t 1 large red onion, finely chopped \n" +
                        "•\t 2 garlic cloves, crushed \n" +
                        "•\t 500g beef mince \n" +
                        "•\t 1 small red capsicum, finely chopped \n" +
                        "•\t 125g can corn kernels, drained, rinsed \n" +
                        "•\t 2 teaspoons Mexican chilli powder \n" +
                        "•\t 415g can diced tomatoes \n" +
                        "•\t 1/2 cup torn fresh coriander leaves \n" +
                        "•\t 4 salsa-flavoured tortillas \n" +
                        "•\t 1 1/2 cups grated tasty cheese \n" +
                        "•\t 1 large tomato, deseeded, finely chopped \n" +
                        "•\t•  Preheat oven to 180°C. Heat oil in a frying pan over medium-high heat. Reserve 2 tablespoons onion. Add garlic and remaining onion to pan. Cook, stirring, for 3 minutes or until soft. Add mince. Cook, breaking up mince with a wooden spoon, for 8 minutes or until browned.\n" +
                        "•\t•  Step 2 \n" +
                        "•\tAdd capsicum, corn and chilli powder. Cook, stirring, for 3 minutes or until capsicum is just tender. Stir in diced tomatoes. Reduce heat to medium. Simmer, stirring, for 5 minutes or until mixture is thick. Add half the coriander. Season with salt. Stir to combine. Set aside for 10 minutes to cool.\n" +
                        "•\t•  Step 3 \n" +
                        "•\tPlace a 6cm-deep, 20cm round springform pan on a baking tray. Place 1 tortilla in base of pan. Spread one-third of the mince mixture over tortilla. Sprinkle with 1/3 cup of cheese. Repeat layers twice with remaining tortillas, mince mixture and cheese, finishing with 1 tortilla. Sprinkle with remaining cheese.\n" +
                        "•\t•  Step 4 \n" +
                        "•\tBake for 15 minutes or until cheese is golden. Set aside for 5 minutes before removing from pan.\n" +
                        "•\t•  Step 5 \n" +
                        "•\tMeanwhile, combine chopped tomato, reserved onion and coriander in a bowl. " +
                        "Serve pie with tomato mixture.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "6KB3FYKE-g4";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 3: {
                rb = new RecipeBean(R.drawable.m5, "BEAN CHILLI", R.drawable.m5, " " +"\n Ingredients  \n"+
                        "2 tablespoons extra virgin olive oil \n" +
                        "•\t 1 onion, chopped \n" +
                        "•\t 2 cloves garlic, crushed \n" +
                        "•\t 1 red capsicum, chopped \n" +
                        "•\t 1 teaspoon Cajun seasoning \n" +
                        "•\t 1 small fresh red chilli, chopped \n" +
                        "•\t 400g can Coles Brand 4 Bean Mix \n" +
                        "•\t 420g can Mexican chilli beans \n" +
                        "•\t 400g can Coles Brand Italian Diced Tomatoes \n" +
                        "•\t 2 tablespoons flat-leaf parsley, chopped \n" +
                        "•\t 450g packet microwave white rice \n" +
                        "•\t 1/4 cup natural yoghurt \n" +
                        "•\t•  Heat the oil in a large saucepan over medium heat. Add the onion and cook for 4-5 mins or until soft.\n" +
                        "•\t•  Step 2 \n" +
                        "•\tAdd the garlic to the pan and cook for 30 secs. Add the capsicum, Cajun seasoning, chilli, 4 bean mix, Mexican chilli beans and tomatoes and cook for 8-10 mins or until thickened. Stir in the parsley.\n" +
                        "•\t•  Step 3 \n" +
                        "•\tMeanwhile, cook the rice following packet directions.\n" +
                        "•\t•  Step 4 \n" +
                        "•\tServe the chilli with the rice and yoghurt.\n",R.drawable.veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "dk5Dcy2CsxA";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 4: {
                rb = new RecipeBean(R.drawable.m6, "beef and chicken fajitas", R.drawable.m6, " " + "\n Ingredients \n"+
                        "2 beef porterhouse steaks, cut into strips \n" +
                        "•\t 35g pkt salt-reduced taco seasoning \n" +
                        "•\t 2 single chicken breast fillets, cut into strips \n" +
                        "•\t 2 tablespoons olive oil \n" +
                        "•\t 1 red onion, halved, cut into thin wedges \n" +
                        "•\t 1 large red capsicum, halved, seeded, thinly sliced \n" +
                        "•\t 1 large yellow capsicum, halved, seeded, thinly sliced \n" +
                        "•\t 18 mini flour tortillas \n" +
                        "•\t 1/2 cup fresh coriander leaves \n" +
                        "•\t Reduced-fat sour cream, to serve \n" +
                        "•\t 80g (1 cup) coarsely grated cheddar \n" +
                        "\n" +
                        "•\tPlace the beef in a bowl. Add half the seasoning and toss to coat. Toss the chicken and remaining seasoning in a separate bowl.\n" +
                        "•\tStep 2 \n" +
                        "•\tHeat half the oil in a large frying pan over medium-high heat. Cook beef, stirring, for 4-5 minutes or until browned. Transfer to a bowl. Add chicken to pan. Cook, stirring, for 5 minutes or until cooked through.\n" +
                        "•\tStep 3 \n" +
                        "•\tHeat the remaining oil in the pan. Cook the onion and combined capsicum, stirring, for 4 minutes or until soft. Return the beef and chicken to the pan and cook for 2 minutes or until heated through.\n" +
                        "•\tStep 4 \n" +
                        "•\tHeat tortillas following packet directions.\n" +
                        "•\tStep 5 \n" +
                        "•\tStir coriander into beef mixture. Place some fajita filling on a tortilla. Top with sour cream and cheddar. " +
                        "Wrap to enclose.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "LqYrW0rJSOY";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 5: {
                rb = new RecipeBean(R.drawable.m7, "beef quesadilla", R.drawable.m7, " " +
                        "1 tablespoon olive oil \n" +
                        "•\t 5 green onions, sliced \n" +
                        "•\t 500g beef mince \n" +
                        "•\t 2 garlic cloves, crushed \n" +
                        "•\t 2 teaspoons ground cumin \n" +
                        "•\t 2 tablespoons tomato paste \n" +
                        "•\t 1/3 cup Campbell's Real Stock Beef \n" +
                        "•\t 400g can red kidney beans, drained, rinsed \n" +
                        "•\t olive oil cooking spray \n" +
                        "•\t 8 flour tortillas \n" +
                        "•\t 1 cup grated cheddar cheese \n" +
                        "•\t tomato salsa and sour cream, to serve \n" +
                        "•\t•  Heat oil in a non-stick saucepan over medium heat. Add onions. Cook, stirring, for 1 to 2 minutes or until soft. Increase heat to high. Add mince. Cook, stirring with a wooden spoon to break up mince, for 5 minutes or until browned. Add garlic, cumin and tomato paste. Cook, stirring, for 1 minute or until fragrant.\n" +
                        "•\t•  Step 2 \n" +
                        "•\tAdd stock and beans. Simmer for 3 to 5 minutes or until beans heat through and mixture reduces and thickens slightly.\n" +
                        "•\t•  Step 3 \n" +
                        "•\tPreheat oven to 180°C. Heat a large, non-stick frying pan over medium heat. Spray pan with oil. Place 1 tortilla in pan. Spoon a quarter of meat mixture over tortilla. Sprinkle with a quarter of cheese. Top with another tortilla. Spray top with oil. Cook for 1 to 2 minutes or until base is golden. Place a plate over frying pan and turn out quesadilla. Slide quesadilla, uncooked side down, back into pan. Cook for 1 to 2 minutes or until golden. Transfer to a baking tray and keep warm in oven. Repeat with remaining tortillas, mince and cheese.\n" +
                        "•\t•  Step 4 \n" +
                        "•\tPlace quesadillas on plates. Cut into quarters. Top with salsa and cream. " +
                        "Serve.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "1P3Bsxr88wQ";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 6: {
                rb = new RecipeBean(R.drawable.m8, "CHICKEN NACHOS SALAD", R.drawable.m8, " " +  "\n Ingredients \n"+
                        "250g light sour cream \n" +
                        "•\t 1 large barbecue chicken \n" +
                        "•\t 230g packet corn chips \n" +
                        "•\t 1 avocado, diced \n" +
                        "•\t 1 cup enchilada sauce \n" +
                        "•\t 1 cup small fresh coriander sprigs \n" +
                        "          METHOD\n" +
                        "•\t•  Place sour cream and 2 tablespoons warm water in a small bowl. Stir until smooth and combined.\n" +
                        "•\t•  Step 2 \n" +
                        "•\tMeanwhile, remove and discard skin and bones from chicken. Thickly shred chicken.\n" +
                        "•\t•  Step 3 \n" +
                        "•\tPlace a layer of corn chips on a serving platter or dish. Arrange 1/3 of chicken, sour cream mixture, avocado, " +
                        "sauce and a few coriander sprigs on platter. Repeat layering with remaining ingredients and " +
                        "finishing with coriander sprigs. Serve.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "0squeKWfaKM";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 7: {
                rb = new RecipeBean(R.drawable.m9, "mexican pasta", R.drawable.m9, " " +"\n Ingredients \n"+
                        "•\t1/2 pound seashell pasta \n" +
                        "•\t \n" +
                        "•\t2 tablespoons olive oil \n" +
                        "•\t \n" +
                        "•\t2 onions, chopped \n" +
                        "•\t \n" +
                        "•\t1 green bell pepper, chopped \n" +
                        "•\t \n" +
                        "•\t1/2 cup sweet corn kernels \n" +
                        "•\t \n" +
                        "•\t1 (15 ounce) can black beans, drained \n" +
                        "•\t \n" +
                        "•\t1 (14.5 ounce) can peeled and diced tomatoes \n" +
                        "•\t \n" +
                        "•\t1/4 cup salsa \n" +
                        "•\t \n" +
                        "•\t1/4 cup sliced black olives \n" +
                        "•\t \n" +
                        "•\t1 1/2 tablespoons taco seasoning mix \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tBring a large pot of lightly salted water to a boil. Add pasta and cook for 8 to 10 minutes or until al dente; drain.\n" +
                        "•\tWhile pasta is cooking, heat olive oil over medium heat in a large skillet. Cook onions and pepper in oil until lightly browned, 10 minutes. Stir in corn and heat through. Stir in black beans, tomatoes, salsa, olives, taco seasoning and salt and pepper and cook until thoroughly heated, 5 minutes.\n" +
                        "•\tToss sauce with cooked pasta and serve.\n",R.drawable.veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "oFGIZZxnaUs";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 8: {
                rb = new RecipeBean(R.drawable.m10, "spinach enchiladas", R.drawable.m10, " " +
                        "Ingredients\n" +
                        "•\t1 tablespoon butter \n" +
                        "•\t \n" +
                        "•\t1/2 cup sliced green onions \n" +
                        "•\t \n" +
                        "•\t2 cloves garlic, minced \n" +
                        "•\t \n" +
                        "•\t1 (10 ounce) package frozen chopped spinach , thawed, drained and squeezed dry \n" +
                        "•\t \n" +
                        "•\t1 cup ricotta cheese \n" +
                        "•\t \n" +
                        "•\t1/2 cup sour cream \n" +
                        "•\t \n" +
                        "•\t2 cups shredded Monterey Jack cheese \n" +
                        "•\t \n" +
                        "•\t10 (6 inch) corn tortillas \n" +
                        "•\t \n" +
                        "•\t1 (19 ounce) can enchilada sauce \n" +
                        "•\tMETHOD\n" +
                        "•\tPreheat the oven to 375 degrees F (190 degrees C).\n" +
                        "•\tMelt butter in a saucepan over medium heat. Add garlic and onion; cook for a few minutes until fragrant, but not brown. Stir in spinach, and cook for about 5 more minutes. Remove from the heat, and mix in ricotta cheese, sour cream, and 1 cup of Monterey Jack cheese.\n" +
                        "•\tIn a skillet over medium heat, warm tortillas one at a time until flexible, about 15 seconds. Spoon about 1/4 cup of the spinach mixture onto the center of each tortilla. Roll up, and place seam side down in a 9x13 inch baking dish. Pour enchilada sauce over the top, and sprinkle with the remaining cup of Monterey Jack.\n" +
                        "•\tBake for 15 to 20 minutes in the preheated oven, until sauce is bubbling and cheese is lightly " +
                        "browned at the edges.\n",R.drawable.veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "tGhrrP-7mJg";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 9: {
                rb = new RecipeBean(R.drawable.m11, "BURRITOS", R.drawable.m11, " " + "\n Ingredients \n"+
                        "\n" +
                        "•\t4 potatoes, peeled and chopped \n" +
                        "•\t \n" +
                        "•\t1 cup shredded Colby-Monterey Jack cheese \n" +
                        "•\t \n" +
                        "•\t2 teaspoons chili powder \n" +
                        "•\t \n" +
                        "•\t1 teaspoon ground cumin \n" +
                        "•\t \n" +
                        "•\t1 clove garlic, minced \n" +
                        "•\t \n" +
                        "•\tsalt and pepper to taste \n" +
                        "•\t \n" +
                        "•\t8 (6 inch) flour tortillas \n" +
                        "•\t \n" +
                        "•\t1/2 cup red enchilada sauce \n" +
                        "•\tMETHOD\n" +
                        "•\tBring a large pot of salted water to a boil. Add potatoes, and cook until tender but still firm, about 15 minutes. Drain, cool and mash.\n" +
                        "•\tPreheat oven to 350 degrees F (175 degrees C).\n" +
                        "•\tIn a medium mixing bowl, combine mashed potatoes, 3/4 cup cheese, chili powder, cumin, garlic, salt and pepper. Spoon evenly into tortillas, and roll up. Place rolled tortillas side by side in a 8x8 inch baking pan. Spread enchilada sauce evenly over the top, and sprinkle with remaining cheese.\n" +
                        "•\tBake in the preheated oven 15 minutes, or until cheese is bubbly.\n",R.drawable.veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "b3Ie-p84zNc";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 10: {
                rb = new RecipeBean(R.drawable.m12, "chorizo hash ", R.drawable.m12, " " +
                        "Ingredients\n" +
                        "•\t2 ounces raw Mexican chorizo \n" +
                        "•\t1 cup prechopped onion $\n" +
                        "•\t1/4 cup coarsely chopped bottled roasted red bell peppers \n" +
                        "•\t1/2 teaspoon kosher salt \n" +
                        "•\t1/2 teaspoon freshly ground black pepper \n" +
                        "•\t1 (6-ounce) package baby spinach \n" +
                        "•\t2 teaspoons olive oil \n" +
                        "•\t2 1/2 cups refrigerated shredded hash brown potatoes (such as Simply Potatoes) $\n" +
                        "•\t4 large eggs $\n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tHeat a large skillet over medium-high heat. Add chorizo to pan; cook 3 minutes or until browned, stirring to crumble. Add onion, bell peppers, salt, and black pepper; cook 3 minutes, stirring occasionally. Add spinach; stir until spinach wilts. Remove sausage mixture from pan. Add oil to pan; swirl to coat. Add potatoes; cook 8 minutes or until bottom is crisp. Stir in sausage mixture." +
                        " Make 4 egg-size spaces in pan with a spoon. Crack 1 egg into each space. Cover and cook 4 minutes or until egg " +
                        "yolks are slightly set.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "N7gm4ocnRoY";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 11: {
                rb = new RecipeBean(R.drawable.m13, "pork chop", R.drawable.m13, " " +
                        "\n" +
                        "Ingredients\n" +
                        "•\t1 tablespoon brown sugar \n" +
                        "•\t1 teaspoon smoked paprika \n" +
                        "•\t1 teaspoon ground cumin \n" +
                        "•\t1 teaspoon unsweetened cocoa powder \n" +
                        "•\t1 teaspoon ground chipotle chile peppers \n" +
                        "•\t1/2 teaspoon salt \n" +
                        "•\t4 (6-ounce) bone-in center-cut pork chops (about 1/2 inch thick) $\n" +
                        "•\tCooking spray $\n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tPreparation\n" +
                        "•\tHeat a grill pan over medium heat.\n" +
                        "•\tCombine first 6 ingredients; rub evenly over both sides of pork. Lightly coat pork with cooking spray." +
                        " Place pork on grill pan; cover and grill 3 minutes on each side or until done. " +
                        "Let stand 3 minutes.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "ftTR_3KRCeI";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 12: {
                rb = new RecipeBean(R.drawable.m14, "ACAPULCO  ENCHILADAS", R.drawable.m14, " " +
                        "Ingredients\n" +
                        "•\t2 cups diced cooked chicken or turkey $\n" +
                        "•\t1/2 cup chopped ripe olives \n" +
                        "•\t1 cup slivered or coarsely chopped almonds \n" +
                        "•\t3 cups Mexican Enchilada Sauce \n" +
                        "•\t12 corn tortillas (7-inch) \n" +
                        "•\tVegetable oil for frying $\n" +
                        "•\t1 1/2 cups shredded sharp cheddar cheese $\n" +
                        "•\t1 cup sour cream $\n" +
                        "•\t2 tablespoons minced green onions \n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tPreparation\n" +
                        "•\tCombine chicken, olives, almonds, and enough of the enchilada sauce to moisten (about 1/3 cup).\n" +
                        "•\tUse tongs to dip the tortillas into medium-hot oil. Fry tortillas just a few seconds, until they bubble and are limp--do not fry crisp.\n" +
                        "•\tDip fried tortilla into heated enchilada sauce as soon as it comes out of the hot fat. A cake pan just larger than the tortilla is an ideal utensil.\n" +
                        "•\tLay sauce-dipped tortilla out on a board or pan. (This part of enchilada making is admittedly slightly messy, but well worth the trouble.) Generously spoon the chicken filling in the center of the tortilla.\n" +
                        "•\tTurn tortilla over the filling, roll, and place (with the flap pointing down) in baking pan. Fry, dip, fill, and roll remaining tortillas. Ladle additional enchilada sauce over enchiladas and top with cheddar. Place enchiladas " +
                        "in a moderate oven (350°) for 15 to 20 minutes--or until thoroughly heated. " +
                        "Mix cold sour cream with onions and serve as a sauce.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "9W3fA8Fck9k";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 13: {
                rb = new RecipeBean(R.drawable.m15, "SALBUTES", R.drawable.m15, " " +
                        "Ingredients\n" +
                        "•\t1 red onion, halved and thinly sliced \n" +
                        "•\t1 cup distilled white vinegar \n" +
                        "•\t1 teaspoon salt $\n" +
                        "•\t1/4 teaspoon freshly ground black pepper \n" +
                        "•\tVegetable oil for frying $\n" +
                        "•\t8 corn tortillas (4 in. or 6 in.) \n" +
                        "•\t3 tablespoons olive oil $\n" +
                        "•\t1 medium white or yellow onion, halved and thinly sliced $\n" +
                        "•\t1/2 teaspoon oregano \n" +
                        "•\t2 cups shredded cooked turkey \n" +
                        "•\t1 cup chicken broth \n" +
                        "•\t2 serrano chiles, seeded and minced \n" +
                        "•\t2 tablespoons lime juice \n" +
                        "•\t1 tablespoon orange juice $\n" +
                        "•\t1 avocado, sliced $\n" +
                        "•\tAbout 1 1/2 cups shredded green and/or red cabbage \n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tIn a small pan over high heat, cover red onion with cold water and bring to a boil. Remove from heat and drain. Put red onion in a small bowl with vinegar, 1/2 tsp. salt, and pepper. Set aside to marinate at least 30 minutes at room temperature or up to 1 week covered and refrigerated.\n" +
                        "•\tTo a small frying pan over high heat, add 1 in. of vegetable oil and heat to 375°. Fry tortillas, one at a time, until golden and crispy. Drain on paper towels.\n" +
                        "•\tHeat olive oil in a large frying pan over high heat. Add sliced white or yellow onion and 1/4 tsp. salt. Cook, stirring, until onions are soft, about 4 minutes. Add oregano and cook until fragrant, about 1 minute. Add turkey and broth. Bring to a boil, lower heat to a steady simmer, and cook, partially covered, for 10 minutes to let flavors blend.\n" +
                        "•\tMeanwhile, in a small bowl, combine chiles, lime juice, orange juice, and remaining 1/4 tsp. salt. Set aside.\n" +
                        "•\tTo assemble: Divide turkey-onion mixture among the 8 tortillas, then top each with avocado, cabbage, and drained pickled red onion (you will have extra onion; see Notes). " +
                        "Serve with serrano-citrus sauce.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "f5ZIt6ScQ34";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 14: {
                rb = new RecipeBean(R.drawable.m16, "CHICKEN AND RICE", R.drawable.m16, " " +
                        "Ingredients\n" +
                        "•\t8 chicken thighs (about 6 oz. each) $\n" +
                        "•\t1 tablespoon chili powder \n" +
                        "•\tAbout 1 tablespoon vegetable oil $\n" +
                        "•\t1 white onion (8 oz.), peeled and chopped $\n" +
                        "•\t3 cloves garlic, peeled and minced \n" +
                        "•\t2 fresh jalapeño chiles (1 1/2 to 2 oz. total), rinsed, stemmed, and thinly sliced \n" +
                        "•\t1 1/2 cups long-grain white rice $\n" +
                        "•\t2 cups fat-skimmed chicken broth \n" +
                        "•\t1 can (14 oz.) stewed tomatoes $\n" +
                        "•\t1 3/4 cups (9 oz.) frozen corn kernels \n" +
                        "•\t1/3 cup chopped fresh mint leaves \n" +
                        "•\tSalt $\n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tRemove skin from chicken. Trim off and discard excess fat. Rinse chicken and pat dry. Rub chili powder all over pieces.\n" +
                        "•\tSet a 12-inch frying pan with 2-inch-tall sides or a 5- to 6-quart pan over medium-high heat. When hot, add oil and tilt pan to coat bottom. Add chicken in a single layer and turn as needed to brown on both sides, 10 to 12 minutes total (if necessary, brown in two batches, adding 1 more tablespoon oil if needed). Transfer to a plate.\n" +
                        "•\tAdd onion, garlic, and jalapeño chiles to pan; stir often until onion is limp, about 3 minutes. Reduce heat to medium and add rice; stir often until rice is opaque, about 3 minutes. Add broth, tomatoes (including juices), corn, and 1/4 cup mint. Bring to a boil over high heat.\n" +
                        "•\tLay chicken pieces slightly apart in pan. Reduce heat to low, cover pan, and cook until rice is tender to bite and chicken is no longer pink at the bone (cut to test), 25 to 30 minutes. " +
                        "Sprinkle with remaining mint and add salt to taste.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "MkqLRewM5jM";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 15: {
                rb = new RecipeBean(R.drawable.m17, "CHEESE QUESADILLAS", R.drawable.m17, " " +
                        "\n" +
                        "•\t1/2 cup shredded jack cheese \n" +
                        "•\t5 or 6 flour tortillas (8 in. wide) $\n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\t\n" +
                        "•\tPreparation\n" +
                        "•\tSpread about cheese over half of each tortilla; fold bare halves over cheese. Grill over a solid bed of hot coals or high heat on a gas grill (you can hold your hand at grill level for only 2 to 3 seconds), " +
                        "turning once, for 2 minutes total. Cut into wedges.\n",R.drawable.veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "SVuVATGsPB8";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 16: {
                rb = new RecipeBean(R.drawable.m18, "RANCHEROS", R.drawable.m18, " " +
                        "Ingredients\n" +
                        "•\t2 cups store-bought hot red salsa* $\n" +
                        "•\tVegetable oil for frying \n" +
                        "•\t8 smallish corn tortillas (5 to 6 in.) \n" +
                        "•\t8 eggs $\n" +
                        "•\t1 cup coarsely shredded jack cheese, plus extra for sprinkling on beans \n" +
                        "•\t1/4 cup chopped green onions $\n" +
                        "•\t3 tablespoons grated cotija or parmesan cheese $\n" +
                        "•\t2 teaspoons dried Mexican oregano or 2 tbsp. chopped fresh cilantro \n" +
                        "•\t2 cans (15 oz. each) refried beans*, thinned with water if you like and warmed up in the microwave $\n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tPut 4 heavy dinner plates in oven and preheat to 200°. Heat salsa in a small saucepan over low heat, covered.\n" +
                        "•\tFill a large frying pan with 1/2 in. oil and heat over medium heat until the handle of a wooden spoon bubbles when you stand it in the oil. Remove plates from oven. Using tongs, fry each tortilla 2 seconds per side. Drain against side of pan, then overlap 2 tortillas on each warm plate. Pop in oven to keep warm.\n" +
                        "•\tReduce heat to medium low. Cook 4 eggs, gently spooning oil over yolks to set them, 2 minutes for firm whites and runny yolks.\n" +
                        "•\tSpoon about 3 tbsp. warm salsa onto each plate of tortillas. Using a slotted spatula or spoon, transfer 2 eggs to each plate, draining against side of pan first, and top with another 3 tbsp. salsa. Keep warm in oven while frying and plating remaining 4 eggs. (You may have to increase the heat a little for the second batch.)\n" +
                        "•\tSprinkle eggs with jack cheese, then green onions, cotija, and oregano. Spoon beans alongside and top with jack cheese.\n" +
                        "•\t*If you can spend more time cooking, check out our recipes for Salsa Ranchera," +
                        " Chorizo Refried Beans, and Mexican Red Rice.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "mr-it5OJUfM";
                i.putExtra("VideoID", videoId);

                startActivity(i);
            }
            break;
            case 17: {
                rb = new RecipeBean(R.drawable.m19, "TAMALE POTPIE", R.drawable.m19, " " +
                        "Ingredients\n" +
                        "•\tFilling: \n" +
                        "•\tCooking spray $\n" +
                        "•\t1 cup chopped onion $\n" +
                        "•\t3/4 cup chopped red bell pepper $\n" +
                        "•\t4 garlic cloves, minced \n" +
                        "•\t1 pound ground turkey breast $\n" +
                        "•\t1 tablespoon chili powder \n" +
                        "•\t1 teaspoon dried oregano \n" +
                        "•\t1/2 teaspoon salt $\n" +
                        "•\t1 (14.5-ounce) can no-salt-added diced tomatoes, undrained \n" +
                        "•\t1 (15-ounce) can kidney beans, rinsed and drained \n" +
                        "•\tTopping: \n" +
                        "•\t1 cup all-purpose flour (about 4 1/2 ounces) \n" +
                        "•\t3/4 cup yellow cornmeal \n" +
                        "•\t1 teaspoon sugar $\n" +
                        "•\t1 teaspoon baking powder \n" +
                        "•\t1/2 teaspoon salt $\n" +
                        "•\t1/4 teaspoon baking soda \n" +
                        "•\t1 cup low-fat buttermilk \n" +
                        "•\t1 large egg, lightly beaten $\n" +
                        "•\tTry meal plans from Cooking Light Diet! \n" +
                        "\n" +
                        "•\tMETHOD\n" +
                        "•\tPreheat oven to 425°.\n" +
                        "•\tTo prepare filling, heat a large nonstick skillet over medium-high heat. Coat pan with cooking spray. Add onion, bell pepper, garlic, and turkey; cook 5 minutes or until turkey loses its pink color. Add chili powder, oregano, 1/2 teaspoon salt, tomatoes, and beans; cook 3 minutes. Spoon turkey mixture into an 11 x 7-inch baking dish coated with cooking spray.\n" +
                        "•\tTo prepare topping, lightly spoon flour into a dry measuring cup; level with a knife. " +
                        "Combine flour, cornmeal, sugar, baking powder, 1/2 teaspoon salt, and baking soda in a bowl. " +
                        "Combine buttermilk and egg; add to dry ingredients, stirring just until moist. Spread cornmeal mixture " +
                        "evenly over turkey mixture. Bake at 425° for 18 minutes or until topping is golden.\n",R.drawable.non_veg);
                Intent i = new Intent(Mexican_Activity.this, AllRecipesActivity.class);
                i.putExtra(Util.keyRecipe, rb);

                String videoId = "m43C2ZmIaDM";
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
        getMenuInflater().inflate(R.menu.menu_mexican_, menu);
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
