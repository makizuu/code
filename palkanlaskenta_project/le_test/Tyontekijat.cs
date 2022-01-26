using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace le_test
{
    class Tyontekijat
    {
        public string Nimi { get; set; }
        public int Bruttopalkka { get; set; }
        public int Sivukulut { get; set; }
        public int Nettopalkka { get; set; }

        public Tyontekijat(string Nimi, int Bruttopalkka, int Sivukulut, int Nettopalkka)
        {
            this.Nimi = Nimi;
            this.Bruttopalkka = Bruttopalkka;
            this.Sivukulut = Sivukulut;
            this.Nettopalkka = Nettopalkka;

        }
        public string Tulosta()
        {
            return Nimi + "\t\t" + Bruttopalkka + "e\t\t" + Nettopalkka + "e\t\t" + Sivukulut + "e\t";
        }
    }
}
