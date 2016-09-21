package edu.orangecoastcollege.cs273.dpham147.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class SummaryActivity extends AppCompatActivity {

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public TextView totalTextView;
    public TextView itemsTextView;
    public TextView subtotalTextView;
    public TextView taxTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        totalTextView = (TextView) findViewById(R.id.totalTextView);
        itemsTextView = (TextView) findViewById(R.id.itemsTextView);
        subtotalTextView = (TextView) findViewById(R.id.subtotalTextView);
        taxTextView = (TextView) findViewById(R.id.taxTextView);

        Intent intentFromOrderActivity = getIntent();
        totalTextView.setText(currency.format(intentFromOrderActivity.getStringExtra("Total")));
        subtotalTextView.setText(intentFromOrderActivity.getStringExtra("Subtotal"));
        itemsTextView.setText(intentFromOrderActivity.getStringExtra("TotalItems"));
        taxTextView.setText(intentFromOrderActivity.getStringExtra("Tax"));
    }

    public void returnToOrder(View view){
        this.finish();
    }
}
