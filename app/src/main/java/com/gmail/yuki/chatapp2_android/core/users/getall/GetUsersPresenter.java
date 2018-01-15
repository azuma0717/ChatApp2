package com.gmail.yuki.chatapp2_android.core.users.getall;

import com.gmail.yuki.chatapp2_android.core.users.getall.GetUsersContract;
import com.gmail.yuki.chatapp2_android.core.users.getall.GetUsersInteractor;
import com.gmail.yuki.chatapp2_android.models.User;

import java.util.List;

/**
 * Created by yuki on 2018/01/13.
 */

public class GetUsersPresenter implements GetUsersContract.Presenter, GetUsersContract.OnGetAllUsersListener {
    private GetUsersContract.View mView;
    private GetUsersInteractor mGetUsersInteractor;

    public GetUsersPresenter(GetUsersContract.View view) {
        this.mView = view;
        mGetUsersInteractor = new GetUsersInteractor(this);
    }

    @Override
    public void getAllUsers() {
        mGetUsersInteractor.getAllUsersFromFirebase();
    }

    @Override
    public void getChatUsers() {
        mGetUsersInteractor.getChatUsersFromFirebase();
    }

    @Override
    public void onGetAllUsersSuccess(List<User> users) {
        mView.onGetAllUsersSuccess(users);
    }

    @Override
    public void onGetAllUsersFailure(String message) {
        mView.onGetAllUsersFailure(message);
    }
}