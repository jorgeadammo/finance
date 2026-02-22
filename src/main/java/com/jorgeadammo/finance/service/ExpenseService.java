package com.jorgeadammo.finance.service;

import com.jorgeadammo.finance.dto.MessageResponseDTO;
import com.jorgeadammo.finance.entity.Expense;
import com.jorgeadammo.finance.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ExpenseService {
    ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public MessageResponseDTO create(Expense expense){
        Expense savedExpense = expenseRepository.save(expense);
        return MessageResponseDTO.builder()
                .message("Expense created with ID " + savedExpense.getId())
                .build();
    }


}
