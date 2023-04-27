package com.example.mapinha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    public Button idBotao;
    public TextInputLayout idEstado;
    public TextView idNomeEstado;
    public TextView idPopulacao;
    public TextView idIDH;
    public TextView idArea;
    public TextView idMunicipios;
    public ImageView idImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idBotao = findViewById(R.id.idBotao);
        idEstado = findViewById(R.id.idEstado);
        idNomeEstado = findViewById(R.id.idNomeEstado);
        idPopulacao = findViewById(R.id.idPopulacao);
        idIDH = findViewById(R.id.idIDH);
        idArea = findViewById(R.id.idArea);
        idMunicipios = findViewById(R.id.idMunicipios);
        idImagem = findViewById(R.id.idImagem);

    }

    public void inicio_app(View view) {
        String nome_estado = idEstado.getEditText().getText().toString();
        if (nome_estado.equals("PR") || nome_estado.equals("pr")){
            idNomeEstado.setText("Paraná");
            idPopulacao.setText("População = 11,08 M.");
            idIDH.setText("IDH = 0,749");
            idArea.setText("Area = 199.315 km²");
            idMunicipios.setText("Municípios  = 284");
            idImagem.setImageResource(R.drawable.parana);

            idNomeEstado.setVisibility(View.VISIBLE);
            idPopulacao.setVisibility(View.VISIBLE);
            idIDH.setVisibility(View.VISIBLE);
            idArea.setVisibility(View.VISIBLE);
            idMunicipios.setVisibility(View.VISIBLE);
            idImagem.setVisibility(View.VISIBLE);
        }

        if (nome_estado.equals("RS") || nome_estado.equals("rs")){
            idNomeEstado.setText("Rio Grande do Sul");
            idPopulacao.setText("População = 11,29 M.");
            idIDH.setText("IDH = 0,652");
            idArea.setText("Area = 281.748 km²");
            idMunicipios.setText("Municípios = 497");
            idImagem.setImageResource(R.drawable.riograndesul);

            idNomeEstado.setVisibility(View.VISIBLE);
            idPopulacao.setVisibility(View.VISIBLE);
            idIDH.setVisibility(View.VISIBLE);
            idArea.setVisibility(View.VISIBLE);
            idMunicipios.setVisibility(View.VISIBLE);
            idImagem.setVisibility(View.VISIBLE);
        }

        if (nome_estado.equals("SC") || nome_estado.equals("SC")){
            idNomeEstado.setText("Santa Catarina");
            idPopulacao.setText("População = 7,165 M.");
            idIDH.setText("IDH = 0,840");
            idArea.setText("Area = 95.346 km²");
            idMunicipios.setText("Municípios = 295");
            idImagem.setImageResource(R.drawable.santacatarina);

            idNomeEstado.setVisibility(View.VISIBLE);
            idPopulacao.setVisibility(View.VISIBLE);
            idIDH.setVisibility(View.VISIBLE);
            idArea.setVisibility(View.VISIBLE);
            idMunicipios.setVisibility(View.VISIBLE);
            idImagem.setVisibility(View.VISIBLE);
        }
    }
}