package com.example.ucsdcalorietracker;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String[] DEGREES = new String[]{
            //breakfast
            "Banana Pancakes", "Veggie Egg Scramble Skillet", "Breakfast Hash Plate",
            "Cage Free Scrambled Eggs", "Mini Biscuit", "Scrambled Egg Whites", "Smoked Bacon",
            "Soyrizo Scrambled Eggs", "Tater Barrels", "Turkey Sausage", "Veggie Sausage", "Beans",
            "Fresh Tortillas", "Jalapenos", "Molcajete Green Salsa", "Molcajete Salsa",
            "Cereal with Milk", "Cut Fresh Fruit", "Whole Apple", "Whole Banana", "Whole Orange",
            "Yogurt & Fruit Parfait", "Yogurt Bar", "Steelcut Oatmeal", "Assorted Breakfast Toast",
            "Gluten Friendly Bread", "Country Potatoes",
            //lunch
            "Crispy French Fries", "Crispy Onion Rings", "Fried Chicken Fritters",
            "Sweet Potato Fries", "Cheese Pizza", "Cheeseburger", "Gardein Burger",
            "Grilled Cheese Sandwich", "Grilled Chicken Sandwich",
            "Grilled Eggplant and Hummus Sandwich", "Hamburger", "Hot Dog",
            "Pepperoni & Sausage Pizza", "Jackfruit Tunaless Wrap", "Roast Beef Sub",
            "Turkey & Swiss Super Sub", "Beef and Broccoli", "Crunchy Orange Chicken",
            "Hibachi Chicken", "Tofu with Black Bean & Garlic Sauce", "Steamed Brown Rice",
            "Steamed Rice", "Stir Fry Veg Mix"
    };

    private static final String[] VENTANAS = new String[]{
            //breakfast
            "Beans", "Fresh Tortillas", "Jalapenos", "Molcajete Green Salsa", "Molcajete Salsa",
            "Veggie Egg Scramble Skillet", "Banana Pancakes", "Assorted Breakfast Toast",
            "Cereal with Milk", "Cut Fresh Fruit", "Gluten Friendly Bread", "Whole Apple",
            "Whole Banana", "Whole Orange", "Yogurt & Fruit Parfait", "Yogurt Bar",
            "Blueberry Muffin", "Breakfast Streusel", "Zucchini Breakfast Muffins",
            "Chia Seed Pudding", "Chocolate Chip Muffins", "Doughnut Holes", "Mini Danish",
            "Breakfast Hash Plate", "Cage Free Scrambled Eggs", "Scrambled Egg Whites",
            "Smoked Bacon", "Soyrizo Scrambled Eggs", "Steelcut Oatmeal", "Tater Barrels",
            "Turkey Sausage", "Veggie Sausage", "Buttermilk Pancakes", "Texas French Toast",
            "Mini Biscuit", "Country Potatoes", "Blueberry Pancakes", "Corned Beef Hash and Eggs",
            "Hash Brown Potatoes",
            //lunch
            "Moroccan Chickpea Wrap", "Roast Beef Wrap", "Turkey & Swiss Super Sub",
            "Bread Pudding", "Brownies", "Carrot Cake Cookie", "Chocolate Chip Cookie",
            "Cookie, Sugar", "Double Chocolate Chip Cookie", "Froot Loop Krispy Treats",
            "Green Chile Corn Cornbread", "Lemon Bars", "Oatmeal Raisin Cookie", "Peach Cobbler",
            "Rice Krispy Treats", "Fresh Garden Bar", "Cheeseburger", "Gardein Burger",
            "Grilled Cheese Sandwich", "Grilled Chicken Sandwich", "Hamburger", "Hot Dog",
            "Crispy French Fries", "Crispy Onion Rings", "Fried Chicken Fritters",
            "Sweet Potato Fries", "Cooked Whole Wheat Spaghetti", "Garlic Bread", "Pasta Bar",
            "Whole Wheat Pasta Cooked", "Cauliflower White Sauce", "Marinara Sauce", "Cheese Pizza",
            "Pepperoni & Sausage Pizza", "Vegetarian Pizza", "Chicken Tortilla Soup",
            "Roots 3 Bean Chili", "Seafood Veracruz", "Vegetarian Tandoori Stew", "Basmati Rice",
            "Roasted Red Potatoes", "Sauteed Vegetable Mix", "Jackfruit Tunaless Wrap",
            "White Dinner Rolls", "Broccoli Cheddar Soup",
            "Potato Spinach & Mushroom Vegetarian Lasagna", "Tuscan Chicken with Cannellini Beans",
            "Aztec Black Beans", "Spanish Rice", "Steamed Vegetable Mix", "Salami & Ham Sub",
            "Apple Cobbler", "Kale & Sweet Potato Soup", "Beef Gyudon Bowl", "Chicken Gyudon Bowl",
            "Tofu Gyudon Bowl", "Sticky Rice", "Stir Fry Veg Mix", "Yakisoba Noodle",
            "Crispy Fish Sandwich",
            //dinner
            "Grilled New York Steak Strip", "Penne Bake", "Seared Salmon With Lentils",
            "Au Gratin Potatoes with Green Chile", "Steamed Broccoli", "Steamed Brown Rice",
            "Chop Chop Salmon Bowl", "Chop Chop Tuna Bowl", "Pollo Moreno",
            "Salmon w/Tomato and Fennel", "Wild Rice Pilaf", "Pan Blasted Stir-fry with Chicken",
            "Pan Blasted Stir-fry with Pork", "Pan Blasted Stir-fry with Tofu",
            "Baked Black Bean Tostada", "Roasted Pork Loin Tapenade", "Seafood Bruschetta",
            "Roasted Corn", "Steamed Bhutan Red Rice", "Zucchini Provencal",
            "Mac Bowl with Achiote Chicken", "Mac Bowl with Ham", "Mac Bowl with Pulled Pork"
    };

    private static final String[] PINES = new String[] {
            //breakfast
            "Breakfast Hash Plate", "Cage Free Scrambled Eggs", "Country Potatoes", "Mini Biscuit",
            "Scrambled Egg Whites", "Smoked Bacon", "Soyrizo Scrambled Eggs", "Steelcut Oatmeal",
            "Turkey Sausage", "Veggie Sausage", "Beans", "Fresh Tortillas", "Jalapenos",
            "Cereal with Milk", "Chia Seed Pudding", "Cut Fresh Fruit", "Whole Apple",
             "Whole Orange", "Yogurt & Fruit Parfait", "Yogurt Bar",
            "Assorted Breakfast Toast", "Banana Bread", "Banana Craisin Muffins",
            "Blueberry Muffin", "Breakfast Streusel", "Chocolate Chip Muffins",
            "Gluten Friendly Bread", "Zucchini Breakfast Muffins", "Buttermilk Pancakes",
            "Texas French Toast", "Bacon", "Pork Sausage Links", "Tater Tots", "Whole Banana",
            "Avocado Toast", "French Toast with Berries", "Ricotta Cheese Pancake Plate",
            "Smoked Salmon Eggs Benedict", "Belgian Waffles", "Salmon Bagel Bar", "Turkey Bagel",
            "Vegetarian Bagel",
            //lunch
            "Jackfruit Tunaless Wrap", "Roast Beef Wrap", "Turkey & Swiss Super Sub",
            "Caprese Pizza", "Cheese Pizza", "Pepperoni Pizza", "Cheeseburger",
            "Crispy French Fries", "Crispy Onion Rings", "Fried Chicken Fritters", "Gardein Burger",
            "Grilled Cheese Sandwich", "Grilled Chicken Sandwich", "Hamburger",
            "Sweet Potato Fries", "Broccoli Cheddar Soup", "Roots 3 Bean Chili", "Carne Asada Taco",
            "Fish-Less Tacos", "Grilled Fish Taco", "Achiote Roasted Vegetables", "Spanish Rice",
            "Fresh Garden Bar", "Mushroom Penne Gratin", "Grilled Eggplant and Hummus Sandwich",
            "Hot Dog", "Emerald Sesame Greens", "Sauteed Broccolini", "Cauliflower White Sauce",
            "Cooked Whole Wheat Spaghetti", "Marinara Sauce", "Pasta Bar",
            "Whole Wheat Pasta Cooked", "Bread Pudding", "Brownies", "Carrot Cake Cookie",
            "Chocolate Chip Cookie", "Cookie, Sugar", "Dinner Rolls",
            "Double Chocolate Chip Cookie", "Froot Loop Krispy Treats", "Lemon Bars",
            "Oatmeal Raisin Cookie", "Peach Cobbler", "Rice Krispy Treats", "White Dinner Rolls",
            "Moroccan Chickpea Wrap", "Texas BBQ Cheese Burger", "French Fries", "Mushroom Poutine",
            "Chicken Breast Sandwich", "Chipotle Black Bean Burger", "Chixin Vegan Burger",
            "Double Hamburger", "Grilled Turkey Burger", "Plant Based Burger", "Salmon Sandwich",
            "Smoky Chicken Macaroni & Cheese", "Garlic Bread", "Turkey Corn Dog",
            "Meat Lovers Pizza",
            //dinner
            "Citrus Ponzu sauce", "Spicy Dragon sauce", "Sweet Soy Ginger sauce", "Pollo Moreno",
            "Potato Spinach & Mushroom Vegetarian Lasagna", "Salmon w/Tomato and Fennel",
            "Au Gratin Potatoes with Green Chile", "Steamed Vegetable Mix", "Wild Rice Pilaf",
            "Rice Noodles", "Udon Noodles", "Yakisoba Noodle", "Char Siu Pork", "Chicken Thigh",
            "Tofu Cubes"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dining_halls, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
        AutoCompleteTextView editText1 = findViewById(R.id.editText1);
        AutoCompleteTextView editText2 = findViewById(R.id.editText2);
        AutoCompleteTextView editText3 = findViewById(R.id.editText3);
        AutoCompleteTextView editText4 = findViewById(R.id.editText4);




        if (position == 0) {
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

            TextView textView1 = findViewById(R.id.textView1);
            textView1.setText("Calories");
            TextView textView2 = findViewById(R.id.textView2);
            textView2.setText("Calories");
            TextView textView3 = findViewById(R.id.textView3);
            textView3.setText("Calories");
            TextView textView4 = findViewById(R.id.textView4);
            textView4.setText("Calories");
            TextView total = findViewById(R.id.total);
            total.setText("Total");

            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, DEGREES);
            editText1.setAdapter(adapter1);

            editText2.setAdapter(adapter1);

            editText3.setAdapter(adapter1);

            editText4.setAdapter(adapter1);

            editText1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText1 = findViewById(R.id.editText1);
                    String str = editText1.getText().toString();
                    //breakfast
                    if (str.equals("Beans")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("136");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("82");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("149");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("90");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("139");
                        //lunch
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("298");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("183");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("158");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("642");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("377");
                    } else if (str.equals("Grilled Eggplant and Hummus Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("383");
                    } else if (str.equals("Hamburger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("590");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("436");
                    } else if (str.equals("Pepperoni & Sausage Pizza")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("189");
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("132");
                    } else if (str.equals("Roast Beef Sub")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("217");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("187");
                    } else if (str.equals("Beef and Broccoli")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("62");
                    } else if (str.equals("Crunchy Orange Chicken")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("124");
                    } else if (str.equals("Hibachi Chicken")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("466");
                    } else if (str.equals("Tofu with Black Bean & Garlic Sauce")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("145");
                    } else if (str.equals("Steamed Brown Rice")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("94");
                    } else if (str.equals("Steamed Rice")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("304");
                    } else if (str.equals("Stir Fry Veg Mix")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("37");
                    }
                }
            });

            editText2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText2 = findViewById(R.id.editText2);
                    String str = editText2.getText().toString();
                    //breakfast
                    if (str.equals("Beans")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("136");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("82");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("149");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("90");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("139");
                        //lunch
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("298");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("183");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("158");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("642");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("377");
                    } else if (str.equals("Grilled Eggplant and Hummus Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("383");
                    } else if (str.equals("Hamburger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("590");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("436");
                    } else if (str.equals("Pepperoni & Sausage Pizza")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("189");
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("132");
                    } else if (str.equals("Roast Beef Sub")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("217");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("187");
                    } else if (str.equals("Beef and Broccoli")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("62");
                    } else if (str.equals("Crunchy Orange Chicken")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("124");
                    } else if (str.equals("Hibachi Chicken")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("466");
                    } else if (str.equals("Tofu with Black Bean & Garlic Sauce")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("145");
                    } else if (str.equals("Steamed Brown Rice")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("94");
                    } else if (str.equals("Steamed Rice")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("304");
                    } else if (str.equals("Stir Fry Veg Mix")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("37");
                    }
                }
            });

            editText3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText3 = findViewById(R.id.editText3);
                    String str = editText3.getText().toString();
                    //breakfast
                    if (str.equals("Beans")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("136");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("82");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("149");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("90");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("139");
                        //lunch
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("298");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("183");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("158");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("642");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("377");
                    } else if (str.equals("Grilled Eggplant and Hummus Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("383");
                    } else if (str.equals("Hamburger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("590");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("436");
                    } else if (str.equals("Pepperoni & Sausage Pizza")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("189");
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("132");
                    } else if (str.equals("Roast Beef Sub")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("217");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("187");
                    } else if (str.equals("Beef and Broccoli")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("62");
                    } else if (str.equals("Crunchy Orange Chicken")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("124");
                    } else if (str.equals("Hibachi Chicken")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("466");
                    } else if (str.equals("Tofu with Black Bean & Garlic Sauce")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("145");
                    } else if (str.equals("Steamed Brown Rice")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("94");
                    } else if (str.equals("Steamed Rice")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("304");
                    } else if (str.equals("Stir Fry Veg Mix")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("37");
                    }
                }
            });

            editText4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText4 = findViewById(R.id.editText4);
                    String str = editText4.getText().toString();
                    //breakfast
                    if (str.equals("Beans")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("136");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("82");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("149");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("90");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("139");
                        //lunch
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("298");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("183");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("158");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("642");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("377");
                    } else if (str.equals("Grilled Eggplant and Hummus Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("383");
                    } else if (str.equals("Hamburger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("590");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("436");
                    } else if (str.equals("Pepperoni & Sausage Pizza")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("189");
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("132");
                    } else if (str.equals("Roast Beef Sub")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("217");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("187");
                    } else if (str.equals("Beef and Broccoli")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("62");
                    } else if (str.equals("Crunchy Orange Chicken")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("124");
                    } else if (str.equals("Hibachi Chicken")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("466");
                    } else if (str.equals("Tofu with Black Bean & Garlic Sauce")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("145");
                    } else if (str.equals("Steamed Brown Rice")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("94");
                    } else if (str.equals("Steamed Rice")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("304");
                    } else if (str.equals("Stir Fry Veg Mix")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("37");
                    }
                }
            });

            Button calculate = findViewById(R.id.calculate);
            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView textView1 = findViewById(R.id.textView1);
                    TextView textView2 = findViewById(R.id.textView2);
                    TextView textView3 = findViewById(R.id.textView3);
                    TextView textView4 = findViewById(R.id.textView4);

                    String s1 =  textView1.getText().toString();
                    String s2 =  textView2.getText().toString();
                    String s3 =  textView3.getText().toString();
                    String s4 =  textView4.getText().toString();

                    if (s1.equals("Calories") && s2.equals("Calories")
                            && s3.equals("Calories") && s4.equals("Calories")) {
                        int n1 = 0;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n1));
                    } else if (s2.equals("Calories") && s3.equals("Calories")
                                && s4.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n1));
                    } else if (s1.equals("Calories") && s3.equals("Calories")
                                && s4.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n2));
                    } else if (s1.equals("Calories") && s2.equals("Calories")
                                && s4.equals("Calories")) {
                        int n3 = Integer.parseInt(s3);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n3));
                    } else if (s1.equals("Calories") && s2.equals("Calories") &&
                                s3.equals("Calories")) {
                        int n4 = Integer.parseInt(s4);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n4));
                    } else if (s3.equals("Calories") && s4.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n2 = Integer.parseInt(s2);

                        int res = n1 + n2;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s2.equals("Calories") && s4.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n3 = Integer.parseInt(s3);

                        int res = n1 + n3;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s2.equals("Calories") && s3.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n4 = Integer.parseInt(s4);

                        int res = n1 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories") && s4.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);

                        int res = n2 + n3;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories") && s3.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n4 = Integer.parseInt(s4);

                        int res = n2 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories") && s2.equals("Calories")) {

                            int n3 = Integer.parseInt(s3);
                            int n4 = Integer.parseInt(s4);

                            int res = n3 + n4;

                            TextView total = findViewById(R.id.total);
                            total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n2 + n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s2.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n1 + n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s3.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n1 = Integer.parseInt(s1);
                        int n4 = Integer.parseInt(s4);

                        int res = n2 + n1 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));

                    } else if (s4.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);
                        int n1 = Integer.parseInt(s1);

                        int res = n2 + n3 + n1;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else {
                        int n1= Integer.parseInt(s1);
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n1 + n2 + n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    }
                }
            });
        } else if (position == 1) {
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

            TextView textView1 = findViewById(R.id.textView1);
            textView1.setText("Calories");
            TextView textView2 = findViewById(R.id.textView2);
            textView2.setText("Calories");
            TextView textView3 = findViewById(R.id.textView3);
            textView3.setText("Calories");
            TextView textView4 = findViewById(R.id.textView4);
            textView4.setText("Calories");
            TextView total = findViewById(R.id.total);
            total.setText("Total");

        } else if (position == 2){
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

            TextView textView1 = findViewById(R.id.textView1);
            textView1.setText("Calories");
            TextView textView2 = findViewById(R.id.textView2);
            textView2.setText("Calories");
            TextView textView3 = findViewById(R.id.textView3);
            textView3.setText("Calories");
            TextView textView4 = findViewById(R.id.textView4);
            textView4.setText("Calories");
            TextView total = findViewById(R.id.total);
            total.setText("Total");

            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, VENTANAS);
            editText1.setAdapter(adapter3);

            editText2.setAdapter(adapter3);

            editText3.setAdapter(adapter3);

            editText4.setAdapter(adapter3);

            editText1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText1 = findViewById(R.id.editText1);
                    String str = editText1.getText().toString();
                    //breakfast
                    if (str.equals("Beans")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("136");
                    } else if (str.equals("Fresh Tortillas")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("114");
                    } else if (str.equals("Jalapenos")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("8");
                    } else if (str.equals("Molcajete Green Salsa")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("19");
                    } else if (str.equals("Molcajete Salsa")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("19");
                    } else if (str.equals("Breakfast Hash Plate")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("64");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("82");
                    } else if (str.equals("Scrambled Egg Whites")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("68");
                    } else if (str.equals("Smoked Bacon")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("159");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("149");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("52");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("90");
                    } else if (str.equals("Buttermilk Pancakes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("174");
                    } else if (str.equals("Texas French Toast")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("219");
                    } else if (str.equals("Assorted Breakfast Toast")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("114");
                    } else if (str.equals("Cereal with Milk")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("271");
                    } else if (str.equals("Cut Fresh Fruit")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("39");
                    } else if (str.equals("Gluten Friendly Bread")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("100");
                    } else if (str.equals("Mini Biscuit")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("180");
                    } else if (str.equals("Whole Apple")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("72");
                    } else if (str.equals("Whole Banana")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("115");
                    } else if (str.equals("Whole Orange")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("55");
                    } else if (str.equals("Yogurt & Fruit Parfait")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("85");
                    } else if (str.equals("Yogurt Bar")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("127");
                    } else if (str.equals("Blueberry Muffin")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("94");
                    } else if (str.equals("Breakfast Streusel")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("206");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("101");
                    } else if (str.equals("Chocolate Chip Muffins")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("100");
                    } else if (str.equals("Doughnut Holes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("64");
                    } else if (str.equals("Mini Danish")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("130");
                    } else if (str.equals("Zucchini Breakfast Muffins")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("92");
                    } else if (str.equals("Blueberry Pancakes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("189");
                    } else if (str.equals("Corned Beef Hash and Eggs")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("191");
                    } else if (str.equals("Hash Brown Potatoes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("59");
                    //lunch
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("132");
                    } else if (str.equals("Roast Beef Wrap")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("102");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("187");
                    } else if (str.equals("Cooked Whole Wheat Spaghetti")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("40");
                    } else if (str.equals("Garlic Bread")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("182");
                    } else if (str.equals("Pasta Bar")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("161");
                    } else if (str.equals("Whole Wheat Pasta Cooked")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("37");
                    } else if (str.equals("Bread Pudding")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("225");
                    } else if (str.equals("Brownies")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("188");
                    } else if (str.equals("Carrot Cake Cookie")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("125");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("101");
                    } else if (str.equals("Chocolate Chip Cookie")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("380");
                    } else if (str.equals("Cookie, Sugar")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("167");
                    } else if (str.equals("Double Chocolate Chip Cookie")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("170");
                    } else if (str.equals("Froot Loop Krispy Treats")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("120");
                    } else if (str.equals("Lemon Bars")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("132");
                    } else if (str.equals("Oatmeal Raisin Cookie")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("319");
                    } else if (str.equals("Peach Cobbler")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("235");
                    } else if (str.equals("Rice Krispy Treats")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("100");
                    } else if (str.equals("White Dinner Rolls")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("116");
                    } else if (str.equals("Cauliflower White Sauce")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("9");
                    } else if (str.equals("Marinara Sauce")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("29");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("158");
                    } else if (str.equals("Pepperoni & Sausage Pizza")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("189");
                    } else if (str.equals("Vegetarian Pizza")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("163");
                    } else if (str.equals("Broccoli Cheddar Soup")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("106");
                    } else if (str.equals("Roots 3 Bean Chili")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("82");
                    } else if (str.equals("Potato Spinach & Mushroom Vegetarian Lasagna")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("177");
                    } else if (str.equals("Tuscan Chicken with Cannellini Beans")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("109");
                    } else if (str.equals("Fresh Garden Bar")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("26");
                    } else if (str.equals("Aztec Black Beans")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("74");
                    } else if (str.equals("Spanish Rice")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("96");
                    } else if (str.equals("Steamed Vegetable Mix")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("32");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("642");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("377");
                    } else if (str.equals("Hamburger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("590");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("436");
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("298");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("183");
                    } else if (str.equals("Salami & Ham Sub")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("261");
                    } else if (str.equals("Apple Cobbler")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("343");
                    } else if (str.equals("Kale & Sweet Potato Soup")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("59");
                    } else if (str.equals("Beef Gyudon Bowl")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("279");
                    } else if (str.equals("Chicken Gyudon Bowl")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("255");
                    } else if (str.equals("Tofu Gyudon Bowl")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("312");
                    } else if (str.equals("Sticky Rice")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("111");
                    } else if (str.equals("Stir Fry Veg Mix")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("37");
                    } else if (str.equals("Yakisoba Noodle")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("225");
                    } else if (str.equals("Crispy Fish Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("660");
                    //dinner
                    } else if (str.equals("Pollo Moreno")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("79");
                    } else if (str.equals("Salmon w/Tomato and Fennel")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("175");
                    } else if (str.equals("Au Gratin Potatoes with Green Chile")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("141");
                    } else if (str.equals("Wild Rice Pilaf")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("78");
                    } else if (str.equals("Pan Blasted Stir-fry with Chicken")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("455");
                    } else if (str.equals("Pan Blasted Stir-fry with Pork")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("422");
                    } else if (str.equals("Pan Blasted Stir-fry with Tofu")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("411");
                    } else if (str.equals("Baked Black Bean Tostada")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("251");
                    } else if (str.equals("Roasted Pork Loin Tapenade")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("232");
                    } else if (str.equals("Seafood Bruschetta")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("114");
                    } else if (str.equals("Roasted Corn")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("88");
                    } else if (str.equals("Steamed Bhutan Red Rice")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("284");
                    } else if (str.equals("Zucchini Provencal")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("54");
                    } else if (str.equals("Mac Bowl with Achiote Chicken")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("372");
                    } else if (str.equals("Mac Bowl with Ham")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("558");
                    } else if (str.equals("Mac Bowl with Pulled Pork")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("366");
                    }
                }
            });

            editText2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText2 = findViewById(R.id.editText2);
                    String str = editText2.getText().toString();
                    //breakfast
                    if (str.equals("Beans")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("136");
                    } else if (str.equals("Fresh Tortillas")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("114");
                    } else if (str.equals("Jalapenos")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("8");
                    } else if (str.equals("Molcajete Green Salsa")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("19");
                    } else if (str.equals("Molcajete Salsa")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("19");
                    } else if (str.equals("Breakfast Hash Plate")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("64");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("82");
                    } else if (str.equals("Scrambled Egg Whites")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("68");
                    } else if (str.equals("Smoked Bacon")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("159");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("149");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("52");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("90");
                    } else if (str.equals("Buttermilk Pancakes")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("174");
                    } else if (str.equals("Texas French Toast")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("219");
                    } else if (str.equals("Assorted Breakfast Toast")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("114");
                    } else if (str.equals("Cereal with Milk")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("271");
                    } else if (str.equals("Cut Fresh Fruit")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("39");
                    } else if (str.equals("Gluten Friendly Bread")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("100");
                    } else if (str.equals("Mini Biscuit")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("180");
                    } else if (str.equals("Whole Apple")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("72");
                    } else if (str.equals("Whole Banana")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("115");
                    } else if (str.equals("Whole Orange")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("55");
                    } else if (str.equals("Yogurt & Fruit Parfait")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("85");
                    } else if (str.equals("Yogurt Bar")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("127");
                    } else if (str.equals("Blueberry Muffin")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("94");
                    } else if (str.equals("Breakfast Streusel")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("206");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("101");
                    } else if (str.equals("Chocolate Chip Muffins")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("100");
                    } else if (str.equals("Doughnut Holes")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("64");
                    } else if (str.equals("Mini Danish")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("130");
                    } else if (str.equals("Zucchini Breakfast Muffins")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("92");
                    } else if (str.equals("Blueberry Pancakes")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("189");
                    } else if (str.equals("Corned Beef Hash and Eggs")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("191");
                    } else if (str.equals("Hash Brown Potatoes")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("59");
                        //lunch
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("132");
                    } else if (str.equals("Roast Beef Wrap")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("102");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("187");
                    } else if (str.equals("Cooked Whole Wheat Spaghetti")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("40");
                    } else if (str.equals("Garlic Bread")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("182");
                    } else if (str.equals("Pasta Bar")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("161");
                    } else if (str.equals("Whole Wheat Pasta Cooked")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("37");
                    } else if (str.equals("Bread Pudding")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("225");
                    } else if (str.equals("Brownies")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("188");
                    } else if (str.equals("Carrot Cake Cookie")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("125");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("101");
                    } else if (str.equals("Chocolate Chip Cookie")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("380");
                    } else if (str.equals("Cookie, Sugar")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("167");
                    } else if (str.equals("Double Chocolate Chip Cookie")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("170");
                    } else if (str.equals("Froot Loop Krispy Treats")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("120");
                    } else if (str.equals("Lemon Bars")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("132");
                    } else if (str.equals("Oatmeal Raisin Cookie")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("319");
                    } else if (str.equals("Peach Cobbler")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("235");
                    } else if (str.equals("Rice Krispy Treats")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("100");
                    } else if (str.equals("White Dinner Rolls")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("116");
                    } else if (str.equals("Cauliflower White Sauce")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("9");
                    } else if (str.equals("Marinara Sauce")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("29");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("158");
                    } else if (str.equals("Pepperoni & Sausage Pizza")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("189");
                    } else if (str.equals("Vegetarian Pizza")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("163");
                    } else if (str.equals("Broccoli Cheddar Soup")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("106");
                    } else if (str.equals("Roots 3 Bean Chili")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("82");
                    } else if (str.equals("Potato Spinach & Mushroom Vegetarian Lasagna")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("177");
                    } else if (str.equals("Tuscan Chicken with Cannellini Beans")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("109");
                    } else if (str.equals("Fresh Garden Bar")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("26");
                    } else if (str.equals("Aztec Black Beans")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("74");
                    } else if (str.equals("Spanish Rice")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("96");
                    } else if (str.equals("Steamed Vegetable Mix")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("32");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("642");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("377");
                    } else if (str.equals("Hamburger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("590");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("436");
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("298");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("183");
                    } else if (str.equals("Salami & Ham Sub")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("261");
                    } else if (str.equals("Apple Cobbler")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("343");
                    } else if (str.equals("Kale & Sweet Potato Soup")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("59");
                    } else if (str.equals("Beef Gyudon Bowl")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("279");
                    } else if (str.equals("Chicken Gyudon Bowl")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("255");
                    } else if (str.equals("Tofu Gyudon Bowl")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("312");
                    } else if (str.equals("Sticky Rice")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("111");
                    } else if (str.equals("Stir Fry Veg Mix")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("37");
                    } else if (str.equals("Yakisoba Noodle")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("225");
                    } else if (str.equals("Crispy Fish Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("660");
                        //dinner
                    } else if (str.equals("Pollo Moreno")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("79");
                    } else if (str.equals("Salmon w/Tomato and Fennel")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("175");
                    } else if (str.equals("Au Gratin Potatoes with Green Chile")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("141");
                    } else if (str.equals("Wild Rice Pilaf")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("78");
                    } else if (str.equals("Pan Blasted Stir-fry with Chicken")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("455");
                    } else if (str.equals("Pan Blasted Stir-fry with Pork")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("422");
                    } else if (str.equals("Pan Blasted Stir-fry with Tofu")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("411");
                    } else if (str.equals("Baked Black Bean Tostada")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("251");
                    } else if (str.equals("Roasted Pork Loin Tapenade")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("232");
                    } else if (str.equals("Seafood Bruschetta")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("114");
                    } else if (str.equals("Roasted Corn")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("88");
                    } else if (str.equals("Steamed Bhutan Red Rice")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("284");
                    } else if (str.equals("Zucchini Provencal")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("54");
                    } else if (str.equals("Mac Bowl with Achiote Chicken")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("372");
                    } else if (str.equals("Mac Bowl with Ham")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("558");
                    } else if (str.equals("Mac Bowl with Pulled Pork")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("366");
                    }
                }
            });

            editText3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText3 = findViewById(R.id.editText3);
                    String str = editText3.getText().toString();
                    //breakfast
                    if (str.equals("Beans")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("136");
                    } else if (str.equals("Fresh Tortillas")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("114");
                    } else if (str.equals("Jalapenos")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("8");
                    } else if (str.equals("Molcajete Green Salsa")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("19");
                    } else if (str.equals("Molcajete Salsa")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("19");
                    } else if (str.equals("Breakfast Hash Plate")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("64");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("82");
                    } else if (str.equals("Scrambled Egg Whites")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("68");
                    } else if (str.equals("Smoked Bacon")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("159");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("149");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("52");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("90");
                    } else if (str.equals("Buttermilk Pancakes")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("174");
                    } else if (str.equals("Texas French Toast")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("219");
                    } else if (str.equals("Assorted Breakfast Toast")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("114");
                    } else if (str.equals("Cereal with Milk")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("271");
                    } else if (str.equals("Cut Fresh Fruit")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("39");
                    } else if (str.equals("Gluten Friendly Bread")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("100");
                    } else if (str.equals("Mini Biscuit")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("180");
                    } else if (str.equals("Whole Apple")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("72");
                    } else if (str.equals("Whole Banana")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("115");
                    } else if (str.equals("Whole Orange")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("55");
                    } else if (str.equals("Yogurt & Fruit Parfait")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("85");
                    } else if (str.equals("Yogurt Bar")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("127");
                    } else if (str.equals("Blueberry Muffin")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("94");
                    } else if (str.equals("Breakfast Streusel")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("206");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("101");
                    } else if (str.equals("Chocolate Chip Muffins")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("100");
                    } else if (str.equals("Doughnut Holes")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("64");
                    } else if (str.equals("Mini Danish")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("130");
                    } else if (str.equals("Zucchini Breakfast Muffins")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("92");
                    } else if (str.equals("Blueberry Pancakes")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("189");
                    } else if (str.equals("Corned Beef Hash and Eggs")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("191");
                    } else if (str.equals("Hash Brown Potatoes")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("59");
                        //lunch
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("132");
                    } else if (str.equals("Roast Beef Wrap")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("102");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("187");
                    } else if (str.equals("Cooked Whole Wheat Spaghetti")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("40");
                    } else if (str.equals("Garlic Bread")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("182");
                    } else if (str.equals("Pasta Bar")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("161");
                    } else if (str.equals("Whole Wheat Pasta Cooked")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("37");
                    } else if (str.equals("Bread Pudding")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("225");
                    } else if (str.equals("Brownies")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("188");
                    } else if (str.equals("Carrot Cake Cookie")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("125");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("101");
                    } else if (str.equals("Chocolate Chip Cookie")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("380");
                    } else if (str.equals("Cookie, Sugar")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("167");
                    } else if (str.equals("Double Chocolate Chip Cookie")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("170");
                    } else if (str.equals("Froot Loop Krispy Treats")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("120");
                    } else if (str.equals("Lemon Bars")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("132");
                    } else if (str.equals("Oatmeal Raisin Cookie")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("319");
                    } else if (str.equals("Peach Cobbler")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("235");
                    } else if (str.equals("Rice Krispy Treats")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("100");
                    } else if (str.equals("White Dinner Rolls")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("116");
                    } else if (str.equals("Cauliflower White Sauce")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("9");
                    } else if (str.equals("Marinara Sauce")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("29");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("158");
                    } else if (str.equals("Pepperoni & Sausage Pizza")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("189");
                    } else if (str.equals("Vegetarian Pizza")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("163");
                    } else if (str.equals("Broccoli Cheddar Soup")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("106");
                    } else if (str.equals("Roots 3 Bean Chili")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("82");
                    } else if (str.equals("Potato Spinach & Mushroom Vegetarian Lasagna")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("177");
                    } else if (str.equals("Tuscan Chicken with Cannellini Beans")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("109");
                    } else if (str.equals("Fresh Garden Bar")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("26");
                    } else if (str.equals("Aztec Black Beans")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("74");
                    } else if (str.equals("Spanish Rice")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("96");
                    } else if (str.equals("Steamed Vegetable Mix")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("32");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("642");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("377");
                    } else if (str.equals("Hamburger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("590");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("436");
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("298");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("183");
                    } else if (str.equals("Salami & Ham Sub")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("261");
                    } else if (str.equals("Apple Cobbler")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("343");
                    } else if (str.equals("Kale & Sweet Potato Soup")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("59");
                    } else if (str.equals("Beef Gyudon Bowl")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("279");
                    } else if (str.equals("Chicken Gyudon Bowl")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("255");
                    } else if (str.equals("Tofu Gyudon Bowl")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("312");
                    } else if (str.equals("Sticky Rice")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("111");
                    } else if (str.equals("Stir Fry Veg Mix")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("37");
                    } else if (str.equals("Yakisoba Noodle")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("225");
                    } else if (str.equals("Crispy Fish Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("660");
                        //dinner
                    } else if (str.equals("Pollo Moreno")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("79");
                    } else if (str.equals("Salmon w/Tomato and Fennel")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("175");
                    } else if (str.equals("Au Gratin Potatoes with Green Chile")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("141");
                    } else if (str.equals("Wild Rice Pilaf")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("78");
                    } else if (str.equals("Pan Blasted Stir-fry with Chicken")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("455");
                    } else if (str.equals("Pan Blasted Stir-fry with Pork")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("422");
                    } else if (str.equals("Pan Blasted Stir-fry with Tofu")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("411");
                    } else if (str.equals("Baked Black Bean Tostada")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("251");
                    } else if (str.equals("Roasted Pork Loin Tapenade")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("232");
                    } else if (str.equals("Seafood Bruschetta")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("114");
                    } else if (str.equals("Roasted Corn")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("88");
                    } else if (str.equals("Steamed Bhutan Red Rice")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("284");
                    } else if (str.equals("Zucchini Provencal")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("54");
                    } else if (str.equals("Mac Bowl with Achiote Chicken")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("372");
                    } else if (str.equals("Mac Bowl with Ham")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("558");
                    } else if (str.equals("Mac Bowl with Pulled Pork")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("366");
                    }
                }
            });

            editText4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText4 = findViewById(R.id.editText4);
                    String str = editText4.getText().toString();
                    //breakfast
                    if (str.equals("Beans")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("136");
                    } else if (str.equals("Fresh Tortillas")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("114");
                    } else if (str.equals("Jalapenos")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("8");
                    } else if (str.equals("Molcajete Green Salsa")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("19");
                    } else if (str.equals("Molcajete Salsa")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("19");
                    } else if (str.equals("Breakfast Hash Plate")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("64");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("82");
                    } else if (str.equals("Scrambled Egg Whites")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("68");
                    } else if (str.equals("Smoked Bacon")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("159");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("149");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("52");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("90");
                    } else if (str.equals("Buttermilk Pancakes")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("174");
                    } else if (str.equals("Texas French Toast")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("219");
                    } else if (str.equals("Assorted Breakfast Toast")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("114");
                    } else if (str.equals("Cereal with Milk")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("271");
                    } else if (str.equals("Cut Fresh Fruit")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("39");
                    } else if (str.equals("Gluten Friendly Bread")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("100");
                    } else if (str.equals("Mini Biscuit")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("180");
                    } else if (str.equals("Whole Apple")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("72");
                    } else if (str.equals("Whole Banana")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("115");
                    } else if (str.equals("Whole Orange")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("55");
                    } else if (str.equals("Yogurt & Fruit Parfait")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("85");
                    } else if (str.equals("Yogurt Bar")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("127");
                    } else if (str.equals("Blueberry Muffin")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("94");
                    } else if (str.equals("Breakfast Streusel")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("206");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("101");
                    } else if (str.equals("Chocolate Chip Muffins")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("100");
                    } else if (str.equals("Doughnut Holes")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("64");
                    } else if (str.equals("Mini Danish")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("130");
                    } else if (str.equals("Zucchini Breakfast Muffins")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("92");
                    } else if (str.equals("Blueberry Pancakes")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("189");
                    } else if (str.equals("Corned Beef Hash and Eggs")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("191");
                    } else if (str.equals("Hash Brown Potatoes")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("59");
                        //lunch
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("132");
                    } else if (str.equals("Roast Beef Wrap")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("102");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("187");
                    } else if (str.equals("Cooked Whole Wheat Spaghetti")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("40");
                    } else if (str.equals("Garlic Bread")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("182");
                    } else if (str.equals("Pasta Bar")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("161");
                    } else if (str.equals("Whole Wheat Pasta Cooked")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("37");
                    } else if (str.equals("Bread Pudding")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("225");
                    } else if (str.equals("Brownies")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("188");
                    } else if (str.equals("Carrot Cake Cookie")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("125");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("101");
                    } else if (str.equals("Chocolate Chip Cookie")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("380");
                    } else if (str.equals("Cookie, Sugar")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("167");
                    } else if (str.equals("Double Chocolate Chip Cookie")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("170");
                    } else if (str.equals("Froot Loop Krispy Treats")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("120");
                    } else if (str.equals("Lemon Bars")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("132");
                    } else if (str.equals("Oatmeal Raisin Cookie")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("319");
                    } else if (str.equals("Peach Cobbler")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("235");
                    } else if (str.equals("Rice Krispy Treats")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("100");
                    } else if (str.equals("White Dinner Rolls")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("116");
                    } else if (str.equals("Cauliflower White Sauce")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("9");
                    } else if (str.equals("Marinara Sauce")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("29");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("158");
                    } else if (str.equals("Pepperoni & Sausage Pizza")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("189");
                    } else if (str.equals("Vegetarian Pizza")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("163");
                    } else if (str.equals("Broccoli Cheddar Soup")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("106");
                    } else if (str.equals("Roots 3 Bean Chili")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("82");
                    } else if (str.equals("Potato Spinach & Mushroom Vegetarian Lasagna")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("177");
                    } else if (str.equals("Tuscan Chicken with Cannellini Beans")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("109");
                    } else if (str.equals("Fresh Garden Bar")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("26");
                    } else if (str.equals("Aztec Black Beans")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("74");
                    } else if (str.equals("Spanish Rice")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("96");
                    } else if (str.equals("Steamed Vegetable Mix")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("32");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("642");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("377");
                    } else if (str.equals("Hamburger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("590");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("436");
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("298");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("183");
                    } else if (str.equals("Salami & Ham Sub")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("261");
                    } else if (str.equals("Apple Cobbler")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("343");
                    } else if (str.equals("Kale & Sweet Potato Soup")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("59");
                    } else if (str.equals("Beef Gyudon Bowl")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("279");
                    } else if (str.equals("Chicken Gyudon Bowl")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("255");
                    } else if (str.equals("Tofu Gyudon Bowl")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("312");
                    } else if (str.equals("Sticky Rice")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("111");
                    } else if (str.equals("Stir Fry Veg Mix")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("37");
                    } else if (str.equals("Yakisoba Noodle")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("225");
                    } else if (str.equals("Crispy Fish Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("660");
                        //dinner
                    } else if (str.equals("Pollo Moreno")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("79");
                    } else if (str.equals("Salmon w/Tomato and Fennel")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("175");
                    } else if (str.equals("Au Gratin Potatoes with Green Chile")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("141");
                    } else if (str.equals("Wild Rice Pilaf")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("78");
                    } else if (str.equals("Pan Blasted Stir-fry with Chicken")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("455");
                    } else if (str.equals("Pan Blasted Stir-fry with Pork")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("422");
                    } else if (str.equals("Pan Blasted Stir-fry with Tofu")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("411");
                    } else if (str.equals("Baked Black Bean Tostada")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("251");
                    } else if (str.equals("Roasted Pork Loin Tapenade")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("232");
                    } else if (str.equals("Seafood Bruschetta")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("114");
                    } else if (str.equals("Roasted Corn")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("88");
                    } else if (str.equals("Steamed Bhutan Red Rice")) {
                        TextView textView4 = findViewById(R.id.textView1);
                        textView4.setText("284");
                    } else if (str.equals("Zucchini Provencal")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("54");
                    } else if (str.equals("Mac Bowl with Achiote Chicken")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("372");
                    } else if (str.equals("Mac Bowl with Ham")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("558");
                    } else if (str.equals("Mac Bowl with Pulled Pork")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("366");
                    }
                }
            });

            Button calculate = findViewById(R.id.calculate);
            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView textView1 = findViewById(R.id.textView1);
                    TextView textView2 = findViewById(R.id.textView2);
                    TextView textView3 = findViewById(R.id.textView3);
                    TextView textView4 = findViewById(R.id.textView4);

                    String s1 =  textView1.getText().toString();
                    String s2 =  textView2.getText().toString();
                    String s3 =  textView3.getText().toString();
                    String s4 =  textView4.getText().toString();

                    if (s1.equals("Calories") && s2.equals("Calories")
                            && s3.equals("Calories") && s4.equals("Calories")) {
                        int n1 = 0;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n1));
                    } else if (s2.equals("Calories") && s3.equals("Calories")
                            && s4.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n1));
                    } else if (s1.equals("Calories") && s3.equals("Calories")
                            && s4.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n2));
                    } else if (s1.equals("Calories") && s2.equals("Calories")
                            && s4.equals("Calories")) {
                        int n3 = Integer.parseInt(s3);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n3));
                    } else if (s1.equals("Calories") && s2.equals("Calories") &&
                            s3.equals("Calories")) {
                        int n4 = Integer.parseInt(s4);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n4));
                    } else if (s3.equals("Calories") && s4.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n2 = Integer.parseInt(s2);

                        int res = n1 + n2;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s2.equals("Calories") && s4.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n3 = Integer.parseInt(s3);

                        int res = n1 + n3;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s2.equals("Calories") && s3.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n4 = Integer.parseInt(s4);

                        int res = n1 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories") && s4.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);

                        int res = n2 + n3;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories") && s3.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n4 = Integer.parseInt(s4);

                        int res = n2 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories") && s2.equals("Calories")) {

                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n2 + n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s2.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n1 + n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s3.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n1 = Integer.parseInt(s1);
                        int n4 = Integer.parseInt(s4);

                        int res = n2 + n1 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));

                    } else if (s4.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);
                        int n1 = Integer.parseInt(s1);

                        int res = n2 + n3 + n1;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else {
                        int n1= Integer.parseInt(s1);
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n1 + n2 + n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    }
                }
            });
        } else if (position == 3) {
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

            TextView textView1 = findViewById(R.id.textView1);
            textView1.setText("Calories");
            TextView textView2 = findViewById(R.id.textView2);
            textView2.setText("Calories");
            TextView textView3 = findViewById(R.id.textView3);
            textView3.setText("Calories");
            TextView textView4 = findViewById(R.id.textView4);
            textView4.setText("Calories");
            TextView total = findViewById(R.id.total);
            total.setText("Total");

        } else if (position == 4) {
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

            TextView textView1 = findViewById(R.id.textView1);
            textView1.setText("Calories");
            TextView textView2 = findViewById(R.id.textView2);
            textView2.setText("Calories");
            TextView textView3 = findViewById(R.id.textView3);
            textView3.setText("Calories");
            TextView textView4 = findViewById(R.id.textView4);
            textView4.setText("Calories");
            TextView total = findViewById(R.id.total);
            total.setText("Total");

        } else if (position == 5){
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

            TextView textView1 = findViewById(R.id.textView1);
            textView1.setText("Calories");
            TextView textView2 = findViewById(R.id.textView2);
            textView2.setText("Calories");
            TextView textView3 = findViewById(R.id.textView3);
            textView3.setText("Calories");
            TextView textView4 = findViewById(R.id.textView4);
            textView4.setText("Calories");
            TextView total = findViewById(R.id.total);
            total.setText("Total");

            ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, PINES);
            editText1.setAdapter(adapter6);

            editText2.setAdapter(adapter6);

            editText3.setAdapter(adapter6);

            editText4.setAdapter(adapter6);

            editText1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText1 = findViewById(R.id.editText1);
                    String str = editText1.getText().toString();
                    //breakfast
                    if (str.equals("Breakfast Hash Plate")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("64");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("82");
                    } else if (str.equals("Mini Biscuit")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("180");
                    } else if (str.equals("Scrambled Egg Whites")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("68");
                    } else if (str.equals("Smoked Bacon")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("159");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("149");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("52");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("90");
                    } else if (str.equals("Assorted Breakfast Toast")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("114");
                    } else if (str.equals("Banana Bread")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("240");
                    } else if (str.equals("Banana Craisin Muffins")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("118");
                    } else if (str.equals("Breakfast Streusel")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("206");
                    } else if (str.equals("Chocolate Chip Muffins")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("100");
                    } else if (str.equals("Gluten Friendly Bread")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("100");
                    } else if (str.equals("Zucchini Breakfast Muffins")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("92");
                    } else if (str.equals("Beans")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("136");
                    } else if (str.equals("Fresh Tortillas")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("114");
                    } else if (str.equals("Jalapenos")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("8");
                    } else if (str.equals("Buttermilk Pancakes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("87");
                    } else if (str.equals("Texas French Toast")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("219");
                    } else if (str.equals("Cereal with Milk")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("134");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("101");
                    } else if (str.equals("Cut Fresh Fruit")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("39");
                    } else if (str.equals("Whole Apple")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("72");
                    } else if (str.equals("Whole Orange")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("55");
                    } else if (str.equals("Yogurt & Fruit Parfait")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("85");
                    } else if (str.equals("Yogurt Bar")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("127");
                    } else if (str.equals("Bacon")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("99");
                    } else if (str.equals("Pork Sausage Links")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("153");
                    } else if (str.equals("Tater Tots")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("415");
                    } else if (str.equals("Whole Banana")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("115");
                    } else if (str.equals("Avocado Toast")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("239");
                    } else if (str.equals("French Toast with Berries")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("476");
                    } else if (str.equals("Ricotta Cheese Pancake Plate")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("576");
                    } else if (str.equals("Smoked Salmon Eggs Benedict")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("343");
                    } else if (str.equals("Belgian Waffles")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("473");
                    } else if (str.equals("Salmon Bagel Bar")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("727");
                    } else if (str.equals("Turkey Bagel")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("544");
                    } else if (str.equals("Vegetarian Bagel")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("483");
                    //lunch
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("132");
                    } else if (str.equals("Roast Beef Wrap")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("102");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("187");
                    } else if (str.equals("Caprese Pizza")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("182");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("158");
                    } else if (str.equals("Pepperoni Pizza")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("192");
                    } else if (str.equals("Broccoli Cheddar Soup")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("106");
                    } else if (str.equals("Roots 3 Bean Chili")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("82");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("642");
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("298");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("377");
                    } else if (str.equals("Hamburger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("590");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("183");
                    } else if (str.equals("Fresh Garden Bar")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("26");
                    } else if (str.equals("Grilled Eggplant and Hummus Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("383");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("436");
                    } else if (str.equals("Cauliflower White Sauce")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("9");
                    } else if (str.equals("Cooked Whole Wheat Spaghetti")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("40");
                    } else if (str.equals("Marinara Sauce")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("15");
                    } else if (str.equals("Pasta Bar")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("161");
                    } else if (str.equals("Whole Wheat Pasta Cooked")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("37");
                    } else if (str.equals("Bread Pudding")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("225");
                    } else if (str.equals("Brownies")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("188");
                    } else if (str.equals("Carrot Cake Cookie")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("125");
                    } else if (str.equals("Chocolate Chip Cookie")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("380");
                    } else if (str.equals("Cookie, Sugar")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("167");
                    } else if (str.equals("Dinner Rolls")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("116");
                    } else if (str.equals("Double Chocolate Chip Cookie")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("170");
                    } else if (str.equals("Froot Loop Krispy Treats")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("120");
                    } else if (str.equals("Lemon Bars")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("132");
                    } else if (str.equals("Oatmeal Raisin Cookie")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("319");
                    } else if (str.equals("Peach Cobbler")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("235");
                    } else if (str.equals("Rice Krispy Treats")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("100");
                    } else if (str.equals("White Dinner Rolls")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("116");
                    } else if (str.equals("Moroccan Chickpea Wrap")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("579");
                    } else if (str.equals("Texas BBQ Cheese Burger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("764");
                    } else if (str.equals("French Fries")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("422");
                    } else if (str.equals("Mushroom Poutine")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("458");
                    } else if (str.equals("Chicken Breast Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("431");
                    } else if (str.equals("Chipotle Black Bean Burger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("465");
                    } else if (str.equals("Chixin Vegan Burger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("736");
                    } else if (str.equals("Double Hamburger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("825");
                    } else if (str.equals("Grilled Turkey Burger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("515");
                    } else if (str.equals("Plant Based Burger")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("620");
                    } else if (str.equals("Salmon Sandwich")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("680");
                    } else if (str.equals("Smoky Chicken Macaroni & Cheese")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("393");
                    } else if (str.equals("Garlic Bread")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("223");
                    } else if (str.equals("Turkey Corn Dog")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("402");
                    } else if (str.equals("Meat Lovers Pizza")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("430");
                    //dinner
                    } else if (str.equals("Rice Noodles")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("135");
                    } else if (str.equals("Udon Noodles")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("48");
                    } else if (str.equals("Yakisoba Noodle")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("122");
                    } else if (str.equals("Char Siu Pork")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("159");
                    } else if (str.equals("Chicken Thigh")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("62");
                    } else if (str.equals("Tofu Cubes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("25");
                    } else if (str.equals("Citrus Ponzu sauce")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("23");
                    } else if (str.equals("Spicy Dragon sauce")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("33");
                    } else if (str.equals("Sweet Soy Ginger sauce")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("58");
                    }
                }
            });

            editText2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText2 = findViewById(R.id.editText2);
                    String str = editText2.getText().toString();
                    //breakfast
                    if (str.equals("Breakfast Hash Plate")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("64");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("82");
                    } else if (str.equals("Mini Biscuit")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("180");
                    } else if (str.equals("Scrambled Egg Whites")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("68");
                    } else if (str.equals("Smoked Bacon")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("159");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("149");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("52");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("90");
                    } else if (str.equals("Assorted Breakfast Toast")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("114");
                    } else if (str.equals("Banana Bread")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("240");
                    } else if (str.equals("Banana Craisin Muffins")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("118");
                    } else if (str.equals("Breakfast Streusel")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("206");
                    } else if (str.equals("Chocolate Chip Muffins")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("100");
                    } else if (str.equals("Gluten Friendly Bread")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("100");
                    } else if (str.equals("Zucchini Breakfast Muffins")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("92");
                    } else if (str.equals("Beans")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("136");
                    } else if (str.equals("Fresh Tortillas")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("114");
                    } else if (str.equals("Jalapenos")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("8");
                    } else if (str.equals("Buttermilk Pancakes")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("87");
                    } else if (str.equals("Texas French Toast")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("219");
                    } else if (str.equals("Cereal with Milk")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("134");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("101");
                    } else if (str.equals("Cut Fresh Fruit")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("39");
                    } else if (str.equals("Whole Apple")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("72");
                    } else if (str.equals("Whole Orange")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("55");
                    } else if (str.equals("Yogurt & Fruit Parfait")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("85");
                    } else if (str.equals("Yogurt Bar")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("127");
                    } else if (str.equals("Bacon")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("99");
                    } else if (str.equals("Pork Sausage Links")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("153");
                    } else if (str.equals("Tater Tots")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("415");
                    } else if (str.equals("Whole Banana")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("115");
                    } else if (str.equals("Avocado Toast")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("239");
                    } else if (str.equals("French Toast with Berries")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("476");
                    } else if (str.equals("Ricotta Cheese Pancake Plate")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("576");
                    } else if (str.equals("Smoked Salmon Eggs Benedict")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("343");
                    } else if (str.equals("Belgian Waffles")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("473");
                    } else if (str.equals("Salmon Bagel Bar")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("727");
                    } else if (str.equals("Turkey Bagel")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("544");
                    } else if (str.equals("Vegetarian Bagel")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("483");
                        //lunch
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("132");
                    } else if (str.equals("Roast Beef Wrap")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("102");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("187");
                    } else if (str.equals("Caprese Pizza")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("182");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("158");
                    } else if (str.equals("Pepperoni Pizza")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("192");
                    } else if (str.equals("Broccoli Cheddar Soup")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("106");
                    } else if (str.equals("Roots 3 Bean Chili")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("82");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("642");
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("298");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("377");
                    } else if (str.equals("Hamburger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("590");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("183");
                    } else if (str.equals("Fresh Garden Bar")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("26");
                    } else if (str.equals("Grilled Eggplant and Hummus Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("383");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("436");
                    } else if (str.equals("Cauliflower White Sauce")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("9");
                    } else if (str.equals("Cooked Whole Wheat Spaghetti")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("40");
                    } else if (str.equals("Marinara Sauce")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("15");
                    } else if (str.equals("Pasta Bar")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("161");
                    } else if (str.equals("Whole Wheat Pasta Cooked")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("37");
                    } else if (str.equals("Bread Pudding")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("225");
                    } else if (str.equals("Brownies")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("188");
                    } else if (str.equals("Carrot Cake Cookie")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("125");
                    } else if (str.equals("Chocolate Chip Cookie")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("380");
                    } else if (str.equals("Cookie, Sugar")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("167");
                    } else if (str.equals("Dinner Rolls")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("116");
                    } else if (str.equals("Double Chocolate Chip Cookie")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("170");
                    } else if (str.equals("Froot Loop Krispy Treats")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("120");
                    } else if (str.equals("Lemon Bars")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("132");
                    } else if (str.equals("Oatmeal Raisin Cookie")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("319");
                    } else if (str.equals("Peach Cobbler")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("235");
                    } else if (str.equals("Rice Krispy Treats")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("100");
                    } else if (str.equals("White Dinner Rolls")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("116");
                    } else if (str.equals("Moroccan Chickpea Wrap")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("579");
                    } else if (str.equals("Texas BBQ Cheese Burger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("764");
                    } else if (str.equals("French Fries")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("422");
                    } else if (str.equals("Mushroom Poutine")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("458");
                    } else if (str.equals("Chicken Breast Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("431");
                    } else if (str.equals("Chipotle Black Bean Burger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("465");
                    } else if (str.equals("Chixin Vegan Burger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("736");
                    } else if (str.equals("Double Hamburger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("825");
                    } else if (str.equals("Grilled Turkey Burger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("515");
                    } else if (str.equals("Plant Based Burger")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("620");
                    } else if (str.equals("Salmon Sandwich")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("680");
                    } else if (str.equals("Smoky Chicken Macaroni & Cheese")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("393");
                    } else if (str.equals("Garlic Bread")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("223");
                    } else if (str.equals("Turkey Corn Dog")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("402");
                    } else if (str.equals("Meat Lovers Pizza")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("430");
                        //dinner
                    } else if (str.equals("Rice Noodles")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("135");
                    } else if (str.equals("Udon Noodles")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("48");
                    } else if (str.equals("Yakisoba Noodle")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("122");
                    } else if (str.equals("Char Siu Pork")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("159");
                    } else if (str.equals("Chicken Thigh")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("62");
                    } else if (str.equals("Tofu Cubes")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("25");
                    } else if (str.equals("Citrus Ponzu sauce")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("23");
                    } else if (str.equals("Spicy Dragon sauce")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("33");
                    } else if (str.equals("Sweet Soy Ginger sauce")) {
                        TextView textView2 = findViewById(R.id.textView2);
                        textView2.setText("58");
                    }
                }
            });

            editText3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText3 = findViewById(R.id.editText3);
                    String str = editText3.getText().toString();
                    //breakfast
                    if (str.equals("Breakfast Hash Plate")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("64");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("82");
                    } else if (str.equals("Mini Biscuit")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("180");
                    } else if (str.equals("Scrambled Egg Whites")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("68");
                    } else if (str.equals("Smoked Bacon")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("159");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("149");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("52");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("90");
                    } else if (str.equals("Assorted Breakfast Toast")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("114");
                    } else if (str.equals("Banana Bread")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("240");
                    } else if (str.equals("Banana Craisin Muffins")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("118");
                    } else if (str.equals("Breakfast Streusel")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("206");
                    } else if (str.equals("Chocolate Chip Muffins")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("100");
                    } else if (str.equals("Gluten Friendly Bread")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("100");
                    } else if (str.equals("Zucchini Breakfast Muffins")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("92");
                    } else if (str.equals("Beans")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("136");
                    } else if (str.equals("Fresh Tortillas")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("114");
                    } else if (str.equals("Jalapenos")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("8");
                    } else if (str.equals("Buttermilk Pancakes")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("87");
                    } else if (str.equals("Texas French Toast")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("219");
                    } else if (str.equals("Cereal with Milk")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("134");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("101");
                    } else if (str.equals("Cut Fresh Fruit")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("39");
                    } else if (str.equals("Whole Apple")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("72");
                    } else if (str.equals("Whole Orange")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("55");
                    } else if (str.equals("Yogurt & Fruit Parfait")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("85");
                    } else if (str.equals("Yogurt Bar")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("127");
                    } else if (str.equals("Bacon")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("99");
                    } else if (str.equals("Pork Sausage Links")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("153");
                    } else if (str.equals("Tater Tots")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("415");
                    } else if (str.equals("Whole Banana")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("115");
                    } else if (str.equals("Avocado Toast")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("239");
                    } else if (str.equals("French Toast with Berries")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("476");
                    } else if (str.equals("Ricotta Cheese Pancake Plate")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("576");
                    } else if (str.equals("Smoked Salmon Eggs Benedict")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("343");
                    } else if (str.equals("Belgian Waffles")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("473");
                    } else if (str.equals("Salmon Bagel Bar")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("727");
                    } else if (str.equals("Turkey Bagel")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("544");
                    } else if (str.equals("Vegetarian Bagel")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("483");
                        //lunch
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("132");
                    } else if (str.equals("Roast Beef Wrap")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("102");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("187");
                    } else if (str.equals("Caprese Pizza")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("182");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("158");
                    } else if (str.equals("Pepperoni Pizza")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("192");
                    } else if (str.equals("Broccoli Cheddar Soup")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("106");
                    } else if (str.equals("Roots 3 Bean Chili")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("82");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("642");
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("298");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("377");
                    } else if (str.equals("Hamburger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("590");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("183");
                    } else if (str.equals("Fresh Garden Bar")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("26");
                    } else if (str.equals("Grilled Eggplant and Hummus Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("383");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("436");
                    } else if (str.equals("Cauliflower White Sauce")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("9");
                    } else if (str.equals("Cooked Whole Wheat Spaghetti")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("40");
                    } else if (str.equals("Marinara Sauce")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("15");
                    } else if (str.equals("Pasta Bar")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("161");
                    } else if (str.equals("Whole Wheat Pasta Cooked")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("37");
                    } else if (str.equals("Bread Pudding")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("225");
                    } else if (str.equals("Brownies")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("188");
                    } else if (str.equals("Carrot Cake Cookie")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("125");
                    } else if (str.equals("Chocolate Chip Cookie")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("380");
                    } else if (str.equals("Cookie, Sugar")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("167");
                    } else if (str.equals("Dinner Rolls")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("116");
                    } else if (str.equals("Double Chocolate Chip Cookie")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("170");
                    } else if (str.equals("Froot Loop Krispy Treats")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("120");
                    } else if (str.equals("Lemon Bars")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("132");
                    } else if (str.equals("Oatmeal Raisin Cookie")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("319");
                    } else if (str.equals("Peach Cobbler")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("235");
                    } else if (str.equals("Rice Krispy Treats")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("100");
                    } else if (str.equals("White Dinner Rolls")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("116");
                    } else if (str.equals("Moroccan Chickpea Wrap")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("579");
                    } else if (str.equals("Texas BBQ Cheese Burger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("764");
                    } else if (str.equals("French Fries")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("422");
                    } else if (str.equals("Mushroom Poutine")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("458");
                    } else if (str.equals("Chicken Breast Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("431");
                    } else if (str.equals("Chipotle Black Bean Burger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("465");
                    } else if (str.equals("Chixin Vegan Burger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("736");
                    } else if (str.equals("Double Hamburger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("825");
                    } else if (str.equals("Grilled Turkey Burger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("515");
                    } else if (str.equals("Plant Based Burger")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("620");
                    } else if (str.equals("Salmon Sandwich")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("680");
                    } else if (str.equals("Smoky Chicken Macaroni & Cheese")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("393");
                    } else if (str.equals("Garlic Bread")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("223");
                    } else if (str.equals("Turkey Corn Dog")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("402");
                    } else if (str.equals("Meat Lovers Pizza")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("430");
                        //dinner
                    } else if (str.equals("Rice Noodles")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("135");
                    } else if (str.equals("Udon Noodles")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("48");
                    } else if (str.equals("Yakisoba Noodle")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("122");
                    } else if (str.equals("Char Siu Pork")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("159");
                    } else if (str.equals("Chicken Thigh")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("62");
                    } else if (str.equals("Tofu Cubes")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("25");
                    } else if (str.equals("Citrus Ponzu sauce")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("23");
                    } else if (str.equals("Spicy Dragon sauce")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("33");
                    } else if (str.equals("Sweet Soy Ginger sauce")) {
                        TextView textView3 = findViewById(R.id.textView3);
                        textView3.setText("58");
                    }
                }
            });

            editText4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    AutoCompleteTextView editText4 = findViewById(R.id.editText4);
                    String str = editText4.getText().toString();
                    //breakfast
                    if (str.equals("Breakfast Hash Plate")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("64");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("82");
                    } else if (str.equals("Mini Biscuit")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("180");
                    } else if (str.equals("Scrambled Egg Whites")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("68");
                    } else if (str.equals("Smoked Bacon")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("159");
                    } else if (str.equals("Soyrizo Scrambled Eggs")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("149");
                    } else if (str.equals("Steelcut Oatmeal")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("52");
                    } else if (str.equals("Turkey Sausage")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("70");
                    } else if (str.equals("Veggie Sausage")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("90");
                    } else if (str.equals("Assorted Breakfast Toast")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("114");
                    } else if (str.equals("Banana Bread")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("240");
                    } else if (str.equals("Banana Craisin Muffins")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("118");
                    } else if (str.equals("Breakfast Streusel")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("206");
                    } else if (str.equals("Chocolate Chip Muffins")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("100");
                    } else if (str.equals("Gluten Friendly Bread")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("100");
                    } else if (str.equals("Zucchini Breakfast Muffins")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("92");
                    } else if (str.equals("Beans")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("136");
                    } else if (str.equals("Fresh Tortillas")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("114");
                    } else if (str.equals("Jalapenos")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("8");
                    } else if (str.equals("Buttermilk Pancakes")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("87");
                    } else if (str.equals("Texas French Toast")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("219");
                    } else if (str.equals("Cereal with Milk")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("134");
                    } else if (str.equals("Chia Seed Pudding")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("101");
                    } else if (str.equals("Cut Fresh Fruit")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("39");
                    } else if (str.equals("Whole Apple")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("72");
                    } else if (str.equals("Whole Orange")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("55");
                    } else if (str.equals("Yogurt & Fruit Parfait")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("85");
                    } else if (str.equals("Yogurt Bar")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("127");
                    } else if (str.equals("Bacon")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("99");
                    } else if (str.equals("Pork Sausage Links")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("153");
                    } else if (str.equals("Tater Tots")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("415");
                    } else if (str.equals("Whole Banana")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("115");
                    } else if (str.equals("Avocado Toast")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("239");
                    } else if (str.equals("French Toast with Berries")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("476");
                    } else if (str.equals("Ricotta Cheese Pancake Plate")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("576");
                    } else if (str.equals("Smoked Salmon Eggs Benedict")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("343");
                    } else if (str.equals("Belgian Waffles")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("473");
                    } else if (str.equals("Salmon Bagel Bar")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("727");
                    } else if (str.equals("Turkey Bagel")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("544");
                    } else if (str.equals("Vegetarian Bagel")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("483");
                        //lunch
                    } else if (str.equals("Jackfruit Tunaless Wrap")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("132");
                    } else if (str.equals("Roast Beef Wrap")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("102");
                    } else if (str.equals("Turkey & Swiss Super Sub")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("187");
                    } else if (str.equals("Caprese Pizza")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("182");
                    } else if (str.equals("Cheese Pizza")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("158");
                    } else if (str.equals("Pepperoni Pizza")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("192");
                    } else if (str.equals("Broccoli Cheddar Soup")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("106");
                    } else if (str.equals("Roots 3 Bean Chili")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("82");
                    } else if (str.equals("Cheeseburger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("642");
                    } else if (str.equals("Crispy French Fries")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("236");
                    } else if (str.equals("Crispy Onion Rings")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("322");
                    } else if (str.equals("Fried Chicken Fritters")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("298");
                    } else if (str.equals("Gardein Burger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("290");
                    } else if (str.equals("Grilled Cheese Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("632");
                    } else if (str.equals("Grilled Chicken Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("377");
                    } else if (str.equals("Hamburger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("590");
                    } else if (str.equals("Sweet Potato Fries")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("183");
                    } else if (str.equals("Fresh Garden Bar")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("26");
                    } else if (str.equals("Grilled Eggplant and Hummus Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("383");
                    } else if (str.equals("Hot Dog")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("436");
                    } else if (str.equals("Cauliflower White Sauce")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("9");
                    } else if (str.equals("Cooked Whole Wheat Spaghetti")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("40");
                    } else if (str.equals("Marinara Sauce")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("15");
                    } else if (str.equals("Pasta Bar")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("161");
                    } else if (str.equals("Whole Wheat Pasta Cooked")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("37");
                    } else if (str.equals("Bread Pudding")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("225");
                    } else if (str.equals("Brownies")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("188");
                    } else if (str.equals("Carrot Cake Cookie")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("125");
                    } else if (str.equals("Chocolate Chip Cookie")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("380");
                    } else if (str.equals("Cookie, Sugar")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("167");
                    } else if (str.equals("Dinner Rolls")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("116");
                    } else if (str.equals("Double Chocolate Chip Cookie")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("170");
                    } else if (str.equals("Froot Loop Krispy Treats")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("120");
                    } else if (str.equals("Lemon Bars")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("132");
                    } else if (str.equals("Oatmeal Raisin Cookie")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("319");
                    } else if (str.equals("Peach Cobbler")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("235");
                    } else if (str.equals("Rice Krispy Treats")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("100");
                    } else if (str.equals("White Dinner Rolls")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("116");
                    } else if (str.equals("Moroccan Chickpea Wrap")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("579");
                    } else if (str.equals("Texas BBQ Cheese Burger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("764");
                    } else if (str.equals("French Fries")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("422");
                    } else if (str.equals("Mushroom Poutine")) {
                        TextView textView4= findViewById(R.id.textView4);
                        textView4.setText("458");
                    } else if (str.equals("Chicken Breast Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("431");
                    } else if (str.equals("Chipotle Black Bean Burger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("465");
                    } else if (str.equals("Chixin Vegan Burger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("736");
                    } else if (str.equals("Double Hamburger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("825");
                    } else if (str.equals("Grilled Turkey Burger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("515");
                    } else if (str.equals("Plant Based Burger")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("620");
                    } else if (str.equals("Salmon Sandwich")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("680");
                    } else if (str.equals("Smoky Chicken Macaroni & Cheese")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("393");
                    } else if (str.equals("Garlic Bread")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("223");
                    } else if (str.equals("Turkey Corn Dog")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("402");
                    } else if (str.equals("Meat Lovers Pizza")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("430");
                        //dinner
                    } else if (str.equals("Rice Noodles")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("135");
                    } else if (str.equals("Udon Noodles")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("48");
                    } else if (str.equals("Yakisoba Noodle")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("122");
                    } else if (str.equals("Char Siu Pork")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("159");
                    } else if (str.equals("Chicken Thigh")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("62");
                    } else if (str.equals("Tofu Cubes")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("25");
                    } else if (str.equals("Citrus Ponzu sauce")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("23");
                    } else if (str.equals("Spicy Dragon sauce")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("33");
                    } else if (str.equals("Sweet Soy Ginger sauce")) {
                        TextView textView4 = findViewById(R.id.textView4);
                        textView4.setText("58");
                    }
                }
            });

            Button calculate = findViewById(R.id.calculate);
            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView textView1 = findViewById(R.id.textView1);
                    TextView textView2 = findViewById(R.id.textView2);
                    TextView textView3 = findViewById(R.id.textView3);
                    TextView textView4 = findViewById(R.id.textView4);

                    String s1 =  textView1.getText().toString();
                    String s2 =  textView2.getText().toString();
                    String s3 =  textView3.getText().toString();
                    String s4 =  textView4.getText().toString();

                    if (s1.equals("Calories") && s2.equals("Calories")
                            && s3.equals("Calories") && s4.equals("Calories")) {
                        int n1 = 0;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n1));
                    } else if (s2.equals("Calories") && s3.equals("Calories")
                            && s4.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n1));
                    } else if (s1.equals("Calories") && s3.equals("Calories")
                            && s4.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n2));
                    } else if (s1.equals("Calories") && s2.equals("Calories")
                            && s4.equals("Calories")) {
                        int n3 = Integer.parseInt(s3);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n3));
                    } else if (s1.equals("Calories") && s2.equals("Calories") &&
                            s3.equals("Calories")) {
                        int n4 = Integer.parseInt(s4);

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(n4));
                    } else if (s3.equals("Calories") && s4.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n2 = Integer.parseInt(s2);

                        int res = n1 + n2;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s2.equals("Calories") && s4.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n3 = Integer.parseInt(s3);

                        int res = n1 + n3;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s2.equals("Calories") && s3.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n4 = Integer.parseInt(s4);

                        int res = n1 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories") && s4.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);

                        int res = n2 + n3;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories") && s3.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n4 = Integer.parseInt(s4);

                        int res = n2 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories") && s2.equals("Calories")) {

                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s1.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n2 + n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s2.equals("Calories")) {
                        int n1 = Integer.parseInt(s1);
                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n1 + n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else if (s3.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n1 = Integer.parseInt(s1);
                        int n4 = Integer.parseInt(s4);

                        int res = n2 + n1 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));

                    } else if (s4.equals("Calories")) {
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);
                        int n1 = Integer.parseInt(s1);

                        int res = n2 + n3 + n1;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    } else {
                        int n1= Integer.parseInt(s1);
                        int n2 = Integer.parseInt(s2);
                        int n3 = Integer.parseInt(s3);
                        int n4 = Integer.parseInt(s4);

                        int res = n1 + n2 + n3 + n4;

                        TextView total = findViewById(R.id.total);
                        total.setText(String.valueOf(res));
                    }
                }
            });
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
