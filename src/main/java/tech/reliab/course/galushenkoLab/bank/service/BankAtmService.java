package tech.reliab.course.galushenkoLab.bank.service;

import tech.reliab.course.galushenkoLab.bank.entity.BankAtm;

import java.util.List;

public interface BankAtmService {
    BankAtm createAtm(String name, String address);
    BankAtm getAtmById(int id);
    void updateAtm(BankAtm bankAtm);
    void deleteAtm(int id);
    List<BankAtm> getAllAtms();
}
