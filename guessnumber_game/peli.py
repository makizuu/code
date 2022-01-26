from random import randint

def pickNumber(maxValue = 10):
    tietokone = randint(1, maxValue)
    return tietokone

def getInput(maxValue):
    try:
        arvaus = int(input("Anna arvauksesi (väliltä 1-10): "))
        if (arvaus > maxValue):
            print("Arvauksen luku on liian suuri")
        elif (arvaus < 1):
            print("Arvauksen luku on liian pieni")
        return arvaus
    except ValueError:
        return 0

def playGame():
    tietokone = pickNumber(10)
    arvaus = None
    while(True):
        arvaus = getInput(10)
        if (arvaus > tietokone):
            print("Numero on pienempi")
        if (arvaus < tietokone):
            print("Numero on suurempi")
        if (arvaus == tietokone):
            print("Oikea arvaus! Voitit pelin!")
            break
    


# tehtävä on numeronarvauspeli moduulina

# moduulissa on funktiot
# funktio pickNumber()
#   parametri   maxValue    arvottavan lukualueen yläraja. Alaraja on 1.
#   palautusarvo            arvottu kokonaisluku

#funktio getInput()
#   parametri maxValue      arvottavan lukualueen yläraja. Tulostusta varten
#   palautusarvo            käyttäjän syöttämä kokonaisluku tai nolla jos
#                           lukemisessa tapahtui virhe (poikkeusten käsittely)

#funktio playGame()
#   parametri   ei ole
#   palautusarvo            None
#
#                           Funktiossa on toistorakenne jossa kysytään käyttäjältä lukua
#                           kunnes se on arvattu oikein. Ennen silmukkaa kutsutaab pickNumber funktiota
#                           ja otetaan arvottu luku talteen muuttujaan
#                           Syötteen lukemisen (getInput funktion kutsu) jälkeen tutkitaan oliko luku oikein,
#                           pienempi tai suurempi kuin arvottu luku.
#                           Jos yhtäsuuri -> lopetetaan silmukka (peli päättyy)
#                           Jos pienempi -> tulostetaan suurempi
#                           Jos suurempi -> tulostetaan pienempi