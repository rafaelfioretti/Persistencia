package br.com.rafaelfioretti.persistencia;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

import br.com.rafaelfioretti.persistencia.dao.DBHelper;
import br.com.rafaelfioretti.persistencia.dao.DatabaseManager;

/**
 * Created by rafaelfioretti on 12/12/16.
 */

public class MinhaAplicacao extends Application {

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        DatabaseManager.initializeInstance(new DBHelper());
    }

    public static Context getContext(){
        return getContext();

    }
}
