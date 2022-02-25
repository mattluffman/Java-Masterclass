package academy.learnprogramming.composition;

/**
 * section 7, lecture 91
 *
 * @author Matt Luffman
 * Date: 2/25/2022
 * Time: 5:40 PM
 */
public class Monitor {

    private final String model;
    private final String manufacturer;
    private final int size;
    private final Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }
}
