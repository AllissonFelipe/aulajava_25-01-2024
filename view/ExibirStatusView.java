package view;

import controller.*;

public class ExibirStatusView {
    public static void respErradaInicial() {
        System.out.println(InterfacePadokaController.respErradaInicial);
        //InicialView.inicial();
    }
    public static void respErradaDoMenu() {
        System.out.println(InterfacePadokaController.respErradaDoMenu);
        //InicialView.opcoesDoMenu();
    }
    public static void saindo() {
        System.out.println(InterfacePadokaController.respSaindoDoPrograma);
    }
}
