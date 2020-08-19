package com.example.hw6_1_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "LifeCycleLogTag";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

        Log.i(LOG_TAG, "onCreate()");
        textView.append("\n onCreate()");

        if (savedInstanceState != null) {
            String string = savedInstanceState.getString("textView");
            textView.append(string);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG, "onStart()");
        textView.append("\n onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG, "onStop()");
        textView.append("\n onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, "onDestroy()");
        textView.append("\n onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "onPause()");
        textView.append("\n onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_TAG, "onResume()");
        textView.append("\n onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(LOG_TAG, "onRestart()");
        textView.append("\n onRestart()");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i(LOG_TAG, "onPostCreate()");
        textView.append("\n onPostCreate()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(LOG_TAG, "onPostResume()");
        textView.append("\n onPostResume()");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.i(LOG_TAG, "onKeyDown()");
        textView.append("\n onKeyDown()");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress (int keyCode, KeyEvent event){
        Log.i(LOG_TAG, "onKeyLongPress()");
        textView.append("\n onKeyLongPress()");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed (){
        super.onBackPressed();
        Log.i(LOG_TAG, "onBackPressed()");
        textView.append("\n onBackPressed()");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(LOG_TAG, "onSaveInstanceState()");
        textView.append("\n onSaveInstanceState()");
        savedInstanceState.putString("textView", textView.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(LOG_TAG, "onRestoreInstanceState()");
        textView.append("\n onRestoreInstanceState()");
        textView.setText(savedInstanceState.getString("textView"));

    }
}