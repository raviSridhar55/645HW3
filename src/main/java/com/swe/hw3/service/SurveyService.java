/*
 * Program Name: Survey Service Interface
 * Description: This interface defines methods for survey-related operations.
 *              It provides abstraction for creating, retrieving, updating, and deleting surveys.
 * Author: Ajay Kumar Addike (G01398832)
        Venkata Ravi Sridhar Devarakonda (G01449062)
        Rohith Tangudu (G01409971)
        Arun Chakravarthy Annadata (G01409888)
 * Date: Date of creation or last modification (optional)
 */
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
