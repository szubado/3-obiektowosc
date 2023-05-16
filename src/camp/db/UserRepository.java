package camp.db;

import camp.gui.GUI;
import camp.model.User;

public class UserRepository {
    private static User[] users = new User[10];
    int currentUserNumber = 2;
    public UserRepository() {
        this.users[0] = new User("admin", "admin1", "admin");
        this.users[1] = new User("janusz", "janusz1", "user");
    }
//konstruktor zeby pamietal za kazdym razem jak doda nowy obiekt klasy ile wynosi currentUserNumber
    public UserRepository(int currentUserNumber) {
        this.currentUserNumber = currentUserNumber;
    }

    public void addUser(){
        if (currentUserNumber > users.length) {
            System.out.println("Za duza ilosc uzytkownikow");
            return;
        }
        users[currentUserNumber++] = GUI.readLoginAndPassword();
    }


    public User findUserByLogin(String login) {
        for(User user : this.users) {
            if(user.getLogin().equals(login)) {
                return user;
            }
        }

        return null;
    }

    public User createUserByLogin(String nowyLogin) {
        for(User user : this.users) {
            if(!(user.getLogin().equals(nowyLogin))) {
                return user;
            }
        }
        return null;
        }

    public void createUser(int i, String nowyLogin, String noweHaslo) {
        this.users[i].setLogin(nowyLogin);
        this.users[i].setPassword(noweHaslo);
    }


}
