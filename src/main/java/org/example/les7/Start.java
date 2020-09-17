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

        Bank ing = new Bank();

        BankAccount petra = new BankAccount();
        ing.addAccount(petra);


        petra.withdraw(200);
        System.out.println("Balance is " + petra.getBalance());










    }
}

