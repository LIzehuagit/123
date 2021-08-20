package com.example.freemarkerdemo.uitl;

public class Page {

    private int zts ;
    private int zys ;
    private int dqy =1 ;
    private int yts =2;
    private int qs;
    private int flag;
    public void jisuan() {
        if(zts%yts==0){
            zys=zts/yts;
        }else{
            zys=zts/yts+1;
        }
        qs=(dqy-1)*yts;
    }
    public int getZts() {
        return zts;
    }
    public void setZts(int zts) {
        this.zts = zts;
    }
    public int getZys() {
        return zys;
    }
    public void setZys(int zys) {
        this.zys = zys;
    }
    public int getDqy() {
        return dqy;
    }
    public void setDqy(int dqy) {
        this.dqy = dqy;
    }
    public int getYts() {
        return yts;
    }
    public void setYts(int yts) {
        this.yts = yts;
    }
    public int getQs() {
        return qs;
    }
    public void setQs(int qs) {
        this.qs = qs;
    }
    public int getFlag() {
        return flag;
    }
    public void setFlag(int flag) {
        this.flag = flag;
    }



}
