package controller;
import model.*;
import view.*;

public class RespostaInicialController {
    
    public static void menu(String resp) {
        switch (resp) {
            case "1":
                InicialView.opcoesDoMenu();
                break;
            case "2":
                ExibirStatusView.saindo();  
                break;
            default:
                ExibirStatusView.respErradaInicial();
                InicialView.inicial();
                break;
        }
    }
    
    public static void escolhaMenu(String resp) {
        switch (resp) {
            case "1":
                LoginView.login();
                break;
            case "2":
                CadastroView.cadastro();
                break;
            case "3":
                InterfacePadokaController.respReceitaDisponivel = CardapioModel.exibirCardapio();
                CardapioView.cardapio(InterfacePadokaController.respReceitaDisponivel);

                break;
            case "4":
                ExibirStatusView.saindo();
                break;
            default:
                ExibirStatusView.respErradaDoMenu();
                InicialView.opcoesDoMenu();
                break;
        }
    }
    public static void escolhaLogado(String resp) {
        switch (resp) {
            case "1":
            InterfacePadokaController.respReceitaDisponivel = CardapioModel.exibirCardapio();    
            CardapioView.cardapio(InterfacePadokaController.respReceitaDisponivel);
                break;
            case "2":

                break;
            default:
                break;
        }
    }
}
