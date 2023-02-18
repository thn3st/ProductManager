package com.haunguyen.ProductManager.common.util;

import lombok.experimental.UtilityClass;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.BindingResult;

import java.util.List;

@UtilityClass
public class ErrorHelper {
    public static List<String> getAllError(BindingResult bindingResult){
        return bindingResult.getAllErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .toList();
    }
}
