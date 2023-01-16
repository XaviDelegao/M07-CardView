package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mNameEditText;
    private EditText mSurnameEditText;
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameEditText = findViewById(R.id.name_edit_text);
        mSurnameEditText = findViewById(R.id.surname_edit_text);
        mSubmitButton = findViewById(R.id.submit_button);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mNameEditText.getText().toString();
                String surname = mSurnameEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("surname", surname);
                startActivity(intent);
            }
        });
    }
}