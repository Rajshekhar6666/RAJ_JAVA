public class j6 {
    public static void main(String [] args){

        int n=args.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=Integer.parseInt(args[i]);
        }

        System.out.println("Sum of arguments is:"+sum);

    }
}