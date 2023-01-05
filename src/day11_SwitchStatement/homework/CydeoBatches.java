package day11_SwitchStatement.homework;

public class CydeoBatches {
    public static void main(String[] args) {
        /*
        4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning,
        US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed


         */
        String batch = "EU";
        String r = "";

        /*sollution 1

        if(batch=="EU" || batch=="US morning" || batch=="US evening"){
            if (batch=="EU"){
                r = "Class times are  10-5 EST. M, T, W, Th, F.";
            } else if (batch=="US morning") {
                r = "Class times are 10-5 EST. M, T, Th, F.";
            }else {
                r = "Class times are 7-10 EST. M, T, W, Th, S, S";
            }
        }else {
            r = "Invalid batch";
        }
        System.out.println(r); */

   /*sollution 2

    switch (batch){
        case "EU":
            r = "Class times are  10-5 EST. M, T, W, Th, F.";
            break;
        case "US morning":
            r = "Class times are 10-5 EST. M, T, Th, F.";
            break;
        case "US evening":
            r = "Class times are 7-10 EST. M, T, W, Th, S, S";
            break;
        default:
            r = "Invalid batch";
    }
        System.out.println(r); */

        if(batch=="EU" || batch=="US morning" || batch=="US evening"){
            switch (batch) {
                case "EU":
                    r = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;
                case "US morning":
                    r = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                default:
                    r = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
            }
        }else {
            r = "Invalid batch";
        }
        System.out.println(r);
    }
}
