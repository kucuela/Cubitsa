package studio.kucuela.cubalone;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimationDrawable animation = (AnimationDrawable) getResources().getDrawable(R.drawable.xml_code_for_animations);
        View wall = (View) findViewById(R.id.wallpaper);
        wall.setBackgroundResource(R.drawable.xml_code_for_animations);
        animation=(AnimationDrawable) wall.getBackground();
        animation.start();



    }

}
