package com.ssmdemo.bean;

import java.util.Objects;

public class Manager {
    int mgrid;
    String mgrname;
    String mgrpwd;
    public Manager(){

    }

    public Manager(String mgrname, String mgrpwd) {
        this.mgrname = mgrname;
        this.mgrpwd = mgrpwd;
    }

    public Manager(int mgrid, String mgrname, String mgrpwd) {
        this.mgrid = mgrid;
        this.mgrname = mgrname;
        this.mgrpwd = mgrpwd;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public String getMgrname() {
        return mgrname;
    }

    public void setMgrname(String mgrname) {
        this.mgrname = mgrname;
    }

    public String getMgrpwd() {
        return mgrpwd;
    }

    public void setMgrpwd(String mgrpwd) {
        this.mgrpwd = mgrpwd;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mgrid=" + mgrid +
                ", mgrname='" + mgrname + '\'' +
                ", mgrpwd='" + mgrpwd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return mgrid == manager.mgrid && Objects.equals(mgrname, manager.mgrname) && Objects.equals(mgrpwd, manager.mgrpwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mgrid, mgrname, mgrpwd);
    }
}
