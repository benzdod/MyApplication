package com.example.a35_sdu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString, userString, passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    nameEditText = findViewById(R.id.txtName);
    usernameEditText = findViewById(R.id.txtUsername);
    passwordEditText = findViewById(R.id.txtPassword);
    loginButton = findViewById(R.id.btnLogin);

    loginButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            nameString = nameEditText.getText().toString().trim();
            userString = usernameEditText.getText().toString().trim();
            passString = passwordEditText.getText().toString().trim();

            if((nameString.length()==0)||(userString.length()==0)||(passString.length()==0)) {
                Toast.makeText(getApplicationContext(), "กรุณาใส่ข้อมูลให้ครบทุกช่อง!", Toast.LENGTH_SHORT).show();

            }

                if ((userString.equals("admin")) && (passString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();


                Intent mainIntent = new Intent(MainActivity.this, MainActivity.class);
                mainIntent.putExtra("nameString", nameString);
                startActivity(mainIntent);

            } else {
                Toast.makeText(getApplicationContext(), "Login Fail!!", Toast.LENGTH_SHORT).show();
            }
        }
    });





    }
}
