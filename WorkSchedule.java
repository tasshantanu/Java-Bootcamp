public class WorkSchedule {

    public static void main(String[] args) {
            
         //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  
    
        int day = 3;   //3rd day of the week...
        boolean holiday = true;
             
            // IF - ELSE IF - ELSE HERE!
            if (day <=5 && holiday) {
                System.out.println("Woohoo, no work!");
            }
            else if (day <=5 && !(holiday)) {
                System.out.println("Wake up at 7:00 am");
            }
            else {
                System.out.println("It's the weekend, no work!");
            }
    
}
}
