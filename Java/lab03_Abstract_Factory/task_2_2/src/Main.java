import bus.Bus;
import machinefactory.Factory;
import machinefactory.HyundaiFactory;
import machinefactory.SkodaFactory;
import machinefactory.VolvoFactory;
import tram.Tram;
import trolleybus.Trolleybus;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Bus> busSkoda = new ArrayList<>();
        ArrayList<Tram> tramSkoda = new ArrayList<>();
        ArrayList<Trolleybus> trolleybusSkoda = new ArrayList<>();
        ArrayList<Bus> busVolvo = new ArrayList<>();
        ArrayList<Tram> tramVolvo = new ArrayList<>();
        ArrayList<Trolleybus> trolleybusVolvo = new ArrayList<>();
        ArrayList<Bus> busHyundai = new ArrayList<>();
        ArrayList<Tram> tramHyundai = new ArrayList<>();
        ArrayList<Trolleybus> trolleybusHyundai = new ArrayList<>();

        final int A = 10;       // закупити A автобусів
        final int T = 5;        // закупити T трамваїв
        final int Tr = 40;      // закупити Tr – тролейбусів
        final int N = 200_000;  // орієнтований пробіг експлуатації

        Factory factorySkoda = new SkodaFactory();
        Factory factoryVolvo = new VolvoFactory();
        Factory factoryHyundai = new HyundaiFactory();

        for (int i = 0; i < A; i++) {
            Bus skodaBus = factorySkoda.createBus();
            Bus volvoBus = factoryVolvo.createBus();
            Bus hyundaiBus = factoryHyundai.createBus();
            busSkoda.add(skodaBus);
            busVolvo.add(volvoBus);
            busHyundai.add(hyundaiBus);
        }

        for (int i = 0; i < T; i++) {
            Tram skodaTram = factorySkoda.createTram();
            Tram volvoTram = factoryVolvo.createTram();
            Tram hyundaiTram = factoryHyundai.createTram();
            tramSkoda.add(skodaTram);
            tramVolvo.add(volvoTram);
            tramHyundai.add(hyundaiTram);
        }

        for (int i = 0; i < Tr; i++) {
            Trolleybus skodaTrolleybus = factorySkoda.createTrolleybus();
            Trolleybus volvoTrolleybus = factoryVolvo.createTrolleybus();
            Trolleybus hyundaiTrolleybus = factoryHyundai.createTrolleybus();
            trolleybusSkoda.add(skodaTrolleybus);
            trolleybusVolvo.add(volvoTrolleybus);
            trolleybusHyundai.add(hyundaiTrolleybus);
        }

        int finalCostScoda = 0;
        int finalCostVolvo = 0;
        int finalCostHyundai = 0;

        for (int i = 0; i < A; i++) {
            finalCostScoda += busSkoda.get(i).getCost() + busSkoda.get(i).getUsageCost() * N;
            finalCostVolvo += busVolvo.get(i).getCost() + busVolvo.get(i).getUsageCost() * N;
            finalCostHyundai += busHyundai.get(i).getCost() + busHyundai.get(i).getUsageCost() * N;
        }

        for (int i = 0; i < T; i++) {
            finalCostScoda += tramSkoda.get(i).getCost() + tramSkoda.get(i).getUsageCost() * N;
            finalCostVolvo += tramVolvo.get(i).getCost() + tramVolvo.get(i).getUsageCost() * N;
            finalCostHyundai += tramHyundai.get(i).getCost() + tramHyundai.get(i).getUsageCost() * N;
        }

        for (int i = 0; i < Tr; i++) {
            finalCostScoda += trolleybusSkoda.get(i).getCost() + trolleybusSkoda.get(i).getUsageCost() * N;
            finalCostVolvo += trolleybusVolvo.get(i).getCost() + trolleybusVolvo.get(i).getUsageCost() * N;
            finalCostHyundai += trolleybusHyundai.get(i).getCost() + trolleybusHyundai.get(i).getUsageCost() * N;
        }

        System.out.printf("Skoda - %s\n", finalCostScoda);
        System.out.printf("Volvo - %s\n", finalCostVolvo);
        System.out.printf("Hyundai - %s\n", finalCostHyundai);

    }
}