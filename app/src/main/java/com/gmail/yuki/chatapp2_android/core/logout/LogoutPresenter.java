package com.gmail.yuki.chatapp2_android.core.logout;

import com.gmail.yuki.chatapp2_android.core.logout.LogoutContract;
import com.gmail.yuki.chatapp2_android.core.logout.LogoutInteractor;

/**
 * Created by yuki on 2018/01/13.
 */

public class LogoutPresenter implements LogoutContract.Presenter, LogoutContract.OnLogoutListener {
    private LogoutContract.View mLogoutView;
    private LogoutInteractor mLogoutInteractor;

    public LogoutPresenter(LogoutContract.View logoutView) {
        mLogoutView = logoutView;
        mLogoutInteractor = new LogoutInteractor(this);
    }

    @Override
    public void logout() {
        mLogoutInteractor.performFirebaseLogout();
    }

    @Override
    public void onSuccess(String message) {
        mLogoutView.onLogoutSuccess(message);
    }

    @Override
    public void onFailure(String message) {
        mLogoutView.onLogoutFailure(message);
    }
}