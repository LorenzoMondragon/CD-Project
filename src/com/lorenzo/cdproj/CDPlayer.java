package com.lorenzo.cdproj;
/******************
 * com.lorenzo.cdproj.CDPlayer.java
 * Lorenzo Mondragon
 *
 * This program emulates a CD player
 */
import com.lorenzo.cdproj.entities.Song;

import java.util.ArrayList;

public class CDPlayer
{

    private ArrayList<Song> songs = new ArrayList<>();

    //**************************

    public CDPlayer()
    {

    }

    //**************************

    public void addSong(Song song)
    {
        songs.add(song);
    }

    //**************************

    public void printStatus()
    {

    }

}
