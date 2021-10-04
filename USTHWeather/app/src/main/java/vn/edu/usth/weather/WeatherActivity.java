package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String call ="WeatherActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_forecast);
        Log.i(call,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(call,"onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(call,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(call,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(call,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(call,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(call,"onRestart");
    }

}
