package day28_ArrayList.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Grades {
    public static void main(String[] args) {
        /*
        8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
         */
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        Integer countA = 0;
        Integer countB = 0;
        Integer countC = 0;
        Integer countD = 0;
        Integer countF = 0;

        for (Integer score : scores) {
            if(score>=90 && score<=100) {
                countA++;
                gradeOfA.add(score);
            } else if (score>=80) {
                countB++;
                gradeOfB.add(score);
            } else if (score>=70) {
                countC++;
                gradeOfC.add(score);
            } else if (score>=60) {
                countD++;
                gradeOfD.add(score);
            } else {
                countF++;
                gradeOfF.add(score);
            }
        }
        System.out.println(countA + " " + gradeOfA);
        System.out.println(countB + " " + gradeOfB);
        System.out.println(countC + " " + gradeOfC);
        System.out.println(countD + " " + gradeOfD);
        System.out.println(countF + " " + gradeOfF);
    }
}
