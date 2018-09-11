package com.example.srinivasrao.projectv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private EditText Login;
   private EditText Password;
   private Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login=(EditText)findViewById(R.id.etLogin);
        Password=(EditText)findViewById(R.id.etPassword);
        Submit=(Button)findViewById(R.id.etButton);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
            }
        });

    }
    private void validate(){
        String user=Login.getText().toString().trim();
        String Pass=Password.getText().toString().trim();
        if(user.equals("vasu")&& Pass.equals("1234")){
            Toast.makeText(this,"submitted",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"LOgin id,password don't match", Toast.LENGTH_SHORT).show();
        }
    }
}
