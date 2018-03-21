package com.example.siddh.wordament;

/**
 * Created by siddh on 19-03-2018.
 */

import android.content.ClipData;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.GridView;

public class LetterTile extends android.support.v7.widget.AppCompatTextView {
    public static final int TILE_SIZE = 150;
    private Character letter;
    private boolean frozen;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public LetterTile(Context context, Character letter) {
        super(context);
        this.letter = letter;
        setText(letter.toString());
        setTextAlignment(TEXT_ALIGNMENT_CENTER);
        setHeight(TILE_SIZE);
        setWidth(TILE_SIZE);
        setTextSize(30);
        setBackgroundColor(Color.rgb(255, 255, 200));
    }
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if(!frozen){
            if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                startDrag(ClipData.newPlainText("",""),new View.DragShadowBuilder(null),this,0);
                return true;
            }
        }
        else
            return super.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }


}
