package com.example.registeration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnCome;
    private EditText password;
    private EditText gmail;
    private TextView toolOut, out, register, forgot, tap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCome = findViewById(R.id.btn_come);
        password = findViewById(R.id.password);
        gmail = findViewById(R.id.gmail);
        toolOut = findViewById(R.id.tool_out);
        out = findViewById(R.id.out);
        register=findViewById(R.id.register);
        forgot=findViewById(R.id.forgot);
        tap=findViewById(R.id.tap);


        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (password.getText().toString().isEmpty()) {
                    btnCome.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.silver));
                } else {
                    btnCome.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (gmail.getText().toString().isEmpty()) {
                    btnCome.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.silver));
                } else {
                    btnCome.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        btnCome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(password.getText().toString().equals("name") && gmail.getText().toString().equals("name")){
                    toolOut.setVisibility(View.INVISIBLE);
                    out.setVisibility(View.INVISIBLE);
                    register.setVisibility(View.INVISIBLE);
                    forgot.setVisibility(View.INVISIBLE);
                    tap.setVisibility(View.INVISIBLE);
                    btnCome.setVisibility(View.INVISIBLE);
                    password.setVisibility(View.INVISIBLE);
                    gmail.setVisibility(View.INVISIBLE);
                }else{
                    Toast.makeText(MainActivity.this,"dont work",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}