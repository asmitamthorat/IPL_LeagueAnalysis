package com.bridgelabz.iplAnalysis;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IPLAnalysis {
    public List<IPLData1> loadCSVFile1(String iplData1) throws IPLAnalysisException {
        try(Reader reader= Files.newBufferedReader(Paths.get(iplData1))){
            ICSVBuilder csvBuilder=CSVBuilderFactory.createCSVBuilder();
            List<IPLData1> IPLData1CsvList=csvBuilder.getCSVFileList(reader,IPLData1.class);
            return IPLData1CsvList;

        }catch (IOException ioException){
            throw new IPLAnalysisException("File problem", IPLAnalysisException.ExceptionType.FILE_PROBLEM);

        }
    }

    public List<IPLData2> loadCSVFile2(String iplData2) throws IPLAnalysisException {
        try(Reader reader= Files.newBufferedReader(Paths.get(iplData2))){
            ICSVBuilder csvBuilder=CSVBuilderFactory.createCSVBuilder();
            List<IPLData2> IPLData2CsvList=csvBuilder.getCSVFileList(reader,IPLData2.class);

            return IPLData2CsvList;

        }catch (IOException ioException){
            throw new IPLAnalysisException("File problem", IPLAnalysisException.ExceptionType.FILE_PROBLEM);

        }
    }

      public int getBattingAvg(String iplData1) throws IPLAnalysisException {
        int avgBattingScore=0;
        int totalScore=0;
          List<IPLData1> IPLData1CsvList= loadCSVFile1(iplData1);
          for(int i=0;i<IPLData1CsvList.size();i++) {
              IPLData1 data = IPLData1CsvList.get(i);
              totalScore=totalScore+data.Runs;
          }
          avgBattingScore=totalScore/IPLData1CsvList.size();
          return avgBattingScore;
  }

    public String getHighestStrikingRate_Player(String iplData2) throws IPLAnalysisException {
        List<IPLData2> IPLData2CsvList= loadCSVFile2(iplData2);
        Comparator<IPLData2> StateCodeCSVComparator=Comparator.comparing(census -> census.SR);
        sort(IPLData2CsvList,StateCodeCSVComparator);
        String sortedIPLBlowingData=new Gson().toJson(IPLData2CsvList);
        System.out.println(IPLData2CsvList);

        return sortedIPLBlowingData;
    }

    private <E> void sort(List<E> CsvList, Comparator<E> CSVComparator) {
        for (int i = 0; i < CsvList.size() - 1; i++) {
            for (int j = 0; j < CsvList.size() - i - 1; j++) {
                E census1 = CsvList.get(j);
                E census2 = CsvList.get(j + 1);
                if (CSVComparator.compare(census1, census2) < 0) {
                    CsvList.set(j, census2);
                    CsvList.set(j + 1, census1);
                }
            }
        }
    }

  public String getPlayerWithHighestSix_Four(String iplData1) throws IPLAnalysisException {

        List<IPLData1> IPLData1CsvList= loadCSVFile1(iplData1);
        Collections.sort(IPLData1CsvList, new com.bridgelabz.iplAnalysis.Comparator.PlayerSixesComparator()
                .thenComparing(new com.bridgelabz.iplAnalysis.Comparator.PlayerFourComparator())
               );
        System.out.println("After:"+IPLData1CsvList);
        String sortedIPLBlowingData=new Gson().toJson(IPLData1CsvList);
        System.out.println(sortedIPLBlowingData);
        return sortedIPLBlowingData;
    }





}
