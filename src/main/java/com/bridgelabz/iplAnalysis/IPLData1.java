package com.bridgelabz.iplAnalysis;

import com.opencsv.bean.CsvBindByName;

public class IPLData1 {
    //public String State;
    @CsvBindByName(column = "POS")
    public int POS;

    @CsvBindByName(column = "PLAYER")
    public String PLAYER;

    @CsvBindByName(column = "Mat")
    public int Mat;

    @CsvBindByName(column = "Inns")
    public int Inns;

    @CsvBindByName(column = "NO")
    public int NO;

    @CsvBindByName(column = "Runs")
    public int Runs;

    @CsvBindByName(column = "HS")
    public String HS;

    @CsvBindByName(column = "Avg")
    public String Avg;

    @CsvBindByName(column = "BF")
    public String BF;

    @CsvBindByName(column = "SR")
    public double SR;

    @CsvBindByName(column = "Century")
    public int Century;

    @CsvBindByName(column = "Fifty")
    public int Fifty;

    @CsvBindByName(column = "Fours")
    public int Fours;

    @CsvBindByName(column = "Sixs")
    public int Sixs;

    @Override
    public String toString() {
        return "IPLData1{" +
                "POS=" + POS +
                ", PLAYER='" + PLAYER + '\'' +
                ", Mat=" + Mat +
                ", Inns=" + Inns +
                ", NO=" + NO +
                ", Runs=" + Runs +
                ", HS='" + HS + '\'' +
                ", Avg='" + Avg + '\'' +
                ", BF='" + BF + '\'' +
                ", SR='" + SR + '\'' +
                ", Century='" + Century + '\'' +
                ", Fifty='" + Fifty + '\'' +
                ", Fours='" + Fours + '\'' +
                ", Sixs='" + Sixs + '\'' +
                '}';
    }
}
