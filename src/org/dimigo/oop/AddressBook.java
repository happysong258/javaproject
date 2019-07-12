package org.dimigo.oop;

public class AddressBook {

    public AddressBook() {
    }

    private int phonenum;
    private String name;
    private String group;
    private String favorites;
    private String emailAddress;

    public boolean save() {
        System.out.println("연락처를 저장했습니다!");
        return true;
    }

    public boolean delete() {
        System.out.println("연락처를 삭제했습니다!");
        return true;
    }

    public void massage(String mname) {
        System.out.println(mname+"(이)에게 메세지를 보냅니다!");
    }

    public void call(String cname) {
        System.out.println(cname+"(이)에게 전화를 겁니다!");
    }

    public void setProfile(String sname) {
        System.out.println(sname+"(이)의 사진을 변경합니다!");
    }

}