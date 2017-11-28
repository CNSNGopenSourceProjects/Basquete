package br.com.conseng.basquete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pontuacaoTimeA = 0;
    private int pontuacaoTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoTresPontosTimeA = findViewById(R.id.tresPontosTimeA);
        botaoTresPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPontosTimeA(3);
            }
        });
        Button botaoDoisPontosTimeA = findViewById(R.id.doisPontosTimeA);
        botaoDoisPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPontosTimeA(2);
            }
        });
        Button botaoUmPontoTimeA = findViewById(R.id.umPontoTimeA);
        botaoUmPontoTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPontosTimeA(1);
            }
        });

        Button botaoTresPontosTimeB = findViewById(R.id.tresPontosTimeB);
        botaoTresPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPontosTimeB(3);
            }
        });
        Button botaoDoisPontosTimeB = findViewById(R.id.doisPontosTimeB);
        botaoDoisPontosTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPontosTimeB(2);
            }
        });
        Button botaoUmPontoTimeB = findViewById(R.id.umPontoTimeB);
        botaoUmPontoTimeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPontosTimeB(1);
            }
        });

        Button reiniciar = findViewById(R.id.reiniciarPlacar);
        reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciarPartida();
            }
        });
    }

    public void reiniciarPartida() {
        pontuacaoTimeA = 0;
        pontuacaoTimeB = 0;
        mostrarPlacarTimeA(pontuacaoTimeA);
        mostrarPlacarTimeB(pontuacaoTimeB);
    }
    public void mostrarPlacarTimeA(int pontuação) {
        TextView placarTimeA = findViewById(R.id.placarTimeA);
        placarTimeA.setText(String.valueOf(pontuação));
    }

    public void addPontosTimeA(int pontos) {
        pontuacaoTimeA = pontuacaoTimeA + pontos;
        mostrarPlacarTimeA(pontuacaoTimeA);
    }

    public void mostrarPlacarTimeB(int pontuação) {
        TextView placarTimeB = findViewById(R.id.placarTimeB);
        placarTimeB.setText(String.valueOf(pontuação));
    }

    public void addPontosTimeB(int pontos) {
        pontuacaoTimeB = pontuacaoTimeB + pontos;
        mostrarPlacarTimeB(pontuacaoTimeB);
    }
}
