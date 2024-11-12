package tech.reliab.course.galushenkoLab.bank.service.impl;

import tech.reliab.course.galushenkoLab.bank.entity.CreditAccount;
import tech.reliab.course.galushenkoLab.bank.entity.User;
import tech.reliab.course.galushenkoLab.bank.entity.Bank;
import tech.reliab.course.galushenkoLab.bank.service.CreditAccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CreditAccountServiceImpl implements CreditAccountService {

    private final List<CreditAccount> accounts = new ArrayList<>();

    @Override
    public CreditAccount createCreditAccount(User user, Bank bank, double loanAmount, int loanTerm) {
        // Исправленная реализация метода
        CreditAccount account = new CreditAccount(user, bank, loanAmount, loanTerm);
        accounts.add(account);
        return account;
    }

    @Override
    public CreditAccount getCreditAccountById(int id) {
        return accounts.stream().filter(account -> account.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void updateCreditAccount(CreditAccount account) {
        Optional<CreditAccount> existingAccount = accounts.stream().filter(a -> a.getId() == account.getId()).findFirst();
        existingAccount.ifPresent(a -> {
            a.setLoanAmount(account.getLoanAmount());
            a.setLoanTerm(account.getLoanTerm());
        });
    }

    @Override
    public void deleteCreditAccount(int id) {
        accounts.removeIf(account -> account.getId() == id);
    }

    @Override
    public List<CreditAccount> getAllCreditAccounts() {
        return new ArrayList<>(accounts);
    }
}
