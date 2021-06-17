package com.example.team_project.Dto;

public class MemberDTO {
   private String id,pw,email,addr,tell;

    public MemberDTO(String id, String pw, String email, String addr, String tell) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.addr = addr;
        this.tell = tell;
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }
}
