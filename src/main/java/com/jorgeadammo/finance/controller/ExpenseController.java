package com.jorgeadammo.finance.controller;

import com.jorgeadammo.finance.dto.MessageResponseDTO;
import com.jorgeadammo.finance.entity.Expense;
import com.jorgeadammo.finance.repository.ExpenseRepository;
import com.jorgeadammo.finance.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/expenses")
public class ExpenseController {

    private ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Expense expense){
        return expenseService.create(expense);
    }
}
