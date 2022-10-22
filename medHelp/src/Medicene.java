import java.io.*;
public class Medicene {
    String name;
    String effect;
    String sEffect;
    String alt;
    String dosage;
    String conditions;

    public Medicene(String name)
    {
        this.name  = name;
    }
    public void medEffect(String medEffect )
    {
        effect = medEffect;
    }
    public void medSEffect(String medSEffect )
    {
        sEffect = medSEffect;
    }
    public void medAlt(String medAlt )
    {
        alt = medAlt;
    }
    public void medDosage(String medDosage )
    {
        dosage = medDosage;
    }
    public void medConditions(String medDosage )
    {
        dosage = medDosage;
    }
    public void printMedication()
    {
        System.out.println(name);
        System.err.println("the effects are " + effect);
        System.out.println("the side effects are " + sEffect);
        System.out.println("possible alterantives to taking " + name + " is " + alt);
        System.out.println("the dosage you should be taking is " + dosage);
    }


   
}
