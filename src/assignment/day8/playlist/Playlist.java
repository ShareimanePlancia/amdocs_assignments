package assignment.day8.playlist;

public class Playlist {
	
    static int front;
    static int rear;
    static int capacity;
    static int count;
    static Song queue[];
    
    public Playlist(int size){
        queue = new Song[size];
        this.capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(Song addSong) {
        System.out.println("Title: " + addSong.getName() +  " by: " +addSong.getArtist() +" has been added to your playlist." );
        rear =(rear +1)%capacity;
        queue[rear] = addSong;
        count++;
    }

    public Song playSong() {
        if (count > 0) {
            Song play = queue[front];
            System.out.println("\nNow Playing: " + play.getName() +  " by: " + play.getArtist());
            front = (front+1)%capacity;
            count--;
            return play;
        } else {
            System.out.println("No more songs in the playlist. All songs are played.") ;
            return null;
        }

    }

    public String nextSong() {

        if (count > 0) {
            System.out.println("Next song: " + queue[front].getName()) ;
            return queue[front].getName();
        }
        else {
            System.out.println("\nNo more songs in the playlist. All songs are played.") ;
            return null;
        }


    }

    public int remainingSong() {
        System.out.println("Number of songs left: " + count);
        return count;
    }
}
