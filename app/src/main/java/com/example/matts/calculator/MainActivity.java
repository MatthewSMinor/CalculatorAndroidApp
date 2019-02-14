package com.example.matts.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView t;
    private StringBuilder sb;




    public void btnZeroClicked(View v){
        sb.append("0");
        t.setText(sb);
    }
    public void btnOneClicked(View v){
        sb.append("1");
        t.setText(sb);
    }
    public void btnTwoClicked(View v){
        sb.append("2");
        t.setText(sb);
    }
    public void btnThreeClicked(View v){
        sb.append("3");
        t.setText(sb);
    }
    public void btnFourClicked(View v){
        sb.append("4");
        t.setText(sb);
    }
    public void btnFiveClicked(View v){
        sb.append("5");
        t.setText(sb);
    }
    public void btnSixClicked(View v){
        sb.append("6");
        t.setText(sb);
    }
    public void btnSevenClicked(View v){
        sb.append("7");
        t.setText(sb);
    }
    public void btnEightClicked(View v){
        sb.append("8");
        t.setText(sb);
    }
    public void btnNineClicked(View v){
        sb.append("9");
        t.setText(sb);
    }

    public void btnClearClicked(View v){
        t.setText("");
    }

    public void btnPlusClicked(View v){
        sb.append("+");
        t.setText(sb);
    }
    public void btnMinusClicked(View v){
        sb.append("-");
        t.setText(sb);
    }
    public void btnDivideClicked(View v){
        sb.append("/");
        t.setText(sb);
    }















    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        t = findViewById(R.id.editText);
        sb = new StringBuilder("");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
