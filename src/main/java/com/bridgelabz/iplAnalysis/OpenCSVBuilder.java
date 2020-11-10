package com.bridgelabz.iplAnalysis;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.Reader;
import java.util.List;

public class OpenCSVBuilder implements ICSVBuilder {
    @Override
    public <E> List<E> getCSVFileList(Reader reader, Class<E> csvClass) throws IPLAnalysisException {
        return this.getCSVBean(reader,csvClass).parse();
    }

    private <E> CsvToBean getCSVBean(Reader reader, Class<E> csvClass) throws IPLAnalysisException {
        try{
            CsvToBeanBuilder<E> csvToBeanBuilder=new CsvToBeanBuilder<>(reader);
            csvToBeanBuilder.withType(csvClass);
            csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
            return csvToBeanBuilder.build();
        }catch (IllegalStateException e){
            throw new IPLAnalysisException(e.getMessage(),IPLAnalysisException.ExceptionType.UNABLE_TO_PARSE);
        }

    }
}
