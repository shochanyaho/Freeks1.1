import java.util.Scanner;

public class login {
    public static void main(String[] args) {
         // 意図した値を入力してもらえるように誘導
         System.out.println("どちらでログインしますか？");
         System.out.println("1.一般社員");
         System.out.println("2.管理者");
 
         // 入力値を格納する準備
         Scanner loginCk = new Scanner(System.in);
 
         // 入力値格納
         int loginRole = loginCk.nextInt();
         loginCk.close();
 
         // 入力値によって呼び出すメソッドを分岐させる
         if(loginRole==1){
 
             // 一般社員であればCheck.javaのEmpCheckメソッドを呼び出す
             Check.EmpCheck();
 
         }else if(loginRole==2){
 
             // 管理者であればadminCheck.javaのadminCkメソッドを呼び出す
             adminCheck.adminCk();
         }
    }
}


class empInfo {

    public static String[] empId = {"JavaKun","JavaChan","JavaSan","JavaSama","JavaJava"};
    public static int[] empPW = {1111,2222,3333,4444,5555};

    public static final int adminPW = 123456789;

}

class adminCheck extends Check {
    public static void adminCk() {

        System.out.println("管理者権限のパスワードを入力して下さい。");

        Scanner adminCk = new Scanner(System.in);
        int adminPW = adminCk.nextInt();
        adminCk.close();

        if(adminPW == empInfo.adminPW){
            System.out.println("こんにちは、管理者様");
        }
        Check.EmpCheck();
    }
}

class Check {

    public static void EmpCheck() {
        
        // IDチェック結果変数の準備
        boolean EIdCk = false;

        System.out.println("IDを入力してください。");
        Scanner empCheck = new Scanner(System.in);
        String empIdCk = empCheck.next();

        int empCounter = empInfo.empId.length;

        for(int x=0;x<empCounter;x++){
            if(empIdCk.equals(empInfo.empId[x])){
                EIdCk = true;
            }else{
                System.out.println("IDが見つかりません。");
            }
        }
        if(EIdCk){
            System.out.println("IDが見つかりました。");
            System.out.println("パスワードを入力してください。");
            int empPWCk = empCheck.nextInt();

            for(int x=0;x<empCounter;x++){
                if(empPWCk == empInfo.empPW[x]){
                    System.out.println("ログイン成功");
                }    
            }
        } 

        empCheck.close();
    }
}