package com.gmail.yuki.chatapp2_android.ui.fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.gmail.yuki.chatapp2_android.R;
import com.gmail.yuki.chatapp2_android.core.login.LoginContract;
import com.gmail.yuki.chatapp2_android.core.login.LoginPresenter;
import com.gmail.yuki.chatapp2_android.ui.activites.LoginActivity;
import com.gmail.yuki.chatapp2_android.ui.activites.RegisterActivity;
import com.gmail.yuki.chatapp2_android.ui.activites.UserListingActivity;

/**
 * Created by yuki on 2018/01/14.
 */

public class ChooseFragment extends Fragment implements View.OnClickListener{

    private ImageView mBtnLogin;
    private CardView mBtnRegister;

    private ProgressDialog mProgressDialog;

    public static ChooseFragment newInstance() {
        Bundle args = new Bundle();
        ChooseFragment fragment = new ChooseFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_choose, container, false);
        bindViews(fragmentView);
        return fragmentView;
    }

    private void bindViews(View view) {
        mBtnLogin = (ImageView) view.findViewById(R.id.login);
        mBtnRegister = (CardView) view.findViewById(R.id.register);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
    }

    private void init() {

        mProgressDialog = new ProgressDialog(getActivity());
        mProgressDialog.setTitle(getString(R.string.loading));
        mProgressDialog.setMessage(getString(R.string.please_wait));
        mProgressDialog.setIndeterminate(true);

        mBtnLogin.setOnClickListener(this);
        mBtnRegister.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        int viewId = view.getId();

        switch (viewId) {
            case R.id.login:
                onLogin(view);
//                Toast.makeText(getContext(),"ok",Toast.LENGTH_SHORT).show();
                break;
            case R.id.register:
                onRegister(view);
//                Toast.makeText(getContext(),"no",Toast.LENGTH_SHORT).show();
                break;
        }
    }


    private void onLogin(View view) {
        LoginActivity.startActivity(getActivity());
    }

    private void onRegister(View view) {
        RegisterActivity.startActivity(getActivity());
    }

//    @Override
//    public void onLoginSuccess(String message) {
//        mProgressDialog.dismiss();
//        Toast.makeText(getActivity(), "Logged in successfully", Toast.LENGTH_SHORT).show();
//        UserListingActivity.startActivity(getActivity(),
//                Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
//    }
//
//    @Override
//    public void onLoginFailure(String message) {
//        mProgressDialog.dismiss();
//        Toast.makeText(getActivity(), "Error: " + message, Toast.LENGTH_SHORT).show();
//    }
}
