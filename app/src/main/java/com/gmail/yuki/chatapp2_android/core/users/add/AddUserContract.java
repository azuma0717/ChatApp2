package com.gmail.yuki.chatapp2_android.core.users.add;

import android.content.Context;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by yuki on 2018/01/13.
 */

public interface AddUserContract {
    interface View {
        void onAddUserSuccess(String message);

        void onAddUserFailure(String message);
    }

    interface Presenter {
        void addUser(Context context, FirebaseUser firebaseUser);
    }

    interface Interactor {
        void addUserToDatabase(Context context, FirebaseUser firebaseUser);
    }

    interface OnUserDatabaseListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}