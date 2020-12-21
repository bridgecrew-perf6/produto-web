package com.silva;

import io.micronaut.http.annotation.RequestAttribute ;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class ProdutoController {

    @Get
    public String hello(){
        return "Hello Cloud";
    }
}
