package com.bridgelabz.iplAnalysis;

import com.opencsv.bean.CsvBindByName;

public class IPLData2 {
    @CsvBindByName(column = "POS")
    public int POS;

    @CsvBindByName(column = "PLAYER")
    public String PLAYER;


    @CsvBindByName(column = "Mat")
    public int Mat;

    @CsvBindByName(column = "Inns")
    public String Inns;

    @CsvBindByName(column = "Ov")
    public double Ov;

    @CsvBindByName(column = "Runs")
    public int Runs;

    @CsvBindByName(column = "Wkts")
    public String Wkts;

    @CsvBindByName(column = "BBI")
    public int BBI;


    @CsvBindByName(column = "Avg")
    public Double Avg;

    @CsvBindByName(column = "Econ")
    public String Econ;

    @CsvBindByName(column = "SR")
    public double SR;

    @CsvBindByName(column = "Four-W")
    public int Century;

    @CsvBindByName(column = "Five-w")
    public int Fifty;

    @Override
    public String toString() {
        return "IPLData2{" +
                "POS=" + POS +
                ", PLAYER='" + PLAYER + '\'' +
                ", Mat=" + Mat +
                ", Inns='" + Inns + '\'' +
                ", Ov=" + Ov +
                ", Runs=" + Runs +
                ", Wkts='" + Wkts + '\'' +
                ", BBI=" + BBI +
                ", Avg='" + Avg + '\'' +
                ", Econ='" + Econ + '\'' +
                ", SR=" + SR +
                ", Century=" + Century +
                ", Fifty=" + Fifty +
                '}';
    }
}
