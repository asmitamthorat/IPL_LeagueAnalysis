package com.bridgelabz.iplAnalysis;

import java.io.Reader;
import java.util.List;

public interface ICSVBuilder {
    public <E> List<E> getCSVFileList(Reader reader, Class<E> csvClass) throws IPLAnalysisException;
}
