package org.example.model;

public class Salary {
    double gross;
    final  double nhif = 10;
    final  double nssf= 10;
    final  double houseLevy=10;
    final  double paye= 20;


    public double getPaye() {
        return paye;
    }



    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getNhif() {
        return nhif;
    }

    public double getNssf() {
        return nssf;
    }

    public double getHouseLevy() {
        return houseLevy;
    }





}
