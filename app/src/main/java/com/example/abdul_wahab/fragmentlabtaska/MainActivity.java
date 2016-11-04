package com.example.abdul_wahab.fragmentlabtaska;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.abdul_wahab.fragmentlabtaska.fragments.BlueFragment;
import com.example.abdul_wahab.fragmentlabtaska.fragments.F1Fragment;
import com.example.abdul_wahab.fragmentlabtaska.fragments.GreenFragment;
import com.example.abdul_wahab.fragmentlabtaska.fragments.RedFragment;

public class MainActivity extends AppCompatActivity implements F1Fragment.IF1FragmentListener {

    private String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(int color) {
        Log.d(TAG, "onFragmentInteraction() called with: color = [" + color + "]");


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if (color == Color.RED)
            transaction.replace(R.id.FragmentContainer, new RedFragment());
        if (color == Color.GREEN)
            transaction.replace(R.id.FragmentContainer, new GreenFragment());
        if (color == Color.BLUE)
            transaction.replace(R.id.FragmentContainer, new BlueFragment());


        transaction.commit();

    }
}
