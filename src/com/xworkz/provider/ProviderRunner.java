package com.xworkz.provider;

public class ProviderRunner {
    public static void main(String[] args) {
        Provider provider= new Provider("Xworkz", "omkarSir") {
            @Override
            public void service() {
                System.out.println("===========");
                return;
            }
        };
        Provider provider1=new InternetProvider(20,1000000);
        Provider provider2=new DellProvider(40,62000);
        Provider provider3=new Lenovoprovider(50,59000);
        Provider provider4=new MovieBookingProvider("KGF",500);
        Provider provider5=new BookingMyShowMovieBookingProvider(true,800);
    }
}
