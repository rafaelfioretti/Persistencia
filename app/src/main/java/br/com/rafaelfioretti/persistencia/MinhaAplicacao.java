package br.com.rafaelfioretti.persistencia;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

import br.com.rafaelfioretti.persistencia.dao.DBHelper;
import br.com.rafaelfioretti.persistencia.dao.DatabaseManager;
import br.com.rafaelfioretti.persistencia.dao.LivroDAO;
import br.com.rafaelfioretti.persistencia.model.Livro;

/**
 * Created by rafaelfioretti on 12/12/16.
 */

public class MinhaAplicacao extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        this.context = getApplicationContext();
        DatabaseManager.initializeInstance(new DBHelper());
        seed();
    }

    public static Context getContext(){
        return context;

    }


    private void seed(){
        LivroDAO livrodao = new LivroDAO();

        Livro android = new Livro();
        android.setAutor("Ricardo Lechetta");
        android.setEditora("Novatec");
        android.setTitulo("Google Android");
        livrodao.insereDado(android);

        Livro torreNegra = new Livro();
        torreNegra.setAutor("Stephen King");
        torreNegra.setEditora("AchoSuma");
        torreNegra.setTitulo("A Torre Negra");
        livrodao.insereDado(torreNegra);


    }
}
