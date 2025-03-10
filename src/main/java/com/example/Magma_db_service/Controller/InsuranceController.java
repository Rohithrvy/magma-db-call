package com.example.Magma_db_service.Controller;

import com.example.Magma_db_service.OutputResult;
import com.example.Magma_db_service.Response;
import com.example.Magma_db_service.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InsuranceController {

    @PostMapping("/getDetails")
    public Response getDetails(@RequestBody Request request) {
        // Hardcoded response
        OutputResult outputResult = new OutputResult("BROKER", "INTERMEDIARY", "BRC0000093", "SRG INSURANCE BROKERS PRIVATE LIMITED",
                "10000061185", "SRG INSURANCE BROKERS PRIVATE LIMITED", "INTR-4101-40120", "100001",
                "100005", "JODHPUR", null, "G02688", "ASHRAY AGARWAL");
        return new com.example.Magma_db_service.Response("Success", outputResult, "", "");
    }
}

