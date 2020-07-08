package com.jun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author：cj
 * @date：2020-7-5 19:46
 * @desc：LoggerFactory.getLogger需要引入slf4j-api(相当于标准，门面模式);在引入其中一个log日志框架的具体实现
 */

public class Test1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Test1.class);
        logger.error("123");
    }
}
