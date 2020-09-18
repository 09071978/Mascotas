package com.example.proyecto3;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    paquete  com.imamblek.petagram ;

    importar  android.content.Context ;

    importar  androidx.test.platform.app.InstrumentationRegistry ;
    importar  androidx.test.ext.junit.runners.AndroidJUnit4 ;

import  org.junit.Test ;
import  org.junit.runner.RunWith ;

    importar  org.junit.Assert estático . * ;

/ **
        * Prueba instrumentada, que se ejecutará en un dispositivo Android.
            *
            * @See < un  href = " http://d.android.com/tools/testing " > Pruebas de documentación </a>
            * /
    @RunWith ( clase AndroidJUnit4 . )
    clase  pública ExampleInstrumentedTest {
        @Prueba
        public  void  useAppContext () {
            // Contexto de la aplicación bajo prueba.
            Contexto appContext =  InstrumentationRegistry . getInstrumentation () . getTargetContext ();
            assertEquals ( " com.imamblek.petagram " , appContext . getPackageName ());
        }
    }
    paquete  com.imamblek.petagram ;

    importar  androidx.annotation.NonNull ;
    importar  androidx.appcompat.app.AppCompatActivity ;
    importar  androidx.recyclerview.widget.LinearLayoutManager ;
    importar  androidx.recyclerview.widget.RecyclerView ;

    importar  android.content.Intent ;
    importar  android.os.Bundle ;
    importar  android.view.Menu ;
    importar  android.view.MenuItem ;
    importar  android.view.View ;
    importar  android.widget.ImageButton ;
    importar  android.widget.Toast ;
    importar  android.widget.Toolbar ;

import  java.util.ArrayList ;

    público  de clase  MainActivity  extiende  AppCompatActivity {

        ArrayList  < Mascota > mascotas;
        public  RecyclerView rvContactos;
        public  ImageButton btnEstrella;

        @Anular
        protected  void  onCreate ( Bundle  SavedInstanceState ) {
            super . onCreate (SavedInstanceState);
            setContentView ( R . diseño . activity_main);
            androidx.appcompat.widget . Barra de herramientas de miActionBarbtn = findViewById ( R . ID . MiActionBarbtn);
            setSupportActionBar (miActionBarbtn);

            btnEstrella = ( ImageButton ) findViewById ( R . ID . btnEstrella);
            rvContactos = ( RecyclerView ) findViewById ( R . ID . rvContactos);

            LinearLayoutManager LLM =  nuevo  LinearLayoutManager ( este );
            llm . setOrientation ( RecyclerView . VERTICAL );

            rvContactos . setLayoutManager (llm);
            inicializarListaContactos ();
            inicializarAdaptador ();

            btnEstrella . setOnClickListener ( nueva  vista . OnClickListener () {

                @Anular
                public  void  onClick ( Ver  vista ) {
                    Tostadas . makeText ( MainActivity . this , " Los mejores 5 " , Toast . LENGTH_SHORT ) . espectáculo();
                    Intención intención =  nuevo  Intención ( MainActivity . Este , DetalleMascota . Clase);
                    startActivity (intención);

                }
            });
        }

        private  void  setSupportActionBar ( Toolbar  miActionBarbtn ) {
        }

        public  void  inicializarAdaptador () {
            Adaptador adaptador =  nuevo  Adaptador (mascotas, esto );
            rvContactos . setAdapter (adaptador);
        }


        public  void  inicializarListaContactos () {
            mascotas =  new  ArrayList < Mascota > ();
            mascotas . añadir ( nuevo  Mascota ( R . estirable . cangrejo, " Cangrejo " , " 0 " ));
            mascotas . añadir ( nuevo  Mascota ( R . estirable . delfin, " Delfin " , " 0 " ));
            mascotas . añadir ( nuevo  Mascota ( R . estirable . pulpo, " Pulpo " , " 0 " ));
            mascotas . añadir ( nuevo  Mascota ( R . estirable . estrella, " Estrella " , " 0 " ));
            mascotas . añadir ( nuevo  Mascota ( R . estirable . calamar, " Calamar " , " 0 " ));
        }


        // para llamar al menu de opciones
        @Anular
        public  boolean  onCreateOptionsMenu ( menú  Menú ) {
            getMenuInflater () . inflar ( R . menú . menu_opciones, menú);
            devuelve  verdadero ;
        }
        // para darle vida a los menus
        @Anular
        public  boolean  onOptionsItemSelected ( elemento @NonNull  MenuItem  ) {

            switch (item . getItemId ()) {
                caso  R . id . mAsobre :
                Intención Intención =  nueva  Intención ( esto , clase ActivityAbout . );
                startActivity (intención);
                romper ;
                caso  R . id . mSetting :
                Intención i =  nueva  Intención ( esto , clase ActivitySettings . );
                startActivity (i);
                romper ;
            }

            volver  super . onOptionsItemSelected (elemento);
        }
    }}