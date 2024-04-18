public class UserHandler extends Handler {

    @Override
    public void handle(Account account) {
        if (account.getAccessType() == Account.AccessType.User) {
            String login = account.getLogin();
            String password = account.getPassword();
            String passwordFromUserStorage = AccountStorage.usersAccounts.get(login);

            if (password.equals(passwordFromUserStorage)) {
                System.out.println("User access provided: " + login);
            } else {
                System.out.println("Access denied: " + login);
            }
        }
        else {
            super.handle(account);
        }
    }
}
