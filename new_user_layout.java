package com.example.win.itm801thesismap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by win on 04/2/2560.
 */

public class new_user_layout extends Activity {
    private EditText userFname ,userLname,userEmail,userLogin,userPassword, userRePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user_layout);

        Button button_confirm = (Button) findViewById(R.id.button_confirm);
        Button button_cancel = (Button) findViewById(R.id.button_cancel);
        Button button_close = (Button) findViewById(R.id.button_close);

        final EditText editTextFname = (EditText) findViewById(R.id.editText_fname);
        final EditText editTextLname = (EditText) findViewById(R.id.editText_lname);
        final EditText editTextEmail = (EditText) findViewById(R.id.editText_email);
        final EditText editTextUseLogin = (EditText) findViewById(R.id.editText_user_login);
        final EditText editTextpassword = (EditText) findViewById(R.id.editText_password);
        final EditText editTextRepassword = (EditText) findViewById(R.id.editText_repassword);

        // Confirm จัดเก็บ
        button_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Save ลง database และ Return ไปหน้า login
            }
        }); // Confirm

        //Clear Screen
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextFname.setText(null);
                editTextLname.setText(null);
                editTextEmail.setText(null);
                editTextUseLogin.setText(null);
                editTextpassword.setText(null);
                editTextRepassword.setText(null);
              }
        });//Clear Screen

        //Close
        button_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        }); //Close


    }
}
