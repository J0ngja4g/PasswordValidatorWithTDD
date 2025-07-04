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
        if (password ==null&&password.length()<8 && password.length()>32) {
            return PasswordStrength.INVALID;
            
        }
        if (Character.isDigit(0)) {
            digit = true;
        }
        if (Character.isLetter(0)) {
            letter  = true;
        }
        if (Character.isUpperCase(0)) {
            Upper = true;
        }
        if (Character.isLowerCase(0)) {
            Lower = true;
        }
        if (!Character.isLetterOrDigit(0)) {
            plag = false;
        }
        
        //return
        
        if (Upper && !Lower && !digit&&!plag) return PasswordStrength.WEAK; //พิมพ์ใหญ่ทั้งหมด
        if (!Upper && Lower && !digit&&!plag) return PasswordStrength.WEAK; //พิมพ์เล็กทั้งหมด
        if (digit && letter&&!plag) return PasswordStrength.MEDIUM; //ตัวเลขกับตัวอักษรรวมกัน
        if (Upper && Lower && digit&&!plag) return PasswordStrength.WEAK;//มีทั้งตัวอักษรพิมพ์ใหญ่ พิมพ์เล็กและตัวเลข
        if (Upper && Lower && digit&&plag) return PasswordStrength.WEAK;//มีทั้งตัวอักษรพิมพ์ใหญ่ พิมพ์เล็กและตัวเลข อักขระพิเศษ
        if (Upper && !Lower && !digit&&!plag) return PasswordStrength.WEAK;//ตัวเลขทั้งหมด
        return null ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}