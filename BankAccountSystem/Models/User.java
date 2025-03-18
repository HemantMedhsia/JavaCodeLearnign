package BankAccountSystem.Models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String userId;
    private String userName;
    private String contact;
    private String email;
    private List<Account> accounts;

    public User(String userId, String userName, String contact, String email) {
        this.userId = userId;
        this.userName = userName;
        this.contact = contact;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public void addAccounts(Account account) {
        accounts.add(account);
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + userName + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
