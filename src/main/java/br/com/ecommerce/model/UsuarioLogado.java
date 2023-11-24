package br.com.ecommerce.model;

public class UsuarioLogado {
    public static int userId;
    private static boolean logado;

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
