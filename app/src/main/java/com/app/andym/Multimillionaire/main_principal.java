package com.app.andym.multimillionaire;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created by andym on 01/04/2018.
 * categoria:
 *
 * bronce   -->4€
 * cobre    -->7€
 * plata    -->429€
 * platino  -->24.433€
 * paladio  -->24.962€
 * oro      -->35.000€
 * rodio    -->37.927,13€

 * Taaffeite: 1.623€
 * Poudretteite: 4.057€
 * Musgravite: 4.869€
 * Zafiro: 14.607€
 * Esmeralda: 8.000$
 * Alexandrite: 6.492€
 * Rubí: 12.172€
 * Diamante: 12.172€
 * Grandidierite: 24.344€
 */
//////////////////
public class main_principal extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_principal);

        TextView texto = (TextView)findViewById(R.id.texto);
        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/Action Force Normal.ttf");
        texto.setTypeface(face);
        //texto.setText(getText(R.string.text));

    }

}
