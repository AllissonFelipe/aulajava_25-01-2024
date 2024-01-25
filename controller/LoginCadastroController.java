package controller;

import view.*;
import model.*;

public class LoginCadastroController {
    
    public static void loginParaModel(String id, String senha) {
        LoginModel.acessarConta(id, senha);
    }
    public static void login(String login, String senha) {
        if (login == "" || senha == "") {
            LoginView.loginDenied(InterfacePadokaController.loginDenied);
            LoginView.login();
            
        } else {
            LoginView.loginAceito(InterfacePadokaController.loginAceito);
            InicialView.opcoesLogado();
        }
    }
    public static void cadastro() {

    }
}
