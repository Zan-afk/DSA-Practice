
    public class Wine {


        public static void main(String[] args) {

            pattern(10);
        }


        static void pattern(int n){

            int count=1; int count2;

            for (int i = 1; i <= n ; i++) {



                if (i%2 != 0){
                    for (int j = 0; j < i; j++) {
                        System.out.print(count);


                        if (j<i-1){
                            System.out.print("*");
                        }

                        count++;
                    }
                    System.out.println();
                }
                else {
                    count2=count+i-1;
                    count=count2+1;

                    for (int j = 1; j <=i ; j++) {

                        System.out.print(count2);
                        if (j>0 && j<i){
                            System.out.print("*");
                        }
                        count2--;
                    }
                    System.out.println();
                }

            }
        }
    }

