package oops.secondAssessment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class User {

    private String name;
    private Map<String,PlayList> playlists;
    private Set<Track> favoriteTracks;

    public User(String name) {
        this.name = name;
        this.playlists = new HashMap<>();
        this.favoriteTracks = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Map<String, PlayList> getPlaylists() {
        return playlists;
    }

    public Set<Track> getFavoriteTracks() {
        return favoriteTracks;
    }

    //Creating playlist
    public void createPlayList(String name) {
        if (playlists.containsKey(name)) {
            throw new IllegalArgumentException("playlist already exists");
        }
        playlists.put(name, new PlayList(name));
    }

    //deleting playlist

    public void deletePlayList(String name) {
        if (playlists.remove(name)==null) {
            throw new IllegalArgumentException("playlist does not exist");
        }
    }

    //retrieving playlist by name

    public PlayList getPlayList(String name) {
        PlayList pl = playlists.get(name);
        if (pl==null) {
            throw new IllegalArgumentException("playlist not found");
        }
        return pl;
    }

    //marking favorite and unmarking

    public void markFavorite(Track track) {
        favoriteTracks.add(track);
    }
    public void unmarkFavorite(Track track) {
        favoriteTracks.remove(track);
    }

    public void displayFavorites(){
        if(favoriteTracks.isEmpty()){
            System.out.println("No favorite tracks found");
        }else{
            for(Track track : favoriteTracks){
                System.out.println(track);
            }
        }

    }

    //merging

    public void mergingPlayList(String first, String second,String newName) {
        PlayList pl = playlists.get(first);
        PlayList pl2 = playlists.get(second);

        if(pl==null||pl2==null){
            System.out.println("Error!!!Not found");
            return;
        }

        PlayList pl3 = new PlayList(newName);

        playlists.put(newName, pl3);
        System.out.println("Merged playlist"+newName);
    }


    public void displayAllPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists available.");
        } else {
            System.out.println("Playlists:");
            for (PlayList playlist : playlists.values()) {
                System.out.println("Playlist: " + playlist.getName());
                playlist.displayTracks();
            }
        }
    }
}
