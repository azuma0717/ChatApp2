package com.gmail.yuki.chatapp2_android.ui.activites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.gmail.yuki.chatapp2_android.R;
import com.gmail.yuki.chatapp2_android.ui.fragments.RegisterFragment;

/**
 * Created by yuki on 2018/01/12.
 */

public class RegisterActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    public static void startActivity(Context context){
        Intent intent = new Intent(context,RegisterActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle sevedInstanceState) {
        super.onCreate(sevedInstanceState);
        setContentView(R.layout.activity_register);
        bindViews();
        init();
    }

    //ここでIDと紐付けをしている。わざわざファンクションで外だしする必要あんのかな？
    private void bindViews() {mToolbar =(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);}
    private void init() {
        setSupportActionBar(mToolbar);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_content_register,
                RegisterFragment.newInstance(),
                RegisterFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }
}
