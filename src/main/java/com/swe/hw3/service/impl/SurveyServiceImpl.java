package com.swe.hw3.service.impl;

import com.swe.hw3.dataTransferObjectResponse.Response;
import com.swe.hw3.entity.SurveyModel;
import com.swe.hw3.repository.SurveyRepo;
import com.swe.hw3.resourceNotFoundException.ResourceNotFound;
import com.swe.hw3.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private SurveyRepo surveyRepo;

    @Override
    public Response createSurvey(SurveyModel surveyModel) {
        surveyRepo.save(surveyModel);
        return new Response(surveyModel);
    }

    public Response getAllSurveys() {
        ArrayList<SurveyModel> surveyModelArrayList = (ArrayList<SurveyModel>) surveyRepo.findAll();
        return new Response(surveyModelArrayList);
    }

    public Response getSurveyById(long id) {
        Optional<SurveyModel> surveyModel = surveyRepo.findById(id);

        if (surveyModel.isPresent()) {
            return new Response(surveyModel.get());
        } else {
            throw new ResourceNotFound("Survey", "id", id);
        }
    }

    public Response updateSurvey(SurveyModel surveyModel, long id) {
        SurveyModel existingSurvey = surveyRepo.findById(id).orElseThrow(
                () -> new ResourceNotFound("Survey", "id", id)
        );

        existingSurvey.setFirstname(surveyModel.getFirstname());
        existingSurvey.setLastname(surveyModel.getLastname());
        existingSurvey.setStreetadd(surveyModel.getStreetadd());
        existingSurvey.setCity(surveyModel.getCity());
        existingSurvey.setState(surveyModel.getState());
        existingSurvey.setZip(surveyModel.getZip());
        existingSurvey.setDate(surveyModel.getDate());
        existingSurvey.setLiked(surveyModel.getLiked());
        existingSurvey.setIntrest(surveyModel.getIntrest());
        existingSurvey.setRecommend(surveyModel.getRecommend());

        surveyRepo.save(existingSurvey);

        return new Response(existingSurvey);
    }

    public void deleteSurvey(long id) {
        surveyRepo.findById(id).orElseThrow(
                () -> new ResourceNotFound("Survey", "id", id)
        );

        surveyRepo.deleteById(id);

    }
}
