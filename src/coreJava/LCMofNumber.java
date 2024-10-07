package coreJava;

public class LCMofNumber {


    public int calculateLCM(int num1, int num2) {
        // Write your code here
        int max= Math.max(num1, num2);
        int lcm=max;

        while(true) {
            if(lcm % num1 == 0 && lcm % num2 == 0) {
                return lcm;
            }
            //System.out.println(lcm);
            lcm+=max;
        }
    }

    public String findDayWithMostChars(){
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String result="";
        for(String day:days){
            if(day.length()>result.length()){
                result=day;
            }
        }
        return result;


    }

    public static void main(String[] args) {
        int num1 = 6, num2 = 8;
        LCMofNumber obj = new LCMofNumber();
        System.out.println(obj.findDayWithMostChars());
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + obj.calculateLCM(num1, num2));
    }
}
