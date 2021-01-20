package BridgePattern;

public class ArtistResource extends Artist implements IResource{
    Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return this.artist.bio();
    }

    @Override
    public String title() {
        return this.artist.bio();
    }
}
