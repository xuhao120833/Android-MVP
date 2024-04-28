package com.example.mvp;

public class MVP_Model implements IModel {
    public boolean login(String account, String pwd) {

        if (account == null || account.length() == 0) {
            return false;
        }

        if (pwd == null || pwd.length() == 0) {
            return false;
        }

        if ("user123".equals(account) && "pwd123".equals(pwd)) {
            return true;

        }
        return false;
    }
}
