package com.project.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import dialogFragmentExample.DialogFragmentMain;
import listFragmentExample.ListFragmentMain;
import listViewExample.ArrayAdapterListView;
import listViewExample.BaseAdapterListView;
import listViewExample.MyListActivity;
import listViewExample.RecyclerViewMain;
import listViewExample.SimpleAdapterListView;
import listViewExample.SpinnerMain;
import plainVanillaExample.VanillaMain;
import preferenceFragmentExample.MyPreferenceMain;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public String TAG = MainActivity.this.getClass().getSimpleName();
    Button listFragmentExample;
    Button dialogFragmentExample;
    Button preferenceFragmentExample;
    Button vanillaFragmentExample;
    Button arrayAdapter;
    Button simpleAdapter;
    Button baseAdapter;
    Button listAdapter;
    Button spinnerAdapter;
    Button RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listFragmentExample = (Button) findViewById(R.id.listFragmentExample);
        dialogFragmentExample = (Button) findViewById(R.id.dialogFragmentExample);
        preferenceFragmentExample = (Button) findViewById(R.id.preferenceFragmentExample);
        vanillaFragmentExample = (Button) findViewById(R.id.vanillaFragmentExample);
        arrayAdapter = (Button) findViewById(R.id.arrayAdapter);
        simpleAdapter = (Button) findViewById(R.id.simpleAdapter);
        baseAdapter = (Button) findViewById(R.id.baseAdapter);
        listAdapter = (Button) findViewById(R.id.listAdapter);
        spinnerAdapter = (Button) findViewById(R.id.spinnerAdapter);
        RecyclerView = (Button) findViewById(R.id.RecyclerView);
        listFragmentExample.setOnClickListener(this);
        dialogFragmentExample.setOnClickListener(this);
        preferenceFragmentExample.setOnClickListener(this);
        vanillaFragmentExample.setOnClickListener(this);
        arrayAdapter.setOnClickListener(this);
        simpleAdapter.setOnClickListener(this);
        baseAdapter.setOnClickListener(this);
        listAdapter.setOnClickListener(this);
        spinnerAdapter.setOnClickListener(this);
        RecyclerView.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() got called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() got called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() got called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() got called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() got called");
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        Log.d(TAG, "onSaveInstanceState() got called");
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        Log.d(TAG, "onRestoreInstanceState() got called");
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.dialogFragmentExample:
                Intent intent2 = new Intent(MainActivity.this, DialogFragmentMain.class);
                startActivity(intent2);
                break;
            case R.id.listFragmentExample:
                Intent intent = new Intent(MainActivity.this, ListFragmentMain.class);
                startActivity(intent);
                break;
            case R.id.preferenceFragmentExample:
                Intent intent3 = new Intent(MainActivity.this, MyPreferenceMain.class);
                startActivity(intent3);
                break;
            case R.id.vanillaFragmentExample:
                Intent intent1 = new Intent(MainActivity.this, VanillaMain.class);
                startActivity(intent1);
                break;
            case R.id.arrayAdapter:
                Intent myIntent = new Intent(MainActivity.this, ArrayAdapterListView.class);
                startActivity(myIntent);
                break;
            case R.id.simpleAdapter:
                Intent simpleAdapterIntent = new Intent(MainActivity.this, SimpleAdapterListView.class);
                startActivity(simpleAdapterIntent);
                break;
            case R.id.baseAdapter:
                Intent baseAdapterIntent = new Intent(MainActivity.this, BaseAdapterListView.class);
                startActivity(baseAdapterIntent);
                break;
            case R.id.listAdapter:
                Intent listAdapterIntent = new Intent(MainActivity.this, MyListActivity.class);
                startActivity(listAdapterIntent);
                break;
            case R.id.spinnerAdapter:
                Intent spinnerIntent = new Intent(MainActivity.this, SpinnerMain.class);
                startActivity(spinnerIntent);
                break;
            case R.id.RecyclerView:
                Intent recyclerAdapter = new Intent(MainActivity.this, RecyclerViewMain.class);
                startActivity(recyclerAdapter);
                break;
        }
    }
}
