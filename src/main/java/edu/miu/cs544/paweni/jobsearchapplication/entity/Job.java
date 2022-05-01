package edu.miu.cs544.paweni.jobsearchapplication.entity;

import javax.persistence.*;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Version
    private long version;
    private String title;
    private float salary;

    public Job() {
    }

    public Job(String title, float salary) {
        this.title = title;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
