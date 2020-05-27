package Chapter3.Polymorphism;

class Bank{
    void rateOfInterest(){
        System.out.println("0.7%");
    }
}

class AxisBank extends Bank{
    @Override
    void rateOfInterest() {
        System.out.println("1.2%");
    }
}
class ICICI extends Bank{
    @Override
    void rateOfInterest() {
        System.out.println("0.9%");
    }
}

class HDFC extends Bank{
    @Override
    void rateOfInterest() {
        System.out.println("1.4%");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
     Bank b;
     // UpCasting & Runtime Polymorphism
        System.out.println(" Rate of Interest in HDFC");
        b = new HDFC();
        b.rateOfInterest();
        System.out.println(" Rate of Interest in ICICI");
        b = new ICICI();
        b.rateOfInterest();
        System.out.println(" Rate of Interest in Axis");
        b = new AxisBank();
        b.rateOfInterest();
    }
}
