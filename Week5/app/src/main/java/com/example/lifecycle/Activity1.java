package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    public static String MESSAGE = "message";
    EditText messageTo2;
    TextView receivedText1;
    TextView ackText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        messageTo2 = findViewById(R.id.messageText1);
        receivedText1 = findViewById(R.id.receivedText1);
        ackText1 = findViewById(R.id.ackText1);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String message = bundle.getString(BundleActivity.MESSAGE);
            receivedText1.setText(message);
            ackText1.setText(R.string.reply_received);
        }
    }

    public void toActivity2(View view) {
        Intent toActivity2Intent = new Intent(Activity1.this, Activity2.class);
        toActivity2Intent.putExtra(MESSAGE, messageTo2.getText().toString());
        startActivity(toActivity2Intent);
    }
}
