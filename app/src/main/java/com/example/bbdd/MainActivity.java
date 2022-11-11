package com.example.bbdd;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.bbdd.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button botonInsertar, botonActualizar, botonBorrar, botonBuscar;

    EditText textoID, textoNombre, textoApellido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonInsertar = findViewById(R.id.insertar);
        botonActualizar = findViewById(R.id.actualizar);
        botonBorrar = findViewById(R.id.borrar);
        botonBuscar = findViewById(R.id.buscar);

        textoID = findViewById(R.id.id);
        textoNombre = findViewById(R.id.nombre);
        textoApellido = findViewById(R.id.apellido);

      final BBDD_HELPER asistente = new BBDD_HELPER(this);




        botonInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = asistente.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put(EstructuraBBDD.NOMBRE_COLUMNA1, textoID.getText().toString());
                values.put(EstructuraBBDD.NOMBRE_COLUMNA2, textoNombre.getText().toString());
                values.put(EstructuraBBDD.NOMBRE_COLUMNA3, textoApellido.getText().toString());
                long newRowId = db.insert(EstructuraBBDD.NOMBRE_TABLA, null, values);

                Toast.makeText(getApplicationContext(), "Se guardó el registro con clave: " + newRowId, Toast.LENGTH_SHORT).show();

            }
        });
        botonActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        botonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

}
}