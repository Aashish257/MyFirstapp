package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

import static android.util.Log.e;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";
    private TextView TextView;
    private Button button;
    private FrameLayout mFrameLayout;

    public static final String NAME = "Aashish";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        mFrameLayout = findViewById(R.id.frame_layout);

        TextView.setText("Aashish");

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                new BlankFragment()).commit();

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this, SecondActivity2.class);
            intent.putExtra(NAME, TextView.getText().toString());
            startActivity(intent);
            finish();



 //           Log.e(TAG, "onClick: " + textview.getText().toString());
 //           Toast toast = Toast.makeText(getApplicationContext(),"Button pressed!",Toast.LENGTH_SHORT);
 //           toast.show();
        });

    }
}