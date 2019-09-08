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
                    if (str.equals("Beans")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("136");
                    } else if (str.equals("Cage Free Scrambled Eggs")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("151");
                    } else if (str.equals("Country Potatoes")) {
                        TextView textView1 = findViewById(R.id.textView1);
                        textView1.setText("82");
                    }



                }
            });




        } else if (position == 1) {
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

        } else if (position == 2){
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

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

        } else if (position == 4) {
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

        } else {
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");

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
