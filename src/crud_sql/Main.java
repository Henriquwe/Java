package crud_sql;

import crud_sql.dao.Conexao;

public class Main {
    public static void main(String[] args) {
        Conexao bancoConectar = new Conexao();

        bancoConectar.conectaDB();
    }
}
