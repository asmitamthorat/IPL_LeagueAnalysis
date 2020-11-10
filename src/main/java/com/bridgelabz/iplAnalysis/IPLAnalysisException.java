package com.bridgelabz.iplAnalysis;

public class IPLAnalysisException extends Exception {
    enum ExceptionType{
        FILE_PROBLEM,UNABLE_TO_PARSE,DELIMITER_ISSUE;
    }
    ExceptionType type;

    public IPLAnalysisException(String message,ExceptionType type){
        super(message);
        this.type=type;
    }
}
