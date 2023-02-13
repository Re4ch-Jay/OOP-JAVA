public class Ex10Computer {
    private String brand, model;
    private int RAMSize, HDDSize;

    public Ex10Computer() {

    }

    public Ex10Computer(String brand) {
        this.brand = brand;
    }

    public Ex10Computer(String brand, String model, int RAMSize) {
        this.brand = brand;
        this.model = model;
        this.RAMSize = RAMSize;
    }

    public Ex10Computer(String brand, String model, int RAMSize, int HDDSize) {
        this.brand = brand;
        this.model = model;
        this.RAMSize = RAMSize;
        this.HDDSize = HDDSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRAMSize(int RAMSize) {
        this.RAMSize = RAMSize;
    }

    public void setHDDSize(int HDDSize) {
        this.HDDSize = HDDSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRAMSize() {
        return RAMSize;
    }

    public int getHDDSize() {
        return HDDSize;
    }

    public void printInfo() {
        System.out.println("Info of computer");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Model: " + this.getModel());
        System.out.println("RAM size: " + this.getRAMSize());
        System.out.println("HDD size: " + this.getHDDSize());
    }

}
