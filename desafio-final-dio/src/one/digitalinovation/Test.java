package one.digitalinovation;

import one.digitalinovation.singleton.SingletonEager;
import one.digitalinovation.singleton.SingletonLazy;
import one.digitalinovation.singleton.SingletonLazyHolder;
import one.digitalinovation.strategy.*;
import one.digitalinovation.facade.*;

/**
 * @author WellRL
 */
public class Test {

    public static void main(String[] args){

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);

        //Strategy

        Comportamento basico = new ComportamentoBasico();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(basico);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Wellington", "18147000");

    }
}
