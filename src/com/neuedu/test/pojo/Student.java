package com.neuedu.test.pojo;/** * Created by admin on 2020/2/18. */public class Student {    private Integer id;    private String name;    private Integer age;    private Integer garden;    public Student() {    }    public Student(String name, Integer age, Integer garden) {        this.name = name;        this.age = age;        this.garden = garden;    }    public Student(Integer id, String name, Integer age, Integer garden) {        this.id = id;        this.name = name;        this.age = age;        this.garden = garden;    }    public Integer getId() {        return id;    }    public void setId(Integer id) {        this.id = id;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public Integer getAge() {        return age;    }    public void setAge(Integer age) {        this.age = age;    }    public Integer getGarden() {        return garden;    }    public void setGarden(Integer garden) {        this.garden = garden;    }    @Override    public String toString() {        return "Student{" +                "id=" + id +                ", name='" + name + '\'' +                ", age=" + age +                ", garden=" + garden +                '}';    }}