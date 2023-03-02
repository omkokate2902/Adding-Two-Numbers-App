package com.example.addingtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView5;
    EditText n1,n2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        textView5=findViewById(R.id.textView5);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
                textView5.setText("The sum is : "+ sum);
                Toast.makeText(MainActivity.this, "Addition Done!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}