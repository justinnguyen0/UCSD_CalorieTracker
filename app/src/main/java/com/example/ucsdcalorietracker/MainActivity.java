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
            "Mini Biscuit", "Country Potatoes",
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
            "Aztec Black Beans", "Spanish Rice", "Steamed Vegetable Mix",
            //dinner
            "Grilled New York Steak Strip", "Penne Bake", "Seared Salmon With Lentils",
            "Au Gratin Potatoes with Green Chile", "Steamed Broccoli", "Steamed Brown Rice",
            "Chop Chop Salmon Bowl", "Chop Chop Tuna Bowl", "Pollo Moreno",
            "Salmon w/Tomato and Fennel", "Wild Rice Pilaf", "Pan Blasted Stir-fry with Chicken",
            "Pan Blasted Stir-fry with Pork", "Pan Blasted Stir-fry with Tofu"
    };

    private static final String[] PINES = new String[] {
            //breakfast
            "Breakfast Hash Plate", "Cage Free Scrambled Eggs", "Country Potatoes", "Mini Biscuit",
            "Scrambled Egg Whites", "Smoked Bacon", "Soyrizo Scrambled Eggs", "Steelcut Oatmeal",
            "Turkey Sausage", "Veggie Sausage", "Beans", "Fresh Tortillas", "Jalapenos",
            "Cereal with Milk", "Chia Seed Pudding", "Cut Fresh Fruit", "Whole Apple",
            "Whole Banana", "Whole Orange", "Yogurt & Fruit Parfait", "Yogurt Bar",
            "Assorted Breakfast Toast", "Banana Bread", "Banana Craisin Muffins",
            "Blueberry Muffin", "Breakfast Streusel", "Chocolate Chip Muffins",
            "Gluten Friendly Bread", "Zucchini Breakfast Muffins", "Buttermilk Pancakes",
            "Texas French Toast",
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
                        textView1.setText("2242");
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
                        textView2.setText("2242");
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
                        textView3.setText("2242");
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
                        textView4.setText("2242");
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

            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, VENTANAS);
            editText1.setAdapter(adapter3);

            editText2.setAdapter(adapter3);

            editText3.setAdapter(adapter3);

            editText4.setAdapter(adapter3);
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

            ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, PINES);
            editText1.setAdapter(adapter6);

            editText2.setAdapter(adapter6);

            editText3.setAdapter(adapter6);

            editText4.setAdapter(adapter6);

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
