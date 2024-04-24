package com.swe.hw3.service;

import com.swe.hw3.dataTransferObjectResponse.Response;
import com.swe.hw3.entity.SurveyModel;

public interface SurveyService {
    Response createSurvey(SurveyModel surveyModel);
    Response getAllSurveys();
    Response getSurveyById(long id);
    Response updateSurvey(SurveyModel surveyModel, long id);
    void deleteSurvey(long id);
}
