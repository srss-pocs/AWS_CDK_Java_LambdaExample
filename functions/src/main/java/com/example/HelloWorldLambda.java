package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class HelloWorldLambda implements RequestHandler<String, String>
{

    @Override
    public String handleRequest(String name, Context context) {
        return "This is "+ name;
    }
}
