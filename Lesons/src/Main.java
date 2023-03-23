import java.util.ArrayList;
import java.util.Scanner;


class MyProgram{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            sc.nextLine();
            String name3="";
        ArrayList<String> list=new ArrayList<>();
        for (int i=0;i<n;i++) {
            String cmd1=sc.nextLine();
            String[]cmd=cmd1.split(" ");
            if (cmd1.length() == 10) {
                 cmd=cmd1.split("");
            }
            if (cmd1.equalsIgnoreCase("Следующий!")) {
                if (list.isEmpty()) {System.out.println("Отлично, попью чаёк!");
                }else { name3=list.get(0);
                    System.out.println(name3+" в обработке");
                    list.remove(0);
                }
            }
            if (cmd[0].equalsIgnoreCase("Добавить")) {
                list.add(cmd[1]);
                System.out.println(cmd[1] + " в очереди");
            }
            if (cmd[0].equalsIgnoreCase("посмотреть")) {
                if (list.size()==0) {
                    System.out.println("*прокатилось перекати-поле*");
                } else {
                    System.out.print(String.join(" ", list));
                    System.out.println();
                }
            }else
            if (cmd[0].equalsIgnoreCase("Стоит")) {
                if (list.size()<5){list.add(cmd[4]);}else {System.out.println("Слабак!");}
            }else
            if (cmd[1].equalsIgnoreCase("занимала")){
                 if (cmd[3].equalsIgnoreCase(name3)){ list.add(0,cmd[0]);}
                 else if (list.contains(cmd[3])) { int index=list.indexOf(cmd[3]); list.add(index+1,cmd[0]);}
                 else{ list.add(cmd[0]); System.out.println(cmd[0]+", не надо тут ля-ля"); }
            }
        }
    }
}

