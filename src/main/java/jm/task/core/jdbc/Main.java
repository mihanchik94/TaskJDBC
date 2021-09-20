package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserServiceImpl userServ = new UserServiceImpl();

    public static void main(String[] args) {
        userServ.createUsersTable();

        userServ.saveUser("Igor", "Astafev", (byte) 28);
        userServ.saveUser("Olga", "Denisova", (byte) 15);
        userServ.saveUser("Magomed", "Yakubov", (byte) 38);
        userServ.saveUser("Anna", "Dolohova", (byte) 22);

        userServ.getAllUsers();
        userServ.cleanUsersTable();
        userServ.dropUsersTable();
    }

}
