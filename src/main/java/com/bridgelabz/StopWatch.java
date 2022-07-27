package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {

        public long startTimer=0;
        public long stopTimer=0;
        public long elapsed;

        //to start timer
        public void start()
        {
            startTimer=System.currentTimeMillis();
            System.out.println("Start Time is: "+startTimer);
        }

        // to stop timer
        public void stop()
        {
            stopTimer=System.currentTimeMillis();
            System.out.println("Stop Time is: "+stopTimer);
        }

        public long getElapsedTime()
        {
            elapsed=stopTimer-startTimer;
            return elapsed;
        }

        public static void main(String[] args) throws Exception
        {
            StopWatch sw=new StopWatch();
            Scanner sc = new Scanner(System.in);
            System.out.println("Press '1' to Start Time: ");
            sc.nextInt();
            sw.start();

            System.out.println();
            System.out.println("Press '2' to Stop Time: ");
            sc.nextInt();
            sw.stop();

            long l=sw.getElapsedTime();
            System.out.println();
            System.out.println("Total Time Elapsed(in Milli Second) is:"+l);
            System.out.println();
            System.out.println("Converting Milli Second to seconds: "+(l/1000)+" sec");
        }
    }

