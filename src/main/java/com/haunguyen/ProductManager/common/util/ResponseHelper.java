package com.haunguyen.ProductManager.common.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ResponseHelper {
    public static ResponseEntity<Object> getResponse(Object obj, HttpStatus httpStatus){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("content", obj);
        map.put("hasErrors", false);
        map.put("errors", "");
        map.put("timestamp", LocalDateTime.now());
        map.put("status", httpStatus.value());
        return new ResponseEntity<Object>(map, httpStatus);
    }

    public static ResponseEntity<Object> getErrorResponse(BindingResult errors, HttpStatus httpStatus){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("content", null);
        map.put("hasErrors", true);
        map.put("errors", ErrorHelper.getAllError(errors));
        map.put("timestamp", LocalDateTime.now());
        map.put("status", httpStatus.value());
        return new ResponseEntity<Object>(map, httpStatus);
    }

    public static ResponseEntity<Object> getErrorResponse(String error, HttpStatus httpStatus){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("content", null);
        map.put("hasErrors", true);
        map.put("errors", error);
        map.put("timestamp", LocalDateTime.now());
        map.put("status", httpStatus.value());
        return new ResponseEntity<Object>(map, httpStatus);
    }
}
