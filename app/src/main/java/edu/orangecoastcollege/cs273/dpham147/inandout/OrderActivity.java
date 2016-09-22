package edu.orangecoastcollege.cs273.dpham147.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.text.NumberFormat;

public class OrderActivity extends AppCompatActivity {

    private EditText doubleDoubleEditText;
    private EditText cheeseburgerEditText;
    private EditText frenchFriesEditText;
    private EditText shakesEditText;
    private EditText smallDrinkEditText;
    private EditText mediumDrinkEditText;
    private EditText largeDrinkEditText;

    private String total;
    private String subtotal;
    private String tax;
    private String totalItems;

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();


    private Order currentOrder = new Order();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        doubleDoubleEditText = (EditText) findViewById(R.id.doubleDoubleEditText);
        cheeseburgerEditText= (EditText) findViewById(R.id.cheeseburgerEditText);
        frenchFriesEditText = (EditText) findViewById(R.id.frenchFriesEditText);
        shakesEditText = (EditText) findViewById(R.id.shakesEditText);
        smallDrinkEditText = (EditText) findViewById(R.id.smallDrinkEditText);
        mediumDrinkEditText = (EditText) findViewById(R.id.mediumDrinkEditText);
        largeDrinkEditText = (EditText) findViewById(R.id.largeDrinkEditText);
    }

    public void placeOrder(View view){
        int doubleDouble, cheeseburgers, fries, shakes, smDrink, medDrink,lgDrink;

        try {
            doubleDouble = Integer.parseInt(doubleDoubleEditText.getText().toString());
            cheeseburgers = Integer.parseInt(cheeseburgerEditText.getText().toString());
            fries = Integer.parseInt(frenchFriesEditText.getText().toString());
            shakes = Integer.parseInt(shakesEditText.getText().toString());
            smDrink = Integer.parseInt(smallDrinkEditText.getText().toString());
            medDrink =Integer.parseInt(mediumDrinkEditText.getText().toString());
            lgDrink = Integer.parseInt(largeDrinkEditText.getText().toString());
        }
        catch (NumberFormatException e){
            doubleDouble = 0;
            cheeseburgers = 0;
            fries = 0;
            shakes = 0;
            smDrink = 0;
            medDrink = 0;
            lgDrink = 0;
        }

        currentOrder.setmCheeseburgers(cheeseburgers);
        currentOrder.setmDoubleDoubles(doubleDouble);
        currentOrder.setmFrenchFries(fries);
        currentOrder.setmShakes(shakes);
        currentOrder.setmSmallDrinks(smDrink);
        currentOrder.setmMediumDrinks(medDrink);
        currentOrder.setmLargeDrinks(lgDrink);

        total = currency.format(currentOrder.calculateTotal());
        subtotal = currency.format(currentOrder.calculateSubtotal());
        tax = currency.format(currentOrder.calculateTax());
        totalItems = String.valueOf(currentOrder.getNumberItemsOrdered());

        Intent orderIntent = new Intent(this, SummaryActivity.class);
        orderIntent.putExtra("Total", total);
        orderIntent.putExtra("Subtotal", subtotal);
        orderIntent.putExtra("Tax", tax);
        orderIntent.putExtra("TotalItems", totalItems);

        startActivity(orderIntent);
    }


}
