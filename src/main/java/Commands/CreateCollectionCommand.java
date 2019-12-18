package Commands;
/*the Commands.Command for Creating Collection*/

import Receiver.Album;

public class CreateCollectionCommand implements Command {

    private Album album;


    public CreateCollectionCommand(Album album) {
        this.album = album;
    }
    public void execute()
    {
        album.Create();
    }

}
