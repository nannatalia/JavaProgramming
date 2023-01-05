package homework2;

public class Salary {
    public static void main(String[] args) {
        /*
        2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
         */
        int salary = 110000;
        boolean married = true;
        if(salary<80000 && married){
            System.out.println(salary - salary*0.15);
        } else if (salary<80000 && !married) {
            System.out.println(salary-salary*0.2);
        } else if (salary>=80000 && salary <100000 && married) {
            System.out.println(salary-salary * 0.2);
        } else if (salary>=80000 && salary<100000 && !married) {
            System.out.println(salary-salary*0.25);
        } else if (salary>=100000 && salary< 130000 && married) {
            System.out.println(salary-salary*0.25);
        } else if (salary>=100000 && salary< 130000 && !married) {
            System.out.println(salary-salary * 0.3);
        } else if (salary>=130000 && married) {
            System.out.println(salary-salary * 0.3);
        }else {
            System.out.println(salary-salary*0.35);
        }
    }
}
