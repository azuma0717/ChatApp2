package com.gmail.yuki.chatapp2_android.ui.activites;

import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//import android.widget.Toolbar;
import android.support.v7.widget.Toolbar;

import com.gmail.yuki.chatapp2_android.R;
import com.gmail.yuki.chatapp2_android.ui.fragments.LoginFragment;

/**
 * Created by yuki on 2018/01/12.
 */

public class LoginActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    public static void startActivity(Context context){
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle sevedInstanceState) {
        super.onCreate(sevedInstanceState);
        setContentView(R.layout.activity_login);
        bindViews();
        init();
    }

    //ここでIDと紐付けをしている。わざわざファンクションで外だしする必要あんのかな？
    private void bindViews() {mToolbar =(Toolbar) findViewById(R.id.toolbar);}
    private void init() {
        setSupportActionBar(mToolbar);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_content_login,
                LoginFragment.newInstance(),
                LoginFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }
}
