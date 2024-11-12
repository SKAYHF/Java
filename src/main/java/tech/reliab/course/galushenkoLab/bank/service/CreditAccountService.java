package tech.reliab.course.galushenkoLab.bank.service;

import tech.reliab.course.galushenkoLab.bank.entity.CreditAccount;
import tech.reliab.course.galushenkoLab.bank.entity.User;
import tech.reliab.course.galushenkoLab.bank.entity.Bank;

import java.util.List;

public interface CreditAccountService {
    CreditAccount createCreditAccount(User user, Bank bank, double loanAmount, int loanTerm); // Исправленная сигнатура
    CreditAccount getCreditAccountById(int id);
    void updateCreditAccount(CreditAccount account);
    void deleteCreditAccount(int id);
    List<CreditAccount> getAllCreditAccounts();
}
