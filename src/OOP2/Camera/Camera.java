package OOP2.Camera;

public class Camera {


    String brand;
    int megaPixels;
    double displaySize;
    boolean colored;
    private Lens lens;
    static int cameraCounter;


    public Camera(String brand, int megaPixels, double displaySize, boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
        cameraCounter++;
    }

    public String getBrand() {
        System.out.println(brand);
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null){
            System.out.println("Bitte geben Sie einen Brand an!");
        }else{
            this.brand = brand;
        }

    }

    public int getMegaPixels() {
        System.out.println(megaPixels);
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        if (megaPixels <= 0){
            System.out.println("Die Megapixels größe muss größer sein!.");
        }else{
            this.megaPixels = megaPixels;
        }

    }

    public double getDisplaySize() {
        System.out.println(displaySize);
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        if (displaySize <= 0){
            System.out.println("Die Displaygröße muss größer sein");
        }else{
            this.displaySize = displaySize;
        }
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public Lens getLens() {
        System.out.println(lens);
        return lens;
    }

    public String toString() {
        return "Camera brand: " + brand + ", megaPixels: " + megaPixels + ", displaySize: " + displaySize
                + ", colored: " + colored + ", lens: " + lens;
    }
}
