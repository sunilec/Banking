package com.sunil.controller;

import com.sunil.payload.*;
import com.sunil.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
// Below code is for Swagger documentation
@Tag(name = "User Management APIs")
public class UserController {

    private final UserService userService;

    // Here adding some information about endpoints for Swagger Documentation
    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigning an account ID"
    )

    // Here Summerise The API Response
    @ApiResponse(
            responseCode = "201",
            description = "http status 201 Created"
    )

    // http://localhost:8080/api/user
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Given an account number, Check how much the user has balance"
    )
    @ApiResponse(
            responseCode = "200",
            description = "http status 200 SUCCESS"
    )
    // http://localhost:8080/api/user/balanceEnquiry
    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request) {
        return userService.balanceEnquiry(request);
    }

    // http://localhost:8080/api/user/nameEnquiry
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request) {
        return userService.nameEnquiry(request);
    }

    // http://localhost:8080/api/user/credit
    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request) {
        return userService.creditAccount(request);
    }

    // http://localhost:8080/api/user/debit
    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request) {
        return userService.debitAccount(request);
    }

    // http://localhost:8080/api/user/transfer
    @PostMapping("/transfer")
    public BankResponse transfer(@RequestBody TransferRequest request) {
        return userService.transfer(request);
    }

    // http://localhost:8080/api/user/login
    @PostMapping("/login")
    public BankResponse login(@RequestBody LoginDto loginDto) {
        return userService.login(loginDto);
    }

}
