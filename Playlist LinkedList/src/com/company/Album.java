package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public String getName() {
        return name;
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs= new ArrayList<Song>();
    }
    public boolean addSong(String titleOfSong,double durationOfSong){
        if(findSong(titleOfSong)==null){
            this.songs.add(new Song(titleOfSong,durationOfSong));
               return true;
        }
            return false;
        }

    private Song findSong(String title){
      for(Song checkedSong:this.songs){
          if(checkedSong.getTitle().equals(title)){
              return checkedSong;
          }
      }
      return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playList){
        int index=track-1;
        if((index>=0) && (index<=this.songs.size())){
    playList.add(this.songs.get(index));
    return true;
        }
        System.out.println("This album does not have a track " + track);
return false;




    }
    public boolean addToPlayList(String title,LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song  " + title + "is not in this album");
        return false;
    }

}
