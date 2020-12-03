package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static int textSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Llama al frag2 para cambiar el texto de tamaño y letras
    public void changeText(String str, int size){
        FragmentManager fm = getSupportFragmentManager();
        frag2 fragment = (frag2)fm.findFragmentById(R.id.fragment2);
        fragment.setText(str, size);
    }

    //Llama al frag2 para cambiar el texto de color.
    public void changeColor(int red, int green, int blue){
        FragmentManager fm = getSupportFragmentManager();
        frag2 fragment = (frag2)fm.findFragmentById(R.id.fragment2);
        fragment.setColor(red, green, blue);
    }
}