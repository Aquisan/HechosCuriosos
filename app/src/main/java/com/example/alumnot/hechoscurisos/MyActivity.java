package com.example.alumnot.hechoscurisos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity
{

    private TextView fact;
    private RelativeLayout background;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        fact =  (TextView) findViewById(R.id.fact);
        background = (RelativeLayout) findViewById(R.id.background);


    }

    public void factButtonAction(View view)
    {

        fact.setText(FactBook.getRandomFact(MyActivity.this));
        changeBackgroundColor();

    }

    public void changeBackgroundColor()
    {

        background.setBackgroundColor(ColorWheel.getRandomColor(MyActivity.this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        getMenuInflater().inflate(R.menu.my, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
