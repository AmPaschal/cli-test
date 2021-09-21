package com.ampaschal.commands;

public class RunCommand {

    public void run() {

        System.out.println("Ranking dependencies...\n\n");

        System.out.println("URL_1 NET_SCORE RAMP_UP_SCORE CORRECTNESS_SCORE BUS_FACTOR_SCORE RESPONSIVE_MAINTAINER_SCORE LICENSE_SCORE");
        System.out.println("https://github.com/AmPaschal/moduleA 0.5 0.5 0.7 0.3 0.4 0.6");
        System.out.println("https://github.com/AmPaschal/moduleB 0.5 0.5 0.7 0.3 0.6 0.4");
        System.out.println("https://github.com/AmPaschal/moduleC 0.5 0.5 0.7 0.3 0.2 0.8");
        System.out.println("https://github.com/AmPaschal/moduleD 0.5 0.5 0.3 0.7 0.6 0.4");
        System.out.println("https://github.com/AmPaschal/moduleE 0.5 0.5 0.7 0.3 0.6 0.4");

    }
}
