package com.lenovo.thegaurdian.Activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import com.lenovo.thegaurdian.R;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {


    private AutoCompleteTextView Name;
    private EditText Password;
    private Button btn;

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (AutoCompleteTextView) findViewById(R.id.email);
        Password = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.email_sign_in_button);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //if(isEmailValid(Name.toString())&&isPasswordValid(Password.toString()))
                {
                    Log.d("d", "clicked");
                    openDialog();
                }
            }
        });
    }


    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

    public void openDialog() {
        Log.d("d", "dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.activity_dialog, null);

        builder.setView(view);

        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        Button careTakerBtn = view.findViewById(R.id.btnCareTaker);
        careTakerBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, CareTakerHomeActivity.class));
            }
        });

        Button dependent = view.findViewById(R.id.btnDependent);
        dependent.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, DependentHomeActivity.class));
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }


}

