package Aufgaben3;
public class Paerchenbildung {

    public static void bildung(int[]a , int[] b){
        for(int i = 0 ; i < a.length; i++){
            System.out.print("("+a[i]+","+b[i]+")");
        }
    }
    
    public static void par(int[]a , int[] b) {
    	for(int i = 0 ; i  < a.length ;i ++) {
    		System.out.print("("+a[i]+","+b[i]+")");
    	}
    }
    public static void main(String[] args) {
        int x []= {9,8,7,6,5,4};
        int y []= {1,2,3,4,5,6};
        par(x,y);
    }
}
