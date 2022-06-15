package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Calcular extends AppCompatActivity {

    EditText _numero1, _numero2;
    RadioButton _suma, _resta, _multiplicación, _división;
    Button _btnCalcular;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        _numero1 = findViewById(R.id.numero1);
        _numero2 = findViewById(R.id.numero2);

        _suma = findViewById(R.id.suma);
        _resta = findViewById(R.id.resta);
        _multiplicación = findViewById(R.id.multiplicación);
        _división = findViewById(R.id.división);

        _btnCalcular = findViewById(R.id.btnCalcular);

        _btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_numero1.getText().toString().length() < 1) {
                    Toast.makeText(getApplicationContext(), "Ingrese un número 1", Toast.LENGTH_LONG).show();

                } else if (_numero1.getText().toString().length() < 1) {
                    Toast.makeText(getApplicationContext(), "Ingrese un número 2", Toast.LENGTH_LONG).show();

                } else {
                    if (_suma.isChecked())
                        operacion = "suma";
                    if (_resta.isChecked())
                        operacion = "restaa";
                    if (_multiplicación.isChecked())
                        operacion = "multiplicación";
                    if (_división.isChecked())
                        operacion = "división";

                    Intent i = new Intent(getApplicationContext(), ResultadoActivity.class);
                    i.putExtra("numero 1", _numero1.getText().toString());
                    i.putExtra("numero 2", _numero2.getText().toString());
                    i.putExtra("operacion", operacion);
                    startActivity(i);

                }
            }
        });
    }
}





