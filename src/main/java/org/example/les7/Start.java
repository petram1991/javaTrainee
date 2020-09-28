package org.example.les7;

public class Start {
    public static void main(String[] args) {

        /*try {
            Person p = new Person("Jan", 12);
            p.setGender(Gender.MALE);
            p.haveBirthday();
            System.out.println(p.getGender());
            System.out.println(p.getAge());

        }catch (Exception e){
            System.out.println("persoon is dood");
        }
        */

        try {
            Bank ing = new Bank();

            BankAccount petra = new BankAccount(1);
            BankAccount tom = new BankAccount(2);



            ing.addAccount(petra);
            ing.addAccount(tom);

            petra.withdraw(500);
            System.out.println(petra.getBalance());
            tom.withdraw(400);
            ing.transfer(tom, petra, 30);
            ing.printAccounts();
            System.out.println("Balance van Petra is " + petra.getBalance());
            System.out.println("Balance van Tom is " + tom.getBalance());
            System.out.println(petra.getAccountNumber());
        }catch (Exception e){
            System.out.println("saldo te laag");
        }
    }
}

