package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText emailAddressEditText;
    private EditText phoneEditText;
    private TextView credentials;
    private CheckBox terms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailAddressEditText = findViewById(R.id.emailAddressEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        terms = findViewById(R.id.termsCheckBox);
        credentials = findViewById(R.id.credentialsEditText);
    }

    public void LoginOnClick(View view) {
        String email = emailAddressEditText.getText().toString();
        String phone = phoneEditText.getText().toString();
        if (email.isEmpty()) {
            emailAddressEditText.setError(getString(R.string.error_fill_email));
        }
        else{
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailAddressEditText.setError(getString(R.string.error_validate_email));
            }
        }
        if (phone.isEmpty()) {
            phoneEditText.setError(getString(R.string.error_fill_phone));
        }
        if (!terms.isChecked()) {
            Toast.makeText(this, "Please check the box", Toast.LENGTH_LONG).show();
        }
        if (!email.isEmpty() && !phone.isEmpty()) {
            credentials.append(email + "\n" + phone + "\n" + terms.isChecked() + "\n");
        }
    }
}
