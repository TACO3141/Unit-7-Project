import java.util.*;

public class Main
{
  public static void Main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String choice = "";
    int index = 0;
    boolean continue = true;
    String artist = "";
    String song = "";

    ArrayList<String> songs = new ArrayList<String>(10);
    ArrayList<String> artists = new ArrayList<String>(10);
    // You should listen to these songs, they are all real :) especially Tame Impala
    String[] unlinkedSongs = {"New Person, Same Old Mistakes", "Happy Song", "Poison", "Freak on a Leash", "Virtual Insanity", "Homecoming", "Crying Lightning", "Even Flow", "Santeria", "Instant Crush"};
    String[] unlinkedArtists = {"Tame Impala", "Bring Me The Horizon", "Bell Biv DeVoe", "Korn", "Jamiroquai", "Kanye West", "Arctic Monkeys", "Pearl Jam", "Sublime", "Daft Punk"};
    songs = Arrays.asList(unlinkedSongs);
    artists = Arrays.asList(unlinkedArtists);
    ArrayList<String> partyPlayList = new ArrayList<String>();
    // Print songs
    for (int i = 0; i < songs.size(); i++)
    {
      System.out.println(i + ": " + songs[i] + " - " + artists[i]);
    }
    while (continue)
    {
      System.out.println("What would you like to do?\nAdd Song To Library (A)\nDelete Song From Library (D)\nList Songs(L)\nAdd Song To Playlist(P)\nShow Playlist(S)\nExit(E)\nChoice: ");
      choice = scan.nextLine();
      if (choice.equalsIgnoreCase(a))
      {
        System.out.println("Please enter the song name:");
        song = scan.nextLine();
        System.out.println("Please enter the artist name:");
        artist = scan.nextLine();
        songs.add(song);
        artists.add(artist);
      }
      else if (choice.equalsIgnoreCase(d))
      {
        System.out.println("Please enter the index of the song to be deleted:");
        index = scan.nextLine();
        if (!(index >= songs.length || index < 0) && !(index >= artists.length))
        {
          songs.remove(index);
          artists.remove(index);
        }
        else
        {
          System.out.println("Sorry, that's not a valid index. Here are the songs and indices:");
          for (int i = 0; i < songs.size(); i++)
          {
            System.out.println(i + ": " + songs[i] + " - " + artists[i]);
          }
        }
      }
      else if (choice.equalsIgnoreCase(l))
      {
        for (int i = 0; i < songs.size(); i++)
        {
          System.out.println(i + ": " + songs[i] + " - " + artists[i]);
        }
      }
      else if (choice.equalsIgnoreCase(p))
      {
        for (int i = 0; i < songs.size(); i++)
        {
          System.out.println(i + ": " + songs[i] + " - " + artists[i]);
        }
        System.out.println("Please enter the index of the song you would like to add:");
        
      }
    }
    scan.close();
  }
}
