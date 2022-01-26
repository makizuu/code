using System;
using System.Collections.Generic;
using System.Linq;
using System.IO;

namespace le_test
{
    class Program
    {
        static string ohje = "[1] Lisää työntekijä\n[2] Lista työntekijöistä\n[3] Poista työntekijä\n[4] Palkkapäivät\n[0] Lopetus";

        static void Main(string[] args)
        {
            Console.WriteLine("Palkanlaskenta");
            Console.WriteLine("--------------");
            Console.WriteLine(ohje);
            string komento = Console.ReadLine();
            var tyontekijalista = new List<Tyontekijat>();
            var bruttopalkatlista = new List<int>();
            var sivukulutlista = new List<int>();
            while (!komento.StartsWith("0"))
            {
                switch(komento)
                {
                    case "1":

                        Tyontekijat henkilo = new Tyontekijat(" ", 1, 1, 1);
                        Console.WriteLine("Anna työntekijän kokonimi: ");
                        henkilo.Nimi = Console.ReadLine();
                        Console.WriteLine("Anna työntekijän bruttopalkka: ");
                        henkilo.Bruttopalkka = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Bruttopalkka on: " + henkilo.Bruttopalkka + "e ");
                        Console.WriteLine("Anna työntekijän veroprosentti desimaalilukuna: ");
                        double Alv = double.Parse(Console.ReadLine());
                        double Alv2 = 1 - Alv;
                        henkilo.Nettopalkka = (int)(henkilo.Bruttopalkka * Alv2);
                        Console.WriteLine("Nettopalkka on: " + henkilo.Nettopalkka +"e ");
                        henkilo.Sivukulut = (int)(henkilo.Bruttopalkka * 0.1968);
                        Console.WriteLine("Sivukulut on: " + henkilo.Sivukulut + "e ");

                        tyontekijalista.Add(new Tyontekijat(henkilo.Nimi, henkilo.Bruttopalkka, henkilo.Sivukulut, henkilo.Nettopalkka));

                        bruttopalkatlista.Add(henkilo.Bruttopalkka);

                        sivukulutlista.Add(henkilo.Sivukulut);

                        break;
                    case "2":
                        Console.WriteLine("Nimi:\t\tBruttopalkka:\tNettopalkka:\tSivukulut:");
                        foreach (var item in tyontekijalista)
                        {
                            Console.WriteLine(item.Tulosta());
                        }
                        break;
                    case "3":
                        Console.WriteLine("Valitsit komennon 3");
                        Console.WriteLine("Mikä työntekijä poistetaan? Lasku alkaa 0:sta: ");
                        int valittuTyontekija = Int32.Parse(Console.ReadLine());
                        tyontekijalista.RemoveAt(valittuTyontekija);
                        bruttopalkatlista.RemoveAt(valittuTyontekija);
                        sivukulutlista.RemoveAt(valittuTyontekija);
                        break;
                    case "4":
                        {
                            { 
                            Console.WriteLine("Tulevat palkanmaksupäivät!");

                            Console.WriteLine("------------------------------");

                            string paivaText;
                            int paiva;
                            Console.WriteLine("Anna päivä : ");
                            paivaText = Console.ReadLine();
                            if (int.TryParse(paivaText, out paiva)) ;

                            else
                            {
                                Console.WriteLine("Käytä vain numeroita, EI KIRJAIMIA!");
                                while (!int.TryParse(Console.ReadLine(), out paiva)) ;
                            }
                            Console.WriteLine("------------------------------");

                            string kuukausiText;
                            int kuukausi;
                            Console.WriteLine("Anna kuukausi lukuna : ");
                            kuukausiText = Console.ReadLine();
                            if (int.TryParse(kuukausiText, out kuukausi)) ;

                            else
                            {
                                Console.WriteLine("Käytä vain numeroita, EI KIRJAIMIA!");
                                while (!int.TryParse(Console.ReadLine(), out kuukausi)) ;
                            }

                            Console.WriteLine("------------------------------");
                            string vuosiText;
                            int vuosi;
                            Console.WriteLine("Anna vuosi lukuna : ");
                            vuosiText = Console.ReadLine();
                            if (int.TryParse(vuosiText, out vuosi)) ;

                            else
                            {
                                Console.WriteLine("Käytä vain numeroita, EI KIRJAIMIA!");
                                while (!int.TryParse(Console.ReadLine(), out vuosi)) ;
                            }
                            Console.WriteLine("------------------------------");
                            DateTime d = new DateTime(vuosi, kuukausi, paiva);

                            Console.WriteLine(PalkkaPaiva(d).ToString("Palkkapäivä on " + "dd/MM/yyyy"));
                            Console.WriteLine("HUOM! Jos viimeinen päivä on viikonloppu tai pyhäpäivä, maksa palkat edeltävänä arkipäivänä!");
                            Console.WriteLine("\n");

                            int bruttosumma = 0;
                            bruttosumma = bruttopalkatlista.Sum();
                            int sivukulusumma = 0;
                            sivukulusumma = sivukulutlista.Sum();
                            int loppusumma = bruttosumma + sivukulusumma;

                            Console.WriteLine("Maksettava bruttopalkkoja: " + bruttosumma + " euroa");
                            Console.WriteLine("Maksettava sivukuluja: " + sivukulusumma + " euroa");
                            Console.WriteLine("Maksettava yhteensä: " + loppusumma + " euroa");
                            }
                            static DateTime PalkkaPaiva(DateTime palkkapaiva)
                        {
                            DateTime KuunVikaPaiva = new(palkkapaiva.Year, palkkapaiva.Month, 1);
                            return KuunVikaPaiva.AddMonths(1).AddDays(-1);
                        }
                }
            break;
                    default:      
                        break;
                }
                Console.WriteLine(ohje);
                komento = Console.ReadLine();
            }
        }
    }
}
