package com.example.aluno.tela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sobre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     sobre = (Button) findViewById(R.id.buttonLab2);

        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Indo para outra tela", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MainActivity.this, SobreActivity.class));

            }
        });

    }
}


