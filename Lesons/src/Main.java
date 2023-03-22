import java.util.ArrayList;
import java.util.Scanner;


class MyProgram{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            String name=null, name3=null;
            String cmd="";
        ArrayList<String> list=new ArrayList<>();
        for (int i=0;i<=n;i++) {
            cmd = sc.nextLine();

            if (cmd.equalsIgnoreCase("Добавить")) {
                name = sc.nextLine();
                list.add(name);
                System.out.println(name + " в очереди"); cmd="";
            }else


            if (cmd.equalsIgnoreCase("Следующий!")) {
                if (list.isEmpty()) {System.out.println("Отлично, попью чаёк!");
                }else { name3=list.get(0);
                System.out.println(name3+" в обработке");
                list.remove(0); cmd="";
                }
            }else
            if (cmd.equalsIgnoreCase("посмотреть очередь")) {
                if (list.isEmpty()) {
                    System.out.println("прокатилось перекати-поле"); cmd="";
                } else {
                    System.out.print(String.join(" ", list));
                    System.out.println(); cmd="";
                }
            }else
            if (cmd.equalsIgnoreCase("Стоит ли оно того?")) {
                name=sc.nextLine(); cmd="";
                if (list.size()<5){list.add(name);}else {System.out.println("Слабак");}
            }
            if (cmd!=""){
                sc.nextLine();
                 String name2=sc.nextLine();

                 if (name2.equalsIgnoreCase(name3)){ list.add(0,cmd);}
                 else if (list.contains(name2)) { int index=list.indexOf(name2); list.add(index+1,cmd);}
                 else{ list.add(cmd); System.out.println(cmd+" не надо тут ля-ля"); }

            }

        }
    }
}

