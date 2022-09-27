package assignment.day8.playlist;

public class MainPlaylist {

	public static void main(String[] args) {
        Playlist playlist = new Playlist(5);
        playlist.enqueue(new Song("Robbers", "The 1975"));
        playlist.enqueue(new Song("Cornelia Street", "Taylor Swift"));
        playlist.enqueue(new Song("NVMD", "Denise Julia"));
        playlist.enqueue(new Song("Die for you", "The Weekend"));
        playlist.enqueue(new Song("Love on the Weekend", "Aria Ohlsson"));
        playlist.playSong();
        playlist.nextSong();
        playlist.remainingSong();
        playlist.playSong();
        playlist.nextSong();
        playlist.remainingSong();
        playlist.playSong();
        playlist.nextSong();
        playlist.remainingSong();
        playlist.enqueue(new Song("That's Hilarious", "Charlie Puth"));
        playlist.playSong();
        playlist.nextSong();
        playlist.remainingSong();
        playlist.playSong();
        playlist.nextSong();
        playlist.remainingSong();
        playlist.playSong();
        playlist.nextSong();
        playlist.remainingSong();

    }

}
