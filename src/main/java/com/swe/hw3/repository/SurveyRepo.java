/*
 * Program Name: Survey Repository
 * Description: This interface extends JpaRepository to provide repository methods for the SurveyModel entity.
 *              It supports standard CRUD operations on the 'survey_Table' within the database.
 * Author: Ajay Kumar Addike (G01398832)
        Venkata Ravi Sridhar Devarakonda (G01449062)
        Rohith Tangudu (G01409971)
        Arun Chakravarthy Annadata (G01409888)
 * Date: Date of creation or last modification (optional)
 */
package com.swe.hw3.repository;

import com.swe.hw3.entity.SurveyModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepo extends JpaRepository<SurveyModel, Long> {

}
