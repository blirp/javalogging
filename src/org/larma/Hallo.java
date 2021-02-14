package org.larma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Hallo {
    private static final Logger log = LoggerFactory.getLogger(Hallo.class); 

    public static void main(
        String[] args)
    {
        log.info("Starter opp");
        System.out.println("Hallo, hallo, Verden!");
        log.info("Avslutter");
    }
}