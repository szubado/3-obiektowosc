package camp.core;

import camp.db.UserRepository;
import camp.gui.GUI;
import camp.model.User;

public class Authenticator {

    private static final UserRepository usersDatabase = new UserRepository();

    public static int authenticate() {

            User userFromGui = GUI.readLoginAndPassword();
            User userFromDb = usersDatabase.findUserByLogin(userFromGui.getLogin());
            if(userFromDb != null) {
                if (userFromDb.getPassword().equals(userFromGui.getPassword())) {
                    if( userFromDb.getRola().equals("admin")) {
                        //admin
                        return 1;
                    } else {
                        //user
                        return 2;
                    }
                }
            }
        System.out.println("Incorrect login or password !!");
        return 0;
        }

    }

