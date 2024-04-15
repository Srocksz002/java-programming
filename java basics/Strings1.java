public class Strings1 {
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){

            //north
            if(path.charAt(i)=='N'){
                y++;
            }
            //south
            else if(path.charAt(i)=='S'){
                y--;
            }
            //east
            else if(path.charAt(i)=='E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }

        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static String subString(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }

    public static void largestString(String fruits[]){
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String path="NS";
        //System.out.println(getShortestPath(path));
        String str="helloworld";
        //System.out.println(str.substring(0,5));
        //System.out.println(subString(str, 0, 5));
        String fruits[]={"apple","mango","banana"};
        largestString(fruits);


    }
}
