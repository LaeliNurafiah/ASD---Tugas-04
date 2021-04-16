package Tugas04;
public class No7 {
     public static void main(String[] args) {
        int [] A = {25,7,9,13,3};
        System.out.println("Laeli Nurafiah (20090104) Kelas 2B");
        System.out.println();
        System.out.println("Data sebelum diurutkan : ");
        No7.print(A);
        No7.inset(A);
        System.out.println("Data setelah diurutkan : ");
        No7.print(A);
        No7.search(A);
    }
    public static void print(int []A){
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void inset(int [] A){
        for (int i = 1; i < A.length; i++) {
            int x = A[i];
            int y = i -1;
            while((y>=0)&&(A[y]> x)){
                A[y + 1] = A[y];
                y--;
            }
            A[y+1]= x;
            
        }
    }
    public static void search(int [] A){
        int Data = 13;
        System.out.println();
        System.out.println("Data yang dicari adalah : " + Data);
        int batasawal = 0;
        int batasakhir = A.length -1;
        int ketemu = 0;
        int point = 0;
        while ((batasawal<=batasakhir)&&(ketemu ==0)){
            point = (batasawal+batasakhir)/2;
            if (A[point]==Data){
                ketemu = 1;
                
            }else{
                if (Data < A[point]){
                    System.out.println("Cari di kiri");
                    batasakhir = point -1;
                }else{
                    System.out.println("Cari di kanan");
                    batasawal = point + 1;
                }
            }
        }
        if(ketemu ==1){
            System.out.println("Data ditemukan pada indeks ke "+point+" dan baris ke "+(point+1));
        }else{
            System.out.println("Data tidak ditemukan");
        }
      
    }

}
