package com.bridgelabz.iplAnalysis;

public class Comparator {
    public static class PlayerSixesComparator implements java.util.Comparator<IPLData1> {
        @Override
        public int compare(IPLData1 Player1, IPLData1 Player2) {
            return Player1.Sixs - Player2.Sixs;
        }
    }

    public static class PlayerFourComparator implements java.util.Comparator<IPLData1> {
        @Override
        public int compare(IPLData1 Player1, IPLData1 Player2) {
            return Player1.Fours - Player2.Fours;
        }
    }
}
