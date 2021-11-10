package com.example.fragmentsprimeraclasse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boto1 = findViewById(R.id.button1);
        boto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: inflar el fragment

                FragmentManager fm = getSupportFragmentManager();


                if (fm.findFragmentById(R.id.contenidor1) == null) {  //OPCIONAL Si es null està buit
                    Fragment1 fragment1_clase = new Fragment1();

                    fm.beginTransaction().replace(R.id.contenidor1, fragment1_clase).commit();
                }
            }
        });

        //TODO: Afegir botó 2 que infli fragment 2 al contenidor 1
    }
}