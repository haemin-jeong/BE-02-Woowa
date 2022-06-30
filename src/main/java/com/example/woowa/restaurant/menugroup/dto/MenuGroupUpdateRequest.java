package com.example.woowa.restaurant.menugroup.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@Getter
public class MenuGroupUpdateRequest {

    @NotBlank
    @Length(max = 100)
    private String title;

    @Length(max = 500)
    private String description;
}
