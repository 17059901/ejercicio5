package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    TextView tvresult;
    EditText editm, edite, editi, edita, edith;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editm = (EditText) findViewById(R.id.edit1);
        edite = (EditText) findViewById(R.id.edit2);
        editi = (EditText) findViewById(R.id.edit3);
        edita = (EditText) findViewById(R.id.edit4);
        edith = (EditText) findViewById(R.id.edit5);
        bt1 = (Button) findViewById(R.id.bt1);
        tvresult = (TextView) findViewById(R.id.tv_resultado);
    }

    public void calcular(View view) {

        String edit1_String =editm .getText().toString();
        String edit2_String =edite .getText().toString();
        String edit3_String =editi .getText().toString();
        String edit4_String =edita .getText().toString();
        String edit5_String =edith .getText().toString();

        int edit1_int = Integer.parseInt(edit1_String);
        int edit2_int = Integer.parseInt(edit2_String);
        int edit3_int = Integer.parseInt(edit3_String);
        int edit4_int = Integer.parseInt(edit4_String);
        int edit5_int = Integer.parseInt(edit5_String);

        int promedio = (edit1_int + edit2_int + edit3_int + edit4_int + edit5_int) / 5;
        if (promedio >= 9) {
            tvresult.setText("Eres buen estudiante. Calificacion: " + promedio);
        } else if (promedio >=8  ) {
            tvresult.setText("Vas bien pero debes mejorar. Calificacion: " + promedio);
        } else if (promedio >= 6) {
            tvresult.setText("Estas aprobando de panzazo. Calificacion: " + promedio);
        } else if (promedio <= 5) {
            tvresult.setText("Reprobado. Calificacion: " + promedio);
        } else {
            tvresult.setText("Gracias por participar!!");
        }

    }
}
