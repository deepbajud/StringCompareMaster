package com.example.stringcomparemasterbajud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button submitButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        submitButton = findViewById(R.id.submitButton);
        resultTextView = findViewById(R.id.resultTextView);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = editText1.getText().toString();
                String input2 = editText2.getText().toString();

                String unmatchedCharacters = findUnmatchedCharacters(input1, input2);
                resultTextView.setText(unmatchedCharacters);
            }
        });
    }

    private String findUnmatchedCharacters(String text1, String text2) {
        StringBuilder unmatched = new StringBuilder();

        for (char c : text1.toCharArray()) {
            if (text2.indexOf(c) == -1) {
                unmatched.append(c);
            }
        }

        return unmatched.toString();
    }
}
