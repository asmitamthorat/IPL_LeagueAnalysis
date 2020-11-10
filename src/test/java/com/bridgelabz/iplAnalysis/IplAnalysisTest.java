package com.bridgelabz.iplAnalysis;

import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class IplAnalysisTest {
     private static final String IPL_DATA1="./src/test/resources/IPL1.csv";
     private static final String IPL_DATA2="./src/test/resources/IPL2.csv";


    @Test
    public void givenIplData1_ifHasCorrectNumberOfRecord_ShouldReturnTrue() throws IPLAnalysisException {
        IPLAnalysis iplAnalysis=new IPLAnalysis();
        List<IPLData1> list=iplAnalysis.loadCSVFile1(IPL_DATA1);
        Assert.assertEquals(101,list.size());
    }

    @Test
    public void givenIPLData2_ifHasCorrectNumberOfRecord_ShouldReturnTrue() throws IPLAnalysisException{
        IPLAnalysis iplAnalysis=new IPLAnalysis();
        List<IPLData2> list=iplAnalysis.loadCSVFile2(IPL_DATA2);
        Assert.assertEquals(99,list.size());
    }

    @Test
    public void battingAvgOfPayer_ifHasCorrectNumberOfRecord_ShouldReturnTrue() throws IPLAnalysisException{
        IPLAnalysis iplAnalysis=new IPLAnalysis();
        int battingAvg=iplAnalysis.getBattingAvg(IPL_DATA1);
        Assert.assertEquals(185,battingAvg);

    }

    @Test
    public void battingPayerWithHighestStrikeRte_ifHasCorrectNumberOfRecord_ShouldReturnTrue() throws IPLAnalysisException{
        IPLAnalysis iplAnalysis=new IPLAnalysis();
        String list=iplAnalysis.getHighestStrikingRate_Player(IPL_DATA2);
       // IndiaCensusCSV[] censusCSV=new Gson().fromJson(sortedCensusData,IndiaCensusCSV[].class);
      //  Assert.assertEquals(1.99812341E8 ,censusCSV[0].population,0.00001);

    }



}
