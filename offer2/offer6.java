package aa;

public class offer6 {
  public static int minNumberInRotateArray(int [] array) {
//        if(array.length==0){
//            return 0;
//        }
//        int tar=array[0];
//        for (int i = 1; i <array.length ; i++) {
//            if(tar>array[i]){
//                tar=array[i];
//            }else {
//                continue;
//            }
//        }
//        return tar;
        if(array.length==0){
            return 0;
        }
        int first=0;
        int end=array.length-1;
        while (first<end){
            if(array[first]<array[end]){
                return array[first];
            }
            int mid=first+(end-first)/2;
            if(array[mid]>array[end]){
                first=mid+1;
            }else if(array[mid]<array[end]){
                end=mid;
            }else {
                end--;
            }
        }
        return array[first];
  }

    public static void main(String[] args) {
        System.out.println(minNumberInRotateArray(new int[]{3,4, 5, 1,2}));
    }
}
