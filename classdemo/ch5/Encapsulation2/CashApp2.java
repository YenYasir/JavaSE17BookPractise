package classdemo.ch5.Encapsulation2;


import java.util.Scanner;

public class CashApp2 {
    public static void main(String[] args) {
        CashCard2[] card2s= {
            new CashCard2("A001",500,0),
            new CashCard2("A002",300,0),
            new CashCard2("A003",1000,1),

        };

        var console = new Scanner((System.in));
        for(CashCard2 card2 : card2s){
            System.out.printf("為 (%s, %d, %d) 儲值: ",
                    card2.number,card2.balance,card2.bonus);
            card2.store(console.nextInt());
            System.out.printf("明細 (%s, %d, %d) %n",
                    card2.number,card2.balance,card2.bonus);
        }
    }
}
