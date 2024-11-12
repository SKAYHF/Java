package tech.reliab.course.galushenkoLab.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankOffice {
    private static int currentId = 1;
    private int id;
    private String name;
    private String address;
    private boolean isWorking;
    private boolean canHostAtm;
    private int atmCount = 0;
    private double moneyAmount;
    private double rentCost;

    public BankOffice(String name, String address) {
        this.id = currentId++;
        this.name = name;
        this.address = address;
        this.isWorking = true;
        this.canHostAtm = true;
        this.moneyAmount = 100_000; // Пример начальной суммы
        this.rentCost = 10_000;
    }
}
