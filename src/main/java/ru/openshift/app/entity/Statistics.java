//package ru.openshift.app.entity;
//
//
//import jakarta.persistence.*;
//
//import java.math.BigDecimal;
//import java.time.Instant;
//
//@Table(name = "STATISTICS")
//@Entity
//public class Statistics {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "ID", updatable = false, nullable = false)
//
////    @Version
//    private Long version;
//
//    @Column(name = "VALUE1", nullable = false)
//    private String value1;
//
//    @Column(name = "VALUE2", nullable = false)
//    private String value2;
//
//    @Column(name = "VALUE3", nullable = false)
//    private BigDecimal value3;
//
//    @Column(name = "VALUE4", nullable = false)
//    private Integer value4;
//
//    @Column(name = "VALUE5", nullable = false)
//    private String value5;
//
//    @Column(name = "VALUE6", nullable = false)
//    private String value6;
//
//    @Column(name = "CREATE_DATE", nullable = false)
//    private Instant createDate;
//
//    public Long getVersion() {
//        return version;
//    }
//
//    public void setVersion(Long version) {
//        this.version = version;
//    }
//
//    public String getValue1() {
//        return value1;
//    }
//
//    public void setValue1(String value1) {
//        this.value1 = value1;
//    }
//
//    public String getValue2() {
//        return value2;
//    }
//
//    public void setValue2(String value2) {
//        this.value2 = value2;
//    }
//
//    public BigDecimal getValue3() {
//        return value3;
//    }
//
//    public void setValue3(BigDecimal value3) {
//        this.value3 = value3;
//    }
//
//    public Integer getValue4() {
//        return value4;
//    }
//
//    public void setValue4(Integer value4) {
//        this.value4 = value4;
//    }
//
//    public String getValue5() {
//        return value5;
//    }
//
//    public void setValue5(String value5) {
//        this.value5 = value5;
//    }
//
//    public String getValue6() {
//        return value6;
//    }
//
//    public void setValue6(String value6) {
//        this.value6 = value6;
//    }
//
//    public Instant getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(Instant createDate) {
//        this.createDate = createDate;
//    }
//}
