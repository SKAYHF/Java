package tech.reliab.course.galushenkoLab.bank;

import tech.reliab.course.galushenkoLab.bank.entity.Bank;
import tech.reliab.course.galushenkoLab.bank.entity.BankAtm;
import tech.reliab.course.galushenkoLab.bank.entity.BankOffice;
import tech.reliab.course.galushenkoLab.bank.entity.Employee;
import tech.reliab.course.galushenkoLab.bank.entity.User;
import tech.reliab.course.galushenkoLab.bank.entity.PaymentAccount;
import tech.reliab.course.galushenkoLab.bank.service.impl.*;
import tech.reliab.course.galushenkoLab.bank.entity.CreditAccount;


public class Main {
    public static void main(String[] args) {
        BankServiceImpl bankService = new BankServiceImpl();
        BankAtmServiceImpl atmService = new BankAtmServiceImpl();
        BankOfficeServiceImpl officeService = new BankOfficeServiceImpl();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl();
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();

        // Создаем банк
        Bank alphaBank = bankService.createBank("AlphaBank", "Moscow");
        System.out.println("Создан банк: " + alphaBank);

        // Создаем офис банка
        BankOffice alphaOffice = officeService.createOffice("AlphaBank Main Office", "Moscow, Red Square 1");
        System.out.println("Создан офис банка: " + alphaOffice);

        // Создаем банкомат
        BankAtm alphaAtm = atmService.createAtm("AlphaBank ATM", "Moscow, Red Square 1");
        System.out.println("Создан банкомат: " + alphaAtm);

        // Создаем сотрудника банка
        Employee employee = employeeService.createEmployee("Ivan", "Petrov", "Credit Officer");
        System.out.println("Создан сотрудник: " + employee);

        // Создаем пользователя
        User user = userService.createUser("John", "Doe", 5000);
        System.out.println("Создан пользователь: " + user);

        // Создаем платежный счет для пользователя
        PaymentAccount paymentAccount = paymentAccountService.createPaymentAccount(user, alphaBank, 5000.0);
        System.out.println("Создан платежный счет: " + paymentAccount);

        // Создаем кредитный счет для пользователя
        CreditAccount creditAccount = creditAccountService.createCreditAccount(user, alphaBank, 10000.0, 12);
        System.out.println("Создан кредитный счет: " + creditAccount);


        // Обновляем пользователя
        user.setMonthlyIncome(6000);
        userService.updateUser(user);
        System.out.println("Обновленный пользователь: " + user);

        // Удаляем пользователя
        userService.deleteUser(user.getId());
        System.out.println("Все пользователи после удаления: " + userService.getAllUsers());

        // Получаем банк по ID
        Bank retrievedBank = bankService.getBankById(alphaBank.getId());
        System.out.println("Полученный банк: " + retrievedBank);
    }
}
