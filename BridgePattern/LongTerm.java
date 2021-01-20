package BridgePattern;

public class LongTerm extends View {

    public LongTerm(IResource iResource) {
        super(iResource);
    }

    @Override
    public String show() {
        return "Executing show method";
    }

    public String showSnippet() {
        return iResource.snippet();
    }
}
