package dev.com.andre.restapi.controller;

import dev.com.andre.restapi.domain.common.ResponseResult;
import dev.com.andre.restapi.domain.dto.user.UserDetailDto;
import dev.com.andre.restapi.service.ModelMapperService;
import dev.com.andre.restapi.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final ModelMapperService modelMapperService;
    private final UserService userService;

    @GetMapping("/v1/p/users/{id}")
    public ResponseResult detail(@PathVariable long id) {
        return ResponseResult.success(modelMapperService.toObject(UserDetailDto.class, userService.detail(id)));
    }


}
