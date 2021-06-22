package com.example.pyunhagae.DTO;

public class MemberDTO {
    private String id, pw, email, tel, addr;

    public MemberDTO(String id, String pw, String email, String tel, String addr) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.tel = tel;
        this.addr = addr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
