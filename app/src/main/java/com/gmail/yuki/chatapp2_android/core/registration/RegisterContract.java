package com.gmail.yuki.chatapp2_android.core.registration;

import android.app.Activity;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by yuki on 2018/01/13.
 */

public interface RegisterContract {
    interface View {
        void onRegistrationSuccess(FirebaseUser firebaseUser);

        void onRegistrationFailure(String message);
    }

    interface Presenter {
        void register(Activity activity, String email, String password);
    }

    interface Interactor {
        void performFirebaseRegistration(Activity activity, String email, String password);
    }

    interface OnRegistrationListener {
        void onSuccess(FirebaseUser firebaseUser);

        void onFailure(String message);
    }
}