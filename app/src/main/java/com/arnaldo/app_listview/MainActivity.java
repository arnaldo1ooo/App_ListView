package com.arnaldo.app_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_titulo;
    private ListView lv_lista;

    private String nombres[] = {"Samuel", "Valentina", "Pedro", "Alejandro", "José", "Lorena", "Josefina", "Rosana", "Hugo", "Jorge"};
    private String edades[] = {"18", "25", "10", "22", "43", "47", "44", "19", "13", "11"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_titulo = (TextView) findViewById(R.id.tv_titulo);
        lv_lista = (ListView) findViewById(R.id.lv_lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_formato, nombres);
        lv_lista.setAdapter(adapter);

        lv_lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv_titulo.setText("La edad de " + lv_lista.getItemAtPosition(position) + " es " + edades[position] + " años");
            }
        });
    }
}
