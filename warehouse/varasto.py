from tuotelista import Tuotelista

varasto = Tuotelista()

while(True):
    valinta = int(input("1. Lisää tuote 2. Poista tuote 3. Tulosta tuotteet 4. Muokkaa tuotetta 0. Lopeta"))
    if( valinta == 0):
        break
    if( valinta == 1):
        nimi = input("Anna tuotteen nimi: ")
        hinta = float(input("Anna tuotteen hinta: "))
        maara = int(input("Anna tuotteen määrä: "))
        varasto.lisaaTuote(nimi,hinta,maara)
    if( valinta == 2):
        nimi = input("Anna poistettavan tuotteen nimi: ")
        varasto.poistaTuote(nimi)
    if( valinta == 3):
        print(varasto.tulostaTuotteet())
    if( valinta == 4):
        vanhanimi = input("Anna tuotteen nykyinen nimi: ")
        nimi = input("Anna tuotteen uusi nimi: ")
        hinta = float(input("Anna tuotteen hinta: "))
        maara = int(input("Anna tuotteen määrä: "))
        varasto.muokkaaTuote(vanhanimi,nimi,hinta,maara)
    print("Ohjelma loppui")