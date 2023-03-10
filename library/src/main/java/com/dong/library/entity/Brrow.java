package com.dong.library.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Brrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String stuId;
    private String bookId;
    private String brrowDate;
    private String returnDate;
    private String bookName;
    //  借阅，还书，续借审核   0 默认  1 提交申请   2 同意申请
    private Integer brrCheck;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBrrowDate() {
        return brrowDate;
    }

    public void setBrrowDate(String brrowDate) {
        this.brrowDate = brrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBrrCheck() {
        return brrCheck;
    }

    public void setBrrCheck(Integer brrCheck) {
        this.brrCheck = brrCheck;
    }

    public Integer getRetCheck() {
        return retCheck;
    }

    public void setRetCheck(Integer retCheck) {
        this.retCheck = retCheck;
    }

    public Integer getAddCheck() {
        return addCheck;
    }

    public void setAddCheck(Integer addCheck) {
        this.addCheck = addCheck;
    }

    private Integer retCheck;
    private Integer addCheck;
}
