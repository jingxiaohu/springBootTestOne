package com.park.bean;

import java.io.*;
import java.util.*;

//finger_userinfo_relation2
@SuppressWarnings({"serial"})
public class Finger_userinfo_relation2 implements Cloneable , Serializable{

    //public static String[] carrays ={"fur_id","fu_id","fu_nd","fingerprint","finger_veno","fingerprint_hash","finger_veno_hash","is_del","ctime","utime","note","fingerprint_img","finger_veno_img"};

    public long fur_id;//bigint(20)    主键ID
    public long fu_id;//bigint(20)    指纹用户基本信息表主键ID（外键）
    public String fu_nd="";//varchar(80)    指纹用户基本信息表(finger_userinfo)ND
    public String fingerprint="";//text    用户指纹
    public String finger_veno="";//text    用户指静脉
    public String fingerprint_hash="";//varchar(255)    用户指纹图片hash
    public String finger_veno_hash="";//varchar(255)    用户指静脉图片hash
    public int is_del;//int(11)    是否删除(0:正常1：删除)
    public Date ctime=new Date();//datetime    创建时间
    public Date utime=new Date();//datetime    修改时间
    public String note="";//varchar(100)    备注
    public String fingerprint_img="";//varchar(255)    用户指纹图片URL
    public String finger_veno_img="";//varchar(255)    用户指静脉图片URL



    public long getFur_id(){
        return fur_id;
    }

    public void setFur_id(long value){
        this.fur_id= value;
    }

    public long getFu_id(){
        return fu_id;
    }

    public void setFu_id(long value){
        this.fu_id= value;
    }

    public String getFu_nd(){
        return fu_nd;
    }

    public void setFu_nd(String value){
    	if(value == null){
           value = "";
        }
        this.fu_nd= value;
    }

    public String getFingerprint(){
        return fingerprint;
    }

    public void setFingerprint(String value){
    	if(value == null){
           value = "";
        }
        this.fingerprint= value;
    }

    public String getFinger_veno(){
        return finger_veno;
    }

    public void setFinger_veno(String value){
    	if(value == null){
           value = "";
        }
        this.finger_veno= value;
    }

    public String getFingerprint_hash(){
        return fingerprint_hash;
    }

    public void setFingerprint_hash(String value){
    	if(value == null){
           value = "";
        }
        this.fingerprint_hash= value;
    }

    public String getFinger_veno_hash(){
        return finger_veno_hash;
    }

    public void setFinger_veno_hash(String value){
    	if(value == null){
           value = "";
        }
        this.finger_veno_hash= value;
    }

    public int getIs_del(){
        return is_del;
    }

    public void setIs_del(int value){
        this.is_del= value;
    }

    public Date getCtime(){
        return ctime;
    }

    public void setCtime(Date value){
    	if(value == null){
           value = new Date();
        }
        this.ctime= value;
    }

    public Date getUtime(){
        return utime;
    }

    public void setUtime(Date value){
    	if(value == null){
           value = new Date();
        }
        this.utime= value;
    }

    public String getNote(){
        return note;
    }

    public void setNote(String value){
    	if(value == null){
           value = "";
        }
        this.note= value;
    }

    public String getFingerprint_img(){
        return fingerprint_img;
    }

    public void setFingerprint_img(String value){
    	if(value == null){
           value = "";
        }
        this.fingerprint_img= value;
    }

    public String getFinger_veno_img(){
        return finger_veno_img;
    }

    public void setFinger_veno_img(String value){
    	if(value == null){
           value = "";
        }
        this.finger_veno_img= value;
    }



    public static Finger_userinfo_relation2 newFinger_userinfo_relation2(long fur_id, long fu_id, String fu_nd, String fingerprint, String finger_veno, String fingerprint_hash, String finger_veno_hash, int is_del, Date ctime, Date utime, String note, String fingerprint_img, String finger_veno_img) {
        Finger_userinfo_relation2 ret = new Finger_userinfo_relation2();
        ret.setFur_id(fur_id);
        ret.setFu_id(fu_id);
        ret.setFu_nd(fu_nd);
        ret.setFingerprint(fingerprint);
        ret.setFinger_veno(finger_veno);
        ret.setFingerprint_hash(fingerprint_hash);
        ret.setFinger_veno_hash(finger_veno_hash);
        ret.setIs_del(is_del);
        ret.setCtime(ctime);
        ret.setUtime(utime);
        ret.setNote(note);
        ret.setFingerprint_img(fingerprint_img);
        ret.setFinger_veno_img(finger_veno_img);
        return ret;    
    }

