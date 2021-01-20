package BridgePattern;

public class Main {

    public static void main(String[] args) {
        Artist artist = new Artist();
        ArtistResource artistResource = new ArtistResource(artist);
        LongTerm longTerm = new LongTerm(artistResource);
        System.out.println(longTerm.showSnippet());
    }

}
