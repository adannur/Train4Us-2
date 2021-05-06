package com.lootpesaapp.train4us;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideosActivity extends AppCompatActivity {

    VideoView catpose,bridge_strech,triangular,down_dog;
    VideoView indoor_football,cattch,dancing,indoorHit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        catpose=findViewById(R.id.catpose);
        bridge_strech=findViewById(R.id.bridge_pose);
        triangular=findViewById(R.id.triangular_pose);
        down_dog=findViewById(R.id.downward_dog);
//
        indoor_football=findViewById(R.id.indoor_footbals);
        cattch=findViewById(R.id.Catch);
        dancing=findViewById(R.id.dancing);
        indoorHit=findViewById(R.id.indoor_hits);



        String videopath_catpose="android.resource://"+ getPackageName() +"/"+ R.raw.cat_pose;
        Uri catpose_uri=Uri.parse(videopath_catpose);
        catpose.setVideoURI(catpose_uri);
        MediaController catpose_mediaController=new MediaController(this);
        catpose.setMediaController(catpose_mediaController);
        catpose_mediaController.setAnchorView(catpose);

        ////////////////
        String videopath_bridgestrecthes="android.resource://"+ getPackageName() +"/"+ R.raw.bridge_strech;
        Uri bridge_strrech_uri=Uri.parse(videopath_bridgestrecthes);
        bridge_strech.setVideoURI(bridge_strrech_uri);
        MediaController bridge_strrech_mediaController=new MediaController(this);
        bridge_strech.setMediaController(bridge_strrech_mediaController);
        bridge_strrech_mediaController.setAnchorView(bridge_strech);


        ////////////////
        String videopath_triangular="android.resource://"+ getPackageName() +"/"+ R.raw.triangularpose;
        Uri triangular_uri=Uri.parse(videopath_triangular);
        triangular.setVideoURI(triangular_uri);
        MediaController triangular_mediaController=new MediaController(this);
        triangular.setMediaController(triangular_mediaController);
        triangular_mediaController.setAnchorView(triangular);


        ////////////////
        String videopath_downdog="android.resource://"+ getPackageName() +"/"+ R.raw.downward_dog;
        Uri downdog_uri=Uri.parse(videopath_downdog);
        down_dog.setVideoURI(downdog_uri);
        MediaController downdog_mediaController=new MediaController(this);
        down_dog.setMediaController(downdog_mediaController);
        downdog_mediaController.setAnchorView(down_dog);










        //////////////
        String videopath_cattch="android.resource://"+ getPackageName() +"/"+ R.raw.catching;
        Uri cattch_uri=Uri.parse(videopath_cattch);
        cattch.setVideoURI(cattch_uri);
        MediaController cattch_mediaController=new MediaController(this);
        cattch.setMediaController(cattch_mediaController);
        cattch_mediaController.setAnchorView(cattch);


        //////////////
        String videopath_dancing="android.resource://"+ getPackageName() +"/"+ R.raw.dancing;
        Uri dancing_uri=Uri.parse(videopath_dancing);
        dancing.setVideoURI(dancing_uri);
        MediaController dancing_mediaController=new MediaController(this);
        dancing.setMediaController(dancing_mediaController);
        dancing_mediaController.setAnchorView(dancing);

        //////////////
        String videopath_indoor="android.resource://"+ getPackageName() +"/"+ R.raw.indoor;
        Uri indoor_uri=Uri.parse(videopath_indoor);
        indoorHit.setVideoURI(indoor_uri);
        MediaController indoor_mediaController=new MediaController(this);
        indoorHit.setMediaController(indoor_mediaController);
        indoor_mediaController.setAnchorView(indoorHit);
//
//
        ////////////////
        String videopath_indoor_football="android.resource://"+ getPackageName() +"/"+ R.raw.indoor_football;
        Uri indoor_football_uri=Uri.parse(videopath_indoor_football);
        indoor_football.setVideoURI(indoor_football_uri);
        MediaController indoor_football_mediaController=new MediaController(this);
        indoor_football.setMediaController(indoor_football_mediaController);
        indoor_football_mediaController.setAnchorView(indoor_football);




    }
}