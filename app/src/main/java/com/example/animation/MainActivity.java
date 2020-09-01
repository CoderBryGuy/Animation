package com.example.animation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final static int BART_SHOWN = 0;
    private final static int HOMER_SHOWN = 1;
    private int cartoon_shown = BART_SHOWN;

    public void fade(View view){

        Log.i("Info", "Imageview tapped");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

//        bartImageView.animate().translationYBy(2000).setDuration(2000);
//        bartImageView.animate().translationXBy(-2000).setDuration(2000);

//        bartImageView.animate().rotation(180).setDuration(1000);
//        bartImageView.animate().rotation(1800).alpha(0).setDuration(1000);


        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);

    }


   public void toggleBartHomer(ImageView bartImageView, ImageView homerImageView){

        if(cartoon_shown == BART_SHOWN) {
            bartImageView.animate().alpha(0).setDuration(2000);
            homerImageView.animate().alpha(1).setDuration(2000);
            cartoon_shown = HOMER_SHOWN;
        }else if(cartoon_shown == HOMER_SHOWN){
            homerImageView.animate().alpha(0).setDuration(2000);
            bartImageView.animate().alpha(1).setDuration(2000);
            cartoon_shown = BART_SHOWN;
       }
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
//        bartImageView.animate().translationXBy(-1000);
        bartImageView.setX(-1000);
        bartImageView.animate().translationXBy(1000).rotation(3600).alpha(1).setDuration(2000);
    }
}