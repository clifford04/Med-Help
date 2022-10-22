import java.util.*;

//import javax.swing.plaf.synth.SynthSplitPaneUI;

import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // create a profile
        // add all the medicenes and all there properties
        //create a fucntion to add medicenes 
        System.out.println("please enter your name");
        String name = input.nextLine();
        Profile patient = new Profile(name);
        System.out.println("please enter your conditions seperated by commas ");
        String conditions = input.nextLine();
        patient.profmeds(conditions);
        System.out.println("please enter your daily medication seperated by commas ");
        String dailyMed = input.nextLine();
        patient.profConditions(dailyMed);

        Medicene advil = new Medicene("advil");
        advil.medEffect("Pain reliever and an anti-inflammatory medication, reducing swelling");
        advil.medSEffect("Nausea, heartburn, stomach pain, dizziness, high blood pressure");
        advil.medAlt("ginger, tumeric");
        advil.medDosage("1 pill");
        advil.medConditions("pregnant high blood pressure warfarin");
        //advil.medCondtions.contains(al)
        //advil.printMedication();

        Medicene benadryl = new Medicene("benadryl");
        benadryl.medEffect("preventing swelling or allergic reactions to occur or cold-like symptoms");
        benadryl.medSEffect("Drowsiness, fatigue, tiredness, sleepiness, dizziness");
        benadryl.medAlt("cardamom");
        benadryl.medDosage("1-2 pills");
        benadryl.medConditions("antihistamines liver problems");
        //advil.medCondtions.contains(al)
        //benadryl.printMedication();

        Medicene afrin = new Medicene("afrin");
        afrin.medEffect("Temporarily relieves nasal congestion/stuffiness");
        afrin.medSEffect("Burning, stinging, increased nasal discharge, dryness inside the nose, sneezing");
        afrin.medAlt("neti pots");
        afrin.medDosage("2-3 drops");
        afrin.medConditions("pregnant breastfeeding");
        //advil.medCondtions.contains(al)
        //afrin.printMedication();

        Medicene fexofenadine = new Medicene("fexofenadine");
        fexofenadine.medEffect("preventing swelling or allergic symptoms");
        fexofenadine.medSEffect("Headaches, drowsiness, dry mouth, nausea, or dizziness");
        fexofenadine.medAlt("antihistamines");
        fexofenadine.medDosage("60 mg");
        fexofenadine.medConditions("kidney disease antacids");
        //advil.medCondtions.contains(al)
        //fexofenadine.printMedication();

        Medicene almacone = new Medicene("almacone");
        almacone.medEffect("treats upset stomach, heartburn, acid indigestion, belching, bloating, and pressure");
        almacone.medSEffect("Nausea, constipation, diarrhea, or headache");
        almacone.medAlt("baking soda, apple cider vinegar");
        almacone.medDosage("2-4 tsp");
        almacone.medConditions("digoxin kidney disease");
        //advil.medCondtions.contains(al)
        //almacone.printMedication();

        Medicene miralax = new Medicene("miralax");
        miralax.medEffect("Treats constipation");
        miralax.medSEffect("Burning/itching/pain around the anus, difficulty sleeping, chills");
        miralax.medAlt("prunes, figs, apples");
        miralax.medDosage("17 g/1 packet");
        miralax.medConditions("bowl obstruction intestinal blockage");
        //advil.medCondtions.contains(al)
       // miralax.printMedication();

        //System.out.println(advil.getCount());
        
        List<String> al = allProfCondition(patient);
        List<Medicene> meds = new ArrayList<Medicene>();
        List<Medicene> medsTake = new ArrayList<Medicene>();
        
        
        //al.add(advil.getName());
        //al.add(benadryl.getName());
        //al.add(afrin.getName());
        //al.add(fexofenadine.getName());
        //al.add(almacone.getName());
        //al.add(miralax.getName());

        
        meds.add(advil);
        meds.add(benadryl);
        meds.add(afrin);
        meds.add(fexofenadine);
        meds.add(almacone);
        meds.add(miralax);
        
        

         // adds the meds and condtioitns t one string 
        // add medience (plan to take) add the medience to the array list of the the pteins medceince and contisonts
        //VERY END 
       System.out.println("please enter number of meds you plan to take ");
        int medNumber = input.nextInt();
        for(int n = 0; n < medNumber; n ++)
        {
            System.out.println("please enter the name of the medicene you are taking and that it is spelled correctly");
        String medtake = input.next();
        for(int i = 0; i< meds.size(); i++)
        {
            if(meds.get(i).getName().equals(medtake))
                {
                     meds.get(i).printMedication();
                     al.add(meds.get(i).getName());
                     medsTake.add(meds.get(i));
                     System.out.println("medicene was added");
                }
           
        }
         
    }
System.out.println(checkConditions(medsTake, al ));
    System.out.println(al);

    }
    public static List allProfCondition(Profile x) // convertiins the string of condtions and medicnes into an array list 
    {
        ArrayList<String> al = new ArrayList<String>();
        String a = x.getAllCondition();
        String [] str = a.split(",");
       for(int i =0; i < str.length; i++)
       {
        al.add(str[i]);
       }
        return al;
    }
    public static String checkConditions(List<Medicene> meds,  List<String> al)
    {

        for(int i = 0; i < meds.size(); i++)
        {
            for(int n = 0; n < al.size(); n++)
            {
                if(meds.get(i).getCondition().contains(al.get(n)))
                {
                    return meds.get(i).getName() + " is not compatible with " + al.get(n);
                }
            } 
        }
        return "all meds are good";
       /* for(int i=0; i < al.size(); i++)
        {
            if( med.getCondition().contains(al.get(i)))
            {
                return med.getName() + " is not compatiable with " + al.get(i);
            }
        }


return "take " + med.getName();
*/
    }
}