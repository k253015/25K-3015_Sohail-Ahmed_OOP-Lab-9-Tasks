

interface GPS{
    // Methods not specified in question
}
interface PaymentSystem{
    // Methods not specified in question
}
public class Ride implements GPS,PaymentSystem {
        static class CompanyRules{
            // Static inner class as per question
        }
    // No additional methods required as per question
        public static void main(String[] args){
            Ride ride = new Ride();
        }
}
