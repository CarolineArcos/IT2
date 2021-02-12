class tabellen{

    public static void main (String[]arg){

        for (int n=1; n<=10; n=n+1){

            int sum =0;
            for (int j=0;j<n; j++){
            sum = sum+2;                    //sæt alt efter hvad tabel du laver
            System.out.print(sum+"...");

            }
            System.out.println(" 2 gange "+n+" giver: "+ sum);  //sæt alt efter hvad tabel du laver
        }
    }
}
