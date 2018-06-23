package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    final private String peselId;
    final private String firstname;
    final private String lastname;
    final private BigDecimal baseDecimal;

    public Employee(String peselId, String firstname, String lastname, BigDecimal baseDecimal) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseDecimal = baseDecimal;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseDecimal() {
        return baseDecimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(peselId, employee.peselId) &&
                Objects.equals(firstname, employee.firstname) &&
                Objects.equals(lastname, employee.lastname) &&
                Objects.equals(baseDecimal, employee.baseDecimal);
    }

    @Override
    public int hashCode() {

        return Objects.hash(peselId, firstname, lastname, baseDecimal);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", bigDecimal=" + baseDecimal +
                '}';
    }
}
