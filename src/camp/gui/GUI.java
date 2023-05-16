package camp.gui;

import camp.db.ProductRepository;
import camp.model.Produkt;
import camp.model.User;

import java.util.Scanner;

public class GUI {
    Produkt pro = new Produkt();

    private static Scanner scanner = new Scanner(System.in);
    public static String showMenu(boolean admin) {
        System.out.println("1. Wyswietl produkty");
        System.out.println("2. Kup produkt");
        System.out.println("3. Wyloguj");
        if (admin) {
            System.out.println("4. Zmien ilosc produktow");
        }
        String a = scanner.nextLine();
        return a;
    }
    public static String showFirstMenu() {
        System.out.println("1. Zaloguj");
        System.out.println("2. Zarejestruj");
        System.out.println("3. Exit");
        return scanner.nextLine();
    }

    // menu 1
    public static void wyswietlProdukty(Produkt[] listaProduktow) {
        for(Produkt elementy : listaProduktow) {
            System.out.println(elementy);
        }
    }
    public static String readProdukt() {
        System.out.println("Wpisz nazwe produktu, ktory chcesz kupic");
        return scanner.nextLine();

    }

    public static int readIlosc() {
        System.out.println("Podaj ilosc prodktow, ktore chcesz kupic");
        //wczytanie calej linii z enterem po czym zmiana na liczbe gdzie tracimy enter
        String wprowadzone = scanner.nextLine();
        return Integer.parseInt(wprowadzone);
    }
    public static void listujProdukty(Produkt[] listaProduktow) {
        for(Produkt produkt : listaProduktow) {
            if(produkt.getIlosc() != 0) {
                System.out.println(new StringBuilder()
                        .append(produkt.getNazwaProduktu())
                        .append(" Cena: ")
                        .append(produkt.getCena())
                        .append(" Ilosc w magazynie: ")
                        .append(produkt.getIlosc())
                        .toString());
            }
            }
        }

    public static User readLoginAndPassword() {
        System.out.println("Login:");
        String login = scanner.nextLine();
        System.out.println("Password:");
        return new User(login, scanner.nextLine(), "user");
    }

    }


