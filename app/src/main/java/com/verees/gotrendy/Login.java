package com.verees.gotrendy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);
        submit=findViewById(R.id.button3);
        /*this code is to enanble a method to listen for input changes
         in the edit text field such that the button remains disabled
         unless something is input*/

        username.addTextChangedListener(vicky);
        password.addTextChangedListener(vicky);
    }
    private TextWatcher vicky=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//get input directly from edit text
            String usernameinput=username.getText().toString().trim();
            String passwordinput=password.getText().toString().trim();
            //we then check if fields are empty
            submit.setEnabled(!usernameinput.isEmpty()
                    && !passwordinput.isEmpty());
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Login.this,Cardview.class);
                    startActivity(intent);
                }
            });
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    }
