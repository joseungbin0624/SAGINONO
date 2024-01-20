package com.saginono.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.saginono.service.FraudDetectionService;

@RestController
public class TransactionController {
  @Autowired
  private FraudDetectionService fraudDetectionService;

  // API 엔드포인트 메소드
}
