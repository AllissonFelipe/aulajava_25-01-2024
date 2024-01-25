package view;

import controller.*;
import java.util.*;

public class LoginView {
    public static void login() {
        Scanner scnLogin = new Scanner(System.in);
        Scanner scnSenha = new Scanner(System.in);
        String strId, strSenha;

        System.out.println("Digite seu ID: ");
        strId = scnLogin.nextLine();
        System.out.println("Digite sua Senha: ");
        strSenha = scnSenha.nextLine();
        LoginCadastroController.loginParaModel(strId, strSenha);

        scnLogin.close();
        scnSenha.close();
    }
    public static void loginDenied(String loginDenied) {
        System.out.println(loginDenied);
        //login();
    }
    public static void loginAceito(String loginAceito) {
        System.out.println(loginAceito);
        System.out.println(InterfacePadokaController.loginOpcoes);
        //InicialView.opcoesLogado();
    }
}
