package fr.papounworld;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Propriétés projet : " );
        System.out.println( " " );
        Properties proprietes = new Properties();
        InputStream inputStream = null;
        try {
        inputStream = App.class.getResourceAsStream("/conf-prod/info.properties");
      
			proprietes.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        finally {
        	if(inputStream !=null) {try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
        }
        
        
        System.out.println ("version projet " + proprietes.getProperty("fr.papounworld.version"));
        System.out.println ("racine projet " + proprietes.getProperty("fr.papounworld.racineProjet"));
        System.out.println ("version java " + proprietes.getProperty("fr.papounworld.versionJava"));
        System.out.println ("variable environnement JAVA_HOME " + proprietes.getProperty("fr.papounworld.variableEnvironnementJAVA_HOME"));
        System.out.println ("variable environnement MAVEN_HOME " + proprietes.getProperty("fr.papounworld.variableEnvironnementMAVEN_HOME"));

        
        
    }
}
