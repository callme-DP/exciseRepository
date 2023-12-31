package com.customException;

import com.customException.enumPro.ExceptionEnum;

/**
 * @author yangdongpeng
 * @title DescribeException
 * @date 2023/7/28 15:13
 * @description TODO
 */
public class DescribeException extends RuntimeException {

        private Integer code;

        /**
         * 继承exception，加入错误状态值
         * @param exceptionEnum
         */
        public DescribeException(ExceptionEnum exceptionEnum) {
            super(exceptionEnum.getMsg());
            this.code = exceptionEnum.getCode();
        }

        /**
         * 自定义错误信息
         * @param message
         * @param code
         */
        public DescribeException(String message, Integer code) {
            super(message);
            this.code = code;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }
}
