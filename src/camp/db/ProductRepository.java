package camp.db;

import camp.gui.GUI;
import camp.model.Produkt;

    public class ProductRepository {
        private static final Produkt rep = new Produkt();
        private static final GUI gui = new GUI();


        private final Produkt[] listaProduktow = new Produkt[4];

        public ProductRepository() {
            this.listaProduktow[0] = new Produkt("Ekran", 5, 23);
            this.listaProduktow[1] = new Produkt("Myszka", 3, 43);
            this.listaProduktow[2] = new Produkt("Klawiatura", 8, 65);
            this.listaProduktow[3] = new Produkt("Laptop", 2, 1234);
        }

        public Produkt znajdzProduktWMagazynie(String nazwaProduktu) {
            for (Produkt produkt : this.listaProduktow) {
                if (produkt.getNazwaProduktu().equals(nazwaProduktu)) {
                    return produkt;
                }
            }
            return null;
        }

        public void zmienWMag (String coChceKlient, int ileChceKlient) {
            for (Produkt produkt : this.listaProduktow) {
                if (produkt.getNazwaProduktu().toUpperCase().equals(coChceKlient)) {
                    if (ileChceKlient <= produkt.getIlosc()) {
                        produkt.setIlosc(produkt.getIlosc() - ileChceKlient);
                        System.out.println("Kwota do zaplaty : " + ileChceKlient * produkt.getCena() + " zl");
                        //return wychodzi z funkcji
                        return;
                    }
                    else {
                        System.out.println("W magazynie jest tylko " + produkt.getIlosc() + " sztuk");
                        return;
                    }
                }
            }
            System.out.println("Niepoprawna nazwa produktu");
        }

        public void adminZmienWMag (String coChceKlient) {
            for (Produkt produkt : this.listaProduktow) {
                if (produkt.getNazwaProduktu().equals(coChceKlient)) {
                    produkt.setIlosc(produkt.getIlosc() + GUI.readIlosc());
                }
            }
        }
        public Produkt[] getListaProduktow() {
            return listaProduktow;
        }

        public static void wynikTransakcji(boolean result) {
            if (result) {
                System.out.println(GUI.readIlosc());
            } else {
                System.out.println("Brak wystarczajacej ilosci produktow w magazynie");
            }
        }
    }
