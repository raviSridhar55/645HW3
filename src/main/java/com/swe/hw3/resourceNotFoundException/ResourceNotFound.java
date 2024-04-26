/*
 * Program Name: Resource Not Found Exception
 * Description: This class represents a custom exception for resource not found errors.
 *              It is thrown when a requested resource cannot be found in the system.
 *              The exception includes details such as the name of the resource, the field causing the error, and its value.
 * Author: Ajay Kumar Addike (G01398832)
        Venkata Ravi Sridhar Devarakonda (G01449062)
        Rohith Tangudu (G01409971)
        Arun Chakravarthy Annadata (G01409888)
 * Date: Date of creation or last modification (optional)
 */

package com.swe.hw3.resourceNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFound(String resourceName, String fieldName, Object fieldValue) {
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    public Object getFieldValue() {
        return fieldValue;
    }
    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }
}
