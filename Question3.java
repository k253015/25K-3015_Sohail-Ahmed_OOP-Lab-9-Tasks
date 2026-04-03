

interface FraudChecker{
    default void temporaryFraudChecker(){
        System.out.println("Fraud Check Message");
    }
}
interface AssignAuditor{
    default void oneTimeAuditor(){
        System.out.println("Auditor Report");
    }
}

public class Bank implements FraudChecker, AssignAuditor{

    public void Hiring(){
        FraudChecker.super.temporaryFraudChecker();
        AssignAuditor.super.oneTimeAuditor();


    }
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.Hiring();
    }
}
