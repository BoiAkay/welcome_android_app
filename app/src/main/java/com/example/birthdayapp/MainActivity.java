package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BtnCick(View view)
    {

        EditText mEdit   = (EditText)findViewById(R.id.editText1);
        String myString = mEdit.getText().toString();
        Toast.makeText(this, "Creating Card", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        intent.putExtra("KEY_MESSAGE", myString);
        startActivity(intent);

    }
}