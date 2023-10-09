package com.example.u1ptciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "En onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "En onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "En onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "En onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "En onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "En onDestroy", Toast.LENGTH_SHORT).show();
    }

    public void seDaClick(View view) {
        // se hace la asociación
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextText);

        textView.setText(editText.getText().toString());
    }

    public void abreActivity2(View view) {
        //el intent crea la intención de abrir una nueva ventana
        Intent intent = new Intent(view.getContext(), MainActivity2.class);
        view.getContext().startActivity(intent);
    }

    public void abreActivity3(View view) {
        Intent intent = new Intent(view.getContext(), MainActivity3.class);
        view.getContext().startActivity(intent);
    }
}


    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "En onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "En onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "En onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "En onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "En onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "En onDestroy", Toast.LENGTH_SHORT).show();
    }

    public void seDaClick(View view) {
        // se hace la asociación
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editTextText); //aquí me mandaba error: el ejemplo era id.eT1

        textView.setText(editText.getText().toString());
    }*/