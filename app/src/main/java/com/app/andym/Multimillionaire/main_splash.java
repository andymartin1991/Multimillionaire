package com.app.andym.multimillionaire;

import android.app.Activity;
import android.content.Intent;;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;





public class main_splash extends Activity {

    String version = String.valueOf((BuildConfig.VERSION_NAME));
    private static final long SPLASH_SCREEN_DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main_splash);


        WebView carga = (WebView)findViewById(R.id.webview);
        carga.loadUrl("file:///android_asset/html/index.html");

        mostrar();
    }

    private void mostrar(){
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(SPLASH_SCREEN_DELAY);
                } catch (InterruptedException e) {
                }
                startActivity(new Intent(main_splash.this, main_principal.class));
                overridePendingTransition(R.anim.transpain, R.anim.transpaout);
                finish();
            }
        }).start();
    }
}
