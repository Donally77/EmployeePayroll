package com.employeepayrollservice;

import org.junit.jupiter.api.Test;
import java.util.Arrays;


public class EmployeePayrollServiceTest {

    @Test
    public void given3EmployeeWhenWrittenToFile_ShouldReturnEmployeeEnteries() {
        EmployeePayrollData[] arrayOfEmps = {
                new EmployeePayrollData(1, "Donally", 100000),
                new EmployeePayrollData(2, "pooja", 100000),
                new EmployeePayrollData(3, "Swati", 100000),
        };
        EmployeePayrollService employeePayRollService;
        employeePayRollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));

        employeePayRollService.writeData(EmployeePayrollService.IOService.FILE_IO);


    }


}
