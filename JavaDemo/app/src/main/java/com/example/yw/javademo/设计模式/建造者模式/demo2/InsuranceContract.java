package com.example.yw.javademo.设计模式.建造者模式.demo2;

import com.example.yw.javademo.设计模式.建造者模式.Builder;

/**
 * Created on 2017/11/1114:43.
 * Author jackyang
 * -------------------------------
 *
 * @description 产品
 * @email 3180518198@qq.com
 */

public class InsuranceContract {
    //保险合同编号
    private String contractId;
    /**
     * 被保险人员的名称，同一份保险合同，要么跟人员签订，要么跟公司签订
     * 也就是说，“被保险人员”和“被保险公司”这两个属性，不可能同时有值
     */
    private String personName;
    //被保险公司的名称
    private String companyName;

    //保险开始生效日期
    private long beginDate;

    //保险失效日期，一定会大于保险开始生效日期
    private long endDate;
    //其他数据
    private String otherData;

    private InsuranceContract(Builder buider) {
        this.beginDate = buider.beginDate;
        this.companyName = buider.companyName;
        this.contractId = buider.contractId;
        this.endDate = buider.endDate;
        this.otherData = buider.otherData;
        this.personName = buider.personName;
    }

    public void someOperate() {
        System.out.println("当前正在操作的保险合同编号为【"+this.contractId+"】");
    }

    public static class Builder {
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        public Builder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public Builder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }


        /**
         * Created from 2017/11/11 14:51
         * Author jackyang
         * ------------------
         * @desc 做一些业务逻辑判断
         */
        public InsuranceContract build() {
            boolean signPerson = (personName != null && personName.trim().length() > 0);
            boolean signCompany = (companyName != null && companyName.trim().length() > 0);
            if (signCompany && signPerson) {
                throw new IllegalArgumentException("不能同时签署二者");
            }
            if (!signCompany && !signPerson) {
                throw new IllegalArgumentException("一份保险合同不能没有签订对象");
            }
            return new InsuranceContract(this);
        }
    }
}
