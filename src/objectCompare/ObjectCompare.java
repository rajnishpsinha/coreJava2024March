package objectCompare;

import java.util.Comparator;

public class ObjectCompare {
    private boolean comareByName(SavingAccount savingAccount1,
                                 SavingAccount savingAccount2){


        return savingAccount1.equals(savingAccount2);
    }
    public static void main(String[] args) {
 SavingAccount savingAccount1= new SavingAccount("Amitt",205,"accounts");
 SavingAccount savingAccount2= new SavingAccount("Amitt",204,"accounts");
System.out.println(savingAccount1.equals(savingAccount2));

        Comparator<SavingAccount> comparatorById = (SavingAccount s1,SavingAccount s2)->s1.getId()-s2.getId();
      //  comparator.compare(savingAccount1,savingAccount2);
        System.out.println(comparatorById.compare(savingAccount1,savingAccount2)==0);

        Comparator<SavingAccount> comparatorByName = (SavingAccount s1,SavingAccount s2)->s1.getName().compareTo(s2.getName());
        System.out.println(comparatorByName.compare(savingAccount1,savingAccount2)==0);



    }
}
