package com.example.jaime.inventoryfragment.ui.login;

/**
 * Contiene los métodos mecesarios/expuestos para la comunicación del presentador
 * con la vista.
 */

public interface LoginView {

    void navigateToHome();
    void setUserEmptyError();
    void setPasswordEmptyError();
    void setPasswordError();
}
