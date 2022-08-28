package org.example;

public class TestBean {
    private String password;

    public TestBean(String password){
        this.password = password;
    }

    public String getName() {
        return password;
    }

    public void setName(String password) {
        this.password = password;
    }
}
