package com.bridgelabz.iplAnalysis;

import org.junit.Assert;
import org.junit.Test;

public class IplAnalysisTest {
     private static final String IPL_DATA1="./src/test/resources/IPL1.csv";
     private static final String IPL_DATA2="./src/test/resources/IPL2.csv";


    @Test
    public void givenIplData1_ifHasCorrectNumberOfRecord_ShouldReturnTrue() throws IPLAnalysisException {
        IPLAnalysis iplAnalysis=new IPLAnalysis();
        int numberOfRecord=iplAnalysis.loadCSVFile1(IPL_DATA1);
        Assert.assertEquals(101,numberOfRecord);
    }

    @Test
    public void givenIPLData2_ifHasCorrectNumberOfRecord_ShouldReturn() throws IPLAnalysisException{
        IPLAnalysis iplAnalysis=new IPLAnalysis();
        int numberOfRecord=iplAnalysis.loadCSVFile2(IPL_DATA2);
        Assert.assertEquals(99,numberOfRecord);
    }

}
