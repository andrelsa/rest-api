package dev.com.andre.restapi.domain.dto;

import dev.com.andre.restapi.service.ModelMapperService;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class ResultListDto<T> implements Serializable {

    private List<T> result;

    public ResultListDto(List<T> resultList,
                         ModelMapperService modelMapperService,
                         Class<T> clazz) {

        this.result = modelMapperService.toList(clazz, resultList);
    }
}
