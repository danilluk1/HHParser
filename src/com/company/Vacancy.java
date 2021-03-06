package com.company;

import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class Vacancy {
    private String name;
    private String company;
    private String responsibility;
    private String requirement;
    private String salary;
    protected Elements elements;
    protected List<Vacancy> vacancies = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
