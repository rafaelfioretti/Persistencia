package br.com.rafaelfioretti.persistencia;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

/**
 * Created by rafaelfioretti on 12/12/16.
 */

public class MinhaAplicacao extends Application {

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }

    public static Context getContext(){
        return getContext();

    }
}
