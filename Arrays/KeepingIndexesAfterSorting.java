import java.util.*;
class ArrItem{
    int item;
    int index;
    ArrItem(int im,int ix){
        item=im;
        index=ix;
    }
}
public class KeepingIndexesAfterSorting {
    public static void printElemntWithIndex(int []a){
        int n=a.length;
        ArrayList<ArrItem>list=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(new ArrItem(a[i],i));
        }
        Collections.sort(list,(ai1,ai2)->(ai1.item-ai2.item));
        for(ArrItem x:list){
            System.out.println(x.item+"  "+x.index);
        }
    }
    public static void main(String[] args){
        int arr[]={3,4,2,1,9,6,8,7,5};
        printElemntWithIndex(arr);
    }
}
