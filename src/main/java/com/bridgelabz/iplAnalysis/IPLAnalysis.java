package com.bridgelabz.iplAnalysis;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IPLAnalysis {
    public int loadCSVFile1(String iplData1) throws IPLAnalysisException {
        try(Reader reader= Files.newBufferedReader(Paths.get(iplData1))){
            ICSVBuilder csvBuilder=CSVBuilderFactory.createCSVBuilder();
            List<IPLData1> IPLData1CsvList=csvBuilder.getCSVFileList(reader,IPLData1.class);
            return IPLData1CsvList.size();

        }catch (IOException ioException){
            throw new IPLAnalysisException("File problem", IPLAnalysisException.ExceptionType.FILE_PROBLEM);

        }
    }

    public int loadCSVFile2(String iplData2) throws IPLAnalysisException {
        try(Reader reader= Files.newBufferedReader(Paths.get(iplData2))){
            ICSVBuilder csvBuilder=CSVBuilderFactory.createCSVBuilder();
            List<IPLData2> IPLData2CsvList=csvBuilder.getCSVFileList(reader,IPLData2.class);
            System.out.println(IPLData2CsvList);
            return IPLData2CsvList.size();

        }catch (IOException ioException){
            throw new IPLAnalysisException("File problem", IPLAnalysisException.ExceptionType.FILE_PROBLEM);

        }
    }
}
