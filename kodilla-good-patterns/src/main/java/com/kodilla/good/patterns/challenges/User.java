package com.kodilla.good.patterns.challenges;

public class User {
    String realName;
    String nick;
    int moneyAmount;

    public User(String realName, String nick, int moneyAmount) {
        this.realName = realName;
        this.nick = nick;
        this.moneyAmount = moneyAmount;
    }

    public String getRealName() {
        return realName;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "User{" +
                "realName='" + realName + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }

    public int getMoneyAmount(){
        return moneyAmount;
    }
}
