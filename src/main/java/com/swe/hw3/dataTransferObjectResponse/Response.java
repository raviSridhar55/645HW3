package com.swe.hw3.dataTransferObjectResponse;

import com.swe.hw3.entity.SurveyModel;

import java.util.ArrayList;

public class Response {

//    private String statusCode;
//    private String statusDesc;
    private ArrayList<SurveyModel> Survey;
//    private String errorCodes;

//    public String getStatusCode() {
//        return statusCode;
//    }
//    public void setStatusCode(String statusCode) {
//        statusCode = statusCode;
//    }
//    public String getStatusDesc() {
//        return statusDesc;
//    }
    public ArrayList<SurveyModel> getSurvey() {
        return Survey;
    }
    public void setSurvey(ArrayList<SurveyModel> survey) {
        Survey = survey;
    }

//    public String getErrorCodes() {
//        return errorCodes;
//    }
//    public void setErrorCodes(String errorCodes) {
//        errorCodes = errorCodes;
//    }
    public Response(ArrayList<SurveyModel> surveyModel) {
//        statusCode = statusCode;
//        statusDesc = statusDesc;
//        errorCodes = err;
        Survey = surveyModel;
    }
    public Response(SurveyModel surveyModel) {
//        statusCode = statusCode;
//        statusDesc = statusDesc;
//        errorCodes = err;
        Survey  = new ArrayList<SurveyModel>();
        Survey.add(surveyModel);
    }
}

//        String statusCode, String statusDesc, String err,