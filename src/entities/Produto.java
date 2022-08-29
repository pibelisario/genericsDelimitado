package entities;

public class Produto implements Comparable<Produto>{

    private String name;
    private Double price;

    public Produto(){
    }

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "\nName: " +getName() +" Price: " +String.format("%.2f", getPrice());
    }

    @Override
    public int compareTo(Produto other) {
        return price.compareTo(other.getPrice());
    }
}
