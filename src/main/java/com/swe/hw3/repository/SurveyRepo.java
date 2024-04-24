package com.swe.hw3.repository;

import com.swe.hw3.entity.SurveyModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepo extends JpaRepository<SurveyModel, Long> {

}
