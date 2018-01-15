package com.gmail.yuki.chatapp2_android.core.login;

import android.app.Activity;

import com.gmail.yuki.chatapp2_android.core.login.LoginContract;
import com.gmail.yuki.chatapp2_android.core.login.LoginInteractor;

/**
 * Created by yuki on 2018/01/13.
 */

public class LoginPresenter implements LoginContract.Presenter, LoginContract.OnLoginListener {
    private LoginContract.View mLoginView;
    private LoginInteractor mLoginInteractor;

    public LoginPresenter(LoginContract.View loginView) {
        this.mLoginView = loginView;
        mLoginInteractor = new LoginInteractor(this);
    }

    @Override
    public void login(Activity activity, String email, String password) {
        mLoginInteractor.performFirebaseLogin(activity, email, password);
    }

    @Override
    public void onSuccess(String message) {
        mLoginView.onLoginSuccess(message);
    }

    @Override
    public void onFailure(String message) {
        mLoginView.onLoginFailure(message);
    }
}