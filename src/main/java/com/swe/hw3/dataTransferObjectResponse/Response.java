/*
 * Program Name: Response DTO
 * Description: This class serves as a Data Transfer Object for encapsulating survey data in response bodies.
 *              It provides functionality to manage a list of SurveyModel instances, supporting both single and multiple surveys.
 * Author: Ajay Kumar Addike (G01398832)
        Venkata Ravi Sridhar Devarakonda (G01449062)
        Rohith Tangudu (G01409971)
        Arun Chakravarthy Annadata (G01409888)
 * Date: Date of creation or last modification (optional)
 */
package com.swe.hw3.dataTransferObjectResponse;

import com.swe.hw3.entity.SurveyModel;

import java.util.ArrayList;

public class Response {


    private ArrayList<SurveyModel> Survey;

    public ArrayList<SurveyModel> getSurvey() {
        return Survey;
    }
    public void setSurvey(ArrayList<SurveyModel> survey) {
        Survey = survey;
    }

    public Response(ArrayList<SurveyModel> surveyModel) {
        Survey = surveyModel;
    }
    public Response(SurveyModel surveyModel) {

        Survey  = new ArrayList<SurveyModel>();
        Survey.add(surveyModel);
    }
}

