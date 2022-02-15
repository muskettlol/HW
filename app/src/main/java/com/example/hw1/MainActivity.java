package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Mikayla Muskett
 *
 * Resource: Nuxoll's CustomElement and DrawClass java files
 */
public class MainActivity extends AppCompatActivity {

    private String []drawingItems = {"evening sky", "mesa 1", "mesa 2", "sheep 1", "sheep 2", "house"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //redSeekBar
        SeekBar redSB = findViewById(R.id.redSB);
        TextView redTV = findViewById(R.id.numberOfRed);
        redTV.setText(redSB.getProgress() + "/" + redSB.getMax());
        //redSB progress
        redSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int redVal = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redVal = progress;
                redTV.setText(redVal + "/" + seekBar.getMax());
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //no code
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //no code
            }
        });

        //blueSeekBar
        SeekBar blueSB = findViewById(R.id.blueSB);
        TextView blueTV = findViewById(R.id.numberOfBlue);
        blueTV.setText(blueSB.getProgress() + "/" + blueSB.getMax());
        //blueSB progress
        blueSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int blueVal = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blueVal = progress;
                blueTV.setText(blueVal + "/" + seekBar.getMax());
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //no code
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //no code
            }
        });

        //greenSeekBar
        SeekBar greenSB = findViewById(R.id.greenSB);
        TextView greenTV = findViewById(R.id.numberOfGreen);
        greenTV.setText(greenSB.getProgress() + "/" + greenSB.getMax());
        //greenSB progress
        greenSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int greenVal = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                greenVal = progress;
                greenTV.setText(greenVal + "/" + seekBar.getMax());
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //no code
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //no code
            }
        });
    }
}