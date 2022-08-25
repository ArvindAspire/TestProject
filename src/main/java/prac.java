class prac {
   public static void main(String[] args) {
        int N=15958;
        int num;
        String number=String.valueOf(N);
        char[] ch= number.toCharArray();
        char[] ch2=new char[ch.length];
        int j=0;
       int counter=0;
        if(N>0){
            //   char[] ch= number.toCharArray();
            for(int i=0;i<=ch.length-1;i++){

                if(ch[i]=='5'){
                    if(counter==0){
                        counter++;
                    }
                    else {
                        ch2[j] = ch[i];
                        j++;
                    }
                }

                else {
                    ch2[j] = ch[i];
                    j++;
                }

            }

        num=Integer.parseInt(new String(ch2).trim());


        }

        else{

            for(int i=ch.length-1;i>=0;i--){

                if(ch[i]=='5'){
                    if(counter==0){
                        counter++;
                    }
                    else {
                        ch2[j] = ch[i];
                        j++;
                    }
                }

                else {
                    ch2[j] = ch[i];
                    j++;
                }

            }

            num= Integer.valueOf(new String(ch2).trim());

        }


        System.out.println(num);
    }
}
