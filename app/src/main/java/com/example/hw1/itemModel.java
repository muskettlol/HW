package com.example.hw1;
import android.graphics.Color;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Mikayla Muskett
 *
 * Resource: Nuxoll's CustomElement and DrawClass java files
 */
public abstract class itemModel implements View.OnTouchListener {

    public static final int tapArea = 0;
    int theNewColor;

    //myDrawingView myDesert = new myDrawingView();

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();

    /*public void newColor(Color theColor){
             newColor= Color.rbg((int) red, (int) blue, (int) green));
        }
        //sheep 1
        if( x > 580 && x < 640 && y > 560 && y < 610){
            myDesert.newColor(newColor);
        //invalidate();
        //something something here for items

     */
        return true;
    }
}

