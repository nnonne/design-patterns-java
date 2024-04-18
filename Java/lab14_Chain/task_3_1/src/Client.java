public class Client {

    public static void main(String[] args) {

        // Login and passwords for administrators
        AccountStorage.adminsAccounts.put("admin", "123qweASD");
        AccountStorage.adminsAccounts.put("administrator", "1234");

        // Login and passwords for users
        AccountStorage.usersAccounts.put("andrii", "1234");
        AccountStorage.usersAccounts.put("black_knight", "S@ruman1");
        AccountStorage.usersAccounts.put("white_knight", "ruman1");


        Account[] users = {
                Account.createAdmin("admin", "123qweASD"),
                Account.createAdmin("administrator", "1234"),
                Account.createUser("andrii", "1234"),
                Account.createGuest(),
                Account.createUser("black_knight", "S@ruman1"),
                Account.createUser("white_knight", "S111"),
                Account.createGuest(),
        };

        Handler guestHandler = new GuestHandler();
        Handler userHandler = new UserHandler();
        Handler adminHandler = new AdminHandler();

        guestHandler.setNext(userHandler);
        userHandler.setNext(adminHandler);

        for (Account user : users) {
            guestHandler.handle(user);
        }
    }
}
