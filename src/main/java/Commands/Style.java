package Commands;
/*the Commands.Command for Searching Genre*/

import Receiver.Album;

public class Style implements Command {

    private Album album;


    public Style(Album album) {
        this.album = album;
    }

    public void execute()
    {
        album.Style();
    }

}
