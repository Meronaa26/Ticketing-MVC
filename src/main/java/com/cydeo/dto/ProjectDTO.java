package com.cydeo.dto;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class ProjectDTO {
    private String projectName;
    private String projectCode;
    private UserDTO assignManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status projectStatus;

}
