package tech.reliab.course.galushenkoLab.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAtm {
    private static int currentId = 1;
    private int id;
    private String name;
    private String address;
    private boolean isWorking;
    private Bank bank;
    private BankOffice office;  // Привязываем к офису
    private boolean canWithdraw;
    private boolean canDeposit;
    private double moneyAmount;

    public BankAtm(String name, String address, Bank bank) {
        this.id = currentId++;
        this.name = name;
        this.address = address;
        this.bank = bank;
        this.isWorking = true;
        this.canWithdraw = true;
        this.canDeposit = true;
        this.moneyAmount = bank != null ? bank.getTotalMoney().doubleValue() / 10 : 0.0;
    }

    public void setOffice(BankOffice office) {
        this.office = office;
    }
}
