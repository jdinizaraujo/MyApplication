package br.com.jdinizaraujo.meuteste;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void buscar(View view){
        Intent intent = new Intent(this,ExibeGifs.class);
        EditText texto = (EditText) findViewById(R.id.TextoBusca);
        String textoBuscar = texto.getText().toString();
        intent.putExtra("textobuscar",textoBuscar);
        startActivity(intent);
    }
}
