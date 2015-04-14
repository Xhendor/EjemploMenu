package curso.uabc.com.ejemplomenu;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.HashMap;


public class ActivityA extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Intent intent=getIntent();

        Descripcion descripcion=(Descripcion)intent.getExtras().getSerializable("menu");

        TextView miTextoMalvado=(TextView)findViewById(R.id.textomalvado);

       switch (descripcion.getIdentificador()){
           case 1:
               setTitle("Comida Corrida #"+descripcion.getIdentificador());

               miTextoMalvado.setText(
                       descripcion.getDescripcion().get(new Integer(1))
                       +"\n"+
                       descripcion.getDescripcion().get(new Integer(2))
                       +"\n"+
                       descripcion.getDescripcion().get(new Integer(3))
                       +"\n"+
                       descripcion.getDescripcion().get(new Integer(4)));


               break;
           case 2:
               setTitle("Comida Corrida #"+descripcion.getIdentificador());

               break;
           case 3:
               setTitle("Comida Corrida #"+descripcion.getIdentificador());

               break;
           case 4:
               setTitle("Comida Corrida #"+descripcion.getIdentificador());

               break;
       }



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_a, menu);
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
}
