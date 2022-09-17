package com.app.swagger_example_springboot.controllers;

import com.app.swagger_example_springboot.models.Country;
import com.app.swagger_example_springboot.repository.CountryRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CountryRest {
    @Autowired
    private CountryRepository countryRepository;


    @Operation(summary = "Get all countries")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "request successfully",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Country.class)) }),
            @ApiResponse(responseCode = "404", description = "countries not founds",
                    content = @Content) })
    @GetMapping("/countries")
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }
}
