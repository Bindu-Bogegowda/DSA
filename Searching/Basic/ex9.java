package Searching.Basic;

//remove the char from string

class ex9{
    public static void main(String[] args) {
        String str = "Hello World";
        char x = 'o';
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != x){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    } 
}