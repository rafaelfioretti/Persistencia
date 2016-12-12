package br.com.rafaelfioretti.persistencia.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.rafaelfioretti.persistencia.MinhaAplicacao;

/**
 * Created by rafaelfioretti on 12/12/16.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static String NOME_BANCO = "livros.db";
    public static int VERSAO_BANCO = 1;

    public DBHelper(){
        super(MinhaAplicacao.getContext(), NOME_BANCO, null, VERSAO_BANCO );
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(LivroDAO.createTable());


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
