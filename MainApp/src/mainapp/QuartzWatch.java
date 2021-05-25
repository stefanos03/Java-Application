
package mainapp;

/**
 *
 * @author Dell
 */
public class QuartzWatch extends Watch{
    
    private String battery;
    
    public QuartzWatch(String make,String batt){
        super(make);
        this.battery = batt;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
    
    @Override
    public String toString(){
        return super.toString()+ "\nBattery:"+ this.battery;
    }
    @Override
    public void service(){
        super.service();
        super.addComment("Battery fitted");
        super.addToCharge(25.0);
    }
    
    public static void main(String[] args) {
        QuartzWatch q1 =  new QuartzWatch("Rolex","SW626");
        System.out.println(q1);
        q1.service();
        System.out.println(q1);
    }
}
