package olegmasiuk94;

/**
 * Created by Marta on 16.11.2017.
 */
public class Phone {
    private  String color;
    private double size;
    private  double nomer;
    private  String  brand;

    public Phone(String color, double size, double nomer, String brand) {
        this.color = color;
        this.size = size;
        this.nomer = nomer;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getNomer() {
        return nomer;
    }

    public void setNomer(double nomer) {
        this.nomer = nomer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public  void registrationPhone (){

    }
    public String callNumber(){


    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", nomer=" + nomer +
                ", brand='" + brand + '\'' +
                '}';
    }
}
