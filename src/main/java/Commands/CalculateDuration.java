package Commands;
/*the Commands.Command for Calculating Duration */

import Receiver.Album;

public class CalculateDuration implements Command {

    private Album album;


    public CalculateDuration(Album album) {
        this.album = album;
    }

    public void execute()
    {
        album.Calculate();
    }

}
