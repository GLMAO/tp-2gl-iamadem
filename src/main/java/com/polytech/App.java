package com.polytech;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /* 
        Cours cours2 = Cours.builder()
     .setMatiere("Math")
     .setEnseignant("Amiour")
     .setSalle("A1")
     .setDate("2025-01-13")
     .setHeureDebut("14:00")
     .build();
     */
      Cours cours = new CoursBuilder()
     .setMatiere("Math")
     .setEnseignant("Amiour")
     .setSalle("A1")
     .setDate("2025-01-15")
     .setHeureDebut("09:00")
     .build();

        System.out.println(cours.getDescription());

        
    }




  
}
