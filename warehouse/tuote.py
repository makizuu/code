class Tuote:
    nimi = ""
    hinta = 0
    maara = 0
    def __init__(self, nimi,hinta,maara):
        self.nimi = nimi
        self.hinta = hinta
        self.maara = maara
    def haeNimi(self):
        return self.nimi
    def haeHinta(self):
        return self.hinta
    def haeMaara(self):
        return self.maara
    def asetaNimi(self,nimi):
        self.nimi = nimi
    def asetaHinta(self,hinta):
        self.hinta = hinta
    def asetaMaara(self,maara):
        self.maara = maara
