package Patterns.Factory;/*  Created by Ilyasov Damir on 30.08.2016. */

import java.util.Date;

public class Factory {
    public static void main(String[] args) {
        WatchesMaker maker = getMark("Digital   ");
        Watches watches = maker.createWatches();
        watches.showTime();
    }
    public static WatchesMaker getMark(String maker){
        if (maker.equals("Digital")){
            return new DigitalWatchesMaker();
        }
        if (maker.equals("Rome")){
            return new RomeWatchesMaker();
        }

        throw new RuntimeException("Не поддерживаемая марка часов");
    }
}

interface Watches{
    void showTime();
}

class RomeWatches implements Watches{

    @Override
    public void showTime() {
        System.out.println("VII");
    }
}

class DigitalWatches implements Watches{

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

interface WatchesMaker{
    Watches createWatches();
}

class RomeWatchesMaker implements WatchesMaker{

    @Override
    public Watches createWatches() {
        return new RomeWatches();
    }
}

class DigitalWatchesMaker implements WatchesMaker{

    @Override
    public Watches createWatches() {
        return new DigitalWatches();
    }
}