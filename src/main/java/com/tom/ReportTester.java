package com.tom;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report finance = new FinanceReport();
        Report health = new HealthReport();
//        被限定只能放Report的集合
        List<Report> reports = new ArrayList<>();
        reports.add(finance);
        reports.add(health);
        for (Report report:reports) {
            report.load();
            report.print();
        }

    }
}

