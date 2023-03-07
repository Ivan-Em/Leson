import java.util.Scanner;


class MyProgram{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt();
        System.out.print(summ(x,y));
    }
    public static int summ(int x,int y) {
        int summ=x+y;
        return summ;
    }
}

