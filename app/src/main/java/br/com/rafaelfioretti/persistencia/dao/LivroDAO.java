package br.com.rafaelfioretti.persistencia.dao;

import br.com.rafaelfioretti.persistencia.model.Livro;

/**
 * Created by rafaelfioretti on 12/12/16.
 */

public class LivroDAO {

    public static String createTable() {
        return "CREATE TABLE " + Livro.NOME_TABELA + " ( "
                + Livro.ID + " integer primary key autoincrement, "
                + Livro.TITULO + " text, "
                + Livro.AUTOR + " text, "
                + Livro.EDITORA + " text)";
    }
}
