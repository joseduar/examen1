package com.example.ana.todojose.activity;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ana.todojose.R;
import com.example.ana.todojose.database.models.TodoTable;
import com.example.ana.todojose.database.models.TodoTable_Table;

public class formularioActivity extends AppCompatActivity {

    private TextView lblnombre;
    private TextView lblactividad;
    private EditText txtnombre;
    private EditText txtactividad;
    private Button btnguardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        lblnombre = findViewById(R.id.lblnombre);
        lblactividad = findViewById(R.id.lblactividad);
        txtnombre = findViewById(R.id.txtnombre);
        txtactividad = findViewById(R.id.txtactividad);
        btnguardar = findViewById(R.id.btnguardar);
        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardar();
            }
        });


    }
    private boolean validacion(){
        boolean send = true;
        if(txtnombre.getText().toString().isEmpty()){
            send = false;

        }
        if(txtactividad.getText().toString().isEmpty()){
            send = false;
        }
        return  send;
    }
    private void guardar(){
        if(validacion()){
            TodoTable registro = new TodoTable();
            registro.nombre = txtnombre.getText().toString();
            registro.actividad = txtactividad.getText().toString();
            registro.save();
            finish();

        }else {
            Toast.makeText(this,getResources().getString(R.string.error_valid), Toast.LENGTH_LONG).show();
        }
    }



}
