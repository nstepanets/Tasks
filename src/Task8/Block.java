package Task8;

public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int[] size) {
        this.width = size[0];
        this.length = size[1];
        this.height = size[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (width * length + length * height + height * width);
    }
}
