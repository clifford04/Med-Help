import java.io.*;
import java.util.*;

public class Profile {

    private String name;
    private int age;
    private float weight;
    private String meds;
    private String conditons;
        //Medicene newmds;

        public Profile(String name)
        {
            this.name  = name;
        }
        public void profAge(int profAge )
        {
            age = profAge;
        }
        public void profWeight(float profWeight )
        {
            weight = profWeight;
        }
        public void profmeds(String profMeds )
        {
            meds = profMeds;
        }
        public void profConditions(String profConditions )
        {
            conditons = profConditions;
        }
        public String getCondition()
        {
            return conditons;
        }
        public String getMeds()
        {
            return meds;
        }
        public String getAllCondition()
        {
            StringBuilder b = new StringBuilder();
            b.append(getMeds() + ",");
            b.append(getCondition());
            return b.toString();
        }
        public String getName()
        {
            return name;
        }
        public int getAge()
        {
            return age;
        }
        public float getweight()
        {
            return weight;
        }
        

    }
