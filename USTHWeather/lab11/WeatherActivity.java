package vn.edu.usth.weather;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.MediaController;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {
    private static final String call = "WeatherActivity";
    private TabLayout tabLayout;

    MediaPlayer player;

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(call, "Program is created");

        playmusic playMusic = new playmusic();
        getSupportFragmentManager().beginTransaction().add(R.id.container, playMusic).commit();


    }

    public void play(View v){
        if (player == null){
            player = MediaPlayer.create(this, R.raw.music1);
        }
        player.start();

    }
    public void pause(View v){
        if (player != null){
            player.pause();
        }
    }
    public void stop(View v){
        stopmedia();
    }
    private void stopmedia(){
        if (player != null){
            player.release();
            player = null;
            Toast.makeText(this,"Music stop", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(call, "On started");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(call, "On resumed");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(call, "On paused");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(call, "On stopped");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(call, "On destroyed");
    }
}
