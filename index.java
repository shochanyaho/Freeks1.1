// スーパークラス
class SuperSalaryClass {

    // 基礎の給料を宣言
    protected int basicSalary = 25;
    // ボーナスを宣言
    protected int bonus = 50;
    // 増減指数を宣言
    protected int SalaryIndex = 2;
 
    // 基礎となる処理を宣言
    public void Salary(){
        System.out.println("給料について");
        System.out.println("月給" + (basicSalary) + "万円");
        System.out.println("ボーナス" + (bonus * SalaryIndex) + "万円");
    }
}

// ジュニアエンジニアクラス
// スーパークラスを継承
class JuniorEngineerClass extends SuperSalaryClass{
    // エンジニアの給料の処理を記述
    public void EngineerSalary(){
        System.out.print("ジュニアエンジニアの");
        // スーパークラスのSalry()メソッドを実行
        super.Salary();
        // 一行開ける
        System.out.println();
    }
}

// シニアエンジニアクラス
class SeniorEngineerClass extends JuniorEngineerClass{

    // JuniorEngineerClassのEngineerSalary()メソッドをオーバーライド
    @Override
    public void EngineerSalary(){
        // スーパークラスのEngineerSalary()メソッドを実行
        super.EngineerSalary();
        
        // 基礎給料をシニアエンジニアの基礎給料に変更
        basicSalary += 10;
        // ボーナスをシニアエンジニアのボーナスに変更
        bonus += 10;

        System.out.print("シニアエンジニアの");
        // スーパークラスのSalary()メソッドを実行
        super.Salary();
        System.out.println("シニアエンジニア報酬" + (bonus) + "万円");
        System.out.println();
    }

}

// マネージャークラス
class ManagerClass extends SeniorEngineerClass{

    // SeniorEngineerClassのSalary()メソッドをオーバーライド
    @Override
    public void Salary(){
        // スーパークラスのEngineerSalary()メソッドを実行
        super.EngineerSalary();

        // シニアエンジニアの基礎給料をマネージャーの基礎給料に変更
        basicSalary += 20;
        // シニアエンジニアのボーナスをマネージャーのボーナスに変更
        bonus += 20;
        System.out.print("マネージャーの");
        super.Salary();
        System.out.print("マネージャー報酬" + (bonus) + "万円");

    }
}


public class index {
    public static void main(String[] args) {
        // マネージャークラスを初期化
        ManagerClass SC = new ManagerClass();
        // マネージャークラスのSalary()メソッドを追加
        SC.Salary();
    }
 
}
