package com.example.hw1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
/**
 * Mikayla Muskett
 *
 * Resource: Nuxoll's CustomElement and DrawClass java files
 */
public class myDrawingView extends SurfaceView {
    public Paint brownDesert;
    public Paint eveningPink;
    public Paint mesas;
    public Paint woolWhite;
    public Paint blackLegs;
    public  Paint eveningSun;
   /* public int Ycoord;
    public int Xcoord;

    */
    public myDrawingView(Context context, AttributeSet attr) {
        super(context,attr);
        color();
    }
    public void color() {
        //desert and sun
        this.brownDesert = new Paint();
        this.brownDesert.setColor(0xFF652A0E);
        this.brownDesert.setStyle(Paint.Style.FILL);
        this.eveningSun = new Paint();
        this.eveningSun.setColor(0xFFfbcc0a);
        this.eveningSun.setStyle(Paint.Style.FILL);
        //the pink sky
        this.eveningPink = new Paint();
        this.eveningPink.setColor(0xFFf06553);
        this.eveningPink.setStyle(Paint.Style.FILL);
        //mesas
        this.mesas = new Paint();
        this.mesas.setColor(0xFF381c2a);
        this.mesas.setStyle(Paint.Style.FILL);
        //sheep
        this.woolWhite = new Paint() ;
        this.woolWhite.setColor(0xFFDCD0BA);
        this.woolWhite.setStyle(Paint.Style.FILL);
        this.blackLegs = new Paint();
        this.blackLegs.setColor(Color.BLACK);
        this.blackLegs.setStyle(Paint.Style.FILL);

        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        //desert
        canvas.drawRect(0.0f, 500.0f, 10000.0f, 800.0f, this.brownDesert);
        //pink sky and sun
        canvas.drawRect(0.0f,0.0f, 10000.0f, 500.0f, this.eveningPink);
        canvas.drawOval(170.0f, 260.0f, 300.0f, 360.0f, this.eveningSun);
        //the 2 mesas
        canvas.drawRect(750.0f, 390.0f, 10000.0f, 500.0f, this.mesas);
        canvas.drawRect(850.0f, 300.0f, 1950.0f, 500.0f, this.mesas);
        canvas.drawRect(30.0f, 390.0f, 400.0f, 500.0f, this.mesas);
        canvas.drawRect(100.0f, 320.0f, 320.0f, 500.0f, this.mesas);
        //sheep1
        canvas.drawRect(585.0f, 600.0f, 590.0f, 620.0f,this.blackLegs);
        canvas.drawRect(615.0f, 600.0f, 620.0f, 620.0f, this.blackLegs);
        canvas.drawOval(580.0f,560.0f, 630.0f, 610.0f, this.woolWhite);
        canvas.drawOval(620.0f,560.0f, 640.0f, 580.0f, this.woolWhite);
        //sheep2
        canvas.drawRect(685.0f, 600.0f, 690.0f, 620.0f,this.blackLegs);
        canvas.drawRect(715.0f, 600.0f, 720.0f, 620.0f, this.blackLegs);
        canvas.drawOval(720.0f, 560.0f, 740.0f, 580.0f, this.woolWhite);
        canvas.drawOval(680.0f, 560.0f, 730.0f, 610.0f, this.woolWhite);
        }

    /*public int getX(){
        return Xcoord;
    }
    public int getY(){
        return Ycoord;
    }
    public void setX(){
    }
    public void setX(){
    }
     */
}


















