package com.example.encuesta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv3, tv4;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;
    private RadioGroup rg2;
    private Button btn1, btn3;
    int i = 1;
    int totalPersonas;
    int acumRb4 = 0;
    int acumRb5 = 0;
    int acumRb6 = 0;
    int acumRb7 = 0;
    int acumRb8 = 0;
    String tipoEncuesta;
    String preguntaMostrada;
    String resultadosDeportes, resultadosArte, resultadosCine, resultadosTransporte, resultadosComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.e1);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        rb5 = findViewById(R.id.rb5);
        rb6 = findViewById(R.id.rb6);
        rb7 = findViewById(R.id.rb7);
        rb8 = findViewById(R.id.rb8);
        rb9 = findViewById(R.id.rb9);
        rb10 = findViewById(R.id.rb10);
        rg2 = findViewById(R.id.rg2);
        btn1 = findViewById(R.id.btn1);
        btn3 = findViewById(R.id.btn3);
        tv3.setVisibility(View.INVISIBLE);
        rg2.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
    }

    public void encuesta (View view){
        int i = 1;
        acumRb4 = 0;
        acumRb5 = 0;
        acumRb6 = 0;
        acumRb7 = 0;
        acumRb8 = 0;
        tv3.setVisibility(View.VISIBLE);
        rg2.setVisibility(View.VISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.VISIBLE);
        totalPersonas =  Integer.parseInt(et1.getText().toString());
        if(rb1.isChecked() == true){
            tipoEncuesta = "DEPORTES";
            preguntasDeportes(view, i);
        }else if (rb2.isChecked() == true) {
            tipoEncuesta = "ARTE";
            preguntasArte(view, i);
        }else if (rb3.isChecked() == true){
            tipoEncuesta = "CINE";
            preguntasCine(view, i);
        }else if (rb9.isChecked() == true){
            tipoEncuesta = "TRANSPORTE";
            preguntasTransporte(view, i);
        }
        else if (rb10.isChecked() == true){
            tipoEncuesta = "COMIDA";
            preguntasComida(view, i);
        }
    }


    public void preguntasDeportes(View view, int i){

        rb4.setText("Ciclismo");
        rb5.setText("Futbol");
        rb6.setText("Beisbol");
        rb7.setText("Hockey");
        rb8.setText("Basketball");
        tv3.setText("Cúal es tu deporte favorito? Persona: 1" );
        preguntaMostrada = tv3.getText().toString().replace("1", "");
    }

    public void preguntasArte(View view, int i){

        rb4.setText("Música");
        rb5.setText("Teatro");
        rb6.setText("Pintura");
        rb7.setText("Circo");
        rb8.setText("Baile");
        tv3.setText("Qué Actividad artisitica practicas? Persona: 1" );
        preguntaMostrada = tv3.getText().toString().replace("1", "");
    }

    public void preguntasCine(View view, int i){

        rb4.setText("Acción");
        rb5.setText("Terror");
        rb6.setText("Comedia");
        rb7.setText("Romantico");
        rb8.setText("Musicales");
        tv3.setText("Cúal genero de cine te gusta? Persona: 1"  );
        preguntaMostrada = tv3.getText().toString().replace("1", "");
    }

    public void preguntasTransporte(View view, int i){

        rb4.setText("Carro");
        rb5.setText("Moto");
        rb6.setText("Bicicleta");
        rb7.setText("Transmilenio");
        rb8.setText("SITP");
        tv3.setText("Transporte usado diariamente? Persona: 1" );
        preguntaMostrada = tv3.getText().toString().replace("1", "");
    }

    public void preguntasComida(View view, int i){

        rb4.setText("Hamburguesa");
        rb5.setText("Pizza");
        rb6.setText("Sandwich");
        rb7.setText("Suchi");
        rb8.setText("Hot dog");
        tv3.setText("Cúal comida prefieres? Persona: 1" );
        preguntaMostrada = tv3.getText().toString().replace("1", "");
    }

    public void enviar(View view){
        String resultadosAMostrar = "";
        i = i + 1;
        tv3.setText(preguntaMostrada + i);
        if(rb4.isChecked() == true){
            acumRb4 = acumRb4 +1;
        }else if (rb5.isChecked() == true) {
            acumRb5 = acumRb5 +1;
        }else if (rb6.isChecked() == true){
            acumRb6 = acumRb6 +1;
        }else if (rb7.isChecked() == true){
            acumRb7 = acumRb7 +1;
        }else if (rb8.isChecked() == true){
            acumRb8 = acumRb8 +1;
        }
        if ( tipoEncuesta == "DEPORTES"){
            resultadosDeportes  = "ESTADISTICAS: "+"\n" + "Ciclismo: " + acumRb4 + "\n" + "Futbol: " +  acumRb5 + "\n" + "Beisbol: " + acumRb6 + "\n" + "Hockey: " + acumRb7 + "\n" + "Basketball: " + acumRb8 ;
            resultadosAMostrar = resultadosDeportes;
        } else if ( tipoEncuesta == "ARTE"){
            resultadosArte      = "ESTADISTICAS: "+"\n" + "Música: " + acumRb4 + "\n" + "Teatro: " +  acumRb5 + "\n" + "Pintura: " + acumRb6 + "\n" + "Circo: " + acumRb7 + "\n" + "Baile: " + acumRb8 ;
            resultadosAMostrar = resultadosArte;
        }else if (tipoEncuesta == "CINE") {
            resultadosCine      = "ESTADISTICAS: "+"\n" + "Acción: " + acumRb4 + "\n" + "Terror: " +  acumRb5 + "\n" + "Comedia: " + acumRb6 + "\n" + "Romantico: " + acumRb7 + "\n" + "Musicales: " + acumRb8 ;
            resultadosAMostrar = resultadosCine;
        }else if(tipoEncuesta == "TRANSPORTE"){
            resultadosTransporte  = "ESTADISTICAS: "+"\n" + "Carro: " + acumRb4 + "\n" + "Moto: " +  acumRb5 + "\n" + "Bicicleta: " + acumRb6 + "\n" + "Transmilenio: " + acumRb7 + "\n" + "SITP: " + acumRb8 ;
            resultadosAMostrar = resultadosTransporte;
        }else if(tipoEncuesta == "COMIDA"){
            resultadosComida      = "ESTADISTICAS: "+"\n" + "Hamburguesa: " + acumRb4 + "\n" + "Pizza: " +  acumRb5 + "\n" + "Sandwich: " + acumRb6 + "\n" + "Suchi: " + acumRb7 + "\n" + "Hot Dog: " + acumRb8 ;
            resultadosAMostrar = resultadosComida;
        }

        if(i > totalPersonas){
            tv3.setVisibility(View.INVISIBLE);
            rg2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            i = 1;
        }
        tv4.setVisibility(View.VISIBLE);
        tv4.setText(resultadosAMostrar);
    }
}
