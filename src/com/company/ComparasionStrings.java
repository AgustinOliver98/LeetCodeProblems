package com.company;

public class ComparasionStrings {

        public void printArray(int[] arr){
            for(int i: arr) System.out.print(i + " ");
            System.out.println();
        }
        public void compareStrings(String time){
                char[] timeArray = time.toCharArray();
                if(timeArray[0] == '?'){
                   timeArray[0] =  (timeArray[1] <=3  || timeArray[1] == '?') ?  '2' : '1' ;
                }
                if(timeArray[1] == '?'){
                    timeArray[1] = (timeArray[0] == '2') ? '3' : '9';
                }

                timeArray[3] = timeArray[3] == '?' ? '5' : timeArray[3];
                timeArray[4] = timeArray[4] == '?' ? '9' : timeArray[3];

               System.out.println(timeArray);
        }
    }

