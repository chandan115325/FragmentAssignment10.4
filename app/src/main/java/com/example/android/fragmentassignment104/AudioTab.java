package com.example.android.fragmentassignment104;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by CHANDAN on 6/16/2017.
 */

public class AudioTab extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState){
        View view = layoutInflater.inflate(R.layout.audio_fragment,container,false);

        TextView audioTextView = (TextView)view.findViewById(R.id.audioTextView);
        audioTextView.setText("Audio Fragment");
        return  view;
    }
}
