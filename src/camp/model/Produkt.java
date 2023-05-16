package camp.model;

public class Produkt {

    private String nazwaProduktu;
    private int ilosc;
    private int cena;

    public Produkt(String nazwaProduktu, int ilosc, int cena) {
        this.nazwaProduktu = nazwaProduktu;
        this.ilosc = ilosc;
        this.cena = cena;
    }

    public Produkt() {
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
