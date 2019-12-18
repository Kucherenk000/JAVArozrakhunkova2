package Commands;
/*the Commands.Command to choose a random track*/


import Receiver.Album;

public class Random implements Command {

    private Album album;

    public Random(Album album) {
        this.album = album;
    }

    public void execute()
    {
        album.Random();
    }


}
