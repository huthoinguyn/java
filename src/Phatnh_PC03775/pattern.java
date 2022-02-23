/*
HỌ VÀ TÊN: NGUYỄN HỮU PHÁT
MSSV: PC03775
 */
package Phatnh_PC03775;

public class pattern {
    
    
    public boolean ktMA(String sc){
        String pattern = "[a-zA-Z]{2}\\d{5}"; 
        return sc.matches(pattern);
    }
   

    public boolean ktTen(String sc) {
        String pattern = "[a-zA-Z\\s]{1,30}";
        return sc.matches(pattern);
    }
    
}
