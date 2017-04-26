package com.andrzej;

public class Main {

    public static void main(String[] args) {
        //tworzyny mowe obiekty
        // potrzebujemy obiekt konto bankowe, które przyjmie parametry metody Set i Get

//        Account kontoBankoweAndrzeja = new Account();
//        Account kontoBankoweTadeusza = new Account();
        //dla każdej metody settera dodajemy parametry (wartości) odpowiadające typowi danych użytych wcześniej

//        kontoBankoweAndrzeja.setAccountBalance(900);
//        kontoBankoweAndrzeja.setAccountNumber(4564545);
//        kontoBankoweAndrzeja.setAccountHolderEmail("andrzej.brandt@gmail.com");
//        kontoBankoweAndrzeja.setAccountHolderName("Andrzej Brandt");
//        kontoBankoweAndrzeja.setAccountHolderPhone("5445443545");

        //dodawanie parametrów każdego kolejnego konta wykorzystuje zbyt dużo zasobów, więc można
        //to elegancko zastąpić korzystając z konstruktora, który jest definiowany w klasie Account public Account
        Account kontoBankoweTadeusza = new Account(234525, 4000, "Tadzio Tadzio", "email@email.com", "046899988");
        Account kontoBankoweAndrzej = new Account(245435, 3000, "Andrzej Brandt", "brandt@andrzej.com", "098727623");
//        kontoBankoweTadeusza.setAccountBalance(900);
//        kontoBankoweTadeusza.setAccountNumber(4564545);
//        kontoBankoweTadeusza.setAccountHolderEmail("tadeusz.dzierzynki@gmail.com");
//        kontoBankoweTadeusza.setAccountHolderName("Taduesz tadeuszowaty");
//        kontoBankoweTadeusza.setAccountHolderPhone("5445443545");

        kontoBankoweTadeusza.setAccountBalance(5000);
        kontoBankoweTadeusza.Deposit(500);
        System.out.println("Na koncie bankowym Tadeusza znajduje się obecnie " + kontoBankoweTadeusza.getAccountBalance() + " złotych");

        kontoBankoweAndrzej.setAccountBalance(5000);
        kontoBankoweAndrzej.Deposit(4000);
        System.out.println("Na koncie Andrzej " + kontoBankoweAndrzej.getAccountBalance() + "złotych");

        //po ustaleniu wyjściowych parametrów możemy pobawić się metodami i sprawdzić jak się kompilują
//        kontoBankoweAndrzeja.Withdrawal(400);
//        kontoBankoweAndrzeja.Deposit(500);
//        kontoBankoweAndrzeja.Withdrawal(1100);
//
//        //obiekt kontobankoweAndrzej.Deposit - wywołanie metody i kwota
//
//        System.out.println("The current account balance is " + kontoBankoweAndrzeja.getAccountBalance());
//
//
//
        }

}
