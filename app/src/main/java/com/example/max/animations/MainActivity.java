package com.example.max.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    final int ALPHA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {

        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        Animation anim;
        switch(item.getItemId())
        {
            case ALPHA:
                anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
                break;
            default:
                anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
                break;
        }
        tv.startAnimation(anim);
        return super.onContextItemSelected(item);
    }
}
