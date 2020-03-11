package com.example.week4tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "au.edu.unsw.infs3634.beers.message";
    private Button mButton;
    private EditText searchFunction;
    String searchValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchFunction = findViewById(R.id.edtSearch);

        mButton = findViewById(R.id.btnActivity2);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchValue = searchFunction.getText().toString();
                launchActivity2(searchValue);
            }
        });

    }

    private void launchActivity2(String message) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