    public void assignment(Finger_userinfo_relation2 finger_userinfo_relation2) {
        long fur_id = finger_userinfo_relation2.getFur_id();
        long fu_id = finger_userinfo_relation2.getFu_id();
        String fu_nd = finger_userinfo_relation2.getFu_nd();
        String fingerprint = finger_userinfo_relation2.getFingerprint();
        String finger_veno = finger_userinfo_relation2.getFinger_veno();
        String fingerprint_hash = finger_userinfo_relation2.getFingerprint_hash();
        String finger_veno_hash = finger_userinfo_relation2.getFinger_veno_hash();
        int is_del = finger_userinfo_relation2.getIs_del();
        Date ctime = finger_userinfo_relation2.getCtime();
        Date utime = finger_userinfo_relation2.getUtime();
        String note = finger_userinfo_relation2.getNote();
        String fingerprint_img = finger_userinfo_relation2.getFingerprint_img();
        String finger_veno_img = finger_userinfo_relation2.getFinger_veno_img();

        this.setFur_id(fur_id);
        this.setFu_id(fu_id);
        this.setFu_nd(fu_nd);
        this.setFingerprint(fingerprint);
        this.setFinger_veno(finger_veno);
        this.setFingerprint_hash(fingerprint_hash);
        this.setFinger_veno_hash(finger_veno_hash);
        this.setIs_del(is_del);
        this.setCtime(ctime);
        this.setUtime(utime);
        this.setNote(note);
        this.setFingerprint_img(fingerprint_img);
        this.setFinger_veno_img(finger_veno_img);

    }

    @SuppressWarnings("unused")
    public static void getFinger_userinfo_relation2(Finger_userinfo_relation2 finger_userinfo_relation2 ){
        long fur_id = finger_userinfo_relation2.getFur_id();
        long fu_id = finger_userinfo_relation2.getFu_id();
        String fu_nd = finger_userinfo_relation2.getFu_nd();
        String fingerprint = finger_userinfo_relation2.getFingerprint();
        String finger_veno = finger_userinfo_relation2.getFinger_veno();
        String fingerprint_hash = finger_userinfo_relation2.getFingerprint_hash();
        String finger_veno_hash = finger_userinfo_relation2.getFinger_veno_hash();
        int is_del = finger_userinfo_relation2.getIs_del();
        Date ctime = finger_userinfo_relation2.getCtime();
        Date utime = finger_userinfo_relation2.getUtime();
        String note = finger_userinfo_relation2.getNote();
        String fingerprint_img = finger_userinfo_relation2.getFingerprint_img();
        String finger_veno_img = finger_userinfo_relation2.getFinger_veno_img();
    }

    public Map<String,Object> toMap(){
        return toEnMap(this);
    }

    public static Map<String,Object> toEnMap(Finger_userinfo_relation2 finger_userinfo_relation2){
        long fur_id = finger_userinfo_relation2.getFur_id();
        long fu_id = finger_userinfo_relation2.getFu_id();
        String fu_nd = finger_userinfo_relation2.getFu_nd();
        String fingerprint = finger_userinfo_relation2.getFingerprint();
        String finger_veno = finger_userinfo_relation2.getFinger_veno();
        String fingerprint_hash = finger_userinfo_relation2.getFingerprint_hash();
        String finger_veno_hash = finger_userinfo_relation2.getFinger_veno_hash();
        int is_del = finger_userinfo_relation2.getIs_del();
        Date ctime = finger_userinfo_relation2.getCtime();
        Date utime = finger_userinfo_relation2.getUtime();
        String note = finger_userinfo_relation2.getNote();
        String fingerprint_img = finger_userinfo_relation2.getFingerprint_img();
        String finger_veno_img = finger_userinfo_relation2.getFinger_veno_img();
    
        Map<String,Object>  _ret = new HashMap<String,Object>();
        _ret.put("fur_id",fur_id);
        _ret.put("fu_id",fu_id);
        _ret.put("fu_nd",fu_nd);
        _ret.put("fingerprint",fingerprint);
        _ret.put("finger_veno",finger_veno);
        _ret.put("fingerprint_hash",fingerprint_hash);
        _ret.put("finger_veno_hash",finger_veno_hash);
        _ret.put("is_del",is_del);
        _ret.put("ctime",ctime);
        _ret.put("utime",utime);
        _ret.put("note",note);
        _ret.put("fingerprint_img",fingerprint_img);
        _ret.put("finger_veno_img",finger_veno_img);
        return _ret;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Finger_userinfo_relation2 clone2(){
        try{
            return (Finger_userinfo_relation2) this.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
