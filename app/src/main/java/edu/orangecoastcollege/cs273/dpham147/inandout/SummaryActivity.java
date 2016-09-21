package edu.orangecoastcollege.cs273.dpham147.inandout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

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
    }
}
