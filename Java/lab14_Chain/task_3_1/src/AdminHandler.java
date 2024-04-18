public class AdminHandler extends Handler {

    @Override
    public void handle(Account account) {
        if (account.getAccessType() == Account.AccessType.Administrator) {
            String login = account.getLogin();
            String password = account.getPassword();
            String passwordFromAdminsStorage = AccountStorage.adminsAccounts.get(login);

            if (password.equals(passwordFromAdminsStorage) && password.length() >= 8) {
                System.out.println("Administrator access provided: " + login);
            } else {
                System.out.println("Access denied: " + login);
            }
        }
        else {
            super.handle(account);
        }
    }
}
