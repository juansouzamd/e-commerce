package br.com.ecommerce.model;

public class UsuarioLogado {

    private static int userId;
    private static boolean logado;

    public static int getUserId() {
        return userId;
    }

    public static boolean isLogado() {
        return logado;
    }
    public static void conectarUsuario(int id){
        userId = id;
        logado = true;

    }
    public static void desconectarUsuario()
    {
        userId = 0;
        logado = false;
    }
}
