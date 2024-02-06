public class ImageProxy implements IImage{
    private String fileName;
    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        Image realImage = new Image(fileName);
        realImage.display();
    }

}
