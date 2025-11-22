package help;

public class Help {
    static void library(int num){
        switch(num){
            //if
            case 1:
                System.out.println("The if:\n");
                System.out.println("if(condition)statement;");
                System.out.println("else statement;");
                break;
            //for
            case 2:
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration)");
                System.out.println("statement;");
                break;
            //switch
            case 3:
                System.out.println("The switch:\n");
                System.out.println("switch(expression){");
                System.out.println("case constant:");
                System.out.println("statement sequece");
                System.out.println("break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            //while
            case 4:
                System.out.println("The while:\n");
                System.out.println("while(condition){");
                System.out.println("statement");
                System.out.println("}");
                break;
            //do-while
            case 5:
                System.out.println("The do-while:\n");
                System.out.println("do{");
                System.out.println("statement;");
                System.out.println("}while(condition);");
                break;
            //break
            case 6:
                System.out.println("The break:\n");
                System.out.println("break;or break label;");
                break;
            //continue
            case 7:
                System.out.println("The continue:\n");
                System.out.println("continue;or continue label");
                break;
        }
    }
    boolean judge(int num){
        if (num >= 1 && num < 8) return true;
        else return false;
    }
    static void residue (){
        System.out.println("Help on:");
        System.out.println("1. if");
        System.out.println("2. for");
        System.out.println("3. switch");
        System.out.println("4. while");
        System.out.println("5. do-while");
        System.out.println("6. break");
        System.out.println("7. continue");
        System.out.println("-1 to quit");
        
    }
    public static void main(String[]args)
        throws java.io.IOException{
        int chose;
        char ignore;
        residue();
        for(;;){
            chose = (int)(System.in.read() - '0');
            do{
                ignore = (char)System.in.read();
            }while(ignore != '\n');
            Help t = new Help();
            if(t.judge(chose) && chose != -1){
                library(chose);
            }else if(chose == -1){
                break;
            }
        }
            
    } 
    
}
