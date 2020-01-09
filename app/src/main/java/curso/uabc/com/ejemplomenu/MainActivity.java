package curso.uabc.com.ejemplomenu;

import android.content.Intent;
import androidx.appcompat.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity implements
        View.OnClickListener,CompoundButton.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonNormal= (Button) findViewById(R.id.botonNormal);
        ToggleButton botonEstado=(ToggleButton) findViewById(R.id.botonEstado);
        ImageButton imageButton=(ImageButton) findViewById(R.id.imageButton);

        botonNormal.setOnClickListener(this);
        botonEstado.setOnClickListener(this);
        imageButton.setOnClickListener(this);

        RadioButton radioButton=(RadioButton) findViewById(R.id.radioButton);
        CheckBox cajaDelMal=(CheckBox)findViewById(R.id.checkBox);

        radioButton.setOnCheckedChangeListener(this);
        cajaDelMal.setOnCheckedChangeListener(this);




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
        if (id == R.id.mostrar_menu) {

          /*  Toast toast=Toast.makeText(
                    getApplication(),
                    "Mostrar Menu",
                    Toast.LENGTH_LONG
                    );
            toast.show();*/


            Descripcion comidaCorridaNo1=new Descripcion();
            comidaCorridaNo1.getDescripcion().put(1,"Chun-kun");
            comidaCorridaNo1.getDescripcion().put(2,"Pollo Mongol");
            comidaCorridaNo1.getDescripcion().put(3,"Chopsoey");
            comidaCorridaNo1.setIdentificador(1);

            Intent pasarPantalla2= new
            Intent(getApplication(),ActivityA.class);
            //Envio objeto de Comida Corrida No.1
            pasarPantalla2.putExtra("menu",comidaCorridaNo1);
            startActivity(pasarPantalla2);

            return true;

        }else
        if (id == R.id.mostrar_informacion) {

            Toast toast=Toast.makeText(
                    this,
                    "Mostrar Información",
                    Toast.LENGTH_LONG
            );
            toast.show();


            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if(view instanceof Button){

            mostrarMensaje("Soy un Button");
        }else if(view instanceof ImageButton){
            mostrarMensaje("Soy un ImageButton");


        }else if(view instanceof  ToggleButton){

            mostrarMensaje("Soy un ToggleButton");

        }else if(view instanceof RadioButton){
            mostrarMensaje("Soy un RadioButton");


        }else if(view instanceof CheckBox){
            mostrarMensaje("Soy un CheckBox");


        }else{

            mostrarMensaje("No se quien soy.");

        }


    }


    public void mostrarMensaje(String mensaje){
        Toast message=Toast.makeText(getApplication(),mensaje,Toast.LENGTH_SHORT);

        message.show();
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


        if(compoundButton instanceof RadioButton){

            RadioButton radio=(RadioButton)compoundButton;
            if(radio.isChecked()){

                mostrarMensaje("Estoy seleccionado");

            }
        }else if(compoundButton instanceof CheckBox){
            CheckBox checkBox=(CheckBox)compoundButton;
            if(checkBox.isChecked()){
            mostrarMensaje("Estoy seleccionado!!!");
            }
        }



    }
}
