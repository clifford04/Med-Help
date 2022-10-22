import java.util.*;
import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        // create a profile
        // add all the medicenes and all there properties
        //create a fucntion to add medicenes 
        Profile patient = new Profile("John Doe");

        Medicene advil = new Medicene("advil");
        advil.medEffect("pain reduction");
        advil.medSEffect("bloating");
        advil.medAlt("sleep");
        advil.medDosage("1 pill ");
        advil.medConditions("pregnant diabetes warfarin");
        //advil.medCondtions.contains(al)
        advil.printMedication();

        System.out.println(advil.getCount());
        patient.profmeds("a,b,c");
        patient.profConditions("a,b,c");
        List<String> al = allProfCondition(patient);
        //al = allProfCondition(patient);
        //al.add("string");
        System.out.println(al); // adds the meds and condtioitns t one string 
        // add medience (plan to take) add the medience to the array list of the the pteins medceince and contisonts
        //VERY END 
        

    }
    public static List allProfCondition(Profile x) // convertiins the string of condtions and medicnes into an array list 
    {
        List<String> al = new ArrayList<String>();
        String a = x.getAllCondition();
        String [] str = a.split(",");
        al = Arrays.asList(str);
        return al;
    }
}