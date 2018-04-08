
public class LCM {

	public int findLCM(int a, int b){
        int lcm = (a > b) ? a : b;
        while(true){
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }
        return lcm;
    }

    public static void main(String [] args){
        LCM lcm = new LCM();
        System.out.println("LCM Of "+ 4 +" and " + 6 + " is : " + lcm.findLCM(4,6));
    }}
