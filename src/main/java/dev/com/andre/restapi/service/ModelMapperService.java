package dev.com.andre.restapi.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ModelMapperService {

    private final ModelMapper modelMapper;

    public <T> List<T> toList(Class<T> clazz, List<?> items) {

        return items.stream()
                .map(item -> modelMapper.map(item, clazz))
                .collect(Collectors.toList());
    }

    public <T> T toObject(Class<T> clazz, Object item) {
        if (item == null) return null;
        return modelMapper.map(item, clazz);
    }

}
