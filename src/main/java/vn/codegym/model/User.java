package vn.codegym.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty
    /*TODO: @NotEmpty: không để trống.*/
    @Size(min = 2, max = 30)
    /*TODO: @Size(min = 2, max = 30): độ dài ký tự từ 2 đến 30.*/
    private String name;
    /*TODO: @Min(18): giá trị nhỏ nhất là 18*/

    @Min(18)
    private int age;

    public User() {
    }

    public User(@NotEmpty @Size(min = 2, max = 30) String name, @Min(18) int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

