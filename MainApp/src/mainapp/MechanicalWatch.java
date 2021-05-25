
package mainapp;

public class MechanicalWatch extends Watch {

    private final MechanicalType type;

    public MechanicalWatch(String make, MechanicalType t) {
        super(make);
        this.type = t;

    }

    public MechanicalType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return super.toString() + "Type: " + this.type;
    }

    @Override
    public void service() {
        super.service();
        if (this.type == MechanicalType.AUTOMATIC) {
            super.addToCharge(125.0);
        } else {
            super.addToCharge(75.0);
        }
    }
    public static void main(String[] args) {
        MechanicalWatch m1= new MechanicalWatch("Patek Phillipe",MechanicalType.AUTOMATIC);
        System.out.println(m1);
        m1.service();
        System.out.println(m1);
        //testing
         MechanicalWatch m2= new MechanicalWatch("Timex",MechanicalType.MANUAL);
        System.out.println(m2);
        m2.service();
        System.out.println(m2);
}
}

