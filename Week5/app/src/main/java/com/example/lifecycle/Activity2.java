package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    EditText messageTo1;
    TextView receivedText2;
    TextView ackText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        messageTo1 = findViewById(R.id.messageText2);
        receivedText2 = findViewById(R.id.receivedText2);
        ackText2 = findViewById(R.id.ackText2);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String message = bundle.getString(BundleActivity.MESSAGE);
            receivedText2.setText(message);
            ackText2.setText(R.string.message_received);
        }
    }

    public void toActivity1(View view) {
        Intent toActivity1Intent = new Intent(Activity2.this, Activity1.class);
        toActivity1Intent.putExtra(Activity1.MESSAGE, messageTo1.getText().toString());
        toActivity1Intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(toActivity1Intent);
        finish();
    }
}
