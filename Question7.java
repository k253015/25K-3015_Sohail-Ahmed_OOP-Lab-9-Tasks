interface EmergencyService{
    default void serviceStatus(){
        System.out.println("Immediate Response");
    }
}

interface InsuranceService{
    default void serviceStatus(){
        System.out.println("Coverage Details");
    }
}


class MedicalHistory{
    void showMedicalHistory(){
        System.out.println("Medical Module");
    }
}

public class Patient implements EmergencyService, InsuranceService{

    MedicalHistory MH = new MedicalHistory();


    public void treatment(){
        System.out.println("Patient treatment Started");
    }

    @Override
    public void serviceStatus(){
        EmergencyService.super.serviceStatus();
        InsuranceService.super.serviceStatus();
    }

    public void medicalModule(){
        MH.showMedicalHistory();
    }

    public static void main(String[] args){
        Patient patient = new Patient();

        patient.treatment();
        patient.serviceStatus();
        patient.medicalModule();
    }
}
