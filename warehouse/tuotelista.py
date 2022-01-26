from tuote import Tuote

class Tuotelista:
    tuotteet = []
    def __init__(self):
        self.tuotteet = []
    def lisaaTuote(self,nimi,hinta,maara):
        tuote = Tuote(nimi,hinta,maara)
        self.tuotteet.append(tuote)
    def poistaTuote(self,nimi):
        for tuote in self.tuotteet:
            if(tuote.haeNimi() == nimi):
                self.tuotteet.remove(tuote)
                break
    def tulostaTuotteet(self):
        tulostettava = ""
        for tuote in self.tuotteet:
            tulostettava = tulostettava + tuote.haeNimi() + " " + str(tuote.haeHinta()) + str(tuote.haeMaara()) + "\n"
        return tulostettava
    def muokkaaTuote(self,vanhanimi,uusinimi,uusihinta,uusimaara):
        index = 0
        for tuote in self.tuotteet:
            if(tuote.haeNimi() == vanhanimi):
                tuote = Tuote(uusinimi,uusihinta,uusimaara)
                self.tuotteet[index] = tuote
            index = index +1

