public class login {
    public static void main(String[] args) {

        // 作業員の人数を指定
        int empNum = 5;

        // 従業員のIDを格納する配列を作成
        int empId[] = new int[empNum];
        
        // for文を使ってIDを作成
        int Id = 10000;
        for(int x=1;x<=empNum;x++){
            empId[x-1] = Id+x;
        }

        // 従業員名を作成
        String empName[] = {"emp1","emp2","emp3","emp4","emp5"};

        //while文を使って従業員のIDと名前を表示
        boolean check = true;
        int checkNum = 0;
        while(check){
            if(checkNum<empNum){
                System.out.println(checkNum+1 + "人目の従業員情報");
                System.out.println("従業員ID:" + empId[checkNum]);
                System.out.println("従業員名:" + empName[checkNum]);
                checkNum++;
            }else{
                check = false;
            }
        }

    }
}
