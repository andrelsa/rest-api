package dev.com.andre.restapi.domain.dto;

import dev.com.andre.restapi.service.ModelMapperService;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;


@Data
public class ResultPageDto<T> implements Serializable {

    private long totalResults;
    private int totalPages;
    private List<T> result;

    public ResultPageDto(Page<T> resultPage,
                         ModelMapperService modelMapperService,
                         Class<T> clazz) {

        this.totalPages = resultPage.getTotalPages();
        this.totalResults = resultPage.getTotalElements();
        this.result = modelMapperService.toList(clazz, resultPage.getContent());
    }
}
