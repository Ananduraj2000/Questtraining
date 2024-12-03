package oops.secondAssessment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DuplicateTrackException {

        Scanner sc = new Scanner(System.in);
        User user = new User("Anandu");

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Create PlayList");
            System.out.println("2. Add track to Playlist");
            System.out.println("3. Remove track from Playlist");
            System.out.println("4. Display Tracks in Playlist");
            System.out.println("5. Display All Playlists");
            System.out.println("6. Mark as favorite");
            System.out.println("7. Unmark as favorite");
            System.out.println("8. Display favorite");
            System.out.println("9. Search Tracks");
            System.out.println("10. Sort by Duration");
            System.out.println("11. Sort by Title");
            System.out.println("12. Shuffle");
            System.out.println("13. Merge");
            System.out.println("14. Delete PlayList");
            System.out.println("15. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                    System.out.print("Enter playlist name: ");
                    String playlistName = sc.nextLine();
                    user.createPlayList(playlistName);
                    break;

                case 2:
                    System.out.print("Enter playlist name to add track: ");
                    playlistName = sc.nextLine();
                    PlayList playlist = user.getPlayList(playlistName);

                    System.out.print("Enter track id: ");
                    int trackId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter track title: ");
                    String trackTitle = sc.nextLine();

                    System.out.print("Enter track artist: ");
                    String trackArtist = sc.nextLine();

                    System.out.print("Enter track duration : ");
                    double trackDuration = sc.nextDouble();

                    System.out.print("Enter track rating : ");
                    int trackRating = sc.nextInt();
                    sc.nextLine();

                    Track track = new Track(trackId, trackTitle, trackArtist, trackDuration, trackRating);
                    playlist.addTrack(track);
                    break;


                case 3:
                    System.out.print("Enter playlist name to remove track: ");
                    playlistName = sc.nextLine();
                    playlist = user.getPlayList(playlistName);

                    System.out.print("Enter track id to remove: ");
                    trackId = sc.nextInt();
                    sc.nextLine();


                    track = new Track(trackId, "", "", 0, 0);
                    playlist.removeTrack(track);
                    break;

                case 4:
                    System.out.print("Enter playlist name to display tracks: ");
                    playlistName = sc.nextLine();
                    playlist = user.getPlayList(playlistName);
                    playlist.displayTracks();
                    break;

                case 5:
                    System.out.println("\n PlayLists :");
                    user.displayAllPlaylists();
                    break;

                case 6:
                    System.out.print("Enter track id to mark as favorite: ");
                    trackId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter track title: ");
                    trackTitle = sc.nextLine();

                    System.out.print("Enter track artist: ");
                    trackArtist = sc.nextLine();

                    System.out.print("Enter track duration: ");
                    trackDuration = sc.nextDouble();

                    System.out.print("Enter track rating (1-5): ");
                    trackRating = sc.nextInt();
                    sc.nextLine();

                    track = new Track(trackId, trackTitle, trackArtist, trackDuration, trackRating);
                    user.markFavorite(track);
                    break;

                case 7:
                    System.out.print("Enter track id to unmark as favorite: ");
                    trackId = sc.nextInt();
                    sc.nextLine();

                    track = new Track(trackId, "", "", 0, 0);
                    user.unmarkFavorite(track);
                    break;

                case 8:
                    System.out.println("\n Favorites :");
                    user.displayFavorites();
                    break;

                case 9:
                    System.out.print("Enter search keyword: ");
                    String keyword = sc.nextLine();
                    playlist = user.getPlayList("default");
                    playlist.search(keyword).forEach(System.out::println);
                    break;

                case 10:
                    System.out.print("Enter playlist name to sort by duration: ");
                    playlistName = sc.nextLine();
                    playlist = user.getPlayList(playlistName);
                    playlist.sortByDuration();
                    break;

                case 11:
                    System.out.print("Enter playlist name to sort by title: ");
                    playlistName = sc.nextLine();
                    playlist = user.getPlayList(playlistName);
                    playlist.sortByTitle();
                    break;

                case 12:
                    System.out.print("Enter playlist name to shuffle: ");
                    playlistName = sc.nextLine();
                    playlist = user.getPlayList(playlistName);
                    playlist.shuffling();
                    break;

                case 13:
                    System.out.print("Enter the first playlist name to merge: ");
                    String firstPlaylist = sc.nextLine();
                    System.out.print("Enter the second playlist name to merge: ");
                    String secondPlaylist = sc.nextLine();
                    System.out.print("Enter the new name for the merged playlist: ");
                    String newPlaylistName = sc.nextLine();
                    user.mergingPlayList(firstPlaylist, secondPlaylist, newPlaylistName);
                    break;

                case 14:
                    System.out.print("Enter playlist name to delete: ");
                    playlistName = sc.nextLine();
                    user.deletePlayList(playlistName);
                    break;

                case 15:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
