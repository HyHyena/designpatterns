package BridgePattern;

public abstract class View {
    IResource iResource;

    public View(IResource iResource) {
        this.iResource = iResource;
    }

    public abstract String show();
}
