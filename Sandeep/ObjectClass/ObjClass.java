package Sandeep.ObjectClass;

class Laptop{
    String model;
    int price;
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", Price=" + price + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}


public class ObjClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model="Dell Insprion";
        obj.price=59000;

        Laptop obj1=new Laptop();
        obj1.model="Dell Insprion";
        obj1.price=59000;
        System.out.println(obj.equals(obj1));
    }
}
