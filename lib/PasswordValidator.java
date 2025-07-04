package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        boolean Lower = false;
        boolean Upper = false;
        boolean count = false;
        boolean plag = false;
        boolean eng = false;
        boolean digit = false;
        boolean letter = false;
        for (char c : password.toCharArray()) {
          if (password ==null||password.length()<8 || password.length()>32) {
            return PasswordStrength.INVALID;
            
        }
        if (Character.isDigit(c)) {
            digit = true;
        }
        //if (Character.isLetter(c)) {
          //  letter  = true;
        //}
        if (Character.isUpperCase(c)) {
            Upper = true;
        }
        if (Character.isLowerCase(c)) {
            Lower = true;
        }  
        if (!Character.isDigit(c)&&!Character.isLetter(c)) {
            plag = true;
        }
        }
        
        
        
        //return
        
        if (Upper && !Lower && !digit && !plag) return PasswordStrength.WEAK; //พิมพ์ใหญ่ทั้งหมด
        if (!Upper && Lower && !digit && !plag) return PasswordStrength.WEAK; //พิมพ์เล็กทั้งหมด
        if (digit && Upper && Lower && !plag) return PasswordStrength.MEDIUM; //ตัวเลขกับตัวอักษรรวมกัน ข้อ5
        if (Upper && Lower && digit && plag) return PasswordStrength.STRONG; //ตัวใหญ่ ตัวเล้กก ตัวเลขข plag
        if (!Upper && !Lower && digit && !plag) return PasswordStrength.WEAK; //only number
        return PasswordStrength.INVALID;
    }
}