package oops.secondAssessment;

import java.util.*;

public class PlayList {
    private String name;
    private List<Track> tracks;

    public PlayList(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    //adding track
    public void addTrack(Track track) {
        try {
            if (tracks.contains(track)) {
                throw new DuplicateTrackException("Track already exists!!!!");
            }
        }catch (DuplicateTrackException e) {
            System.out.println(e.getMessage());
        }
    }

    //Removing track
    public void removeTrack(Track track) {
        if(!tracks.remove(track)) {
            System.out.println("Track not found!!!!");
        }else{
            System.out.println("Track Removed Successfully!!!!");
        }
    }

    //finding duplicate tracks

    public List<Track> duplicates(){
        Set<Track> set = new HashSet<>();
        List<Track> duplicates = new ArrayList<>();
        for (Track track : tracks) {
            if (set.contains(track)) {
                duplicates.add(track);
            }
        }
        return duplicates;
    }

    //Searching for track

    public List<Track> search(String word) {
        word = word.toLowerCase();
        List<Track> found = new ArrayList<>();
        for (Track track : tracks) {
          if(track.getTitle().toLowerCase().contains(word)||
          track.getArtist().toLowerCase().contains(word)) {
              found.add(track);
          }
        }
        return found;
    }

    //sorting

    public void sortByTitle() {
        tracks.sort(Comparator.comparing(Track::getTitle));
        System.out.println("Tracks sorted by title.");
    }

    public void sortByDuration() {
        tracks.sort(Comparator.comparingDouble(Track::getDuration));
        System.out.println("Tracks sorted by duration.");
    }


    //shuffling
    public void shuffling(){
        Collections.shuffle(tracks);
        System.out.println("Tracks Shuffled");
    }


    //displaying all tracks
    public void displayTracks(){
        if(tracks.isEmpty()) {
            System.out.println("No tracks found in the playlist");
        }else{
            for (Track track : tracks) {
                System.out.println(track);
            }
        }
    }
}
