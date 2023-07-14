package com.example.petcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButtonPressed(View buttonView){
        EditText petBornText = findViewById(R.id.editTextTextPersonName);
        int petAge = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(petBornText.getText().toString());
        TextView petAgeTextView = findViewById(R.id.textView);
        petAgeTextView.setText(petAge + " ");



    }




    }
}