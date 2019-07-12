package org.dimigo.oop;

public class FamilyMember {
    private static int memberCnt;
    private String memberName;

    public FamilyMember(String memberName) {
        memberCnt++;
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    public static void printMemberCnt() {
        System.out.printf("가족 총 인원수 : %d명\n", memberCnt);
    }
}
