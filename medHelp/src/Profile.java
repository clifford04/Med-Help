import java.io.*;
import java.util.*;

public class Profile {
    
        String name;
        int age;
        float weight;
        String meds;
        String conditons;
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
        
    }

