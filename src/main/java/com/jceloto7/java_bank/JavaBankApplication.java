// deixar clientmenu a prova de erros ( validar os inputs para aceitar somente o necessário)

package com.jceloto7.java_bank;

import com.jceloto7.java_bank.view.MenuView;

public class JavaBankApplication {
    public static void main(String[] args) {
        Bootstrap.start();
        MenuView menuView = new MenuView();
        menuView.mainMenu();
    }
}