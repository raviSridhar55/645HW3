/*
 * Program Name: Survey Controller
 * Description: This class handles HTTP requests for creating, retrieving, updating, and deleting surveys. 
 *              It leverages the SurveyService to interact with survey data.
 * Author: Ajay Kumar Addike (G01398832)
        Venkata Ravi Sridhar Devarakonda (G01449062)
        Rohith Tangudu (G01409971)
        Arun Chakravarthy Annadata (G01409888)
 * Date: Date of creation or last modification (optional)
 */

package com.swe.hw3.controller;
import com.swe.hw3.dataTransferObjectResponse.Response;
import com.swe.hw3.entity.SurveyModel;
import com.swe.hw3.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/survey")
public class SurveyController {

        @Autowired
        private SurveyService surveyService;

        @PostMapping("newSurvey")
        public ResponseEntity<Response> createSurvey(@RequestBody SurveyModel surveyModel) {
                return new ResponseEntity<Response>(surveyService.createSurvey(surveyModel), HttpStatus.OK);
        }

        @GetMapping("getAllSurvey")
        public ResponseEntity<Response> getAllSurveys() {
                return new ResponseEntity<Response>(surveyService.getAllSurveys(), HttpStatus.OK);
        }

        @GetMapping("getById/{id}")
        public ResponseEntity<Response> getSurveyById(@PathVariable("id") long id) {
                return new ResponseEntity<Response>(surveyService.getSurveyById(id), HttpStatus.OK);
        }

        @PutMapping("update-survey/{id}")
        public ResponseEntity<Response> updateSurvey(@PathVariable("id") long id, @RequestBody SurveyModel surveyModel) {
                return new ResponseEntity<Response>(surveyService.updateSurvey(surveyModel, id), HttpStatus.OK);
        }

        @DeleteMapping("delete-survey/{id}")
        public ResponseEntity<String> deleteSurvey(@PathVariable("id") long id) {
                surveyService.deleteSurvey(id);
                return new ResponseEntity<String>("Successfully Deleted", HttpStatus.OK);
        }
}
