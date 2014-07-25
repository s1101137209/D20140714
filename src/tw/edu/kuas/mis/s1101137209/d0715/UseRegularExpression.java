package tw.edu.kuas.mis.s1101137209.d0715;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class UseRegularExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("HelloWorld");
        
        String str = "abcdefgabcabc"; 
        System.out.println(str.replaceAll("..b", "#")); 
 
        System.out.print("輸入手機號碼: "); 
        str = scanner.next();
 
        // 簡單格式驗證 
        if(str.matches("[A-Za-z0-9_]+")) 
            System.out.println("格式正確"); 
        else 
            System.out.println("格式錯誤");
 
        System.out.print("輸入href標籤: "); 
        // Scanner的next()方法是以空白為區隔
        // 我們的輸入有空白，所以要執行兩次
        str = scanner.next() + " " + scanner.next();
 
        // 驗證href標籤 
        if(str.matches("<a.+href*=*['\"]?.*?['\"]?.*?>"))
            System.out.println("格式正確"); 
        else
            System.out.println("格式錯誤");
 
        System.out.print("輸入電子郵件: "); 
        str = scanner.next();
 
        // 驗證電子郵件格式 
        if(str.matches(
        "^[A-Za-z0-9]+([.][A-Za-z0-9]+)*@[A-Za-z0-9]+([.][A-Za-z0-9]+)*$"))
            System.out.println("格式正確"); 
        else
            System.out.println("格式錯誤"); 
    }
    
}

