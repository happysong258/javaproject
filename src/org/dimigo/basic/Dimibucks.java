package org.dimigo.basic;

public class Dimibucks {
    public static void main(String[] args) {
        long mmoney = 1700000, humen = 3, market = 1500;
        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.printf("월 평균 급여 : %,d원\n", mmoney);
        System.out.printf("점포 내 직원 수 : %d명\n", humen);
        System.out.printf("점포 수 : %,d개\n\n", market);
        System.out.printf("연간 인건비 : %,d원", mmoney * 12 * humen * market);
    }
}
