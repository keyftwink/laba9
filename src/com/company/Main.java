package com.company;

public class Main {

    public static void main(String[] args) {

        Milk milk = new Milk("Молоко", 70, 8.5);
        ChakChak chakChak = new ChakChak("Чак-чак", 120, 10);
        Apple apple = new Apple("Яблоко", 15, 6.7);

        User1 user1 = new User1("login", "123124");
        User2 user2 = new User2("login2", "23hjfs");
        User3 user3 = new User3("login3", "290t42");

        Order order = new Order();
        order.printOrder(user1.getLogin() , milk.getName());
    }
}
interface Product{
    String getName();
    double getCost();
    double getRate();
}
interface User{
    String getLogin();
    String getPassword();
}

class Milk implements Product{

    String name;
    double cost;
    double rate;

    Milk(String name, double cost, double rate){
        this.name = name;
        this.cost = cost;
        this.rate = rate;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getRate() {
        return rate;
    }
}
class ChakChak implements Product{

    String name;
    double cost;
    double rate;

    ChakChak(String name, double cost, double rate){
        this.name = name;
        this.cost = cost;
        this.rate = rate;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getRate() {
        return rate;
    }
}
class Apple implements Product{

    String name;
    double cost;
    double rate;

    Apple(String name, double cost, double rate){
        this.name = name;
        this.cost = cost;
        this.rate = rate;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getRate() {
        return rate;
    }
}
class User1 implements User{
    String login;
    String password;

    User1(String login, String password){
        this.login = login;
        this.password = password;
    }
    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
class User2 implements User{

    String login;
    String password;

    User2(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
class User3 implements User{

    String login;
    String password;

    User3(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
class Order implements User, Product{

    public void printOrder(String login, String name){
        System.out.println("Покупатель: " + login + " товар: "+ name);
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public double getRate() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getLogin() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}
