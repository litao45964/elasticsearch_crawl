package com.fenbeitong.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @version V1.0
 * @Description:
 * @Auther: litao
 * @Date: 2021/3/24 17:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private String name;
    private int age;
}