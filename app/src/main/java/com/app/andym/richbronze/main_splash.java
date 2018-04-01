package com.app.andym.richbronze;

import android.app.Activity;
import android.content.Intent;;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class main_splash extends Activity {

    //String version = "5.1.4";
    String version = String.valueOf((BuildConfig.VERSION_NAME));
    private static final long SPLASH_SCREEN_DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main_splash);

        TextView mensaje = (TextView)findViewById(R.id.mensaje);

        RelativeLayout padre = (RelativeLayout)findViewById(R.id.padre);
        ImageView imagen = (ImageView)findViewById(R.id.imageView1);
        Calendar c1 = new GregorianCalendar();





        mostrar();
    }

    private void mostrar(){
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                startActivity(new Intent(main_splash.this, main_principal.class));
                overridePendingTransition(R.anim.transpain, R.anim.transpaout);
                finish();
            }
        }).start();
    }
}
