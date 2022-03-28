package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor     //DTO==> data transfer object    there is some data you want to show in database but not in ui that's why we need DTO  and ENTITY
public class RoleDTO {       // DTO is interacting with controller and entity is interacting with database
     private Long id;        //and mappers help us to map entity and DTO
     private String description;
}
