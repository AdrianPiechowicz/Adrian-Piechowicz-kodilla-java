package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    final private int indexNo;
    final private String userName;
    final private char sex;
    final private LocalDate birthDate;
    final private int postAmount;

    public ForumUser(int indexNo, String userName, char sex, LocalDate birthDate, int postAmount) {
        this.indexNo = indexNo;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postAmount = postAmount;
    }

    public int getIndexNo() {
        return indexNo;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        char result = ' ';
        if (sex == 'M' || sex == 'F') {
            result = sex;
        }
        return result;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostAmount() {
        return postAmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "indexNo=" + indexNo +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postAmount=" + postAmount +
                '}';
    }

}
