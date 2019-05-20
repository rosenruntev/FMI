package uni.fmi.oopmodel;

public class Display {
    private double size;
    private int numberOfColors;

    public Display(double size, int numberOfColors) {
        this.setSize(size);
        this.setNumberOfColors(numberOfColors);
    }

    public double getSize() {
        return size;
    }

    private void setSize(double size) {
        if (size < 0) {
            throw new IllegalArgumentException("Display size cannot be a negative number.");
        }

        this.size = size;
    }

    public int getNumberOfColors() {
        return numberOfColors;
    }

    private void setNumberOfColors(int numberOfColors) {
        if (numberOfColors < 0) {
            throw new IllegalArgumentException("Display number of colors cannot be a negative number.");
        }

        this.numberOfColors = numberOfColors;
    }

    @Override
    public String toString() {
        String info = String.format("Display Size: %.2f, Display Number of colors: %d", this.size, this.numberOfColors);
        return info;
    }
}
