class hi{
    String str="KAlyan";
    String str1="Kalyan";
    public static void main(String[] args){
        hi obj= new hi();
        boolean ans1=obj.str.isEmpty();
        int length=obj.str.length();
        boolean equal=obj.str.equals(obj.str1);
        int campare_to= obj.str.compareTo(obj.str1);
        String lower=obj.str.toLowerCase();
        String upper=obj.str.toUpperCase();
        boolean equals_ignore=obj.str.equalsIgnoreCase(obj.str1);

        System.out.println(length);
        System.out.println(ans1);
        System.out.println(equal);
        System.out.println(campare_to+"---");
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(equals_ignore);

       

        for(String s:obj.str.split("")){
            System.out.println(s);
            
        }
        System.out.println("____");
         for(String s:obj.str.split("",3)){
            System.out.println(s+" ");
        }
        String Join_Seq=String.join(",,",obj.str1, obj.str);
        System.out.println(Join_Seq);
        
        String concat_=obj.str.concat(obj.str1);
        System.out.println(concat_);


        boolean match=obj.str.matches(obj.str1);
        System.out.println(match);

        boolean contain=obj.str.contains(obj.str1);
        System.out.println(contain);

        String replace=obj.str.replace("ya", "mm");
        System.out.println(replace);

        boolean startWith=obj.str.startsWith("ka");
        System.out.println(startWith);

        boolean endWith= obj.str.endsWith("an");
        System.out.println(endWith);

        char abc[]=obj.str.toCharArray();
        for(char i:abc){
            System.out.print(i+" ");
        }
        for(int i=0;i<obj.str.length();i++){
            System.out.print(obj.str.charAt(i)+" ");
        }

        int index= obj.str.indexOf("y");
        System.out.println(index);

        for(char ch:obj.str.toCharArray()){
            //char ch=(char)i;
            int ind=ch-'A';
            System.out.println(ch+" " +ind);

        }

        StringBuilder sb= new StringBuilder(obj.str);
        //\sb.reverse();
        sb = new StringBuilder(sb.substring(2,4));
        System.out.println(sb);
       // System.out.println(s);
    }
}