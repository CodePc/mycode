package com.learnII;

import com.learnI.Patient;

/**
 * Created by Prem Chand on 9/22/2016.
 */
public class EyeTreatment extends Patient {
    public Patient Eye(){
        Patient patient =new EyeTreatment();
        patient.Patient("prem",1,"Dental");
            return patient;
    }
}
