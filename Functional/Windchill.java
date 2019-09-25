class Main{
    public static void main(String args[]){

        double t=Double.parseDouble(args[0]);
        double v=Double.parseDouble(args[1]);
        //System.out.println(args[0]);
        if(t>50&&v>120){
           double v2=Math.pow(v,0.16);
           double w=35.74+0.6215*t+(0.4275*t-35.75)*v2;
           System.out.println(w);
        }

    }
}