package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText q = findViewById(R.id.quiz);
        final EditText h = findViewById(R.id.hw);
        final EditText m = findViewById(R.id.mid);
        final EditText f = findViewById(R.id.finale);
        final TextView result = findViewById(R.id.result);
        final Button cal = findViewById(R.id.button);
        final Button resButton = findViewById(R.id.button2);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String qString = q.getText().toString();
                String hString = h.getText().toString();
                String mString = m.getText().toString();
                String fString = f.getText().toString();
//        g stands for grade
                    double g = Double.parseDouble(qString) + Double.parseDouble(hString) + Double.parseDouble(mString) + Double.parseDouble(fString);
                    System.out.println("////g is" + g);
                    if (g>89) {
                        String grade = "A";
                        result.setTextColor(Color.GREEN);
                        result.setText(grade);
                    } else if (g < 90 && g>79) {
                        String grade = "B";
                        result.setTextColor(Color.BLUE);
                        result.setText(grade);
                    } else if (g <80 && g>69) {
                        String grade = "C";
                        result.setTextColor(Color.CYAN);
                        result.setText(grade);
                    } else if (g>59 && g<70) {
                        String grade = "D";
                        result.setTextColor(Color.YELLOW);
                        result.setText(grade);
                    } else {
                        String grade = "F";
                        result.setTextColor(Color.RED);
                        result.setText(grade);
                    }
                }
            });
resButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        q.getText().clear();
        h.getText().clear();
        m.getText().clear();
        f.getText().clear();
        result.setTextColor(Color.parseColor("#FF9A76"));
        result.setText("Result");
    }
});
        }
    }
