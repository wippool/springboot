package org.crazyit.boot.c6;

public class User {

    private Integer id;
    
    private String name;
    
    public User() {
        super();
    }

    public User(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printUser(Integer id, String name) {
        System.out.println("User类的print方法：" + id + ", " + name);
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }
    
}