package com.example.mvp;

public class MVP_Presenter {

    MVP_Model model;

    public MVP_Presenter() {
        model = new MVP_Model();
    }

    IView iView;

    public void setiView(IView iView) {
        this.iView = iView;
    }

    public void login(String account, String pwd) {
        boolean loginResult = model.login(account, pwd);

        if (loginResult){
            iView.loginSuccess();
        }else {
            iView.loginFail();
        }
    }
}
