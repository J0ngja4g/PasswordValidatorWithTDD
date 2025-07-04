package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        String pass;

        // Test Case not pass: รหัสผ่านสั้นควรจะ INVALID
        pass ="123";
        PasswordStrength result1 = PasswordValidator.validate(pass);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

        //test case not pass: รหัสผ่านห้ามเกิน32ตัว
        pass ="12345678pwojegpowjegp6464755165465644wfawaawfwawaawjflkksjkdfjks;klfjskfjjsl;dfkj";
        PasswordStrength result2 = PasswordValidator.validate(pass);
        if(result2 == PasswordStrength.INVALID){
            System.out.println("Test Case 2 Passed: Short password is INVALID.");
        } else{
            System.out.println("Test Case 2 FAILED: Expected INVALID but got"+result2);
        }

        pass ="ASDFGHJKLNOPQQQ";
        //test W3: รหัสผ่านพิมพ์ใหญ่ทั้งหมด
        PasswordStrength result3 = PasswordValidator.validate(pass);
        if(result3 == PasswordStrength.WEAK){
            System.out.println("Test Case 3  Passed: Short password is WEAK.");
        } else{
            System.out.println("Test Case 3 FAILED: Expected WEAK but got"+result3);
        }

        pass ="assfsfefseiffu";
        //test W3: รหัสผ่านพิมพ์เล็กทั้งหมด
        PasswordStrength result4 = PasswordValidator.validate(pass);
        if(result4 == PasswordStrength.WEAK){
            System.out.println("Test Case 4  Passed: Short password is WEAK.");
        } else{
            System.out.println("Test Case 4 FAILED: Expected WEAK but got"+result4);
        }

        pass ="Pass316566559";
        //test S1:  มีทั้งตัวอักษรพิมพ์ใหญ่ พิมพ์เล็กและตัวเลข
        PasswordStrength result5 = PasswordValidator.validate(pass);
        if(result5 == PasswordStrength.MEDIUM){
            System.out.println("Test Case 5  Passed: Short password is MEDIUM.");
        } else{
            System.out.println("Test Case 5 FAILED: Expected MIDIUM but got"+ result5);
        }

        pass="Aa1213@adladdwda";
        //test S2:  มีทั้งตัวอักษรพิมพ์ใหญ่ พิมพ์เล็กและตัวเลข อักขระพิเศษ
        PasswordStrength result6 = PasswordValidator.validate(pass);
        if(result6 == PasswordStrength.STRONG){
            System.out.println("Test Case 6  Passed: Short password is STRONG.");
        } else{
            System.out.println("Test Case 6 FAILED: Expected STRONG but got"+  result6);
        }

        pass ="5456546744689";
        //test W3: รหัสผ่านตัวเลขทั้งหมด
        PasswordStrength result7 = PasswordValidator.validate(pass);
        if(result7 == PasswordStrength.WEAK){
            System.out.println("Test Case 7  Passed: Short password is WEAK.");
        } else{
            System.out.println("Test Case 7 FAILED: Expected WEAK but got"+ result7);
        }

        System.out.println("--------------------------------");
    }
}
