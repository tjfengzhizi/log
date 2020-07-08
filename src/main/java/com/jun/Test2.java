package com.jun;

import lombok.extern.slf4j.Slf4j;

/**
 * @author：cj
 * @date：2020-7-5 19:59
 * @desc：使用@Slf4j注解需要idea安装lombok插件并引入lombok的jar包依赖
 */
@Slf4j
public class Test2 {
    public static void main(String[] args) {
        log.error("456");
        log.info("789");
        log.debug("10");
        log.warn("11");
    }
}
