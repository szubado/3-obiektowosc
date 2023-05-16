package camp.core;

import camp.db.ProductRepository;
import camp.db.UserRepository;
import camp.gui.GUI;
import camp.model.Produkt;

public class Core {
    private static final ProductRepository database = new ProductRepository();
    static UserRepository userRep = new UserRepository();
    Authenticator authenticator = new Authenticator();
    public static void start(){

        firstloop:
        while(true) {
            switch(GUI.showFirstMenu()) {
                case "1":
                    int currentUser = Authenticator.authenticate();
                    if(currentUser > 0) {
                        mainloop:
                        while(true) {
                            switch(GUI.showMenu(currentUser == 1)) {
                                case "1":
                                    GUI.listujProdukty(database.getListaProduktow());
                                    break;
                                case "2":
                                    String coChceKlient = GUI.readProdukt();
                                    int ileChceKlient = GUI.readIlosc();
                                    // uzyskanie dostepu po nazwie do ilosci
                                    database.zmienWMag(coChceKlient.toUpperCase(), ileChceKlient);
                                    break;
                                case "3":
                                    break mainloop;
                                case "4":
                                    String coChceZmienicAdmin = GUI.readProdukt();
                                    database.adminZmienWMag(coChceZmienicAdmin);
                                    break;
                                default:
                                    System.out.println("Niepoprawny numer");
                                    break;
                            }
                        }
                    }
                    break;
                case "2":
                    userRep.addUser();
                    break;
                case "3":
                    break firstloop;

            }
        }
    }
}
