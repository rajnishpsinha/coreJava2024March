package genericpractice;

public class CommonGenerics {

    protected <T,Y> Integer add( T var1, Y var2){


        Integer input1=0;
        Integer input2=0;
        String typeOfArgument = var1.getClass().getSimpleName();
        switch(typeOfArgument){
            case "String":
                try {
                    input1 = Integer.valueOf((String) var1);
                }catch (NumberFormatException n){
                    input1= 0;
                    System.out.println("variable 1 is not valid string");
                }
                break;
            case "Integer":
                            input1= (Integer) var1;
                            break;
            default:System.out.println("variable 1 is object");
                    break;
        }
        String typeOfArgument2 = var2.getClass().getSimpleName();
        switch(typeOfArgument2){
            case "String":
                try {
                    input2 = Integer.valueOf((String) var2);
                }catch (NumberFormatException n){
                    input2= 0;
                    System.out.println("variable 1 is not valid string");
                }
                break;
            case "Integer":
                input2= (Integer) var2;
                break;
            default:System.out.println("variable 1 is object");
                break;
        }

        return input1+input2;
    }

    public static void main(String[] args) {
        CommonGenerics commonGenerics = new CommonGenerics();
        Integer sum=commonGenerics.add(4,"c");
        System.out.println("Sum is: "+ sum);
    }
}
