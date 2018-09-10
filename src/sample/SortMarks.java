package sample;

/**
 * Created by Brion Mario on 27/03/2016.
 */
public class SortMarks {
    private int LowestMark;

    Student student = new Student();


    public void setLowestMark(int lowestMark) {
        int []arr = {student.getLevel4Mod1(),student.getLevel4Mod2(),student.getLevel4Mod3(),student.getLevel4Mod4(),student.getLevel4Mod5(),student.getLevel4Mod6()};
        int temp =0;
        for(int i = 0; i<(arr.length-1); i++){
            for(int j = 0; j<(arr.length-1)-i; j++){
                if(arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        for(int mark : arr){
            System.out.println(mark);
        }

        this.LowestMark = lowestMark;
    }

    public int getLowestMark() {

        return LowestMark;
    }
}


