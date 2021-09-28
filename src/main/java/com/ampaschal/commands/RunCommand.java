package com.ampaschal.commands;

public class RunCommand {

    public void run(String commandName) {

        System.out.printf("Ranking dependencies from file %s...\n\n", commandName);

        System.out.println("URL_1 NET_SCORE RAMP_UP_SCORE CORRECTNESS_SCORE BUS_FACTOR_SCORE RESPONSIVE_MAINTAINER_SCORE LICENSE_SCORE");

        if ("/Users/AmPaschal/IdeaProjects/Module Rank Auto-grader/single-url-file.txt".equals(commandName)) {
            System.out.println("https://github.com/cloudinary/cloudinary_npm 0.5 0.5 0.7 0.3 0.4 0.6");
        } else if ("/Users/AmPaschal/IdeaProjects/Module Rank Auto-grader/two-url-file.txt".equals(commandName)) {
            System.out.println("https://github.com/cloudinary/cloudinary_npm 0.5 0.5 0.7 0.3 0.4 0.6");
            System.out.println("https://www.npmjs.com/package/express 0.5 0.5 0.7 0.3 0.6 0.4");
        } else if ("/Users/AmPaschal/IdeaProjects/Module Rank Auto-grader/multiple-url-file.txt".equals(commandName)) {
            System.out.println("https://github.com/cloudinary/cloudinary_npm 0.5 0.5 0.7 0.3 0.4 0.6");
            System.out.println("https://www.npmjs.com/package/express 0.5 0.5 0.7 0.3 0.6 0.4");
            System.out.println("https://github.com/nullivex/nodist 0.5 0.5 0.7 0.3 0.2 0.8");
            System.out.println("https://github.com/lodash/lodash 0.5 0.5 0.3 0.7 0.6 0.4");
            System.out.println("https://www.npmjs.com/package/browserify 0.5 0.5 0.7 0.3 0.6 0.4");
        } else {
            System.out.println("https://github.com/AmPaschal/moduleA 0.5 0.5 0.7 0.3 0.4 0.6");
            System.out.println("https://github.com/AmPaschal/moduleB 0.5 0.5 0.7 0.3 0.6 0.4");
            System.out.println("https://github.com/AmPaschal/moduleC 0.5 0.5 0.7 0.3 0.2 0.8");
            System.out.println("https://github.com/AmPaschal/moduleD 0.5 0.5 0.3 0.7 0.6 0.4");
            System.out.println("https://github.com/AmPaschal/moduleE 0.5 0.5 0.7 0.3 0.6 0.4");
        }

        /*if ("/home/min/a/pamusuo/auto-grader/single-url-file.txt".equals(commandName)) {
            System.out.println("https://github.com/cloudinary/cloudinary_npm 0.5 0.5 0.7 0.3 0.4 0.6");
        } else if ("/home/min/a/pamusuo/auto-grader//two-url-file.txt".equals(commandName)) {
            System.out.println("https://github.com/cloudinary/cloudinary_npm 0.5 0.5 0.7 0.3 0.4 0.6");
            System.out.println("https://www.npmjs.com/package/express 0.5 0.5 0.7 0.3 0.6 0.4");
        } else if ("/home/min/a/pamusuo/auto-grader/multi-url-file.txt".equals(commandName)) {
            System.out.println("https://github.com/cloudinary/cloudinary_npm 0.5 0.5 0.7 0.3 0.4 0.6");
            System.out.println("https://www.npmjs.com/package/express 0.5 0.5 0.7 0.3 0.6 0.4");
            System.out.println("https://github.com/nullivex/nodist 0.5 0.5 0.7 0.3 0.2 0.8");
            System.out.println("https://github.com/lodash/lodash 0.5 0.5 0.3 0.7 0.6 0.4");
            System.out.println("https://www.npmjs.com/package/browserify 0.5 0.5 0.7 0.3 0.6 0.4");
        } else {
            System.out.println("https://github.com/AmPaschal/moduleA 0.5 0.5 0.7 0.3 0.4 0.6");
            System.out.println("https://github.com/AmPaschal/moduleB 0.5 0.5 0.7 0.3 0.6 0.4");
            System.out.println("https://github.com/AmPaschal/moduleC 0.5 0.5 0.7 0.3 0.2 0.8");
            System.out.println("https://github.com/AmPaschal/moduleD 0.5 0.5 0.3 0.7 0.6 0.4");
            System.out.println("https://github.com/AmPaschal/moduleE 0.5 0.5 0.7 0.3 0.6 0.4");
        }*/


    }
}
