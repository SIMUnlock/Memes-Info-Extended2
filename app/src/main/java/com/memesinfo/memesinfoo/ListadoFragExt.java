package com.memesinfo.memesinfoo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ListadoFragExt extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listado_frag_ext, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        FragmentActivity activity = getActivity ();
        Bundle bundle = this.getArguments();
        String []descriptionMemes=getResources().getStringArray(R.array.descriptions);
        String []namesMemes=getResources().getStringArray(R.array.names);
        String []urlMemes=getResources().getStringArray(R.array.urls);
        TextView textView= (TextView) activity.findViewById(R.id.textMemeExt);
        TextView textViewHeader= (TextView) activity.findViewById(R.id.textMemeExtHeader);
        TextView textViewUrl= (TextView) activity.findViewById(R.id.textMemeExtUrl);
        ImageView imageView= (ImageView) activity.findViewById(R.id.imgMemeExt);

        textViewHeader.setText(namesMemes[bundle.getInt("idMeme")]);
        imageView.setImageResource(bundle.getInt("idImg"));
        textView.setText(descriptionMemes[bundle.getInt("idMeme")]);
        textViewUrl.setText(urlMemes[bundle.getInt("idMeme")]);


    }
}
