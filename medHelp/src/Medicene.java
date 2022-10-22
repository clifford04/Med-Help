import java.io.*;
public class Medicene {
    private String name;
    private String effect;
    private String sEffect;
    private String alt;
    private String dosage;
    private String conditions;
    private int count =0;

    public Medicene(String name)
    {
        this.name  = name;
        count++;
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
    public void medConditions(String medConditions )
    {
        conditions = medConditions;
    }
    public void printMedication()
    {
        System.out.println(name);
        System.err.println("the effects are " + effect);
        System.out.println("the side effects are " + sEffect);
        System.out.println("possible alterantives to taking " + name + " is " + alt);
        System.out.println("the dosage you should be taking is " + dosage);
    }
    public String getCondition()
    {
        return conditions;
    }
    public String getName()
    {
        return name;
    }
    public String getEffect()
    {
        return effect;
    }
    public String getSideEffect()
    {
        return sEffect;
    }
    public String getAlt()
    {
        return alt;
    }
    public String getDosage()
    {
        return dosage;
    }
    public int getCount()
    {
        return count;
    }
}