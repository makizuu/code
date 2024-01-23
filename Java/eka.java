import java.io.*;

public class eka
{
    public static void main(String args[])
    {
        String merkkijono;
        BufferedReader olio = new BufferedReader(new InputStreamReader(System.in));
        TulostusLuokka tulostaja = new TulostusLuokka();

        try{
        System.out.println("Anna merkkijono, jonka tulostan: ");
            merkkijono = olio.readLine();
            tulostaja.Tulosta(merkkijono);

        }catch (Exception e){
            System.out.println("Ei toimi.");

        }
    }
}

class TulostusLuokka
{
    public String tuloste;
    public void Tulosta (String s)
    {
        System.out.println(s);
    }
}