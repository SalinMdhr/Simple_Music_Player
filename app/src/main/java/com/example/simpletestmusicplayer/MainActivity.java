package com.example.simpletestmusicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this, R.raw.music);
    }
    public void musicplay(View v) {
        music.start();;
    }
    public void musicpause(View v) {
        music.pause();
    }
    public void musicstop(View v) {
        music.stop();
        music = MediaPlayer.create(this, R.raw.music);
    }

}