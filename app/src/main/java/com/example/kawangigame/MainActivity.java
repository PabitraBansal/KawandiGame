package com.example.kawangigame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText simpleEditText = (EditText) findViewById(R.id.editText);
        String editTextValue = simpleEditText.getText().toString();
        int colourNum = Integer.parseInt(editTextValue);
//         if (colourNum >= 8 && colourNum <= 12)
        if (colourNum >= 8){
            if(colourNum <= 12){
                Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
