package com.gmail.yuki.chatapp2_android.ui.activites;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.gmail.yuki.chatapp2_android.R;
import com.gmail.yuki.chatapp2_android.ui.fragments.ChooseFragment;
import com.gmail.yuki.chatapp2_android.ui.fragments.LoginFragment;

public class ChooseActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    public static void startIntent(Context context){
        Intent intent = new Intent(context,ChooseActivity.class);
        context.startActivity(intent);
    }

    //ログアウトするとに使ってる。
    public static void startIntent(Context context, int flags){
        Intent intent = new Intent(context,ChooseActivity.class);
        intent.setFlags(flags);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

            setContentView(R.layout.activity_choose);
            bindViews();
            init();
        }

        //ここでIDと紐付けをしている。わざわざファンクションで外だしする必要あんのかな？
    private void bindViews() {mToolbar =(Toolbar) findViewById(R.id.toolbar);}
    private void init() {
        setSupportActionBar(mToolbar);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_content_choose,
                ChooseFragment.newInstance(),
                ChooseFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }
}


