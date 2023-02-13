class Ex08Dog {
    private String name, owner;
    private double weight;

    public Ex08Dog() {

    }

    public Ex08Dog(String name) {
        this.name = name;
    }

    public Ex08Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Ex08Dog(String name, double weight, String owner) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public double getWeight() {
        return weight;
    }

    public void printInfo() {
        System.out.println("Dog info");
        System.out.println("Name: " + this.getName());
        System.out.println("Weight: " + this.getWeight());

    }
}
